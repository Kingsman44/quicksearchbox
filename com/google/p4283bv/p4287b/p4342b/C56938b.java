package com.google.p4283bv.p4287b.p4342b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.b.b */
/* compiled from: PG */
public final class C56938b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56938b f151970b;

    /* renamed from: d */
    private static volatile C63010eb f151971d;

    /* renamed from: a */
    public int f151972a;

    /* renamed from: c */
    private int f151973c;

    static {
        C56938b bVar = new C56938b();
        f151970b = bVar;
        C62942bv.registerDefaultInstance(C56938b.class, bVar);
    }

    private C56938b() {
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
                return newMessageInfo(f151970b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{C45240c.f118157a, "a", C56939c.f151974a});
            case 3:
                return new C56938b();
            case 4:
                return new C56937a();
            case 5:
                return f151970b;
            case 6:
                C63010eb ebVar = f151971d;
                if (ebVar == null) {
                    synchronized (C56938b.class) {
                        ebVar = f151971d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151970b);
                            f151971d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
