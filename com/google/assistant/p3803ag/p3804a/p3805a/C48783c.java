package com.google.assistant.p3803ag.p3804a.p3805a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3804a.C48849bp;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.a.c */
/* compiled from: PG */
public final class C48783c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48783c f126226d;

    /* renamed from: f */
    private static volatile C63010eb f126227f;

    /* renamed from: a */
    public int f126228a;

    /* renamed from: b */
    public C48849bp f126229b;

    /* renamed from: c */
    public C62971cq f126230c = emptyProtobufList();

    /* renamed from: e */
    private byte f126231e = 2;

    static {
        C48783c cVar = new C48783c();
        f126226d = cVar;
        C62942bv.registerDefaultInstance(C48783c.class, cVar);
    }

    private C48783c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126231e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126231e = b;
                return null;
            case 2:
                return newMessageInfo(f126226d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C48851br.class});
            case 3:
                return new C48783c();
            case 4:
                return new C48782b();
            case 5:
                return f126226d;
            case 6:
                C63010eb ebVar = f126227f;
                if (ebVar == null) {
                    synchronized (C48783c.class) {
                        ebVar = f126227f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126226d);
                            f126227f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
