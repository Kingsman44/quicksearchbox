package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9565q;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32798at;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32838cf;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2714o.C34919e;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.q.b */
/* compiled from: PG */
public final class C127257b implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350457a;

    /* renamed from: b */
    public static final C33476a f350458b = new C33476a("assistant.api.params.AppContextParams", C51233ac.f133389b);

    /* renamed from: c */
    public final C34919e f350459c;

    /* renamed from: d */
    private final C71422aw f350460d;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        C69664n.m101060f(ccVar, "newBuilder()");
        C32838cf a = C69664n.m101061g(ccVar, "builder");
        a.mo38320c();
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C32798at a2 = C69664n.m101061g(ajVar, "builder");
        a2.mo38300c("asst.integration.context.params");
        a.mo38319b(a2.mo38298a());
        f350457a = a.mo38318a();
    }

    public C127257b(C34919e eVar, C71422aw awVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f350459c = eVar;
        this.f350460d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107986a(C127289i iVar, C32810be beVar) {
        C69664n.m101061g(iVar, "queryContext");
        C69664n.m101061g(beVar, "request");
        return C71663i.m104692e(this.f350460d, (C71424ay) null, new C127256a(this, (C69577g) null), 3);
    }
}
