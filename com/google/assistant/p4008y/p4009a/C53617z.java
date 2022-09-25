package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.y.a.z */
/* compiled from: PG */
public final class C53617z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53617z f140728c;

    /* renamed from: d */
    private static volatile C63010eb f140729d;

    /* renamed from: a */
    public int f140730a;

    /* renamed from: b */
    public C63088z f140731b = C63088z.f170246b;

    static {
        C53617z zVar = new C53617z();
        f140728c = zVar;
        C62942bv.registerDefaultInstance(C53617z.class, zVar);
    }

    private C53617z() {
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
                return newMessageInfo(f140728c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53617z();
            case 4:
                return new C53616y();
            case 5:
                return f140728c;
            case 6:
                C63010eb ebVar = f140729d;
                if (ebVar == null) {
                    synchronized (C53617z.class) {
                        ebVar = f140729d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140728c);
                            f140729d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
