package com.google.common.p4552o.p4570p;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.z */
/* compiled from: PG */
public final class C60405z extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60405z f163465h;

    /* renamed from: i */
    private static volatile C63010eb f163466i;

    /* renamed from: a */
    public int f163467a;

    /* renamed from: b */
    public int f163468b;

    /* renamed from: c */
    public long f163469c;

    /* renamed from: d */
    public int f163470d;

    /* renamed from: e */
    public int f163471e;

    /* renamed from: f */
    public boolean f163472f;

    /* renamed from: g */
    public int f163473g;

    static {
        C60405z zVar = new C60405z();
        f163465h = zVar;
        C62942bv.registerDefaultInstance(C60405z.class, zVar);
    }

    private C60405z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f163465h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဃ\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"a", "b", C60404y.f163464a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60405z();
            case 4:
                return new C60403x();
            case 5:
                return f163465h;
            case 6:
                C63010eb ebVar = f163466i;
                if (ebVar == null) {
                    synchronized (C60405z.class) {
                        ebVar = f163466i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163465h);
                            f163466i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
