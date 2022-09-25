package com.google.android.libraries.home.coreui.devicetile;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71608bi;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.home.coreui.devicetile.ControlActionCoordinatorImpl$shouldRunAction$1", mo61344c = "ControlActionCoordinatorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {140})
/* renamed from: com.google.android.libraries.home.coreui.devicetile.s */
/* compiled from: PG */
final class C23757s extends C69572j implements C69630p {

    /* renamed from: a */
    int f65110a;

    /* renamed from: b */
    final /* synthetic */ long f65111b;

    /* renamed from: c */
    final /* synthetic */ C23761w f65112c;

    /* renamed from: d */
    final /* synthetic */ String f65113d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23757s(long j, C23761w wVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f65111b = j;
        this.f65112c = wVar;
        this.f65113d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C23757s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f65110a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            long j = this.f65111b;
            this.f65110a = 1;
            if (C71608bi.m104551c(j, this) == aVar) {
                return aVar;
            }
        }
        this.f65112c.f65123a.remove(this.f65113d);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C23757s(this.f65111b, this.f65112c, this.f65113d, gVar);
    }
}
