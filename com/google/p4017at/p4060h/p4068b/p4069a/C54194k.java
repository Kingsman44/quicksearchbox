package com.google.p4017at.p4060h.p4068b.p4069a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4682d.p4683a.p4684a.p4685a.C61990f;
import com.google.p395al.p398b.p399a.p400a.C8423g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.b.a.k */
/* compiled from: PG */
public final class C54194k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54194k f142224e;

    /* renamed from: g */
    private static volatile C63010eb f142225g;

    /* renamed from: a */
    public int f142226a;

    /* renamed from: b */
    public int f142227b = 0;

    /* renamed from: c */
    public Object f142228c;

    /* renamed from: d */
    public C54188e f142229d;

    /* renamed from: f */
    private byte f142230f = 2;

    static {
        C54194k kVar = new C54194k();
        f142224e = kVar;
        C62942bv.registerDefaultInstance(C54194k.class, kVar);
    }

    private C54194k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142230f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142230f = b;
                return null;
            case 2:
                return newMessageInfo(f142224e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0000\u0003ᐉ\u0002", new Object[]{C45240c.f118157a, "b", "a", C8423g.class, C61990f.class, "d"});
            case 3:
                return new C54194k();
            case 4:
                return new C54193j();
            case 5:
                return f142224e;
            case 6:
                C63010eb ebVar = f142225g;
                if (ebVar == null) {
                    synchronized (C54194k.class) {
                        ebVar = f142225g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142224e);
                            f142225g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
