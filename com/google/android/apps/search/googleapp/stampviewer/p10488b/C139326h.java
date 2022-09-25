package com.google.android.apps.search.googleapp.stampviewer.p10488b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.b.h */
/* compiled from: PG */
public final class C139326h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C139326h f378938c;

    /* renamed from: d */
    private static volatile C63010eb f378939d;

    /* renamed from: a */
    public int f378940a;

    /* renamed from: b */
    public boolean f378941b;

    static {
        C139326h hVar = new C139326h();
        f378938c = hVar;
        C62942bv.registerDefaultInstance(C139326h.class, hVar);
    }

    private C139326h() {
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
                return newMessageInfo(f378938c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C139326h();
            case 4:
                return new C139325g();
            case 5:
                return f378938c;
            case 6:
                C63010eb ebVar = f378939d;
                if (ebVar == null) {
                    synchronized (C139326h.class) {
                        ebVar = f378939d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378938c);
                            f378939d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
