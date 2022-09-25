package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9547ad;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.topcontacts.DeviceContactsGuard$isContactAccessAllowed$2$personalResponseAllowed$1", mo61344c = "DeviceContactsGuard.kt", mo61345d = "invokeSuspend", mo61346e = {22})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ad.a */
/* compiled from: PG */
final class C127197a extends C69572j implements C69630p {

    /* renamed from: a */
    int f350198a;

    /* renamed from: b */
    final /* synthetic */ C127199c f350199b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127197a(C127199c cVar, C69577g gVar) {
        super(2, gVar);
        this.f350199b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127197a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350198a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f350199b.f350205b.f336571a.mo46042d();
            C69664n.m101060f(d, "personalResponseReadAccessor.personalResponse");
            this.f350198a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(((C121124b) obj).f336566b);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127197a(this.f350199b, gVar);
    }
}
