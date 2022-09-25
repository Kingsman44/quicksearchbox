package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95351bb;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95354be;
import com.google.android.p10712d.C142375d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.x */
/* compiled from: PG */
public final /* synthetic */ class C95929x implements C95354be {

    /* renamed from: a */
    public static final /* synthetic */ C95929x f268598a = new C95929x();

    private /* synthetic */ C95929x() {
    }

    /* renamed from: a */
    public final C58833ax mo89287a(byte[] bArr) {
        C59071e eVar = C95931z.f268603c;
        try {
            return C58833ax.m90834k((C142375d) C62942bv.parseFrom((C62942bv) C142375d.f386335d, bArr, C62921ba.m95368a()));
        } catch (IOException e) {
            C59104x c = C95931z.f268603c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "InitState");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15859)).mo56386p("Error parsing received proto");
            throw new C95351bb((Exception) e);
        }
    }
}
