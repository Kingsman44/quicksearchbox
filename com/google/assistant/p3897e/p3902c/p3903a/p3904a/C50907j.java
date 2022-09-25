package com.google.assistant.p3897e.p3902c.p3903a.p3904a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.a.a.j */
/* compiled from: PG */
public final class C50907j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50907j f132539c;

    /* renamed from: e */
    private static volatile C63010eb f132540e;

    /* renamed from: a */
    public C50919v f132541a;

    /* renamed from: b */
    public int f132542b;

    /* renamed from: d */
    private int f132543d;

    static {
        C50907j jVar = new C50907j();
        f132539c = jVar;
        C62942bv.registerDefaultInstance(C50907j.class, jVar);
    }

    private C50907j() {
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
                return newMessageInfo(f132539c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50907j();
            case 4:
                return new C50906i();
            case 5:
                return f132539c;
            case 6:
                C63010eb ebVar = f132540e;
                if (ebVar == null) {
                    synchronized (C50907j.class) {
                        ebVar = f132540e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132539c);
                            f132540e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
