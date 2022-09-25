package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ek */
/* compiled from: PG */
public final class C57467ek extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57467ek f153507d;

    /* renamed from: g */
    private static volatile C63010eb f153508g;

    /* renamed from: a */
    public int f153509a = 0;

    /* renamed from: b */
    public Object f153510b;

    /* renamed from: c */
    public boolean f153511c;

    /* renamed from: e */
    private int f153512e;

    /* renamed from: f */
    private byte f153513f = 2;

    static {
        C57467ek ekVar = new C57467ek();
        f153507d = ekVar;
        C62942bv.registerDefaultInstance(C57467ek.class, ekVar);
    }

    private C57467ek() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153513f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153513f = b;
                return null;
            case 2:
                return newMessageInfo(f153507d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဇ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C57408cf.class, C57414cl.class});
            case 3:
                return new C57467ek();
            case 4:
                return new C57466ej();
            case 5:
                return f153507d;
            case 6:
                C63010eb ebVar = f153508g;
                if (ebVar == null) {
                    synchronized (C57467ek.class) {
                        ebVar = f153508g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153507d);
                            f153508g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
