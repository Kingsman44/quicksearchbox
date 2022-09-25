package com.google.android.apps.search.googleapp.notifications.p10363b;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.search.googleapp.notifications.C136758b;
import com.google.android.libraries.notifications.data.C29824o;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2293h.C30011d;
import com.google.android.libraries.notifications.p2293h.C30012e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.C60789b;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56968d;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56984t;
import com.google.p4283bv.p4345d.p4350b.p4352b.C57002l;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.notifications.b.a */
/* compiled from: PG */
public final class C136759a implements C30012e {

    /* renamed from: a */
    private final Map f372288a;

    /* renamed from: b */
    private final C62921ba f372289b;

    public C136759a(Map map, C62921ba baVar) {
        C69664n.m101061g(baVar, "extensionRegistryLite");
        this.f372288a = map;
        this.f372289b = baVar;
    }

    /* renamed from: e */
    private final C30011d m222358e(C29827r rVar, C56975k kVar) {
        C136760b bVar = (C136760b) this.f372288a.get(C56973i.m88245a(kVar.f152093b));
        if (bVar == null) {
            return C30011d.m55652e();
        }
        Intent a = bVar.mo113353a(rVar, kVar);
        if (a.getIntExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", -1) == -1) {
            a.putExtra("com.google.android.libraries.notifications.HANDLE_THREAD_UPDATE_ONCREATE", 1);
        }
        return C30011d.m55651d(C58485gu.m89846n(a));
    }

    /* renamed from: a */
    public final C30011d mo35327a(C29827r rVar, C29824o oVar) {
        C69664n.m101061g(oVar, "action");
        C63070h d = oVar.mo35023d();
        C63088z zVar = d != null ? d.f170218b : null;
        C69664n.m101058d(zVar);
        C56975k kVar = ((C56984t) C62942bv.parseFrom((C62942bv) C56984t.f152114f, zVar, this.f372289b)).f152117b;
        if (kVar == null) {
            kVar = C56975k.f152090f;
        }
        C69664n.m101060f(kVar, "parseFrom(action.payload…ite)\n        .clickAction");
        return m222358e(rVar, kVar);
    }

    /* renamed from: b */
    public final C30011d mo35328b(List list) {
        C69664n.m101061g(list, "chimeThreads");
        C29827r rVar = (C29827r) list.get(0);
        C69664n.m101061g(rVar, "thread");
        try {
            C69664n.m101061g(rVar, "thread");
            C63070h c = rVar.mo35054c();
            if (c == null || c.f170218b.mo59173M()) {
                throw new IllegalArgumentException("Payload cannot be null.");
            }
            C56968d dVar = null;
            try {
                C56968d dVar2 = (C56968d) C62942bv.parseFrom((C62942bv) C56968d.f152036t, c.f170218b, C62921ba.m95368a());
                C69664n.m101060f(dVar2, "parseFrom(\n            p…tedRegistry()\n          )");
                int a = C57002l.m88252a(dVar2.f152039b);
                if (a != 0) {
                    if (a != 1) {
                        byte[] N = dVar2.f152040c.mo59174N();
                        dVar2 = (C56968d) C62942bv.parseFrom((C62942bv) C56968d.f152036t, C60789b.m92792b(N, N.length), C62921ba.m95368a());
                    }
                }
                dVar = dVar2;
            } catch (C62974ct e) {
                C59052c cVar = (C59052c) ((C59052c) C136758b.f372287a.mo56226d()).mo56382g(e);
                cVar.mo56379ah(new C59094n(40816));
                cVar.mo56389s("%s: Failed to parse payload.", "snotification");
            } catch (RuntimeException e2) {
                C59052c cVar2 = (C59052c) ((C59052c) C136758b.f372287a.mo56226d()).mo56382g(e2);
                cVar2.mo56379ah(new C59094n(40817));
                cVar2.mo56389s("%s: Failed to decompress payload.", "snotification");
            }
            if (dVar != null) {
                C56975k kVar = dVar.f152042e;
                if (kVar == null) {
                    kVar = C56975k.f152090f;
                }
                C69664n.m101060f(kVar, "ChimeNotificationUtil.ex…(chimeThread).clickAction");
                return m222358e(rVar, kVar);
            }
            C59052c cVar3 = (C59052c) C136758b.f372287a.mo56226d();
            cVar3.mo56379ah(new C59094n(40814));
            cVar3.mo56389s("%s: Payload is missing or invalid.", "snotification");
            throw new IllegalArgumentException("Payload cannot be null");
        } catch (IllegalArgumentException e3) {
            C59052c cVar4 = (C59052c) ((C59052c) C136758b.f372287a.mo56226d()).mo56382g(e3);
            cVar4.mo56379ah(new C59094n(40815));
            cVar4.mo56389s("%s: Payload is missing or invalid.", "snotification");
            throw new IllegalArgumentException(e3);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Bundle mo35329c() {
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ Bundle mo35330d() {
        return null;
    }
}
