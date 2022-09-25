package com.google.android.libraries.web.webview.p3471a;

import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.a.y */
/* compiled from: PG */
final class C44341y implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ int f115309a;

    /* renamed from: b */
    final /* synthetic */ C44342z f115310b;

    public C44341y(int i, C44342z zVar) {
        this.f115309a = i;
        this.f115310b = zVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C44321e eVar = (C44321e) obj;
        if (eVar.f115247b == this.f115309a) {
            return eVar;
        }
        this.f115310b.f115312a.mo47222a();
        int i = this.f115309a;
        C44320d dVar = (C44320d) C44321e.f115244c.createBuilder();
        C69664n.m101060f(dVar, "newBuilder()");
        C44323g a = C69664n.m101061g(dVar, "builder");
        C44320d dVar2 = a.f115248a;
        dVar2.copyOnWrite();
        C44321e eVar2 = (C44321e) dVar2.instance;
        eVar2.f115246a |= 1;
        eVar2.f115247b = i;
        return a.mo47220a();
    }
}
