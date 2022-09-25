package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.a.r */
/* compiled from: PG */
public final class C48149r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48149r f124585b;

    /* renamed from: d */
    private static volatile C63010eb f124586d;

    /* renamed from: a */
    public C51450id f124587a;

    /* renamed from: c */
    private byte f124588c = 2;

    static {
        C48149r rVar = new C48149r();
        f124585b = rVar;
        C62942bv.registerDefaultInstance(C48149r.class, rVar);
    }

    private C48149r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124588c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124588c = b;
                return null;
            case 2:
                return newMessageInfo(f124585b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C48149r();
            case 4:
                return new C48148q();
            case 5:
                return f124585b;
            case 6:
                C63010eb ebVar = f124586d;
                if (ebVar == null) {
                    synchronized (C48149r.class) {
                        ebVar = f124586d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124585b);
                            f124586d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
