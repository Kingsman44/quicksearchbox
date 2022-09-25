package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.cr */
/* compiled from: PG */
public final class C142366cr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C142366cr f386310c;

    /* renamed from: e */
    private static volatile C63010eb f386311e;

    /* renamed from: a */
    public int f386312a;

    /* renamed from: b */
    public boolean f386313b;

    /* renamed from: d */
    private int f386314d;

    static {
        C142366cr crVar = new C142366cr();
        f386310c = crVar;
        C62942bv.registerDefaultInstance(C142366cr.class, crVar);
    }

    private C142366cr() {
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
                return newMessageInfo(f386310c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", C142364cp.f386309a, "b"});
            case 3:
                return new C142366cr();
            case 4:
                return new C142363co();
            case 5:
                return f386310c;
            case 6:
                C63010eb ebVar = f386311e;
                if (ebVar == null) {
                    synchronized (C142366cr.class) {
                        ebVar = f386311e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386310c);
                            f386311e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
