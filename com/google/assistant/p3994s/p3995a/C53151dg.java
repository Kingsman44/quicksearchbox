package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.dg */
/* compiled from: PG */
public final class C53151dg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53151dg f139308e;

    /* renamed from: g */
    private static volatile C63010eb f139309g;

    /* renamed from: a */
    public int f139310a;

    /* renamed from: b */
    public int f139311b;

    /* renamed from: c */
    public C62961ch f139312c = emptyIntList();

    /* renamed from: d */
    public C62971cq f139313d = emptyProtobufList();

    /* renamed from: f */
    private byte f139314f = 2;

    static {
        C53151dg dgVar = new C53151dg();
        f139308e = dgVar;
        C62942bv.registerDefaultInstance(C53151dg.class, dgVar);
    }

    private C53151dg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139314f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139314f = b;
                return null;
            case 2:
                return newMessageInfo(f139308e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ဌ\u0000\u0002\u0016\u0003Л", new Object[]{"a", "b", C53306j.m86810b(), C45240c.f118157a, "d", C53150df.class});
            case 3:
                return new C53151dg();
            case 4:
                return new C53143cz();
            case 5:
                return f139308e;
            case 6:
                C63010eb ebVar = f139309g;
                if (ebVar == null) {
                    synchronized (C53151dg.class) {
                        ebVar = f139309g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139308e);
                            f139309g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
