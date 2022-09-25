package com.google.p4017at.p4027c.p4031b.p4032a.p4033a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57245b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57246ba;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.a.a.e */
/* compiled from: PG */
public final class C53875e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53875e f141375d;

    /* renamed from: f */
    private static volatile C63010eb f141376f;

    /* renamed from: a */
    public C62971cq f141377a = emptyProtobufList();

    /* renamed from: b */
    public C57340w f141378b;

    /* renamed from: c */
    public C57245b f141379c;

    /* renamed from: e */
    private byte f141380e = 2;

    static {
        C53875e eVar = new C53875e();
        f141375d = eVar;
        C62942bv.registerDefaultInstance(C53875e.class, eVar);
    }

    private C53875e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141380e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141380e = b;
                return null;
            case 2:
                return newMessageInfo(f141375d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0002\t\u0005\t", new Object[]{"a", C57246ba.class, "b", C45240c.f118157a});
            case 3:
                return new C53875e();
            case 4:
                return new C53874d();
            case 5:
                return f141375d;
            case 6:
                C63010eb ebVar = f141376f;
                if (ebVar == null) {
                    synchronized (C53875e.class) {
                        ebVar = f141376f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141375d);
                            f141376f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
