package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.fc */
/* compiled from: PG */
public final class C57486fc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57486fc f153555e;

    /* renamed from: g */
    private static volatile C63010eb f153556g;

    /* renamed from: a */
    public int f153557a = 0;

    /* renamed from: b */
    public Object f153558b;

    /* renamed from: c */
    public int f153559c = 0;

    /* renamed from: d */
    public Object f153560d;

    /* renamed from: f */
    private byte f153561f = 2;

    static {
        C57486fc fcVar = new C57486fc();
        f153555e = fcVar;
        C62942bv.registerDefaultInstance(C57486fc.class, fcVar);
    }

    private C57486fc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153561f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153561f = b;
                return null;
            case 2:
                return newMessageInfo(f153555e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0001\u0004ြ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C57498fo.class, C57495fl.class, C57501i.class, C57505m.class});
            case 3:
                return new C57486fc();
            case 4:
                return new C57484fa();
            case 5:
                return f153555e;
            case 6:
                C63010eb ebVar = f153556g;
                if (ebVar == null) {
                    synchronized (C57486fc.class) {
                        ebVar = f153556g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153555e);
                            f153556g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
