package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.c.b.c.a.m */
/* compiled from: PG */
public final class C53901m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53901m f141434b;

    /* renamed from: c */
    private static volatile C63010eb f141435c;

    /* renamed from: a */
    public C62971cq f141436a = emptyProtobufList();

    static {
        C53901m mVar = new C53901m();
        f141434b = mVar;
        C62942bv.registerDefaultInstance(C53901m.class, mVar);
    }

    private C53901m() {
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
                return newMessageInfo(f141434b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53903o.class});
            case 3:
                return new C53901m();
            case 4:
                return new C53900l();
            case 5:
                return f141434b;
            case 6:
                C63010eb ebVar = f141435c;
                if (ebVar == null) {
                    synchronized (C53901m.class) {
                        ebVar = f141435c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141434b);
                            f141435c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
