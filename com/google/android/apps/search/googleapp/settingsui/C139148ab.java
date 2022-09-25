package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.SearchView;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47761cz;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47720k;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47722m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ab */
/* compiled from: PG */
public final class C139148ab {

    /* renamed from: a */
    public final Fragment f378445a;

    /* renamed from: b */
    public final C139189bl f378446b;

    /* renamed from: c */
    public final SearchToolbarView f378447c;

    /* renamed from: d */
    public final C28443m f378448d;

    /* renamed from: e */
    public final MenuItem f378449e;

    /* renamed from: f */
    public final C28452b f378450f;

    /* renamed from: g */
    private final C47770dh f378451g;

    /* renamed from: h */
    private final C47722m f378452h;

    /* renamed from: i */
    private final C47274n f378453i;

    /* renamed from: j */
    private final C28310af f378454j;

    /* renamed from: k */
    private final C28306ab f378455k;

    /* renamed from: l */
    private final Toolbar f378456l;

    /* renamed from: m */
    private final SearchView f378457m;

    public C139148ab(Fragment fragment, Activity activity, C139189bl blVar, SearchToolbarView searchToolbarView, C47770dh dhVar, C47722m mVar, C47274n nVar, C28443m mVar2, C28310af afVar, C28306ab abVar) {
        C69664n.m101061g(fragment, "fragment");
        C69664n.m101061g(activity, "parentActivity");
        C69664n.m101061g(dhVar, "tracing");
        C69664n.m101061g(mVar, "v7Tracing");
        C69664n.m101061g(mVar2, "interactionLogger");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f378445a = fragment;
        this.f378446b = blVar;
        this.f378447c = searchToolbarView;
        this.f378451g = dhVar;
        this.f378452h = mVar;
        this.f378453i = nVar;
        this.f378448d = mVar2;
        this.f378454j = afVar;
        this.f378455k = abVar;
        LayoutInflater.from(nVar).inflate(R.layout.googleapp_settings_toolbar_view, searchToolbarView);
        searchToolbarView.setFitsSystemWindows(true);
        View findViewById = searchToolbarView.findViewById(R.id.googleapp_settings_toolbar);
        C69664n.m101060f(findViewById, "mainView.findViewById<To…ogleapp_settings_toolbar)");
        Toolbar toolbar = (Toolbar) findViewById;
        this.f378456l = toolbar;
        toolbar.mo2404n(R.menu.googleapp_settings_menu_for_search);
        MenuItem findItem = toolbar.mo2393g().findItem(R.id.googleapp_settings_search);
        C69664n.m101060f(findItem, "toolbar.menu.findItem(R.…oogleapp_settings_search)");
        this.f378449e = findItem;
        View actionView = findItem.getActionView();
        C69664n.m101059e(actionView, "null cannot be cast to non-null type android.support.v7.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        this.f378457m = searchView;
        C28452b bVar = new C28452b(abVar.mo33801b(toolbar, afVar.mo33805a(C28427h.m53115a(123162))));
        this.f378450f = bVar;
        findItem.setOnActionExpandListener(new C47761cz(dhVar, new C139270z(this)));
        bVar.mo33907a("SEARCH_FIELD_VE_KEY", afVar.mo33805a(C28427h.m53115a(122947)));
        searchView.setQuery(BuildConfig.FLAVOR, false);
        blVar.mo114809a(BuildConfig.FLAVOR);
        searchView.setMaxWidth(Integer.MAX_VALUE);
        searchView.setQueryHint(nVar.getResources().getString(R.string.googleapp_settings_search_hint));
        searchView.setOnQueryTextListener(new C47720k(mVar, new C139147aa(this)));
    }
}
