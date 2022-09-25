package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.lens.p4694a.C62045ax;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ck */
/* compiled from: PG */
public final class C54030ck extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54030ck f141757c;

    /* renamed from: e */
    private static volatile C63010eb f141758e;

    /* renamed from: a */
    public C54201r f141759a;

    /* renamed from: b */
    public C62045ax f141760b;

    /* renamed from: d */
    private byte f141761d = 2;

    static {
        C54030ck ckVar = new C54030ck();
        f141757c = ckVar;
        C62942bv.registerDefaultInstance(C54030ck.class, ckVar);
    }

    private C54030ck() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141761d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141761d = b;
                return null;
            case 2:
                return newMessageInfo(f141757c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0002\u0001Љ\u0003Љ", new Object[]{"a", "b"});
            case 3:
                return new C54030ck();
            case 4:
                return new C54029cj();
            case 5:
                return f141757c;
            case 6:
                C63010eb ebVar = f141758e;
                if (ebVar == null) {
                    synchronized (C54030ck.class) {
                        ebVar = f141758e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141757c);
                            f141758e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
