package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.ah */
/* compiled from: PG */
public final class C8219ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8219ah f28855a;

    /* renamed from: f */
    private static volatile C63010eb f28856f;

    /* renamed from: b */
    private int f28857b;

    /* renamed from: c */
    private C8213ab f28858c;

    /* renamed from: d */
    private C8213ab f28859d;

    /* renamed from: e */
    private byte f28860e = 2;

    static {
        C8219ah ahVar = new C8219ah();
        f28855a = ahVar;
        C62942bv.registerDefaultInstance(C8219ah.class, ahVar);
    }

    private C8219ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28860e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28860e = b;
                return null;
            case 2:
                return newMessageInfo(f28855a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔉ\u0000\u0002ᔉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C8219ah();
            case 4:
                return new C8218ag();
            case 5:
                return f28855a;
            case 6:
                C63010eb ebVar = f28856f;
                if (ebVar == null) {
                    synchronized (C8219ah.class) {
                        ebVar = f28856f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28855a);
                            f28856f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
