package com.google.assistant.p3897e.p3899b.p3901b;

import com.google.assistant.p3739a.p3740a.C48111h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.b.b.d */
/* compiled from: PG */
public final class C50877d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50877d f132472c;

    /* renamed from: d */
    private static volatile C63010eb f132473d;

    /* renamed from: a */
    public int f132474a;

    /* renamed from: b */
    public C48111h f132475b;

    static {
        C50877d dVar = new C50877d();
        f132472c = dVar;
        C62942bv.registerDefaultInstance(C50877d.class, dVar);
    }

    private C50877d() {
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
                return newMessageInfo(f132472c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50877d();
            case 4:
                return new C50876c();
            case 5:
                return f132472c;
            case 6:
                C63010eb ebVar = f132473d;
                if (ebVar == null) {
                    synchronized (C50877d.class) {
                        ebVar = f132473d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132472c);
                            f132473d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
