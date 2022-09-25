package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.a.a.e */
/* compiled from: PG */
public final class C64113e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64113e f173331c;

    /* renamed from: d */
    private static volatile C63010eb f173332d;

    /* renamed from: a */
    public int f173333a;

    /* renamed from: b */
    public int f173334b;

    static {
        C64113e eVar = new C64113e();
        f173331c = eVar;
        C62942bv.registerDefaultInstance(C64113e.class, eVar);
    }

    private C64113e() {
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
                return newMessageInfo(f173331c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C64112d.f173330a});
            case 3:
                return new C64113e();
            case 4:
                return new C64111c();
            case 5:
                return f173331c;
            case 6:
                C63010eb ebVar = f173332d;
                if (ebVar == null) {
                    synchronized (C64113e.class) {
                        ebVar = f173332d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173331c);
                            f173332d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
