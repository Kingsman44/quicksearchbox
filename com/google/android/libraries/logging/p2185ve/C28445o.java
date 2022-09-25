package com.google.android.libraries.logging.p2185ve;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60201dl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.o */
/* compiled from: PG */
public final class C28445o extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C28445o f77226d;

    /* renamed from: f */
    private static volatile C63010eb f77227f;

    /* renamed from: a */
    public int f77228a;

    /* renamed from: b */
    public int f77229b;

    /* renamed from: c */
    public C62961ch f77230c = emptyIntList();

    /* renamed from: e */
    private byte f77231e = 2;

    static {
        C28445o oVar = new C28445o();
        f77226d = oVar;
        C62942bv.registerDefaultInstance(C28445o.class, oVar);
    }

    private C28445o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f77231e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f77231e = b;
                return null;
            case 2:
                return newMessageInfo(f77226d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"a", "b", C60201dl.f162874a, C45240c.f118157a});
            case 3:
                return new C28445o();
            case 4:
                return new C28444n();
            case 5:
                return f77226d;
            case 6:
                C63010eb ebVar = f77227f;
                if (ebVar == null) {
                    synchronized (C28445o.class) {
                        ebVar = f77227f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77226d);
                            f77227f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
