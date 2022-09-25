package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d;

import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.u */
/* compiled from: PG */
public final class C101781u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C101781u f283916c;

    /* renamed from: d */
    private static volatile C63010eb f283917d;

    /* renamed from: a */
    public int f283918a;

    /* renamed from: b */
    public C92380d f283919b;

    static {
        C101781u uVar = new C101781u();
        f283916c = uVar;
        C62942bv.registerDefaultInstance(C101781u.class, uVar);
    }

    private C101781u() {
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
                return newMessageInfo(f283916c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C101781u();
            case 4:
                return new C101780t();
            case 5:
                return f283916c;
            case 6:
                C63010eb ebVar = f283917d;
                if (ebVar == null) {
                    synchronized (C101781u.class) {
                        ebVar = f283917d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f283916c);
                            f283917d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
