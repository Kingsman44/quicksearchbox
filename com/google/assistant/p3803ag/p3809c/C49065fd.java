package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.fd */
/* compiled from: PG */
public final class C49065fd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49065fd f126914b;

    /* renamed from: c */
    private static volatile C63010eb f126915c;

    /* renamed from: a */
    public C62995dn f126916a = C62995dn.f170057a;

    static {
        C49065fd fdVar = new C49065fd();
        f126914b = fdVar;
        C62942bv.registerDefaultInstance(C49065fd.class, fdVar);
    }

    private C49065fd() {
    }

    /* renamed from: a */
    public final C62995dn mo53217a() {
        C62995dn dnVar = this.f126916a;
        if (!dnVar.f170058b) {
            this.f126916a = dnVar.mo58980a();
        }
        return this.f126916a;
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
                return newMessageInfo(f126914b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", C49063fb.f126913a});
            case 3:
                return new C49065fd();
            case 4:
                return new C49064fc();
            case 5:
                return f126914b;
            case 6:
                C63010eb ebVar = f126915c;
                if (ebVar == null) {
                    synchronized (C49065fd.class) {
                        ebVar = f126915c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126914b);
                            f126915c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
