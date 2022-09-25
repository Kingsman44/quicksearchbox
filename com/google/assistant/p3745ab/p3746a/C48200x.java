package com.google.assistant.p3745ab.p3746a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.a.x */
/* compiled from: PG */
public final class C48200x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48200x f124725a;

    /* renamed from: c */
    private static volatile C63010eb f124726c;

    /* renamed from: b */
    private byte f124727b = 2;

    static {
        C48200x xVar = new C48200x();
        f124725a = xVar;
        C62942bv.registerDefaultInstance(C48200x.class, xVar);
    }

    private C48200x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124727b);
            case 1:
                this.f124727b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f124725a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48200x();
            case 4:
                return new C48199w();
            case 5:
                return f124725a;
            case 6:
                C63010eb ebVar = f124726c;
                if (ebVar == null) {
                    synchronized (C48200x.class) {
                        ebVar = f124726c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124725a);
                            f124726c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
