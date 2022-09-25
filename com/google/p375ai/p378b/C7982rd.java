package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.rd */
/* compiled from: PG */
public final class C7982rd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7982rd f28039d;

    /* renamed from: f */
    private static volatile C63010eb f28040f;

    /* renamed from: a */
    public int f28041a;

    /* renamed from: b */
    public C8150xj f28042b;

    /* renamed from: c */
    public C7536ax f28043c;

    /* renamed from: e */
    private byte f28044e = 2;

    static {
        C7982rd rdVar = new C7982rd();
        f28039d = rdVar;
        C62942bv.registerDefaultInstance(C7982rd.class, rdVar);
    }

    private C7982rd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28044e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28044e = b;
                return null;
            case 2:
                return newMessageInfo(f28039d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7982rd();
            case 4:
                return new C7981rc();
            case 5:
                return f28039d;
            case 6:
                C63010eb ebVar = f28040f;
                if (ebVar == null) {
                    synchronized (C7982rd.class) {
                        ebVar = f28040f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28039d);
                            f28040f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
