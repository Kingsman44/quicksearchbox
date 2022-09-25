package com.google.p5277z.p5282c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p5064h.p5065a.C65453b;

/* renamed from: com.google.z.c.r */
/* compiled from: PG */
public final class C68028r extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C68028r f184311a;

    /* renamed from: e */
    private static volatile C63010eb f184312e;

    /* renamed from: b */
    private int f184313b;

    /* renamed from: c */
    private C65453b f184314c;

    /* renamed from: d */
    private byte f184315d = 2;

    static {
        C68028r rVar = new C68028r();
        f184311a = rVar;
        C62942bv.registerDefaultInstance(C68028r.class, rVar);
    }

    private C68028r() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f184315d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f184315d = b;
                return null;
            case 2:
                return newMessageInfo(f184311a, "\u0001\u0001\u0000\u000188\u0001\u0000\u0000\u00018ᐉ\u0012", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C68028r();
            case 4:
                return new C68027q();
            case 5:
                return f184311a;
            case 6:
                C63010eb ebVar = f184312e;
                if (ebVar == null) {
                    synchronized (C68028r.class) {
                        ebVar = f184312e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184311a);
                            f184312e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
