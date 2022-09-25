package com.google.assistant.p3745ab.p3747aa;

import com.google.assistant.p3745ab.p3763o.C48373j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.aa.d */
/* compiled from: PG */
public final class C48205d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48205d f124732a;

    /* renamed from: d */
    private static volatile C63010eb f124733d;

    /* renamed from: b */
    private C48373j f124734b;

    /* renamed from: c */
    private byte f124735c = 2;

    static {
        C48205d dVar = new C48205d();
        f124732a = dVar;
        C62942bv.registerDefaultInstance(C48205d.class, dVar);
    }

    private C48205d() {
        emptyProtobufList();
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124735c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124735c = b;
                return null;
            case 2:
                return newMessageInfo(f124732a, "\u0000\u0001\u0000\u0000\u0016\u0016\u0001\u0000\u0000\u0001\u0016Љ", new Object[]{"b"});
            case 3:
                return new C48205d();
            case 4:
                return new C48204c();
            case 5:
                return f124732a;
            case 6:
                C63010eb ebVar = f124733d;
                if (ebVar == null) {
                    synchronized (C48205d.class) {
                        ebVar = f124733d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124732a);
                            f124733d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
