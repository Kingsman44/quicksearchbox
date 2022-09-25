package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.assistant.p3897e.p3921j.C52366pb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.a.h */
/* compiled from: PG */
public final class C48139h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48139h f124573b;

    /* renamed from: c */
    private static volatile C63010eb f124574c;

    /* renamed from: a */
    public C52366pb f124575a;

    static {
        C48139h hVar = new C48139h();
        f124573b = hVar;
        C62942bv.registerDefaultInstance(C48139h.class, hVar);
    }

    private C48139h() {
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
                return newMessageInfo(f124573b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C48139h();
            case 4:
                return new C48138g();
            case 5:
                return f124573b;
            case 6:
                C63010eb ebVar = f124574c;
                if (ebVar == null) {
                    synchronized (C48139h.class) {
                        ebVar = f124574c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124573b);
                            f124574c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
