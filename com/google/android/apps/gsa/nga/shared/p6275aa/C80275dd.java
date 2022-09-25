package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80208bb;
import com.google.assistant.p3825an.p3830c.p3831a.C49337n;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.C67017hz;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.dd */
/* compiled from: PG */
public final class C80275dd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80275dd f220288c;

    /* renamed from: e */
    private static volatile C63010eb f220289e;

    /* renamed from: a */
    public int f220290a = 0;

    /* renamed from: b */
    public Object f220291b;

    /* renamed from: d */
    private byte f220292d = 2;

    static {
        C80275dd ddVar = new C80275dd();
        f220288c = ddVar;
        C62942bv.registerDefaultInstance(C80275dd.class, ddVar);
    }

    private C80275dd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220292d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220292d = b;
                return null;
            case 2:
                return newMessageInfo(f220288c, "\u0001\u0015\u0001\u0000\u0001\u0015\u0015\u0000\u0000\u0004\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bᐼ\u0000\tြ\u0000\nᐼ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fᐼ\u0000\u0010ᐼ\u0000\u0011ြ\u0000\u0012ြ\u0000\u0013ြ\u0000\u0014ြ\u0000\u0015ြ\u0000", new Object[]{"b", "a", C80147by.class, C62912at.class, C80156ce.class, C80162ck.class, C80172cu.class, C80208bb.class, C80142bt.class, C80154cc.class, C80166co.class, C80164cm.class, C49337n.class, C80145bw.class, C80174cw.class, C80138bp.class, C80272da.class, C67017hz.class, C80152ca.class, C80140br.class, C80274dc.class, C80176cy.class, C80158cg.class});
            case 3:
                return new C80275dd();
            case 4:
                return new C80143bu();
            case 5:
                return f220288c;
            case 6:
                C63010eb ebVar = f220289e;
                if (ebVar == null) {
                    synchronized (C80275dd.class) {
                        ebVar = f220289e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220288c);
                            f220289e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
