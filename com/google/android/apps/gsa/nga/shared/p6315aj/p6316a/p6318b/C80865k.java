package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.k */
/* compiled from: PG */
public final class C80865k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80865k f221810c;

    /* renamed from: e */
    private static volatile C63010eb f221811e;

    /* renamed from: a */
    public C80578l f221812a;

    /* renamed from: b */
    public int f221813b;

    /* renamed from: d */
    private byte f221814d = 2;

    static {
        C80865k kVar = new C80865k();
        f221810c = kVar;
        C62942bv.registerDefaultInstance(C80865k.class, kVar);
    }

    private C80865k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f221814d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f221814d = b;
                return null;
            case 2:
                return newMessageInfo(f221810c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C80865k();
            case 4:
                return new C80864j();
            case 5:
                return f221810c;
            case 6:
                C63010eb ebVar = f221811e;
                if (ebVar == null) {
                    synchronized (C80865k.class) {
                        ebVar = f221811e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f221810c);
                            f221811e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
