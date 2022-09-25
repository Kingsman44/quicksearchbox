package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bj */
/* compiled from: PG */
public final class C80315bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80315bj f220396c;

    /* renamed from: d */
    private static volatile C63010eb f220397d;

    /* renamed from: a */
    public int f220398a = 0;

    /* renamed from: b */
    public Object f220399b;

    static {
        C80315bj bjVar = new C80315bj();
        f220396c = bjVar;
        C62942bv.registerDefaultInstance(C80315bj.class, bjVar);
    }

    private C80315bj() {
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
                return newMessageInfo(f220396c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C80314bi.class, C80312bg.class});
            case 3:
                return new C80315bj();
            case 4:
                return new C80310be();
            case 5:
                return f220396c;
            case 6:
                C63010eb ebVar = f220397d;
                if (ebVar == null) {
                    synchronized (C80315bj.class) {
                        ebVar = f220397d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220396c);
                            f220397d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
