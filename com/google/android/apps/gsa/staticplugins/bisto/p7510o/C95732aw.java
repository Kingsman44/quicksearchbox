package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142419eq;
import com.google.android.p10712d.C142432fc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60073jv;
import com.google.common.p4552o.C60075jx;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.aw */
/* compiled from: PG */
public final class C95732aw implements C95352bc {

    /* renamed from: a */
    private static final C59071e f268027a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.aw");

    /* renamed from: b */
    private final C89656k f268028b;

    /* renamed from: c */
    private final C68214a f268029c;

    public C95732aw(C68214a aVar, C89656k kVar) {
        this.f268029c = aVar;
        this.f268028b = kVar;
    }

    /* renamed from: a */
    private final synchronized void m158570a(byte[] bArr, C124548d dVar) {
        String b = C95710aa.m158488b(bArr, dVar);
        C59104x c = f268027a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "LogHandler");
        ((C59052c) ((C59052c) c).mo56372aa(15306)).mo56389s("%s", b);
        if (this.f268028b.mo83558m()) {
            C89655j.m145959c("BistoDeviceCrash", b);
        }
    }

    /* renamed from: E */
    public final boolean mo89254E(String str, int i, int i2, byte[] bArr) {
        C124548d dVar = null;
        if (i == 0) {
            throw null;
        } else if (i != 6) {
            return false;
        } else {
            if (i2 == 2) {
                dVar = ((C89492cd) this.f268029c.mo27525b()).mo83401b(str);
                m158570a(bArr, dVar);
            } else if (i2 == 1) {
                try {
                    C142419eq eqVar = (C142419eq) C62942bv.parseFrom((C62942bv) C142419eq.f386443d, bArr);
                    int a = C142432fc.m231082a(eqVar.f386446b);
                    if (a == 0) {
                        a = 1;
                    }
                    int f = C95710aa.m158492f(a);
                    if (f == 6) {
                        C59104x c = f268027a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "LogHandler");
                        ((C59052c) ((C59052c) c).mo56372aa(15305)).mo56389s("%s", eqVar.f386445a);
                    } else if (f == 5) {
                        C59104x d = f268027a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "LogHandler");
                        ((C59052c) ((C59052c) d).mo56372aa(15303)).mo56389s("%s", eqVar.f386445a);
                    }
                } catch (IOException e) {
                    C59104x c2 = f268027a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "LogHandler");
                    ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(15304)).mo56386p("Error parsing LogData proto");
                }
            } else if (i2 == 11) {
                C95710aa.m158489c(bArr);
                C58976aa aaVar = C58975e.f156826a;
                C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
                C60073jv f2 = C95307m.m157551f(bArr);
                nkVar.copyOnWrite();
                C60300nm nmVar = (C60300nm) nkVar.instance;
                C60075jx jxVar = (C60075jx) f2.build();
                jxVar.getClass();
                nmVar.f163166t = jxVar;
                nmVar.f163148b |= 2;
                C89655j.m145958b(nkVar);
            } else if (i2 == 10) {
                C95710aa.m158490d(bArr);
                C58976aa aaVar2 = C58975e.f156826a;
                C60298nk nkVar2 = (C60298nk) C60300nm.f163138H.createBuilder();
                C60073jv g = C95307m.m157552g(bArr);
                nkVar2.copyOnWrite();
                C60300nm nmVar2 = (C60300nm) nkVar2.instance;
                C60075jx jxVar2 = (C60075jx) g.build();
                jxVar2.getClass();
                nmVar2.f163166t = jxVar2;
                nmVar2.f163148b |= 2;
                C89655j.m145958b(nkVar2);
                i2 = 10;
            }
            C95710aa.m158491e(i2, bArr, dVar);
            return true;
        }
    }
}
