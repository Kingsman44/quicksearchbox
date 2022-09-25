package com.google.android.libraries.web.lifecycle.internal;

import com.google.android.libraries.web.lifecycle.C43891f;
import com.google.android.libraries.web.lifecycle.C43892g;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.web.lifecycle.internal.g */
/* compiled from: PG */
final class C43899g extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C43900h f114356a;

    /* renamed from: b */
    final /* synthetic */ C43892g f114357b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43899g(C43900h hVar, C43892g gVar) {
        super(0);
        this.f114356a = hVar;
        this.f114357b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C43900h hVar = this.f114356a;
        C69626l lVar = hVar.f114360c;
        if (lVar != null) {
            C43891f d = this.f114357b.mo46411d(hVar.f114358a);
            C69664n.m101060f(d, "currentChild.getPlugin(pluginClass)");
            lVar.mo5761a(d);
            this.f114356a.f114361d = null;
        }
        return C69788q.f186170a;
    }
}
