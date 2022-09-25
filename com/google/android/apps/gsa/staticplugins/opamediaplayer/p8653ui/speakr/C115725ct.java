package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.p041a.C0502l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115449s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115452v;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115650z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.ct */
/* compiled from: PG */
public final class C115725ct extends C115819o {

    /* renamed from: e */
    public final C115449s f320973e;

    /* renamed from: f */
    public final C21370a f320974f;

    /* renamed from: g */
    public final C22871g f320975g;

    /* renamed from: h */
    public final C115620ah f320976h;

    /* renamed from: i */
    public boolean f320977i = true;

    /* renamed from: j */
    public C115650z f320978j;

    /* renamed from: k */
    public RecyclerView f320979k;

    /* renamed from: l */
    private final C115452v f320980l;

    public C115725ct(C22945j jVar, C115452v vVar, Context context, C115449s sVar, C58833ax axVar, C21370a aVar, C22871g gVar, C115620ah ahVar) {
        super(jVar, context, axVar);
        this.f320980l = vVar;
        this.f320973e = sVar;
        this.f320974f = aVar;
        this.f320975g = gVar;
        this.f320976h = ahVar;
    }

    /* renamed from: e */
    private final void m191855e(int i, Runnable runnable) {
        this.f321207a.mo2393g().findItem(i).setOnMenuItemClickListener(new C115720co(runnable));
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        mo28295iC(LayoutInflater.from(this.f321208b).inflate(R.layout.speakr_feature_playlist, (ViewGroup) null));
        super.mo28299iw();
        this.f320979k = (RecyclerView) mo28297il().findViewById(R.id.recycler_view);
        this.f320979k.setLayoutManager(new LinearLayoutManager(this.f321208b));
        C115714ci ciVar = new C115714ci(this.f321208b, new C115715cj(this), this);
        this.f320978j = ciVar;
        this.f320979k.setAdapter(ciVar);
        new C0502l(new C115803fq(this.f320979k)).mo2460d(this.f320979k);
        m191855e(R.id.speakr_menu_item_page_send_feedback, new C115721cp(this));
        m191855e(R.id.speakr_menu_item_select_voice, new C115722cq(this));
        m191855e(R.id.speakr_menu_item_select_language, new C115723cr(this));
        ((C115814j) this.f320980l).f321191a.mo28726b(new C115716ck(this));
        ((C115814j) this.f320980l).f321192b.mo28726b(new C115717cl(this));
        ((C115814j) this.f320980l).f321194d.mo28726b(new C115718cm(this));
        ((C115814j) this.f320980l).f321193c.mo28726b(new C115719cn(this));
    }
}
