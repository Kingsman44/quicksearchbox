package com.google.android.apps.search.googleapp.stampviewer.preview;

import com.google.android.apps.search.googleapp.stampviewer.p10489c.C139356l;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.p4242bp.p4253e.p4254a.C56190j;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4290a.C56622n;
import com.google.protobuf.C62942bv;
import p5451f.p5455b.p5456a.p5457a.p5458a.p5459a.C69462a;
import p5451f.p5455b.p5456a.p5457a.p5458a.p5459a.C69463b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.preview.e */
/* compiled from: PG */
final class C139461e implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C139457c f379230a;

    public C139461e(C139457c cVar) {
        this.f379230a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C139356l lVar = (C139356l) bVar;
        C139457c cVar = this.f379230a;
        C56622n nVar = cVar.f379213d.f151150i;
        if (nVar == null) {
            nVar = C56622n.f151177e;
        }
        C56190j jVar = nVar.f151182d;
        if (jVar == null) {
            jVar = C56190j.f149710d;
        }
        String str = jVar.f149712a;
        C69664n.m101060f(str, "ampDocument.stampUi.film…ipViewModel.slideIndexKey");
        if (str.length() != 0) {
            C56622n nVar2 = cVar.f379213d.f151150i;
            C56190j jVar2 = (nVar2 == null ? C56622n.f151177e : nVar2).f151182d;
            if (jVar2 == null) {
                jVar2 = C56190j.f149710d;
            }
            int i = jVar2.f149713b;
            if (nVar2 == null) {
                nVar2 = C56622n.f151177e;
            }
            C56190j jVar3 = nVar2.f151182d;
            if (jVar3 == null) {
                jVar3 = C56190j.f149710d;
            }
            if (i >= jVar3.f149714c - 1) {
                C69462a aVar = (C69462a) C69463b.f185875d.createBuilder();
                aVar.copyOnWrite();
                C69463b bVar2 = (C69463b) aVar.instance;
                bVar2.f185877a |= 1;
                bVar2.f185878b = 0;
                aVar.copyOnWrite();
                C69463b bVar3 = (C69463b) aVar.instance;
                bVar3.f185877a |= 2;
                bVar3.f185879c = 0;
                C62942bv build = aVar.build();
                C69664n.m101060f(build, "newBuilder()\n          .…dex(0)\n          .build()");
                cVar.f379217h.mo26140c(str, ((C69463b) build).toByteArray());
            } else {
                C69462a aVar2 = (C69462a) C69463b.f185875d.createBuilder();
                C56622n nVar3 = cVar.f379213d.f151150i;
                if (nVar3 == null) {
                    nVar3 = C56622n.f151177e;
                }
                C56190j jVar4 = nVar3.f151182d;
                if (jVar4 == null) {
                    jVar4 = C56190j.f149710d;
                }
                int i2 = jVar4.f149713b;
                aVar2.copyOnWrite();
                C69463b bVar4 = (C69463b) aVar2.instance;
                bVar4.f185877a |= 1;
                bVar4.f185878b = i2 + 1;
                C56622n nVar4 = cVar.f379213d.f151150i;
                if (nVar4 == null) {
                    nVar4 = C56622n.f151177e;
                }
                C56190j jVar5 = nVar4.f151182d;
                if (jVar5 == null) {
                    jVar5 = C56190j.f149710d;
                }
                int i3 = jVar5.f149713b;
                aVar2.copyOnWrite();
                C69463b bVar5 = (C69463b) aVar2.instance;
                bVar5.f185877a |= 2;
                bVar5.f185879c = i3 + 1;
                C62942bv build2 = aVar2.build();
                C69664n.m101060f(build2, "newBuilder()\n        .se…dex + 1)\n        .build()");
                cVar.f379217h.mo26140c(str, ((C69463b) build2).toByteArray());
            }
        }
        return C47392e.f123115a;
    }
}
