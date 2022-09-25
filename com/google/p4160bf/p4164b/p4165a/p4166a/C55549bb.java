package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bb */
/* compiled from: PG */
public final class C55549bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55549bb f146571c;

    /* renamed from: d */
    private static volatile C63010eb f146572d;

    /* renamed from: a */
    public int f146573a;

    /* renamed from: b */
    public boolean f146574b;

    static {
        C55549bb bbVar = new C55549bb();
        f146571c = bbVar;
        C62942bv.registerDefaultInstance(C55549bb.class, bbVar);
    }

    private C55549bb() {
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
                return newMessageInfo(f146571c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C55549bb();
            case 4:
                return new C55548ba();
            case 5:
                return f146571c;
            case 6:
                C63010eb ebVar = f146572d;
                if (ebVar == null) {
                    synchronized (C55549bb.class) {
                        ebVar = f146572d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146571c);
                            f146572d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
