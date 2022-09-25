package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.co */
/* compiled from: PG */
public final class C82845co extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C82845co f225898a;

    /* renamed from: e */
    private static volatile C63010eb f225899e;

    /* renamed from: b */
    private int f225900b;

    /* renamed from: c */
    private C61752n f225901c;

    /* renamed from: d */
    private byte f225902d = 2;

    static {
        C82845co coVar = new C82845co();
        f225898a = coVar;
        C62942bv.registerDefaultInstance(C82845co.class, coVar);
    }

    private C82845co() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f225902d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f225902d = b;
                return null;
            case 2:
                return newMessageInfo(f225898a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C82845co();
            case 4:
                return new C82844cn();
            case 5:
                return f225898a;
            case 6:
                C63010eb ebVar = f225899e;
                if (ebVar == null) {
                    synchronized (C82845co.class) {
                        ebVar = f225899e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225898a);
                            f225899e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
