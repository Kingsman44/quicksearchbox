package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.ah */
/* compiled from: PG */
public final class C57804ah extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C57804ah f154429f;

    /* renamed from: h */
    private static volatile C63010eb f154430h;

    /* renamed from: a */
    public int f154431a;

    /* renamed from: b */
    public C57784p f154432b;

    /* renamed from: c */
    public C57784p f154433c;

    /* renamed from: d */
    public C57802af f154434d;

    /* renamed from: e */
    public C57800ad f154435e;

    /* renamed from: g */
    private byte f154436g = 2;

    static {
        C57804ah ahVar = new C57804ah();
        f154429f = ahVar;
        C62942bv.registerDefaultInstance(C57804ah.class, ahVar);
    }

    private C57804ah() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154436g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154436g = b;
                return null;
            case 2:
                return newMessageInfo(f154429f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57804ah();
            case 4:
                return new C57803ag();
            case 5:
                return f154429f;
            case 6:
                C63010eb ebVar = f154430h;
                if (ebVar == null) {
                    synchronized (C57804ah.class) {
                        ebVar = f154430h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154429f);
                            f154430h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
