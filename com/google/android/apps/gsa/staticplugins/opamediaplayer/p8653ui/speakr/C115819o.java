package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.support.p033v7.widget.Toolbar;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.o */
/* compiled from: PG */
class C115819o extends C22939d {

    /* renamed from: e */
    private static final C59071e f321206e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.o");

    /* renamed from: a */
    protected Toolbar f321207a;

    /* renamed from: b */
    protected final Context f321208b;

    /* renamed from: c */
    final C58833ax f321209c;

    /* renamed from: d */
    protected Boolean f321210d;

    public C115819o(C22945j jVar, Context context, C58833ax axVar) {
        super(jVar);
        this.f321208b = context;
        this.f321209c = axVar;
    }

    /* renamed from: iw */
    public void mo28299iw() {
        if (!mo28294af() || !this.f321209c.mo56113h()) {
            ((C59052c) ((C59052c) f321206e.mo56226d()).mo56372aa(29990)).mo56386p("Content view isn't set, toolbar won't have any effect. Make sure you are calling super.onInitialize() after the contentView is set.");
            return;
        }
        Toolbar toolbar = (Toolbar) mo28297il().findViewById(R.id.toolbar);
        this.f321207a = toolbar;
        toolbar.mo2404n(R.menu.speakr_toolbar_menu);
        this.f321207a.mo2417r(R.drawable.quantum_ic_arrow_back_grey600_24);
        this.f321207a.mo2416q(this.f321208b.getResources().getString(R.string.omp_speakr_media_player_back_button_description));
        this.f321207a.mo2419t(new C115818n(this));
    }
}
