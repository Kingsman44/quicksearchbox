package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.az */
/* compiled from: PG */
public final class C54322az extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54322az f142696b;

    /* renamed from: c */
    private static volatile C63010eb f142697c;

    /* renamed from: a */
    public C62995dn f142698a = C62995dn.f170057a;

    static {
        C54322az azVar = new C54322az();
        f142696b = azVar;
        C62942bv.registerDefaultInstance(C54322az.class, azVar);
    }

    private C54322az() {
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
                return newMessageInfo(f142696b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C54321ay.f142695a});
            case 3:
                return new C54322az();
            case 4:
                return new C54320ax();
            case 5:
                return f142696b;
            case 6:
                C63010eb ebVar = f142697c;
                if (ebVar == null) {
                    synchronized (C54322az.class) {
                        ebVar = f142697c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142696b);
                            f142697c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
