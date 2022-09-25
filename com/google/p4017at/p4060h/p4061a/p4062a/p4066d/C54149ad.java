package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.ad */
/* compiled from: PG */
public final class C54149ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54149ad f142103c;

    /* renamed from: f */
    private static volatile C63010eb f142104f;

    /* renamed from: a */
    public C62971cq f142105a;

    /* renamed from: b */
    public long f142106b;

    /* renamed from: d */
    private int f142107d;

    /* renamed from: e */
    private byte f142108e = 2;

    static {
        C54149ad adVar = new C54149ad();
        f142103c = adVar;
        C62942bv.registerDefaultInstance(C54149ad.class, adVar);
    }

    private C54149ad() {
        emptyProtobufList();
        this.f142105a = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142108e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142108e = b;
                return null;
            case 2:
                return newMessageInfo(f142103c, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003Л\u0004ဂ\u0001", new Object[]{"d", "a", C54148ac.class, "b"});
            case 3:
                return new C54149ad();
            case 4:
                return new C54146aa();
            case 5:
                return f142103c;
            case 6:
                C63010eb ebVar = f142104f;
                if (ebVar == null) {
                    synchronized (C54149ad.class) {
                        ebVar = f142104f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142103c);
                            f142104f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
