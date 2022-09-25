package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mf */
/* compiled from: PG */
public final class C53393mf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53393mf f140104a;

    /* renamed from: c */
    private static volatile C63010eb f140105c;

    /* renamed from: b */
    private byte f140106b = 2;

    static {
        C53393mf mfVar = new C53393mf();
        f140104a = mfVar;
        C62942bv.registerDefaultInstance(C53393mf.class, mfVar);
    }

    private C53393mf() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140106b);
            case 1:
                this.f140106b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f140104a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53393mf();
            case 4:
                return new C53392me();
            case 5:
                return f140104a;
            case 6:
                C63010eb ebVar = f140105c;
                if (ebVar == null) {
                    synchronized (C53393mf.class) {
                        ebVar = f140105c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140104a);
                            f140105c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
