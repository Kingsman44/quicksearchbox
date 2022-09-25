package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.anx */
/* compiled from: PG */
public final class anx extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final anx f159416e;

    /* renamed from: f */
    private static volatile C63010eb f159417f;

    /* renamed from: a */
    public int f159418a;

    /* renamed from: b */
    public C62961ch f159419b = emptyIntList();

    /* renamed from: c */
    public int f159420c;

    /* renamed from: d */
    public int f159421d = -1;

    static {
        anx anx = new anx();
        f159416e = anx;
        C62942bv.registerDefaultInstance(anx.class, anx);
    }

    private anx() {
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
                return newMessageInfo(f159416e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001d\u0002ဋ\u0000\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new anx();
            case 4:
                return new anw();
            case 5:
                return f159416e;
            case 6:
                C63010eb ebVar = f159417f;
                if (ebVar == null) {
                    synchronized (anx.class) {
                        ebVar = f159417f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159416e);
                            f159417f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
