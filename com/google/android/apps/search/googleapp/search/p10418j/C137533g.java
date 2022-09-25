package com.google.android.apps.search.googleapp.search.p10418j;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.permissions.SearchEnabledDataService$isGoogleSearchEnabled$1", mo61344c = "SearchEnabledDataService.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.googleapp.search.j.g */
/* compiled from: PG */
final class C137533g extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C137534h f374070a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C137533g(C137534h hVar, C69577g gVar) {
        super(2, gVar);
        this.f374070a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C137533g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r4) {
        /*
            r3 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            p5462h.C69714l.m101134b(r4)
            com.google.android.apps.search.googleapp.search.j.h r4 = r3.f374070a
            java.lang.String r0 = "isGoogleSearchEnabled"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85024s(r0)
            android.os.UserManager r1 = r4.f374071a     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r4.f374072b     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ all -> 0x0030 }
            android.os.Bundle r4 = r1.getApplicationRestrictions(r4)     // Catch:{ all -> 0x0030 }
            r1 = 1
            if (r4 == 0) goto L_0x0022
            java.lang.String r2 = "enable_google_search"
            boolean r1 = r4.getBoolean(r2, r1)     // Catch:{ all -> 0x0030 }
        L_0x0022:
            com.google.protobuf.o r4 = com.google.protobuf.C63077o.m96099a(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "of(\n          userManage…        ?: true\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r1)     // Catch:{ all -> 0x0030 }
            r1 = 0
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            return r4
        L_0x0030:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10418j.C137533g.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C137533g(this.f374070a, gVar);
    }
}
