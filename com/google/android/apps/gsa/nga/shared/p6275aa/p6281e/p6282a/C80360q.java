package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.q */
/* compiled from: PG */
public final class C80360q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80360q f220488b;

    /* renamed from: c */
    private static volatile C63010eb f220489c;

    /* renamed from: a */
    public C62971cq f220490a = C62942bv.emptyProtobufList();

    static {
        C80360q qVar = new C80360q();
        f220488b = qVar;
        C62942bv.registerDefaultInstance(C80360q.class, qVar);
    }

    private C80360q() {
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
                return newMessageInfo(f220488b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"a"});
            case 3:
                return new C80360q();
            case 4:
                return new C80359p();
            case 5:
                return f220488b;
            case 6:
                C63010eb ebVar = f220489c;
                if (ebVar == null) {
                    synchronized (C80360q.class) {
                        ebVar = f220489c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220488b);
                            f220489c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
