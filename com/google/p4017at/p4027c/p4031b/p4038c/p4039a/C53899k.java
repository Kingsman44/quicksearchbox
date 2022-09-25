package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57340w;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.c.b.c.a.k */
/* compiled from: PG */
public final class C53899k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53899k f141430c;

    /* renamed from: d */
    private static volatile C63010eb f141431d;

    /* renamed from: a */
    public C57340w f141432a;

    /* renamed from: b */
    public C62971cq f141433b = C62942bv.emptyProtobufList();

    static {
        C53899k kVar = new C53899k();
        f141430c = kVar;
        C62942bv.registerDefaultInstance(C53899k.class, kVar);
    }

    private C53899k() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f141430c, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001\t\u0004Ț", new Object[]{"a", "b"});
            case 3:
                return new C53899k();
            case 4:
                return new C53898j();
            case 5:
                return f141430c;
            case 6:
                C63010eb ebVar = f141431d;
                if (ebVar == null) {
                    synchronized (C53899k.class) {
                        ebVar = f141431d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141430c);
                            f141431d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
