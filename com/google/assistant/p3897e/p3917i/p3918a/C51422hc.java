package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.hc */
/* compiled from: PG */
public final class C51422hc extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51422hc f133938f;

    /* renamed from: g */
    private static volatile C63010eb f133939g;

    /* renamed from: a */
    public int f133940a;

    /* renamed from: b */
    public C63088z f133941b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f133942c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f133943d;

    /* renamed from: e */
    public boolean f133944e;

    static {
        C51422hc hcVar = new C51422hc();
        f133938f = hcVar;
        C62942bv.registerDefaultInstance(C51422hc.class, hcVar);
    }

    private C51422hc() {
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
                return newMessageInfo(f133938f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0002\u0004ဇ\u0004\u0005ည\u0001", new Object[]{"a", "b", "d", "e", C45240c.f118157a});
            case 3:
                return new C51422hc();
            case 4:
                return new C51421hb();
            case 5:
                return f133938f;
            case 6:
                C63010eb ebVar = f133939g;
                if (ebVar == null) {
                    synchronized (C51422hc.class) {
                        ebVar = f133939g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133938f);
                            f133939g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
