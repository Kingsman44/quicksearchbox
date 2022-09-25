package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.assistant.p4008y.p4010b.C53623e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.aa */
/* compiled from: PG */
public final class C107507aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107507aa f299122c;

    /* renamed from: e */
    private static volatile C63010eb f299123e;

    /* renamed from: a */
    public int f299124a;

    /* renamed from: b */
    public C53623e f299125b;

    /* renamed from: d */
    private byte f299126d = 2;

    static {
        C107507aa aaVar = new C107507aa();
        f299122c = aaVar;
        C62942bv.registerDefaultInstance(C107507aa.class, aaVar);
    }

    private C107507aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f299126d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f299126d = b;
                return null;
            case 2:
                return newMessageInfo(f299122c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107507aa();
            case 4:
                return new C107547z();
            case 5:
                return f299122c;
            case 6:
                C63010eb ebVar = f299123e;
                if (ebVar == null) {
                    synchronized (C107507aa.class) {
                        ebVar = f299123e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299122c);
                            f299123e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
