package com.google.android.libraries.web.webview.p3471a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.webview.a.e */
/* compiled from: PG */
public final class C44321e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C44321e f115244c;

    /* renamed from: d */
    private static volatile C63010eb f115245d;

    /* renamed from: a */
    public int f115246a;

    /* renamed from: b */
    public int f115247b = -1;

    static {
        C44321e eVar = new C44321e();
        f115244c = eVar;
        C62942bv.registerDefaultInstance(C44321e.class, eVar);
    }

    private C44321e() {
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
                return newMessageInfo(f115244c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C44321e();
            case 4:
                return new C44320d();
            case 5:
                return f115244c;
            case 6:
                C63010eb ebVar = f115245d;
                if (ebVar == null) {
                    synchronized (C44321e.class) {
                        ebVar = f115245d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f115244c);
                            f115245d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
