package com.google.android.libraries.search.assistant.p2783s.p2785b;

import android.telephony.TelephonyManager;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.MobileInfoProvider$mobileUserInfo$2$1$networkMccMnc$1", mo61344c = "MobileInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.libraries.search.assistant.s.b.i */
/* compiled from: PG */
final class C36390i extends C69572j implements C69630p {

    /* renamed from: a */
    Object f95022a;

    /* renamed from: b */
    int f95023b;

    /* renamed from: c */
    final /* synthetic */ C36395n f95024c;

    /* renamed from: d */
    final /* synthetic */ C71604be f95025d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36390i(C36395n nVar, C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f95024c = nVar;
        this.f95025d = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36390i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f95023b != 0) {
            obj2 = this.f95022a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36395n nVar = this.f95024c;
            C71604be beVar = this.f95025d;
            this.f95022a = nVar;
            this.f95023b = 1;
            Object a = beVar.mo62825a(this);
            if (a == aVar) {
                return aVar;
            }
            obj2 = nVar;
            obj = a;
        }
        TelephonyManager telephonyManager = (TelephonyManager) obj;
        return ((C36395n) obj2).mo40155a(telephonyManager != null ? telephonyManager.getNetworkOperator() : null);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36390i(this.f95024c, this.f95025d, gVar);
    }
}
