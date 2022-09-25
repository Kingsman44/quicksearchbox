package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80570d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.da */
/* compiled from: PG */
public final class C80272da extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80272da f220278b;

    /* renamed from: d */
    private static volatile C63010eb f220279d;

    /* renamed from: a */
    public C62971cq f220280a = emptyProtobufList();

    /* renamed from: c */
    private byte f220281c = 2;

    static {
        C80272da daVar = new C80272da();
        f220278b = daVar;
        C62942bv.registerDefaultInstance(C80272da.class, daVar);
    }

    private C80272da() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220281c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220281c = b;
                return null;
            case 2:
                return newMessageInfo(f220278b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C80570d.class});
            case 3:
                return new C80272da();
            case 4:
                return new C80177cz();
            case 5:
                return f220278b;
            case 6:
                C63010eb ebVar = f220279d;
                if (ebVar == null) {
                    synchronized (C80272da.class) {
                        ebVar = f220279d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220278b);
                            f220279d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
