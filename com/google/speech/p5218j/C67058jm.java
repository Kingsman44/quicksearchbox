package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.jm */
/* compiled from: PG */
public final class C67058jm extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C67058jm f182284b;

    /* renamed from: e */
    private static volatile C63010eb f182285e;

    /* renamed from: a */
    public long f182286a;

    /* renamed from: c */
    private int f182287c;

    /* renamed from: d */
    private byte f182288d = 2;

    static {
        C67058jm jmVar = new C67058jm();
        f182284b = jmVar;
        C62942bv.registerDefaultInstance(C67058jm.class, jmVar);
    }

    private C67058jm() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182288d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182288d = b;
                return null;
            case 2:
                return newMessageInfo(f182284b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C67058jm();
            case 4:
                return new C67057jl();
            case 5:
                return f182284b;
            case 6:
                C63010eb ebVar = f182285e;
                if (ebVar == null) {
                    synchronized (C67058jm.class) {
                        ebVar = f182285e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182284b);
                            f182285e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
