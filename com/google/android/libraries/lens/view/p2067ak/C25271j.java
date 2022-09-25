package com.google.android.libraries.lens.view.p2067ak;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.ak.j */
/* compiled from: PG */
public final class C25271j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C25271j f68747b;

    /* renamed from: c */
    private static volatile C63010eb f68748c;

    /* renamed from: a */
    public int f68749a;

    static {
        C25271j jVar = new C25271j();
        f68747b = jVar;
        C62942bv.registerDefaultInstance(C25271j.class, jVar);
    }

    private C25271j() {
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
                return newMessageInfo(f68747b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C25271j();
            case 4:
                return new C25270i();
            case 5:
                return f68747b;
            case 6:
                C63010eb ebVar = f68748c;
                if (ebVar == null) {
                    synchronized (C25271j.class) {
                        ebVar = f68748c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68747b);
                            f68748c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
