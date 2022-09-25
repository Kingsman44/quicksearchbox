package com.google.android.apps.gsa.staticplugins.opa.samson.p8435j;

import com.google.android.apps.gsa.assistant.shared.l.t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.j.am */
/* compiled from: PG */
public final class C110202am extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C110202am f307077c;

    /* renamed from: d */
    private static volatile C63010eb f307078d;

    /* renamed from: a */
    public int f307079a;

    /* renamed from: b */
    public t f307080b;

    static {
        C110202am amVar = new C110202am();
        f307077c = amVar;
        C62942bv.registerDefaultInstance(C110202am.class, amVar);
    }

    private C110202am() {
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
                return newMessageInfo(f307077c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C110202am();
            case 4:
                return new C110201al();
            case 5:
                return f307077c;
            case 6:
                C63010eb ebVar = f307078d;
                if (ebVar == null) {
                    synchronized (C110202am.class) {
                        ebVar = f307078d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f307077c);
                            f307078d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
