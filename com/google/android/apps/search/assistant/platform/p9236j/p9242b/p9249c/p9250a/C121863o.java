package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import android.content.Intent;
import android.os.Parcelable;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122054n;
import com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.o */
/* compiled from: PG */
public final class C121863o extends C122054n {

    /* renamed from: a */
    private final C121851c f338152a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121863o(C69585o oVar, C121851c cVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        this.f338152a = cVar;
    }

    /* renamed from: b */
    public final Object mo105404b(C121833ap apVar, C69577g gVar) {
        C61541e eVar = C33487a.f89619d;
        C69664n.m101060f(eVar, "INTENT_KEYS");
        Parcelable d = C61543g.m94277d(eVar);
        C69664n.m101060f(d, "INTENT_KEYS.fromRequestHeaders()");
        C121851c cVar = this.f338152a;
        C121857i iVar = (C121857i) cVar;
        return C71803m.m105040a(iVar.f338132a, new C121853e(iVar, C121871w.m201308a(apVar), (Intent) d, (C69577g) null), gVar);
    }

    /* renamed from: c */
    public final Object mo105405c(C121838au auVar, C69577g gVar) {
        C61541e eVar = C33487a.f89619d;
        C69664n.m101060f(eVar, "INTENT_KEYS");
        Parcelable d = C61543g.m94277d(eVar);
        C69664n.m101060f(d, "INTENT_KEYS.fromRequestHeaders()");
        C121851c cVar = this.f338152a;
        C121857i iVar = (C121857i) cVar;
        return C71803m.m105040a(iVar.f338132a, new C121855g(iVar, C121822ae.m201252a(auVar), (Intent) d, (C69577g) null), gVar);
    }
}
