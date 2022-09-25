package com.google.android.apps.search.assistant.verticals.automation.routines.p10021a.p10022a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.a.a.b */
/* compiled from: PG */
public final class C131841b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C131841b f360050b;

    /* renamed from: d */
    private static volatile C63010eb f360051d;

    /* renamed from: a */
    public int f360052a;

    /* renamed from: c */
    private int f360053c;

    static {
        C131841b bVar = new C131841b();
        f360050b = bVar;
        C62942bv.registerDefaultInstance(C131841b.class, bVar);
    }

    private C131841b() {
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
                return newMessageInfo(f360050b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C131841b();
            case 4:
                return new C131840a();
            case 5:
                return f360050b;
            case 6:
                C63010eb ebVar = f360051d;
                if (ebVar == null) {
                    synchronized (C131841b.class) {
                        ebVar = f360051d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360050b);
                            f360051d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
