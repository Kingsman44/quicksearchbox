package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.performers.notification.MaNotificationPermissionRequester$requestPermissions$1", mo61344c = "MaNotificationPermissionRequester.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.j */
/* compiled from: PG */
final class C128332j extends C69572j implements C69630p {

    /* renamed from: a */
    int f352951a;

    /* renamed from: b */
    final /* synthetic */ C128333k f352952b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128332j(C128333k kVar, C69577g gVar) {
        super(2, gVar);
        this.f352952b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128332j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f352951a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128333k kVar = this.f352952b;
            this.f352951a = 1;
            obj = kVar.mo108396c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128332j(this.f352952b, gVar);
    }
}
