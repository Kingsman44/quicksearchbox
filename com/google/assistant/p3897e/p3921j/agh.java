package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agh */
/* compiled from: PG */
public final class agh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final agh f135049c;

    /* renamed from: e */
    private static volatile C63010eb f135050e;

    /* renamed from: a */
    public int f135051a = 0;

    /* renamed from: b */
    public Object f135052b;

    /* renamed from: d */
    private byte f135053d = 2;

    static {
        agh agh = new agh();
        f135049c = agh;
        C62942bv.registerDefaultInstance(agh.class, agh);
    }

    private agh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135053d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f135053d = b;
                return null;
            case 2:
                return newMessageInfo(f135049c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", agg.class});
            case 3:
                return new agh();
            case 4:
                return new agd();
            case 5:
                return f135049c;
            case 6:
                C63010eb ebVar = f135050e;
                if (ebVar == null) {
                    synchronized (agh.class) {
                        ebVar = f135050e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135049c);
                            f135050e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
