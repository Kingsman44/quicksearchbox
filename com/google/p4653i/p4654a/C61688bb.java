package com.google.p4653i.p4654a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.bb */
/* compiled from: PG */
public final class C61688bb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61688bb f166660f;

    /* renamed from: h */
    private static volatile C63010eb f166661h;

    /* renamed from: a */
    public int f166662a;

    /* renamed from: b */
    public C61683ax f166663b;

    /* renamed from: c */
    public C61685az f166664c;

    /* renamed from: d */
    public boolean f166665d;

    /* renamed from: e */
    public boolean f166666e;

    /* renamed from: g */
    private byte f166667g = 2;

    static {
        C61688bb bbVar = new C61688bb();
        f166660f = bbVar;
        C62942bv.registerDefaultInstance(C61688bb.class, bbVar);
    }

    private C61688bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166667g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166667g = b;
                return null;
            case 2:
                return newMessageInfo(f166660f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C61688bb();
            case 4:
                return new C61687ba();
            case 5:
                return f166660f;
            case 6:
                C63010eb ebVar = f166661h;
                if (ebVar == null) {
                    synchronized (C61688bb.class) {
                        ebVar = f166661h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166660f);
                            f166661h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
