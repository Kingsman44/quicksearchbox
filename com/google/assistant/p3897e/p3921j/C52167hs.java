package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.assistant.e.j.hs */
/* compiled from: PG */
public final class C52167hs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52167hs f136885c;

    /* renamed from: d */
    private static volatile C63010eb f136886d;

    /* renamed from: a */
    public int f136887a;

    /* renamed from: b */
    public C63070h f136888b;

    static {
        C52167hs hsVar = new C52167hs();
        f136885c = hsVar;
        C62942bv.registerDefaultInstance(C52167hs.class, hsVar);
    }

    private C52167hs() {
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
                return newMessageInfo(f136885c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52167hs();
            case 4:
                return new C52166hr();
            case 5:
                return f136885c;
            case 6:
                C63010eb ebVar = f136886d;
                if (ebVar == null) {
                    synchronized (C52167hs.class) {
                        ebVar = f136886d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136885c);
                            f136886d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
