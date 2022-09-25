package com.google.android.libraries.web.contrib.googlesignin.internal;

import com.google.apps.tiktok.account.data.C46108a;
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

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.googlesignin.internal.GoogleCookieRefreshSynclet$sync$2", mo61344c = "GoogleCookieRefreshSynclet.kt", mo61345d = "invokeSuspend", mo61346e = {60, 64})
/* renamed from: com.google.android.libraries.web.contrib.googlesignin.internal.h */
/* compiled from: PG */
final class C43595h extends C69572j implements C69630p {

    /* renamed from: a */
    int f113801a;

    /* renamed from: b */
    final /* synthetic */ C43596i f113802b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43595h(C43596i iVar, C69577g gVar) {
        super(2, gVar);
        this.f113802b = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43595h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f113801a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C43596i iVar = this.f113802b;
            C60870cx c = iVar.f113805b.mo50246c(iVar.f113804a);
            C69664n.m101060f(c, "accountDataService.getAccount(accountId)");
            this.f113801a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return null;
        } else {
            C69714l.m101134b(obj);
        }
        if (!C69664n.m101066l(((C46108a) obj).mo50210b().f121165j, "google")) {
            return null;
        }
        C43596i iVar2 = this.f113802b;
        this.f113801a = 2;
        if (iVar2.mo46644c(this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43595h(this.f113802b, gVar);
    }
}
