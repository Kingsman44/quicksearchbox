package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.y */
/* compiled from: PG */
public final class C48923y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48923y f126600f;

    /* renamed from: h */
    private static volatile C63010eb f126601h;

    /* renamed from: a */
    public int f126602a;

    /* renamed from: b */
    public C48919u f126603b;

    /* renamed from: c */
    public C48904f f126604c;

    /* renamed from: d */
    public int f126605d;

    /* renamed from: e */
    public int f126606e;

    /* renamed from: g */
    private byte f126607g = 2;

    static {
        C48923y yVar = new C48923y();
        f126600f = yVar;
        C62942bv.registerDefaultInstance(C48923y.class, yVar);
    }

    private C48923y() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126607g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126607g = b;
                return null;
            case 2:
                return newMessageInfo(f126600f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C48922x.m85307b(), "e", C48922x.m85307b()});
            case 3:
                return new C48923y();
            case 4:
                return new C48920v();
            case 5:
                return f126600f;
            case 6:
                C63010eb ebVar = f126601h;
                if (ebVar == null) {
                    synchronized (C48923y.class) {
                        ebVar = f126601h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126600f);
                            f126601h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
