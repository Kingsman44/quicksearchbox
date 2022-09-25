package com.google.android.libraries.p11016ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ak.af */
/* compiled from: PG */
public final class C147625af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C147625af f398447c;

    /* renamed from: d */
    private static volatile C63010eb f398448d;

    /* renamed from: a */
    public C62971cq f398449a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public int f398450b;

    static {
        C147625af afVar = new C147625af();
        f398447c = afVar;
        C62942bv.registerDefaultInstance(C147625af.class, afVar);
    }

    private C147625af() {
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
                return newMessageInfo(f398447c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C147625af();
            case 4:
                return new C147624ae();
            case 5:
                return f398447c;
            case 6:
                C63010eb ebVar = f398448d;
                if (ebVar == null) {
                    synchronized (C147625af.class) {
                        ebVar = f398448d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f398447c);
                            f398448d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
