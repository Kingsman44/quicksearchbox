package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f;

import android.content.Context;
import com.google.android.apps.gsa.languagepack.av;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8911a.C118952a;
import com.google.android.apps.gsa.search.core.carassistant.p6782e.C85710c;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.errors.VoiceSearchError;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.speech.audio.C92214y;
import com.google.android.libraries.gsa.p1876k.C22869e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.e.a.f.h */
/* compiled from: PG */
public final /* synthetic */ class C119032h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C85422c f332057a;

    /* renamed from: b */
    public final /* synthetic */ Query f332058b;

    /* renamed from: c */
    public final /* synthetic */ C90528t f332059c;

    /* renamed from: d */
    public final /* synthetic */ ClientConfig f332060d;

    /* renamed from: e */
    public final /* synthetic */ C89037bh f332061e;

    /* renamed from: f */
    public final /* synthetic */ Context f332062f;

    /* renamed from: g */
    public final /* synthetic */ C89994f f332063g;

    /* renamed from: h */
    public final /* synthetic */ av f332064h;

    /* renamed from: i */
    public final /* synthetic */ C86124t f332065i;

    /* renamed from: j */
    public final /* synthetic */ String f332066j;

    /* renamed from: k */
    public final /* synthetic */ C85710c f332067k;

    /* renamed from: l */
    public final /* synthetic */ C68214a f332068l;

    /* renamed from: m */
    public final /* synthetic */ C92214y f332069m;

    public /* synthetic */ C119032h(C85422c cVar, Query query, C90528t tVar, C92214y yVar, ClientConfig clientConfig, C89037bh bhVar, Context context, C89994f fVar, av avVar, C86124t tVar2, String str, C85710c cVar2, C68214a aVar) {
        this.f332057a = cVar;
        this.f332058b = query;
        this.f332059c = tVar;
        this.f332069m = yVar;
        this.f332060d = clientConfig;
        this.f332061e = bhVar;
        this.f332062f = context;
        this.f332063g = fVar;
        this.f332064h = avVar;
        this.f332065i = tVar2;
        this.f332066j = str;
        this.f332067k = cVar2;
        this.f332068l = aVar;
    }

    public final void run() {
        C85422c cVar = this.f332057a;
        Query query = this.f332058b;
        C90528t tVar = this.f332059c;
        C92214y yVar = this.f332069m;
        ClientConfig clientConfig = this.f332060d;
        C89037bh bhVar = this.f332061e;
        Context context = this.f332062f;
        C89994f fVar = this.f332063g;
        av avVar = this.f332064h;
        C86124t tVar2 = this.f332065i;
        String str = this.f332066j;
        C85710c cVar2 = this.f332067k;
        C68214a aVar = this.f332068l;
        yVar.mo86892c(query.f252749G);
        cVar.mo78941g(query, new VoiceSearchError(query, tVar, C118952a.m197463a(clientConfig, tVar, bhVar, context, fVar, new C119031g(avVar), query, tVar2, str, cVar2.mo79343a(), aVar)));
    }
}
