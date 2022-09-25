package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.lr */
/* compiled from: PG */
public final class C67117lr extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C67117lr f182453b;

    /* renamed from: e */
    private static volatile C63010eb f182454e;

    /* renamed from: a */
    public boolean f182455a;

    /* renamed from: c */
    private int f182456c;

    /* renamed from: d */
    private byte f182457d = 2;

    static {
        C67117lr lrVar = new C67117lr();
        f182453b = lrVar;
        C62942bv.registerDefaultInstance(C67117lr.class, lrVar);
    }

    private C67117lr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182457d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182457d = b;
                return null;
            case 2:
                return newMessageInfo(f182453b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67117lr();
            case 4:
                return new C67116lq();
            case 5:
                return f182453b;
            case 6:
                C63010eb ebVar = f182454e;
                if (ebVar == null) {
                    synchronized (C67117lr.class) {
                        ebVar = f182454e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182453b);
                            f182454e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
