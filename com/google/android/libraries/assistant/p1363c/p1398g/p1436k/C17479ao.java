package com.google.android.libraries.assistant.p1363c.p1398g.p1436k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.g.k.ao */
/* compiled from: PG */
public final class C17479ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C17479ao f50468d;

    /* renamed from: f */
    private static volatile C63010eb f50469f;

    /* renamed from: a */
    public int f50470a;

    /* renamed from: b */
    public C17485au f50471b;

    /* renamed from: c */
    public C17522y f50472c;

    /* renamed from: e */
    private byte f50473e = 2;

    static {
        C17479ao aoVar = new C17479ao();
        f50468d = aoVar;
        C62942bv.registerDefaultInstance(C17479ao.class, aoVar);
    }

    private C17479ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f50473e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f50473e = b;
                return null;
            case 2:
                return newMessageInfo(f50468d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C17479ao();
            case 4:
                return new C17478an();
            case 5:
                return f50468d;
            case 6:
                C63010eb ebVar = f50469f;
                if (ebVar == null) {
                    synchronized (C17479ao.class) {
                        ebVar = f50469f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f50468d);
                            f50469f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
