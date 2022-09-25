package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bb */
/* compiled from: PG */
public final class C53771bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53771bb f141146c;

    /* renamed from: d */
    private static volatile C63010eb f141147d;

    /* renamed from: a */
    public int f141148a;

    /* renamed from: b */
    public int f141149b;

    static {
        C53771bb bbVar = new C53771bb();
        f141146c = bbVar;
        C62942bv.registerDefaultInstance(C53771bb.class, bbVar);
    }

    private C53771bb() {
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
                return newMessageInfo(f141146c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53770ba.f141145a});
            case 3:
                return new C53771bb();
            case 4:
                return new C53768az();
            case 5:
                return f141146c;
            case 6:
                C63010eb ebVar = f141147d;
                if (ebVar == null) {
                    synchronized (C53771bb.class) {
                        ebVar = f141147d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141146c);
                            f141147d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
