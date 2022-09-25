package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.dx */
/* compiled from: PG */
public final class C62126dx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62126dx f167754a;

    /* renamed from: c */
    private static volatile C63010eb f167755c;

    /* renamed from: b */
    private byte f167756b = 2;

    static {
        C62126dx dxVar = new C62126dx();
        f167754a = dxVar;
        C62942bv.registerDefaultInstance(C62126dx.class, dxVar);
    }

    private C62126dx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167756b);
            case 1:
                this.f167756b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167754a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62126dx();
            case 4:
                return new C62125dw();
            case 5:
                return f167754a;
            case 6:
                C63010eb ebVar = f167755c;
                if (ebVar == null) {
                    synchronized (C62126dx.class) {
                        ebVar = f167755c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167754a);
                            f167755c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
