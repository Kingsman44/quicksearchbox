package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.e */
/* compiled from: PG */
public final class C78803e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C78803e f216897a;

    /* renamed from: b */
    private static volatile C63010eb f216898b;

    static {
        C78803e eVar = new C78803e();
        f216897a = eVar;
        C62942bv.registerDefaultInstance(C78803e.class, eVar);
    }

    private C78803e() {
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
                return newMessageInfo(f216897a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C78803e();
            case 4:
                return new C78802d();
            case 5:
                return f216897a;
            case 6:
                C63010eb ebVar = f216898b;
                if (ebVar == null) {
                    synchronized (C78803e.class) {
                        ebVar = f216898b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216897a);
                            f216898b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
