package com.google.android.apps.search.assistant.verticals.ambient.p10019v.p10020a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.v.a.b */
/* compiled from: PG */
public final class C131839b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C131839b f360046b;

    /* renamed from: d */
    private static volatile C63010eb f360047d;

    /* renamed from: a */
    public boolean f360048a;

    /* renamed from: c */
    private int f360049c;

    static {
        C131839b bVar = new C131839b();
        f360046b = bVar;
        C62942bv.registerDefaultInstance(C131839b.class, bVar);
    }

    private C131839b() {
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
                return newMessageInfo(f360046b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C131839b();
            case 4:
                return new C131838a();
            case 5:
                return f360046b;
            case 6:
                C63010eb ebVar = f360047d;
                if (ebVar == null) {
                    synchronized (C131839b.class) {
                        ebVar = f360047d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360046b);
                            f360047d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
