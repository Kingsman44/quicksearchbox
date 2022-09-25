package com.google.assistant.p3977m.p3978a.p3979a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.m.a.a.c */
/* compiled from: PG */
public final class C52996c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52996c f138923a;

    /* renamed from: d */
    private static volatile C63010eb f138924d;

    /* renamed from: b */
    private C62995dn f138925b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f138926c = 2;

    static {
        C52996c cVar = new C52996c();
        f138923a = cVar;
        C62942bv.registerDefaultInstance(C52996c.class, cVar);
    }

    private C52996c() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138926c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138926c = b;
                return null;
            case 2:
                return newMessageInfo(f138923a, "\u0001\u0001\u0000\u0000\b\b\u0001\u0001\u0000\u0001\bв", new Object[]{"b", C52995b.f138922a});
            case 3:
                return new C52996c();
            case 4:
                return new C52994a();
            case 5:
                return f138923a;
            case 6:
                C63010eb ebVar = f138924d;
                if (ebVar == null) {
                    synchronized (C52996c.class) {
                        ebVar = f138924d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138923a);
                            f138924d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
