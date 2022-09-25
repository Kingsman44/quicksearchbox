package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.l */
/* compiled from: PG */
public final class C24801l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24801l f67766c;

    /* renamed from: d */
    private static volatile C63010eb f67767d;

    /* renamed from: a */
    public int f67768a;

    /* renamed from: b */
    public C24797h f67769b;

    static {
        C24801l lVar = new C24801l();
        f67766c = lVar;
        C62942bv.registerDefaultInstance(C24801l.class, lVar);
    }

    private C24801l() {
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
                return newMessageInfo(f67766c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C24801l();
            case 4:
                return new C24800k();
            case 5:
                return f67766c;
            case 6:
                C63010eb ebVar = f67767d;
                if (ebVar == null) {
                    synchronized (C24801l.class) {
                        ebVar = f67767d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67766c);
                            f67767d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
