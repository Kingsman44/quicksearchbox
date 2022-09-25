package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.ak */
/* compiled from: PG */
public final class C80289ak extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80289ak f220317d;

    /* renamed from: f */
    private static volatile C63010eb f220318f;

    /* renamed from: a */
    public int f220319a;

    /* renamed from: b */
    public int f220320b;

    /* renamed from: c */
    public C65768az f220321c;

    /* renamed from: e */
    private byte f220322e = 2;

    static {
        C80289ak akVar = new C80289ak();
        f220317d = akVar;
        C62942bv.registerDefaultInstance(C80289ak.class, akVar);
    }

    private C80289ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220322e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220322e = b;
                return null;
            case 2:
                return newMessageInfo(f220317d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a});
            case 3:
                return new C80289ak();
            case 4:
                return new C80288aj();
            case 5:
                return f220317d;
            case 6:
                C63010eb ebVar = f220318f;
                if (ebVar == null) {
                    synchronized (C80289ak.class) {
                        ebVar = f220318f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220317d);
                            f220318f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
