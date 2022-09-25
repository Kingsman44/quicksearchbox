package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.ab */
/* compiled from: PG */
public final class C57798ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57798ab f154412c;

    /* renamed from: e */
    private static volatile C63010eb f154413e;

    /* renamed from: a */
    public int f154414a;

    /* renamed from: b */
    public C57784p f154415b;

    /* renamed from: d */
    private byte f154416d = 2;

    static {
        C57798ab abVar = new C57798ab();
        f154412c = abVar;
        C62942bv.registerDefaultInstance(C57798ab.class, abVar);
    }

    private C57798ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154416d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154416d = b;
                return null;
            case 2:
                return newMessageInfo(f154412c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57798ab();
            case 4:
                return new C57797aa();
            case 5:
                return f154412c;
            case 6:
                C63010eb ebVar = f154413e;
                if (ebVar == null) {
                    synchronized (C57798ab.class) {
                        ebVar = f154413e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154412c);
                            f154413e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
