package com.google.assistant.p3741aa.p3742a.p3743a.p3744a;

import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.aa.a.a.a.b */
/* compiled from: PG */
public final class C48133b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48133b f124564b;

    /* renamed from: d */
    private static volatile C63010eb f124565d;

    /* renamed from: a */
    public C51527l f124566a;

    /* renamed from: c */
    private byte f124567c = 2;

    static {
        C48133b bVar = new C48133b();
        f124564b = bVar;
        C62942bv.registerDefaultInstance(C48133b.class, bVar);
    }

    private C48133b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124567c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124567c = b;
                return null;
            case 2:
                return newMessageInfo(f124564b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C48133b();
            case 4:
                return new C48132a();
            case 5:
                return f124564b;
            case 6:
                C63010eb ebVar = f124565d;
                if (ebVar == null) {
                    synchronized (C48133b.class) {
                        ebVar = f124565d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124564b);
                            f124565d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
