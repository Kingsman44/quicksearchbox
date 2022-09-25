package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84835b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.p10923ac.p10948d.p10953b.C147325e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4895aw.p4902b.C64020cc;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.n */
/* compiled from: PG */
public final class C97291n extends C86734a implements C84835b {

    /* renamed from: a */
    private static final C59071e f271715a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bv.n");

    /* renamed from: b */
    private final C147325e f271716b;

    public C97291n(C147325e eVar) {
        super(C118575h.WORKER_MDH_PUSH, "mdh_push");
        this.f271716b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo78519a(byte[] bArr) {
        try {
            return C118826c.m197213c(this.f271716b.mo124096b((C64020cc) C62942bv.parseFrom((C62942bv) C64020cc.f173121b, bArr)));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f271715a.mo56225c()).mo56382g(e)).mo56372aa(20920)).mo56386p("Failed to parse notification payload");
            return C118826c.f331423b;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
