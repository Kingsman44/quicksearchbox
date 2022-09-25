package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57221ac;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.h */
/* compiled from: PG */
public final class C57093h extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57093h f152415c;

    /* renamed from: e */
    private static volatile C63010eb f152416e;

    /* renamed from: a */
    public C62971cq f152417a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f152418b = emptyProtobufList();

    /* renamed from: d */
    private byte f152419d = 2;

    static {
        C57093h hVar = new C57093h();
        f152415c = hVar;
        C62942bv.registerDefaultInstance(C57093h.class, hVar);
    }

    private C57093h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152419d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152419d = b;
                return null;
            case 2:
                return newMessageInfo(f152415c, "\u0001\u0002\u0000\u0000\u0002\u0005\u0002\u0000\u0002\u0002\u0002Л\u0005Л", new Object[]{"a", C57221ac.class, "b", C57696b.class});
            case 3:
                return new C57093h();
            case 4:
                return new C57092g();
            case 5:
                return f152415c;
            case 6:
                C63010eb ebVar = f152416e;
                if (ebVar == null) {
                    synchronized (C57093h.class) {
                        ebVar = f152416e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152415c);
                            f152416e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
