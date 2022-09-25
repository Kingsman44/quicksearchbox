package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.fd */
/* compiled from: PG */
public final class C51369fd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51369fd f133788c;

    /* renamed from: d */
    private static volatile C63010eb f133789d;

    /* renamed from: a */
    public C62995dn f133790a = C62995dn.f170057a;

    /* renamed from: b */
    public C62995dn f133791b = C62995dn.f170057a;

    static {
        C51369fd fdVar = new C51369fd();
        f133788c = fdVar;
        C62942bv.registerDefaultInstance(C51369fd.class, fdVar);
    }

    private C51369fd() {
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
                return newMessageInfo(f133788c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"a", C51367fb.f133786a, "b", C51368fc.f133787a});
            case 3:
                return new C51369fd();
            case 4:
                return new C51366fa();
            case 5:
                return f133788c;
            case 6:
                C63010eb ebVar = f133789d;
                if (ebVar == null) {
                    synchronized (C51369fd.class) {
                        ebVar = f133789d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133788c);
                            f133789d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
