package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.bl */
/* compiled from: PG */
public final class C37407bl extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C37407bl f99325c;

    /* renamed from: e */
    private static volatile C63010eb f99326e;

    /* renamed from: a */
    public int f99327a;

    /* renamed from: b */
    public C37773c f99328b;

    /* renamed from: d */
    private byte f99329d = 2;

    static {
        C37407bl blVar = new C37407bl();
        f99325c = blVar;
        C62942bv.registerDefaultInstance(C37407bl.class, blVar);
    }

    private C37407bl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99329d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99329d = b;
                return null;
            case 2:
                return newMessageInfo(f99325c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37407bl();
            case 4:
                return new C37406bk();
            case 5:
                return f99325c;
            case 6:
                C63010eb ebVar = f99326e;
                if (ebVar == null) {
                    synchronized (C37407bl.class) {
                        ebVar = f99326e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99325c);
                            f99326e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
