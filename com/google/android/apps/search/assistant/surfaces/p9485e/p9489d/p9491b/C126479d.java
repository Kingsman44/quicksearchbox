package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9491b;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.core.content.p090a.C1846a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.infoproviders.ClientInfoProvider$clientInfo$2$1$versionCodeAsync$1", mo61344c = "ClientInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.b.d */
/* compiled from: PG */
final class C126479d extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C126481f f348335a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126479d(C126481f fVar, C69577g gVar) {
        super(2, gVar);
        this.f348335a = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126479d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Context context = this.f348335a.f348349b;
        try {
            return String.valueOf(C1846a.m5060a(context.getPackageManager().getPackageInfo(context.getPackageName(), 0)));
        } catch (PackageManager.NameNotFoundException e) {
            C59052c cVar = (C59052c) ((C59052c) C126481f.f348348a.mo56226d()).mo56382g(e);
            cVar.mo56379ah(new C59094n(38893));
            cVar.mo56386p("Could not get versionCode");
            return "0";
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126479d(this.f348335a, gVar);
    }
}
