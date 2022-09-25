package com.google.android.apps.search.googleapp.settingsui;

import android.app.Activity;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.apps.tiktok.inject.C47274n;
import com.google.apps.tiktok.tracing.C47579cc;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.cn */
/* compiled from: PG */
public final class C139219cn {

    /* renamed from: a */
    public final Activity f378640a;

    /* renamed from: b */
    public final ToolbarView f378641b;

    /* renamed from: c */
    public final C47770dh f378642c;

    /* renamed from: d */
    public final C47274n f378643d;

    /* renamed from: e */
    public final C28443m f378644e;

    /* renamed from: f */
    public final C28310af f378645f;

    /* renamed from: g */
    public final boolean f378646g;

    /* renamed from: h */
    public final Toolbar f378647h;

    /* renamed from: i */
    public final C28452b f378648i;

    /* renamed from: j */
    private final C28306ab f378649j;

    /* renamed from: k */
    private final boolean f378650k;

    /* renamed from: l */
    private final C69613f f378651l;

    public C139219cn(Activity activity, ToolbarView toolbarView, C47770dh dhVar, C47274n nVar, C28443m mVar, C28310af afVar, C28306ab abVar, boolean z, boolean z2) {
        C69664n.m101061g(activity, "parentActivity");
        C69664n.m101061g(dhVar, "tracing");
        C69664n.m101061g(mVar, "interactionLogger");
        C69664n.m101061g(afVar, "visualElements");
        C69664n.m101061g(abVar, "viewVisualElements");
        this.f378640a = activity;
        this.f378641b = toolbarView;
        this.f378642c = dhVar;
        this.f378643d = nVar;
        this.f378644e = mVar;
        this.f378645f = afVar;
        this.f378649j = abVar;
        boolean z3 = false;
        if (toolbarView.getResources().getBoolean(R.bool.googleapp_settings_use_two_pane) && z2) {
            z3 = true;
        }
        this.f378650k = z3;
        this.f378646g = z;
        this.f378651l = new C69747m(new C139215cj(this));
        LayoutInflater.from(nVar).inflate(true != z ? R.layout.googleapp_settings_toolbar_view : R.layout.googleapp_settings_collapsing_toolbar_view, toolbarView);
        toolbarView.setFitsSystemWindows(true);
        View findViewById = toolbarView.findViewById(R.id.googleapp_settings_toolbar);
        C69664n.m101060f(findViewById, "mainView.findViewById<To…ogleapp_settings_toolbar)");
        Toolbar toolbar = (Toolbar) findViewById;
        this.f378647h = toolbar;
        C28452b bVar = new C28452b(abVar.mo33801b(toolbar, afVar.mo33805a(C28427h.m53115a(123162))));
        this.f378648i = bVar;
        if (!z && !z3) {
            mo114848b();
        }
        bVar.mo33907a("NAV_UP_VE_KEY", afVar.mo33805a(C28427h.m53115a(122945)));
        toolbar.mo2419t(new C47591co(dhVar, "Settings toolbar nav up", new C139218cm(this)));
    }

    /* renamed from: a */
    public final CollapsingToolbarLayout mo114847a() {
        Object a = this.f378651l.mo5768a();
        C69664n.m101060f(a, "<get-collapsingToolbarLayout>(...)");
        return (CollapsingToolbarLayout) a;
    }

    /* renamed from: b */
    public final void mo114848b() {
        if (this.f378647h.mo2393g().findItem(R.id.googleapp_settings_search) == null) {
            this.f378647h.mo2404n(R.menu.googleapp_settings_menu);
            MenuItem findItem = this.f378647h.mo2393g().findItem(R.id.googleapp_settings_search);
            C69664n.m101060f(findItem, "toolbar.menu.findItem(R.…oogleapp_settings_search)");
            this.f378648i.mo33907a("SEARCH_ICON_VE_KEY", this.f378645f.mo33805a(C28427h.m53115a(122946)));
            findItem.setOnMenuItemClickListener(new C47579cc(this.f378642c, "Settings search view onMenuItemClick", new C139217cl(this)));
        }
    }
}
