package com.google.android.libraries.search.p2904c.p2942m.p2943a;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37417bv;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37508do;
import com.google.android.libraries.search.p2904c.C37510dq;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37560ea;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37701id;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.c.m.a.c */
/* compiled from: PG */
public final class C37848c {
    /* renamed from: a */
    public static final C37514du m66814a(C37512ds dsVar) {
        C69664n.m101061g(dsVar, "failure");
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C69664n.m101060f(dtVar, "newBuilder()");
        C37508do a = C69664n.m101061g(dtVar, "builder");
        a.mo40994b(dsVar);
        return a.mo40993a();
    }

    /* renamed from: b */
    public static /* synthetic */ C37400be m66815b(C58833ax axVar, C58833ax axVar2, C37561eb ebVar, C58833ax axVar3, int i) {
        if ((i & 1) != 0) {
            axVar = C58836b.f156633a;
        }
        if ((i & 2) != 0) {
            axVar2 = C58836b.f156633a;
        }
        if ((i & 8) != 0) {
            axVar3 = C58836b.f156633a;
        }
        C69664n.m101061g(axVar, "audioAccessorOptional");
        C69664n.m101061g(axVar2, "audioBytesReceiverRegistryOptional");
        C69664n.m101061g(ebVar, "status");
        C69664n.m101061g(axVar3, "firstByteReadResultFutureOptional");
        return new C37847b(axVar, axVar2, ebVar, axVar3);
    }

    /* renamed from: c */
    public static final C37418bw m66816c(C37514du duVar, C37565ef efVar) {
        C69664n.m101061g(duVar, "status");
        C69664n.m101061g(efVar, "stopListeningReason");
        C37417bv bvVar = (C37417bv) C37418bw.f99351d.createBuilder();
        C69664n.m101060f(bvVar, "newBuilder()");
        C37701id a = C69664n.m101061g(bvVar, "builder");
        a.mo41083b(duVar);
        C69664n.m101061g(efVar, "value");
        C37417bv bvVar2 = a.f100131a;
        bvVar2.copyOnWrite();
        C37418bw bwVar = (C37418bw) bvVar2.instance;
        bwVar.f99355c = efVar.f99828q;
        bwVar.f99353a |= 2;
        return a.mo41082a();
    }

    /* renamed from: d */
    public static final C37400be m66817d(C37519dz dzVar) {
        C69664n.m101061g(dzVar, "failure");
        C37560ea eaVar = (C37560ea) C37561eb.f99800c.createBuilder();
        C69664n.m101060f(eaVar, "newBuilder()");
        C37510dq a = C69664n.m101061g(eaVar, "builder");
        a.mo40997b(dzVar);
        return m66815b((C58833ax) null, (C58833ax) null, a.mo40996a(), (C58833ax) null, 11);
    }
}
