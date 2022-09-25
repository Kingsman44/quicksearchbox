package com.google.assistant.p3950h.p3951a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5064h.C65458f;

/* renamed from: com.google.assistant.h.a.d */
/* compiled from: PG */
public final class C52965d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52965d f138864d;

    /* renamed from: f */
    private static volatile C63010eb f138865f;

    /* renamed from: a */
    public int f138866a;

    /* renamed from: b */
    public C65458f f138867b;

    /* renamed from: c */
    public C52091ex f138868c;

    /* renamed from: e */
    private byte f138869e = 2;

    static {
        C52965d dVar = new C52965d();
        f138864d = dVar;
        C62942bv.registerDefaultInstance(C52965d.class, dVar);
    }

    private C52965d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138869e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138869e = b;
                return null;
            case 2:
                return newMessageInfo(f138864d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52965d();
            case 4:
                return new C52964c();
            case 5:
                return f138864d;
            case 6:
                C63010eb ebVar = f138865f;
                if (ebVar == null) {
                    synchronized (C52965d.class) {
                        ebVar = f138865f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138864d);
                            f138865f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
