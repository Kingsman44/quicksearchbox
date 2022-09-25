package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.an */
/* compiled from: PG */
public final class C55534an extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55534an f146543b;

    /* renamed from: c */
    private static volatile C63010eb f146544c;

    /* renamed from: a */
    public C62964ck f146545a = emptyLongList();

    static {
        C55534an anVar = new C55534an();
        f146543b = anVar;
        C62942bv.registerDefaultInstance(C55534an.class, anVar);
    }

    private C55534an() {
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
                return newMessageInfo(f146543b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"a"});
            case 3:
                return new C55534an();
            case 4:
                return new C55533am();
            case 5:
                return f146543b;
            case 6:
                C63010eb ebVar = f146544c;
                if (ebVar == null) {
                    synchronized (C55534an.class) {
                        ebVar = f146544c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146543b);
                            f146544c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
