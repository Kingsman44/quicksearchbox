package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.v */
/* compiled from: PG */
public final class C119903v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C119903v f333904d;

    /* renamed from: e */
    private static volatile C63010eb f333905e;

    /* renamed from: a */
    public int f333906a = 0;

    /* renamed from: b */
    public Object f333907b;

    /* renamed from: c */
    public C119834cb f333908c;

    static {
        C119903v vVar = new C119903v();
        f333904d = vVar;
        C62942bv.registerDefaultInstance(C119903v.class, vVar);
    }

    private C119903v() {
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
                return newMessageInfo(f333904d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003\t\u0004<\u0000", new Object[]{"b", "a", C119899r.class, C62912at.class, C45240c.f118157a, C62912at.class});
            case 3:
                return new C119903v();
            case 4:
                return new C119901t();
            case 5:
                return f333904d;
            case 6:
                C63010eb ebVar = f333905e;
                if (ebVar == null) {
                    synchronized (C119903v.class) {
                        ebVar = f333905e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333904d);
                            f333905e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
