package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.a.u */
/* compiled from: PG */
public final class C48152u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48152u f124590b;

    /* renamed from: c */
    private static volatile C63010eb f124591c;

    /* renamed from: a */
    public C51594nm f124592a;

    static {
        C48152u uVar = new C48152u();
        f124590b = uVar;
        C62942bv.registerDefaultInstance(C48152u.class, uVar);
    }

    private C48152u() {
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
                return newMessageInfo(f124590b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C48152u();
            case 4:
                return new C48151t();
            case 5:
                return f124590b;
            case 6:
                C63010eb ebVar = f124591c;
                if (ebVar == null) {
                    synchronized (C48152u.class) {
                        ebVar = f124591c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124590b);
                            f124591c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
