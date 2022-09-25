package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.x */
/* compiled from: PG */
public final class C80269x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80269x f220270b;

    /* renamed from: c */
    private static volatile C63010eb f220271c;

    /* renamed from: a */
    public C62971cq f220272a = emptyProtobufList();

    static {
        C80269x xVar = new C80269x();
        f220270b = xVar;
        C62942bv.registerDefaultInstance(C80269x.class, xVar);
    }

    private C80269x() {
    }

    /* renamed from: a */
    public final void mo74299a() {
        C62971cq cqVar = this.f220272a;
        if (!cqVar.mo58948c()) {
            this.f220272a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f220270b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C80271z.class});
            case 3:
                return new C80269x();
            case 4:
                return new C80268w();
            case 5:
                return f220270b;
            case 6:
                C63010eb ebVar = f220271c;
                if (ebVar == null) {
                    synchronized (C80269x.class) {
                        ebVar = f220271c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220270b);
                            f220271c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
