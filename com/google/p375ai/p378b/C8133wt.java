package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wt */
/* compiled from: PG */
public final class C8133wt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8133wt f28602c;

    /* renamed from: e */
    private static volatile C63010eb f28603e;

    /* renamed from: a */
    public int f28604a;

    /* renamed from: b */
    public C8077ur f28605b;

    /* renamed from: d */
    private byte f28606d = 2;

    static {
        C8133wt wtVar = new C8133wt();
        f28602c = wtVar;
        C62942bv.registerDefaultInstance(C8133wt.class, wtVar);
    }

    private C8133wt() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28606d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28606d = b;
                return null;
            case 2:
                return newMessageInfo(f28602c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8133wt();
            case 4:
                return new C8132ws();
            case 5:
                return f28602c;
            case 6:
                C63010eb ebVar = f28603e;
                if (ebVar == null) {
                    synchronized (C8133wt.class) {
                        ebVar = f28603e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28602c);
                            f28603e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
