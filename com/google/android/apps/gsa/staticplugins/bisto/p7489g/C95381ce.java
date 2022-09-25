package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142295aa;
import com.google.android.p10712d.C142296ab;
import com.google.android.p10712d.C142299ae;
import com.google.android.p10712d.C142301ag;
import com.google.android.p10712d.C142302ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.HashSet;
import java.util.TimeZone;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.ce */
/* compiled from: PG */
public final class C95381ce {

    /* renamed from: a */
    public static final C59071e f266890a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.g.ce");

    /* renamed from: a */
    public static C124721s m157720a(C89492cd cdVar, String str, int i, byte[] bArr, C95307m mVar) {
        int a;
        String str2 = str;
        int i2 = i;
        int i3 = 2;
        if (i2 == 2) {
            try {
                C142302ah ahVar = (C142302ah) C62942bv.parseFrom((C62942bv) C142302ah.f386044q, bArr);
                C124721s sVar = C124721s.UNKNOWN_DEVICE_TYPE;
                if ((ahVar.f386046a & 1) != 0) {
                    int i4 = ahVar.f386047b;
                    int a2 = C142301ag.m231059a(i4);
                    if (a2 != 0 && a2 == 6) {
                        sVar = C124721s.APOLLO;
                    } else {
                        int a3 = C142301ag.m231059a(i4);
                        if (a3 != 0 && a3 == 5) {
                            sVar = C124721s.BAYWOLF;
                        } else {
                            int a4 = C142301ag.m231059a(i4);
                            if (a4 != 0 && a4 == 4) {
                                sVar = C124721s.SCOUT;
                            } else {
                                int a5 = C142301ag.m231059a(i4);
                                if (a5 != 0 && a5 == 7) {
                                    sVar = (str2.startsWith("simple-") || "wired".equals(str2)) ? C124721s.WIRED : C124721s.GENERIC_SCALED;
                                }
                            }
                        }
                    }
                }
                C124721s sVar2 = sVar;
                C124719q qVar = C124719q.HEADPHONES;
                int i5 = ahVar.f386046a;
                if (!((65536 & i5) == 0 || (a = C142299ae.m231058a(ahVar.f386061p)) == 0 || a != 3)) {
                    qVar = C124719q.CAR_ACCESSORY;
                }
                C124719q qVar2 = qVar;
                Integer valueOf = (i5 & 512) != 0 ? Integer.valueOf(ahVar.f386054i) : null;
                Integer valueOf2 = (i5 & 16) != 0 ? Integer.valueOf(ahVar.f386051f) : null;
                Boolean valueOf3 = (i5 & 256) != 0 ? Boolean.valueOf(ahVar.f386053h) : null;
                String str3 = (i5 & 8) != 0 ? ahVar.f386050e : null;
                String e = C58837ba.m90856e(ahVar.f386060o);
                if (e == null) {
                    e = C124521b.m203979b(ahVar.f386055j, sVar2);
                }
                String str4 = e;
                mVar.mo89245k(ahVar.f386049d, str, C124636bb.UNKNOWN_ENABLED_STATE, ahVar.f386055j, str4, ahVar.f386052g);
                C60856cj.m92911t(cdVar.mo83408n(str), new C95380cd(mVar, str2), C60826bg.f164896a);
                int i6 = ahVar.f386046a;
                C124721s sVar3 = sVar2;
                cdVar.mo83383Y(str, (i6 & 4) != 0 ? ahVar.f386049d : null, (i6 & 128) != 0 ? ahVar.f386052g : null, sVar2, qVar2, str3, valueOf, valueOf3, valueOf2, str4, (i6 & 2048) != 0 ? Integer.valueOf(ahVar.f386056k) : null);
                HashSet hashSet = new HashSet();
                hashSet.add(C124707e.INPUT_OUTPUT_MODE);
                if (ahVar.f386058m) {
                    hashSet.add(C124707e.INPUT_ONLY_MODE);
                }
                boolean z = ahVar.f386057l;
                boolean z2 = ahVar.f386059n;
                if (true != z) {
                    i3 = 3;
                }
                cdVar.mo83399ap(str2, i3, hashSet, Boolean.valueOf(z2));
                return sVar3;
            } catch (IOException e2) {
                C59104x c = f266890a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DeviceCapabilityHelper");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e2)).mo56372aa(14982)).mo56386p("Error parsing capability proto");
                return null;
            }
        } else {
            C59104x d = f266890a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "DeviceCapabilityHelper");
            ((C59052c) ((C59052c) d).mo56372aa(14983)).mo56387q("Unknown messageType received: %d", i2);
            return null;
        }
    }

    /* renamed from: b */
    public static C142296ab m157721b(C21370a aVar) {
        long b = aVar.mo26870b();
        C142295aa aaVar = (C142295aa) C142296ab.f386036e.createBuilder();
        aaVar.copyOnWrite();
        C142296ab abVar = (C142296ab) aaVar.instance;
        abVar.f386038a |= 1;
        abVar.f386039b = (int) (b >>> 32);
        aaVar.copyOnWrite();
        C142296ab abVar2 = (C142296ab) aaVar.instance;
        abVar2.f386038a |= 2;
        abVar2.f386040c = (int) b;
        String id = TimeZone.getDefault().getID();
        aaVar.copyOnWrite();
        C142296ab abVar3 = (C142296ab) aaVar.instance;
        id.getClass();
        abVar3.f386038a |= 4;
        abVar3.f386041d = id;
        return (C142296ab) aaVar.build();
    }
}
