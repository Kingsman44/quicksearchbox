package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.nx */
/* compiled from: PG */
public final class C55317nx extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C55317nx f145731c;

    /* renamed from: e */
    private static volatile C63010eb f145732e;

    /* renamed from: a */
    public int f145733a;

    /* renamed from: b */
    public int f145734b;

    /* renamed from: d */
    private byte f145735d = 2;

    static {
        C55317nx nxVar = new C55317nx();
        f145731c = nxVar;
        C62942bv.registerDefaultInstance(C55317nx.class, nxVar);
    }

    private C55317nx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145735d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145735d = b;
                return null;
            case 2:
                return newMessageInfo(f145731c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55317nx();
            case 4:
                return new C55316nw();
            case 5:
                return f145731c;
            case 6:
                C63010eb ebVar = f145732e;
                if (ebVar == null) {
                    synchronized (C55317nx.class) {
                        ebVar = f145732e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145731c);
                            f145732e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
