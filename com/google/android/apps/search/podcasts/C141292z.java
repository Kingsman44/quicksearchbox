package com.google.android.apps.search.podcasts;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.MenuItem;
import android.view.View;
import androidx.navigation.C3807af;
import com.google.android.apps.search.podcasts.home.HomeFragment;
import com.google.android.apps.search.podcasts.p10565f.C140301av;
import com.google.android.apps.search.podcasts.widgets.p10621c.C141216g;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141243d;
import com.google.android.apps.search.podcasts.widgets.p10624f.C141245f;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;

/* renamed from: com.google.android.apps.search.podcasts.z */
/* compiled from: PG */
final class C141292z implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141182w f383588a;

    public C141292z(C141182w wVar) {
        this.f383588a = wVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        View view;
        MenuItem a;
        View actionView;
        C140301av avVar = (C140301av) bVar;
        C141182w wVar = this.f383588a;
        C141243d dVar = wVar.f383306t;
        if (dVar != null) {
            int itemId = dVar.f383455c.f116864a.getItem(0).getItemId();
            BottomNavigationView bottomNavigationView = dVar.f383455c;
            if (bottomNavigationView.f116865b.f116936e != itemId) {
                bottomNavigationView.mo48182d(itemId);
            }
            C3807af afVar = (C3807af) dVar.f383458f.get();
            if (afVar != null) {
                afVar.mo8062v(afVar.mo8047g().f12375b, false, false);
            }
            FragmentManager fragmentManager = wVar.f383306t.f383457e;
            Fragment c = fragmentManager.f634a.mo671c(C141245f.m229263a(0));
            if (c != null) {
                Fragment fragment = (Fragment) c.getChildFragmentManager().f634a.mo677i().get(0);
                if (!(!(fragment instanceof HomeFragment) || (view = ((HomeFragment) fragment).mo17754z().f381370f.getView()) == null || (a = C141216g.m229225a(view)) == null || (actionView = a.getActionView()) == null)) {
                    actionView.performClick();
                }
            }
        }
        return C47392e.f123115a;
    }
}
