package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.p9758a;

import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128807a;
import com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9757c.C128828c;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.contentprovider.impl.AvatarContentSourceImpl$fetchAvatarState$1", mo61344c = "AvatarContentSourceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {42, 45})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.c.a.a */
/* compiled from: PG */
public final class C128808a extends C69572j implements C69630p {

    /* renamed from: a */
    int f354071a;

    /* renamed from: b */
    final /* synthetic */ C128809b f354072b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128808a(C128809b bVar, C69577g gVar) {
        super(2, gVar);
        this.f354072b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128808a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f354071a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C128809b bVar = this.f354072b;
            C60870cx g = bVar.f354074b.mo50250g(bVar.f354073a);
            C69664n.m101060f(g, "accountDataService.isEnabled(accountId)");
            this.f354071a = 1;
            obj = C71663i.m104690c(g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            C46215j b = ((C46108a) obj).mo50210b();
            C69664n.m101060f(b, "accountDataService.getAc…accountId).await().info()");
            return new C128807a(b);
        } else {
            C69714l.m101134b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return C128828c.f354114a;
        }
        C128809b bVar2 = this.f354072b;
        C60870cx c = bVar2.f354074b.mo50246c(bVar2.f354073a);
        C69664n.m101060f(c, "accountDataService.getAccount(accountId)");
        this.f354071a = 2;
        obj = C71663i.m104690c(c, this);
        if (obj == aVar) {
            return aVar;
        }
        C46215j b2 = ((C46108a) obj).mo50210b();
        C69664n.m101060f(b2, "accountDataService.getAc…accountId).await().info()");
        return new C128807a(b2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128808a(this.f354072b, gVar);
    }
}
