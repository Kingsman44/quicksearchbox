package com.google.frameworks.client.p4630b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.b.j */
/* compiled from: PG */
public final class C61327j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61327j f165849c;

    /* renamed from: d */
    private static volatile C63010eb f165850d;

    /* renamed from: a */
    public int f165851a = 0;

    /* renamed from: b */
    public Object f165852b;

    static {
        C61327j jVar = new C61327j();
        f165849c = jVar;
        C62942bv.registerDefaultInstance(C61327j.class, jVar);
    }

    private C61327j() {
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
                return newMessageInfo(f165849c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဵ\u0000\u0002ဳ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C61321d.class});
            case 3:
                return new C61327j();
            case 4:
                return new C61326i();
            case 5:
                return f165849c;
            case 6:
                C63010eb ebVar = f165850d;
                if (ebVar == null) {
                    synchronized (C61327j.class) {
                        ebVar = f165850d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165849c);
                            f165850d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
