package com.google.android.apps.search.googleapp.discover.p10238u;

import android.net.Uri;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3141j.C40448h;
import com.google.common.p4522b.C58487gw;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.request.DiscoverUrlFetcher$fetch$1", mo61344c = "DiscoverUrlFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.apps.search.googleapp.discover.u.aq */
/* compiled from: PG */
final class C134956aq extends C69572j implements C69630p {

    /* renamed from: a */
    int f367443a;

    /* renamed from: b */
    final /* synthetic */ C134962aw f367444b;

    /* renamed from: c */
    final /* synthetic */ Uri f367445c;

    /* renamed from: d */
    final /* synthetic */ C58487gw f367446d;

    /* renamed from: e */
    final /* synthetic */ C63088z f367447e;

    /* renamed from: f */
    final /* synthetic */ boolean f367448f;

    /* renamed from: g */
    final /* synthetic */ C40448h f367449g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134956aq(C134962aw awVar, Uri uri, C58487gw gwVar, C63088z zVar, boolean z, C40448h hVar, C69577g gVar) {
        super(2, gVar);
        this.f367444b = awVar;
        this.f367445c = uri;
        this.f367446d = gwVar;
        this.f367447e = zVar;
        this.f367448f = z;
        this.f367449g = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134956aq) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f367443a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134962aw awVar = this.f367444b;
            Uri uri = this.f367445c;
            C58487gw gwVar = this.f367446d;
            C63088z zVar = this.f367447e;
            boolean z = this.f367448f;
            C40448h hVar = this.f367449g;
            this.f367443a = 1;
            obj = C71803m.m105040a(awVar.f367472c, new C134960au(uri, awVar, hVar, z, gwVar, zVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134956aq(this.f367444b, this.f367445c, this.f367446d, this.f367447e, this.f367448f, this.f367449g, gVar);
    }
}
