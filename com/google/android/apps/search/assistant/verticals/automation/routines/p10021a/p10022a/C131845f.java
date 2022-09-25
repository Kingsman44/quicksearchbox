package com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.a.a.f */
/* compiled from: PG */
public final class C131845f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C131845f f360061b;

    /* renamed from: d */
    private static volatile C63010eb f360062d;

    /* renamed from: a */
    public C62910ar f360063a;

    /* renamed from: c */
    private int f360064c;

    static {
        C131845f fVar = new C131845f();
        f360061b = fVar;
        C62942bv.registerDefaultInstance(C131845f.class, fVar);
    }

    private C131845f() {
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
                return newMessageInfo(f360061b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C131845f();
            case 4:
                return new C131844e();
            case 5:
                return f360061b;
            case 6:
                C63010eb ebVar = f360062d;
                if (ebVar == null) {
                    synchronized (C131845f.class) {
                        ebVar = f360062d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360061b);
                            f360062d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
