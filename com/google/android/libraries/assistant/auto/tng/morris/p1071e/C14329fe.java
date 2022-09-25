package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.fe */
/* compiled from: PG */
public final class C14329fe extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14329fe f43345c;

    /* renamed from: e */
    private static volatile C63010eb f43346e;

    /* renamed from: a */
    public int f43347a;

    /* renamed from: b */
    public C14333fi f43348b;

    /* renamed from: d */
    private byte f43349d = 2;

    static {
        C14329fe feVar = new C14329fe();
        f43345c = feVar;
        C62942bv.registerDefaultInstance(C14329fe.class, feVar);
    }

    private C14329fe() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43349d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43349d = b;
                return null;
            case 2:
                return newMessageInfo(f43345c, "\u0000\u0002\u0000\u0000\u0010\u0017\u0002\u0000\u0000\u0001\u0010\f\u0017Љ", new Object[]{"a", "b"});
            case 3:
                return new C14329fe();
            case 4:
                return new C14328fd();
            case 5:
                return f43345c;
            case 6:
                C63010eb ebVar = f43346e;
                if (ebVar == null) {
                    synchronized (C14329fe.class) {
                        ebVar = f43346e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43345c);
                            f43346e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
