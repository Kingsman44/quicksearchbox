package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.dm */
/* compiled from: PG */
public final class C50816dm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50816dm f132281e;

    /* renamed from: f */
    private static volatile C63010eb f132282f;

    /* renamed from: a */
    public int f132283a;

    /* renamed from: b */
    public long f132284b;

    /* renamed from: c */
    public long f132285c;

    /* renamed from: d */
    public C62964ck f132286d = emptyLongList();

    static {
        C50816dm dmVar = new C50816dm();
        f132281e = dmVar;
        C62942bv.registerDefaultInstance(C50816dm.class, dmVar);
    }

    private C50816dm() {
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
                return newMessageInfo(f132281e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003%", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50816dm();
            case 4:
                return new C50815dl();
            case 5:
                return f132281e;
            case 6:
                C63010eb ebVar = f132282f;
                if (ebVar == null) {
                    synchronized (C50816dm.class) {
                        ebVar = f132282f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132281e);
                            f132282f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
