package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ao.a.e.cy */
/* compiled from: PG */
public final class C49595cy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49595cy f127972c;

    /* renamed from: d */
    public static final C62940bt f127973d;

    /* renamed from: e */
    private static volatile C63010eb f127974e;

    /* renamed from: a */
    public C62971cq f127975a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f127976b = emptyProtobufList();

    static {
        C49595cy cyVar = new C49595cy();
        f127972c = cyVar;
        C62942bv.registerDefaultInstance(C49595cy.class, cyVar);
        f127973d = C62942bv.newSingularGeneratedExtension(C49530an.f127800e, cyVar, cyVar, (C62958ce) null, 277917800, C63066gd.MESSAGE, C49595cy.class);
    }

    private C49595cy() {
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
                return newMessageInfo(f127972c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C49524ah.class, "b", C49526aj.class});
            case 3:
                return new C49595cy();
            case 4:
                return new C49594cx();
            case 5:
                return f127972c;
            case 6:
                C63010eb ebVar = f127974e;
                if (ebVar == null) {
                    synchronized (C49595cy.class) {
                        ebVar = f127974e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127972c);
                            f127974e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
