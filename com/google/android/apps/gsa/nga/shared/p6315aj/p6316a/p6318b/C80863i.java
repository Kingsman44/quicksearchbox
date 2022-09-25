package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.i */
/* compiled from: PG */
public final class C80863i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80863i f221806b;

    /* renamed from: d */
    private static volatile C63010eb f221807d;

    /* renamed from: a */
    public C80578l f221808a;

    /* renamed from: c */
    private byte f221809c = 2;

    static {
        C80863i iVar = new C80863i();
        f221806b = iVar;
        C62942bv.registerDefaultInstance(C80863i.class, iVar);
    }

    private C80863i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221809c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f221809c = b;
                return null;
            case 2:
                return newMessageInfo(f221806b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C80863i();
            case 4:
                return new C80862h();
            case 5:
                return f221806b;
            case 6:
                C63010eb ebVar = f221807d;
                if (ebVar == null) {
                    synchronized (C80863i.class) {
                        ebVar = f221807d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221806b);
                            f221807d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
