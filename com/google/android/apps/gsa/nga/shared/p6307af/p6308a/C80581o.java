package com.google.android.apps.gsa.nga.shared.p6307af.p6308a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65342d;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.a.o */
/* compiled from: PG */
public final class C80581o extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80581o f221189i;

    /* renamed from: k */
    private static volatile C63010eb f221190k;

    /* renamed from: a */
    public int f221191a;

    /* renamed from: b */
    public C80586t f221192b;

    /* renamed from: c */
    public C80578l f221193c;

    /* renamed from: d */
    public C80589w f221194d;

    /* renamed from: e */
    public double f221195e;

    /* renamed from: f */
    public int f221196f;

    /* renamed from: g */
    public int f221197g;

    /* renamed from: h */
    public C65342d f221198h;

    /* renamed from: j */
    private byte f221199j = 2;

    static {
        C80581o oVar = new C80581o();
        f221189i = oVar;
        C62942bv.registerDefaultInstance(C80581o.class, oVar);
    }

    private C80581o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221199j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221199j = b;
                return null;
            case 2:
                return newMessageInfo(f221189i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0003\u0001\t\u0002Љ\u0003\u0000\u0005\f\u0006Љ\u0007\f\b\f\tЉ", new Object[]{"b", C45240c.f118157a, "e", C10662f.f35572a, "d", C30325g.f82003a, "a", C19618h.f54585a});
            case 3:
                return new C80581o();
            case 4:
                return new C80579m();
            case 5:
                return f221189i;
            case 6:
                C63010eb ebVar = f221190k;
                if (ebVar == null) {
                    synchronized (C80581o.class) {
                        ebVar = f221190k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221189i);
                            f221190k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
