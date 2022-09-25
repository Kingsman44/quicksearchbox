package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4901b;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;

/* renamed from: com.google.protos.aw.a.a.a.a.b.p */
/* compiled from: PG */
public final class C63884p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63884p f172735c;

    /* renamed from: d */
    public static final C62940bt f172736d;

    /* renamed from: e */
    private static volatile C63010eb f172737e;

    /* renamed from: a */
    public int f172738a;

    /* renamed from: b */
    public C62910ar f172739b;

    static {
        C63884p pVar = new C63884p();
        f172735c = pVar;
        C62942bv.registerDefaultInstance(C63884p.class, pVar);
        f172736d = C62942bv.newSingularGeneratedExtension(C63955s.f172966b, pVar, pVar, (C62958ce) null, 1003, C63066gd.MESSAGE, C63884p.class);
    }

    private C63884p() {
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
                return newMessageInfo(f172735c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63884p();
            case 4:
                return new C63883o();
            case 5:
                return f172735c;
            case 6:
                C63010eb ebVar = f172737e;
                if (ebVar == null) {
                    synchronized (C63884p.class) {
                        ebVar = f172737e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172735c);
                            f172737e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
