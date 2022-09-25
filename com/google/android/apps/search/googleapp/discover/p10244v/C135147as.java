package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134538ac;
import com.google.android.apps.search.googleapp.discover.p10214s.C134553ar;
import com.google.android.apps.search.googleapp.discover.p10214s.C134555at;
import com.google.android.apps.search.googleapp.discover.p10214s.C134556au;
import com.google.android.apps.search.googleapp.discover.p10214s.C134557av;
import com.google.android.apps.search.googleapp.discover.p10214s.C134558aw;
import com.google.android.apps.search.googleapp.discover.p10214s.C134573bk;
import com.google.android.apps.search.googleapp.discover.p10214s.C134603u;
import com.google.android.apps.search.googleapp.discover.p10214s.C134605w;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.as */
/* compiled from: PG */
final class C135147as implements C135202v {

    /* renamed from: a */
    final /* synthetic */ C135157bb f368108a;

    public C135147as(C135157bb bbVar) {
        this.f368108a = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo112131a(C135205y yVar) {
        ArrayList arrayList;
        Optional b = yVar.mo112164b(this.f368108a.f368141g);
        if (b.isPresent()) {
            C62921ba baVar = this.f368108a.f368137c;
            C134556au auVar = (C134556au) C62942bv.parseFrom((C62942bv) C134556au.f366435f, (byte[]) b.get(), baVar);
            C69664n.m101060f(auVar, "parseFrom(session.get(), extensionRegistryLite)");
            C134555at a = C134555at.m218283a(auVar.f366439c);
            if (a == null) {
                a = C134555at.UNKNOWN;
            }
            a.name();
            C135155b bVar = this.f368108a.f368140f;
            C134558aw awVar = auVar.f366438b;
            if (awVar == null) {
                awVar = C134558aw.f366443h;
            }
            String str = awVar.f366448d;
            C69664n.m101060f(str, "state.structure.sessionId");
            C69664n.m101061g(str, "sessionId");
            synchronized (bVar.f368128b) {
                List list = bVar.f368130d;
                ArrayList<C135182c> arrayList2 = new ArrayList<>();
                for (Object next : list) {
                    if (C69664n.m101066l(((C135182c) next).f368222a, str)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList<C134538ac> arrayList3 = new ArrayList<>();
                for (C135182c cVar : arrayList2) {
                    C69540x.m100811r(arrayList3, cVar.f368224c);
                }
                arrayList = new ArrayList(C69540x.m100804k(arrayList3, 10));
                for (C134538ac acVar : arrayList3) {
                    C134573bk bkVar = acVar.f366379b;
                    if (bkVar == null) {
                        bkVar = C134573bk.f366497h;
                    }
                    arrayList.add(bkVar);
                }
            }
            C69664n.m101061g(auVar, "sessionState");
            if (arrayList.isEmpty()) {
                return auVar;
            }
            C62934bn builder = auVar.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C134603u a2 = C69664n.m101061g((C134553ar) builder, "builder");
            C62934bn builder2 = a2.mo111832b().toBuilder();
            C69664n.m101060f(builder2, "this.toBuilder()");
            C134605w a3 = C69664n.m101061g((C134557av) builder2, "builder");
            a3.mo111839d();
            a3.mo111838c(arrayList);
            a2.mo111835e(a3.mo111836a());
            return a2.mo111831a();
        }
        C134556au auVar2 = C134556au.f366435f;
        C69664n.m101060f(auVar2, "{\n            logger.atF…ultInstance()\n          }");
        return auVar2;
    }
}
