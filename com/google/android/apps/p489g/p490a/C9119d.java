package com.google.android.apps.p489g.p490a;

import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7744ii;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.g.a.d */
/* compiled from: PG */
public final class C9119d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9119d f31391c;

    /* renamed from: d */
    public static final C62940bt f31392d;

    /* renamed from: f */
    private static volatile C63010eb f31393f;

    /* renamed from: a */
    public int f31394a;

    /* renamed from: b */
    public C60220t f31395b;

    /* renamed from: e */
    private byte f31396e = 2;

    static {
        C9119d dVar = new C9119d();
        f31391c = dVar;
        C62942bv.registerDefaultInstance(C9119d.class, dVar);
        f31392d = C62942bv.newSingularGeneratedExtension(C7744ii.f27054p, dVar, dVar, (C62958ce) null, 223876094, C63066gd.MESSAGE, C9119d.class);
    }

    private C9119d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31396e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31396e = b;
                return null;
            case 2:
                return newMessageInfo(f31391c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9119d();
            case 4:
                return new C9118c();
            case 5:
                return f31391c;
            case 6:
                C63010eb ebVar = f31393f;
                if (ebVar == null) {
                    synchronized (C9119d.class) {
                        ebVar = f31393f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31391c);
                            f31393f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
