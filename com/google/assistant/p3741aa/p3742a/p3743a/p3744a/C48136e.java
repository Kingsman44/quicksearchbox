package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.a.e */
/* compiled from: PG */
public final class C48136e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48136e f124569b;

    /* renamed from: c */
    private static volatile C63010eb f124570c;

    /* renamed from: a */
    public C51261bd f124571a;

    static {
        C48136e eVar = new C48136e();
        f124569b = eVar;
        C62942bv.registerDefaultInstance(C48136e.class, eVar);
    }

    private C48136e() {
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
                return newMessageInfo(f124569b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C48136e();
            case 4:
                return new C48135d();
            case 5:
                return f124569b;
            case 6:
                C63010eb ebVar = f124570c;
                if (ebVar == null) {
                    synchronized (C48136e.class) {
                        ebVar = f124570c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124569b);
                            f124570c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
