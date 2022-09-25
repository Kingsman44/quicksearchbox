package com.google.assistant.p3879aw.p3881b;

import com.google.assistant.p3879aw.p3880a.C50592a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aw.b.j */
/* compiled from: PG */
public final class C50607j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50607j f131671c;

    /* renamed from: d */
    private static volatile C63010eb f131672d;

    /* renamed from: a */
    public int f131673a;

    /* renamed from: b */
    public int f131674b = -1;

    static {
        C50607j jVar = new C50607j();
        f131671c = jVar;
        C62942bv.registerDefaultInstance(C50607j.class, jVar);
    }

    private C50607j() {
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
                return newMessageInfo(f131671c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C50592a.f131645a});
            case 3:
                return new C50607j();
            case 4:
                return new C50606i();
            case 5:
                return f131671c;
            case 6:
                C63010eb ebVar = f131672d;
                if (ebVar == null) {
                    synchronized (C50607j.class) {
                        ebVar = f131672d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131671c);
                            f131672d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
