package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import java.util.NoSuchElementException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71498bb;
import kotlinx.coroutines.p5574b.C71517bu;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$2", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {119})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.ak */
/* compiled from: PG */
final class C126459ak extends C69572j implements C69630p {

    /* renamed from: a */
    int f348279a;

    /* renamed from: b */
    final /* synthetic */ C71553dc f348280b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f348281c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126459ak(C71553dc dcVar, C69644aa aaVar, C69577g gVar) {
        super(2, gVar);
        this.f348280b = dcVar;
        this.f348281c = aaVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126459ak) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348279a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (NoSuchElementException unused) {
            }
        } else {
            C69714l.m101134b(obj);
            C71587n a = C71498bb.m104325a(this.f348280b, new C126458aj((C69577g) null));
            this.f348279a = 1;
            if (C71517bu.m104350a(a, this) == aVar) {
                return aVar;
            }
        }
        this.f348281c.f186023a = true;
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126459ak(this.f348280b, this.f348281c, gVar);
    }
}
