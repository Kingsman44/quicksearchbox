package com.google.android.apps.search.podcasts.playerpanel.p10599b;

import com.google.android.apps.search.podcasts.player.C140790h;
import com.google.android.apps.search.podcasts.widgets.valueselector.C141288f;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.b.g */
/* compiled from: PG */
final class C140903g extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C140906j f382594a;

    /* renamed from: b */
    final /* synthetic */ C141288f f382595b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140903g(C140906j jVar, C141288f fVar) {
        super(1);
        this.f382594a = jVar;
        this.f382595b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Void voidR = (Void) obj;
        C140790h hVar = this.f382594a.f382601d;
        Object a = this.f382595b.mo115955a();
        C69664n.m101060f(a, "value.get()");
        return hVar.mo115884f(((Number) a).floatValue());
    }
}
