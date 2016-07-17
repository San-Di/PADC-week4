package net.sandi.myapplication.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import net.sandi.myapplication.R;
import net.sandi.myapplication.fragments.JobSearchFragment;
import net.sandi.myapplication.fragments.LinkedInFragment;
import net.sandi.myapplication.fragments.MovieFragment;
import net.sandi.myapplication.fragments.PulseFragment;
import net.sandi.myapplication.fragments.WinZinFragment;
import net.sandi.myapplication.utils.MMFontUtils;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        MenuItemCompat.OnActionExpandListener {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        Menu leftMenu = navigationView.getMenu();
        MMFontUtils.applyMMFontToMenu(leftMenu);
        navigationView.setNavigationItemSelectedListener(this);

            LinkedInFragment fragment = LinkedInFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
        

//
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
      return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_settings:
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        menuItem.setChecked(true);
        drawerLayout.closeDrawers();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (menuItem.getItemId()) {
                    case R.id.left_menu_linked_in:
                    {
                        LinkedInFragment fragment = LinkedInFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, fragment)
                                .commit();
                    }

                        break;
                    case R.id.left_menu_job_search:
                    {
                        JobSearchFragment fragment = JobSearchFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, fragment)
                                .commit();
                    }
                        break;
                    case R.id.left_menu_pulse:
                    {
                        PulseFragment fragment = PulseFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, fragment)
                                .commit();
                    }

                    break;
                    case R.id.left_menu_movie:
                    {
                        MovieFragment fragment = MovieFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, fragment)
                                .commit();
                    }
                        break;
                    case R.id.left_menu_winzin:
                    {
                        WinZinFragment fragment = WinZinFragment.newInstance();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fl_container, fragment)
                                .commit();
                    }
                        break;

                }
            }
        }, 100);

        return true;
    }

    @Override
    public boolean onMenuItemActionExpand(MenuItem item) {
        return true;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem item) {
        return true;
    }




}
