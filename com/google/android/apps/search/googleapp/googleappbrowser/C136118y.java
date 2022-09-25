package com.google.android.apps.search.googleapp.googleappbrowser;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.y */
/* compiled from: PG */
public final class C136118y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136118y f370716c;

    /* renamed from: d */
    private static volatile C63010eb f370717d;

    /* renamed from: a */
    public int f370718a;

    /* renamed from: b */
    public C135524bq f370719b;

    static {
        C136118y yVar = new C136118y();
        f370716c = yVar;
        C62942bv.registerDefaultInstance(C136118y.class, yVar);
    }

    private C136118y() {
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
                return newMessageInfo(f370716c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136118y();
            case 4:
                return new C136117x();
            case 5:
                return f370716c;
            case 6:
                C63010eb ebVar = f370717d;
                if (ebVar == null) {
                    synchronized (C136118y.class) {
                        ebVar = f370717d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370716c);
                            f370717d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
