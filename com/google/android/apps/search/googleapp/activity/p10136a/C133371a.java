package com.google.android.apps.search.googleapp.activity.p10136a;

import com.google.android.apps.search.googleapp.p10527u.C139761b;
import com.google.android.apps.search.googleapp.p10527u.C139767h;
import com.google.android.apps.search.googleapp.p10527u.C139773n;
import com.google.android.apps.search.googleapp.p10527u.C139774o;
import com.google.android.apps.search.googleapp.p10527u.C139775p;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.activity.a.a */
/* compiled from: PG */
final class C133371a implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C133372b f363421a;

    /* renamed from: b */
    final /* synthetic */ C139767h f363422b;

    public C133371a(C133372b bVar, C139767h hVar) {
        this.f363421a = bVar;
        this.f363422b = hVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C139761b bVar = (C139761b) obj;
        C69664n.m101061g(bVar, "it");
        C139767h hVar = this.f363422b;
        C139774o oVar = (C139774o) C139775p.f379888c.createBuilder();
        C69664n.m101060f(oVar, "newBuilder()");
        C139773n a = C69664n.m101061g(oVar, "builder");
        a.mo115231b(C133375e.m216487c(hVar));
        bVar.mo111220c(a.mo115230a());
        this.f363421a.f363423a = true;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
