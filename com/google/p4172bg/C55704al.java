package com.google.p4172bg;

import com.google.p4172bg.p4174b.C55723l;
import com.google.p4172bg.p4174b.C55725n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.al */
/* compiled from: PG */
public final class C55704al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55704al f146951c;

    /* renamed from: d */
    private static volatile C63010eb f146952d;

    /* renamed from: a */
    public C55725n f146953a;

    /* renamed from: b */
    public C55723l f146954b;

    static {
        C55704al alVar = new C55704al();
        f146951c = alVar;
        C62942bv.registerDefaultInstance(C55704al.class, alVar);
    }

    private C55704al() {
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
                return newMessageInfo(f146951c, "\u0000\u0002\u0000\u0000\u0003\u0005\u0002\u0000\u0000\u0000\u0003\t\u0005\t", new Object[]{"a", "b"});
            case 3:
                return new C55704al();
            case 4:
                return new C55703ak();
            case 5:
                return f146951c;
            case 6:
                C63010eb ebVar = f146952d;
                if (ebVar == null) {
                    synchronized (C55704al.class) {
                        ebVar = f146952d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146951c);
                            f146952d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
