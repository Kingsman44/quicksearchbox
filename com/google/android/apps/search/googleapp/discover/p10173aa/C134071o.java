package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.apps.search.googleapp.discover.p10173aa.p10174a.C134006a;
import com.google.android.apps.search.googleapp.discover.p10173aa.p10174a.C134007b;
import com.google.android.apps.search.googleapp.discover.p10214s.C134591i;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.o */
/* compiled from: PG */
final class C134071o implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C134073q f365213a;

    /* renamed from: b */
    final /* synthetic */ C134591i f365214b;

    public C134071o(C134073q qVar, C134591i iVar) {
        this.f365213a = qVar;
        this.f365214b = iVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C134007b bVar = (C134007b) obj;
        C69664n.m101061g(bVar, "oldData");
        C134073q qVar = this.f365213a;
        C134591i a = C134591i.m218304a(bVar.f365027b);
        if (a == null) {
            a = C134591i.UNKNOWN;
        }
        C69664n.m101060f(a, "oldData.discoverEligibility");
        C134591i iVar = this.f365214b;
        if (a != iVar) {
            C46459k.m82829b(C71663i.m104692e(qVar.f365222e, (C71424ay) null, new C134070n(qVar, iVar, (C69577g) null), 3), "Failed to re-enqueue the sync worker.", new Object[0]);
        }
        C134591i iVar2 = this.f365214b;
        C62934bn builder = bVar.toBuilder();
        C69664n.m101060f(builder, "this.toBuilder()");
        C134006a aVar = (C134006a) builder;
        C69664n.m101061g(aVar, "builder");
        C69664n.m101061g(iVar2, "value");
        aVar.copyOnWrite();
        C134007b bVar2 = (C134007b) aVar.instance;
        bVar2.f365027b = iVar2.f366539d;
        bVar2.f365026a |= 1;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C134007b) build;
    }
}
