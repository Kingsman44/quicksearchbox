package com.google.android.apps.gsa.staticplugins.p7922eo;

import android.content.Context;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6519al.p6743l.C85516a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.be */
/* compiled from: PG */
public final class C100603be {

    /* renamed from: a */
    public static final C59071e f281293a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.eo.be");

    /* renamed from: b */
    public final C22871g f281294b;

    /* renamed from: c */
    public final C85422c f281295c;

    /* renamed from: d */
    public final C85516a f281296d;

    /* renamed from: e */
    public final Query f281297e;

    /* renamed from: f */
    public final ClientConfig f281298f;

    /* renamed from: g */
    public final C68214a f281299g;

    /* renamed from: h */
    public final Context f281300h;

    /* renamed from: i */
    public final C68214a f281301i;

    /* renamed from: j */
    public final C68214a f281302j;

    /* renamed from: k */
    public final C86124t f281303k;

    /* renamed from: l */
    public final C68214a f281304l;

    /* renamed from: m */
    public final C85710c f281305m;

    /* renamed from: n */
    public final C100626w f281306n;

    /* renamed from: o */
    public final C92214y f281307o;

    public C100603be(C85422c cVar, Query query, ClientConfig clientConfig, C100626w wVar, C85516a aVar, C22871g gVar, C68214a aVar2, Context context, C68214a aVar3, C68214a aVar4, C86124t tVar, C92214y yVar, C68214a aVar5, C85710c cVar2) {
        this.f281294b = gVar;
        this.f281295c = cVar;
        this.f281306n = wVar;
        this.f281296d = aVar;
        this.f281297e = query;
        this.f281298f = clientConfig;
        this.f281299g = aVar2;
        this.f281300h = context;
        this.f281301i = aVar3;
        this.f281302j = aVar4;
        this.f281303k = tVar;
        this.f281307o = yVar;
        this.f281304l = aVar5;
        this.f281305m = cVar2;
    }

    /* renamed from: a */
    public final void mo91987a(C60870cx cxVar, Runnable runnable, String str) {
        C22871g gVar = this.f281294b;
        gVar.mo28211k(cxVar, "Obtained " + str + " signal.", new C100593av(runnable, str));
    }

    /* renamed from: b */
    public final void mo91988b(C119053i iVar) {
        this.f281294b.mo28211k(iVar.f332140a.f332123d.f232931a, "Obtained voiceSearchResultsDone.", new C100600bb(this));
    }
}
