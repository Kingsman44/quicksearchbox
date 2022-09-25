package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.m */
/* compiled from: PG */
public final class C54727m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54727m f143623c;

    /* renamed from: d */
    private static volatile C63010eb f143624d;

    /* renamed from: a */
    public C62971cq f143625a = emptyProtobufList();

    /* renamed from: b */
    public C63088z f143626b = C63088z.f170246b;

    static {
        C54727m mVar = new C54727m();
        f143623c = mVar;
        C62942bv.registerDefaultInstance(C54727m.class, mVar);
    }

    private C54727m() {
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
                return newMessageInfo(f143623c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\n", new Object[]{"a", C54683b.class, "b"});
            case 3:
                return new C54727m();
            case 4:
                return new C54726l();
            case 5:
                return f143623c;
            case 6:
                C63010eb ebVar = f143624d;
                if (ebVar == null) {
                    synchronized (C54727m.class) {
                        ebVar = f143624d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143623c);
                            f143624d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
