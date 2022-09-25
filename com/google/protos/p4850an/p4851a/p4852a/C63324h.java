package com.google.protos.p4850an.p4851a.p4852a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.a.a.h */
/* compiled from: PG */
public final class C63324h extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C63324h f171148d;

    /* renamed from: f */
    private static volatile C63010eb f171149f;

    /* renamed from: a */
    public int f171150a;

    /* renamed from: b */
    public C61752n f171151b;

    /* renamed from: c */
    public float f171152c;

    /* renamed from: e */
    private byte f171153e = 2;

    static {
        C63324h hVar = new C63324h();
        f171148d = hVar;
        C62942bv.registerDefaultInstance(C63324h.class, hVar);
    }

    private C63324h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171153e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171153e = b;
                return null;
            case 2:
                return newMessageInfo(f171148d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63324h();
            case 4:
                return new C63323g();
            case 5:
                return f171148d;
            case 6:
                C63010eb ebVar = f171149f;
                if (ebVar == null) {
                    synchronized (C63324h.class) {
                        ebVar = f171149f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171148d);
                            f171149f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
