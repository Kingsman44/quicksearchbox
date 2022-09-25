package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.cr */
/* compiled from: PG */
public final class C19971cr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19971cr f55946e;

    /* renamed from: g */
    private static volatile C63010eb f55947g;

    /* renamed from: a */
    public int f55948a;

    /* renamed from: b */
    public boolean f55949b;

    /* renamed from: c */
    public boolean f55950c;

    /* renamed from: d */
    public boolean f55951d;

    /* renamed from: f */
    private int f55952f;

    static {
        C19971cr crVar = new C19971cr();
        f55946e = crVar;
        C62942bv.registerDefaultInstance(C19971cr.class, crVar);
    }

    private C19971cr() {
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
                return newMessageInfo(f55946e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19971cr();
            case 4:
                return new C19970cq();
            case 5:
                return f55946e;
            case 6:
                C63010eb ebVar = f55947g;
                if (ebVar == null) {
                    synchronized (C19971cr.class) {
                        ebVar = f55947g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55946e);
                            f55947g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
