package com.google.android.libraries.web.p3353c.p3355b;

import com.google.android.libraries.web.p3353c.C43374s;
import com.google.android.libraries.web.p3353c.C43375t;
import com.google.android.libraries.web.p3353c.C43376u;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.c.b.j */
/* compiled from: PG */
final class C43341j implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69648ae f113214a;

    /* renamed from: b */
    final /* synthetic */ C71548cy f113215b;

    public C43341j(C69648ae aeVar, C71548cy cyVar) {
        this.f113214a = aeVar;
        this.f113215b = cyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C43376u uVar = (C43376u) obj;
        if (uVar == null && this.f113214a.f186027a != C43374s.RENDER_UNSUPPORTED) {
            C43375t tVar = (C43375t) C43376u.f113326k.createBuilder();
            tVar.copyOnWrite();
            C43376u uVar2 = (C43376u) tVar.instance;
            uVar2.f113337j = ((C43374s) this.f113214a.f186027a).f113325e;
            uVar2.f113328a |= 256;
            uVar = (C43376u) tVar.build();
        } else if (uVar == null) {
            uVar = C43376u.f113326k;
            C69664n.m101060f(uVar, "getDefaultInstance()");
        }
        C69664n.m101060f(uVar, "if (windowState == null …ultInstance()\n          }");
        C69648ae aeVar = this.f113214a;
        C43374s a = C43374s.m76523a(uVar.f113337j);
        if (a == null) {
            a = C43374s.RENDER_UNSUPPORTED;
        }
        C69664n.m101060f(a, "state.rendererState");
        aeVar.f186027a = a;
        this.f113215b.mo62807f(uVar);
        return C69788q.f186170a;
    }
}
