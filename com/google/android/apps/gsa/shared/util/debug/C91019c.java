package com.google.android.apps.gsa.shared.util.debug;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.c */
/* compiled from: PG */
public final class C91019c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C91019c f254257b;

    /* renamed from: c */
    private static volatile C63010eb f254258c;

    /* renamed from: a */
    public C62995dn f254259a = C62995dn.f170057a;

    static {
        C91019c cVar = new C91019c();
        f254257b = cVar;
        C62942bv.registerDefaultInstance(C91019c.class, cVar);
    }

    private C91019c() {
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
                return newMessageInfo(f254257b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C91014b.f254252a});
            case 3:
                return new C91019c();
            case 4:
                return new C90963a();
            case 5:
                return f254257b;
            case 6:
                C63010eb ebVar = f254258c;
                if (ebVar == null) {
                    synchronized (C91019c.class) {
                        ebVar = f254258c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f254257b);
                            f254258c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
