package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.nlp.saft.C62849c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cz */
/* compiled from: PG */
public final class C48298cz extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48298cz f124915a;

    /* renamed from: e */
    private static volatile C63010eb f124916e;

    /* renamed from: b */
    private C62849c f124917b;

    /* renamed from: c */
    private C62849c f124918c;

    /* renamed from: d */
    private byte f124919d = 2;

    static {
        C48298cz czVar = new C48298cz();
        f124915a = czVar;
        C62942bv.registerDefaultInstance(C48298cz.class, czVar);
    }

    private C48298cz() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124919d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124919d = b;
                return null;
            case 2:
                return newMessageInfo(f124915a, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0002\u0003Љ\u0004Љ", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48298cz();
            case 4:
                return new C48297cy();
            case 5:
                return f124915a;
            case 6:
                C63010eb ebVar = f124916e;
                if (ebVar == null) {
                    synchronized (C48298cz.class) {
                        ebVar = f124916e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124915a);
                            f124916e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
