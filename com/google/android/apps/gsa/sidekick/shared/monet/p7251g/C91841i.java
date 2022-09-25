package com.google.android.apps.gsa.sidekick.shared.monet.p7251g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.g.i */
/* compiled from: PG */
public final class C91841i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C91841i f256124a;

    /* renamed from: b */
    public static final C62940bt f256125b = C62942bv.newSingularGeneratedExtension(C91835c.f256110a, C91839g.f256120c, C91839g.f256120c, (C62958ce) null, 229556080, C63066gd.MESSAGE, C91839g.class);

    /* renamed from: c */
    private static volatile C63010eb f256126c;

    static {
        C91841i iVar = new C91841i();
        f256124a = iVar;
        C62942bv.registerDefaultInstance(C91841i.class, iVar);
    }

    private C91841i() {
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
                return newMessageInfo(f256124a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C91841i();
            case 4:
                return new C91840h();
            case 5:
                return f256124a;
            case 6:
                C63010eb ebVar = f256126c;
                if (ebVar == null) {
                    synchronized (C91841i.class) {
                        ebVar = f256126c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256124a);
                            f256126c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
