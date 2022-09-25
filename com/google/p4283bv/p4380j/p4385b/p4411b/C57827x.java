package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.x */
/* compiled from: PG */
public final class C57827x extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57827x f154499e;

    /* renamed from: g */
    private static volatile C63010eb f154500g;

    /* renamed from: a */
    public int f154501a;

    /* renamed from: b */
    public int f154502b = 0;

    /* renamed from: c */
    public Object f154503c;

    /* renamed from: d */
    public C57813j f154504d;

    /* renamed from: f */
    private byte f154505f = 2;

    static {
        C57827x xVar = new C57827x();
        f154499e = xVar;
        C62942bv.registerDefaultInstance(C57827x.class, xVar);
    }

    private C57827x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154505f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154505f = b;
                return null;
            case 2:
                return newMessageInfo(f154499e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C57798ab.class, C57804ah.class});
            case 3:
                return new C57827x();
            case 4:
                return new C57826w();
            case 5:
                return f154499e;
            case 6:
                C63010eb ebVar = f154500g;
                if (ebVar == null) {
                    synchronized (C57827x.class) {
                        ebVar = f154500g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154499e);
                            f154500g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
