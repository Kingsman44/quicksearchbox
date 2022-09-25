package com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125276f;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b.C125279i;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71590q;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.m.ab */
/* compiled from: PG */
public final class C125912ab {

    /* renamed from: a */
    public final C125937z f347004a;

    /* renamed from: b */
    public final C71548cy f347005b;

    /* renamed from: c */
    public final C125276f f347006c;

    /* renamed from: d */
    public final C71587n f347007d;

    /* renamed from: e */
    private final C71422aw f347008e;

    public C125912ab(C125937z zVar, C71422aw awVar) {
        C69664n.m101061g(zVar, "keyboardStateManager");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f347004a = zVar;
        this.f347008e = awVar;
        C71548cy b = C71574dx.m104480b(C125934w.f347146a);
        this.f347005b = b;
        C125276f fVar = new C125276f();
        this.f347006c = fVar;
        this.f347007d = C71590q.m104505b(new C125279i(b, fVar, (C69577g) null));
    }

    /* renamed from: a */
    public final C125934w mo107164a() {
        return (C125934w) this.f347005b.mo62784e();
    }

    /* renamed from: b */
    public final C60870cx mo107165b() {
        C71422aw awVar = this.f347008e;
        C125911aa aaVar = new C125911aa(this, (C69577g) null);
        C69586p pVar = C69586p.f185991a;
        C71424ay ayVar = C71424ay.DEFAULT;
        C69664n.m101061g(awVar, "<this>");
        C69664n.m101061g(ayVar, "start");
        return C126309ar.m206522a(C71663i.m104689b(awVar, pVar, ayVar, aaVar));
    }
}
