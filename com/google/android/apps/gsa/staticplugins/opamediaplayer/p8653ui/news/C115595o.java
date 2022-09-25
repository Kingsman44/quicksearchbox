package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.news;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.support.p033v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.p8642a.C115142a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115479w;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115482z;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared.C115620ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28291i;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.news.o */
/* compiled from: PG */
public final class C115595o extends C22939d {

    /* renamed from: a */
    public final Context f320669a;

    /* renamed from: b */
    public final C115479w f320670b;

    /* renamed from: c */
    public final C58833ax f320671c;

    /* renamed from: d */
    public final C21370a f320672d;

    /* renamed from: e */
    public final C22871g f320673e;

    /* renamed from: f */
    public final C115620ah f320674f;

    /* renamed from: g */
    public final C115142a f320675g;

    /* renamed from: h */
    public C115587g f320676h;

    /* renamed from: i */
    private final C115482z f320677i;

    /* renamed from: j */
    private C28291i f320678j;

    /* renamed from: k */
    private RecyclerView f320679k;

    /* renamed from: l */
    private Toolbar f320680l;

    public C115595o(C22945j jVar, C115482z zVar, Context context, C115479w wVar, C115142a aVar, C58833ax axVar, C21370a aVar2, C22871g gVar, C115620ah ahVar) {
        super(jVar);
        this.f320677i = zVar;
        this.f320669a = context;
        this.f320670b = wVar;
        this.f320671c = axVar;
        this.f320672d = aVar2;
        this.f320673e = gVar;
        this.f320674f = ahVar;
        this.f320675g = aVar;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C58976aa aaVar = C58975e.f156826a;
        mo28295iC(LayoutInflater.from(this.f320669a).inflate(R.layout.news_feature_media_player_playlist, (ViewGroup) null));
        this.f320679k = (RecyclerView) mo28297il().findViewById(R.id.recycler_view);
        this.f320679k.setLayoutManager(new LinearLayoutManager(this.f320669a));
        Toolbar toolbar = (Toolbar) mo28297il().findViewById(R.id.playlist_toolbar);
        this.f320680l = toolbar;
        toolbar.mo2417r(R.drawable.quantum_ic_close_grey600_24);
        this.f320680l.mo2404n(R.menu.toolbar_menu);
        this.f320680l.mo2419t(new C115593m(this));
        C115587g gVar = new C115587g(this.f320669a, new C115590j(this));
        this.f320676h = gVar;
        this.f320679k.setAdapter(gVar);
        ((C115576aw) this.f320677i).f320604a.mo28726b(new C115591k(this));
        ((C115576aw) this.f320677i).f320605b.mo28726b(new C115592l(this));
        C28295m.m52919e(mo28297il(), new C28292j(71362));
        this.f320680l.mo2393g().findItem(R.id.send_feedback).setOnMenuItemClickListener(new C115589i(this));
        C28291i iVar = new C28291i(this.f320679k, this.f320675g);
        this.f320678j = iVar;
        iVar.f76970d = this.f320676h;
        iVar.f76971e = new C115588h(this);
        iVar.mo33786b();
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C58976aa aaVar = C58975e.f156826a;
    }
}
