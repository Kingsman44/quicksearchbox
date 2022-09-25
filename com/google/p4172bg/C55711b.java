package com.google.p4172bg;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b */
/* compiled from: PG */
public final class C55711b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55711b f146972b;

    /* renamed from: e */
    private static volatile C63010eb f146973e;

    /* renamed from: a */
    public C55747h f146974a;

    /* renamed from: c */
    private int f146975c;

    /* renamed from: d */
    private byte f146976d = 2;

    static {
        C55711b bVar = new C55711b();
        f146972b = bVar;
        C62942bv.registerDefaultInstance(C55711b.class, bVar);
    }

    private C55711b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f146976d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f146976d = b;
                return null;
            case 2:
                return newMessageInfo(f146972b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55711b();
            case 4:
                return new C55689a();
            case 5:
                return f146972b;
            case 6:
                C63010eb ebVar = f146973e;
                if (ebVar == null) {
                    synchronized (C55711b.class) {
                        ebVar = f146973e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146972b);
                            f146973e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
