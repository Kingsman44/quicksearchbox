package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.no */
/* compiled from: PG */
public final class C52325no extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52325no f137338g;

    /* renamed from: h */
    private static volatile C63010eb f137339h;

    /* renamed from: a */
    public int f137340a;

    /* renamed from: b */
    public int f137341b;

    /* renamed from: c */
    public int f137342c;

    /* renamed from: d */
    public int f137343d;

    /* renamed from: e */
    public int f137344e;

    /* renamed from: f */
    public int f137345f;

    static {
        C52325no noVar = new C52325no();
        f137338g = noVar;
        C62942bv.registerDefaultInstance(C52325no.class, noVar);
    }

    private C52325no() {
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
                return newMessageInfo(f137338g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဆ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52325no();
            case 4:
                return new C52324nn();
            case 5:
                return f137338g;
            case 6:
                C63010eb ebVar = f137339h;
                if (ebVar == null) {
                    synchronized (C52325no.class) {
                        ebVar = f137339h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137338g);
                            f137339h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
