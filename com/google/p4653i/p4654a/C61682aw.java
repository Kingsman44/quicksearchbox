package com.google.p4653i.p4654a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.aw */
/* compiled from: PG */
public final class C61682aw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C61682aw f166628d;

    /* renamed from: e */
    private static volatile C63010eb f166629e;

    /* renamed from: a */
    public int f166630a;

    /* renamed from: b */
    public C61672am f166631b;

    /* renamed from: c */
    public C62961ch f166632c = emptyIntList();

    static {
        C61682aw awVar = new C61682aw();
        f166628d = awVar;
        C62942bv.registerDefaultInstance(C61682aw.class, awVar);
    }

    private C61682aw() {
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
                return newMessageInfo(f166628d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001e", new Object[]{"a", "b", C45240c.f118157a, C61669aj.f166602a});
            case 3:
                return new C61682aw();
            case 4:
                return new C61681av();
            case 5:
                return f166628d;
            case 6:
                C63010eb ebVar = f166629e;
                if (ebVar == null) {
                    synchronized (C61682aw.class) {
                        ebVar = f166629e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166628d);
                            f166629e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
