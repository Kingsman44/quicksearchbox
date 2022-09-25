package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.xu */
/* compiled from: PG */
public final class C50457xu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50457xu f131310b;

    /* renamed from: d */
    private static volatile C63010eb f131311d;

    /* renamed from: a */
    public int f131312a;

    /* renamed from: c */
    private int f131313c;

    static {
        C50457xu xuVar = new C50457xu();
        f131310b = xuVar;
        C62942bv.registerDefaultInstance(C50457xu.class, xuVar);
    }

    private C50457xu() {
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
                return newMessageInfo(f131310b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C50455xs.f131309a});
            case 3:
                return new C50457xu();
            case 4:
                return new C50454xr();
            case 5:
                return f131310b;
            case 6:
                C63010eb ebVar = f131311d;
                if (ebVar == null) {
                    synchronized (C50457xu.class) {
                        ebVar = f131311d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131310b);
                            f131311d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
