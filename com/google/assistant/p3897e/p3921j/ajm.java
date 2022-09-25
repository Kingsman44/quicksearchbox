package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ajm */
/* compiled from: PG */
public final class ajm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ajm f135226d;

    /* renamed from: e */
    private static volatile C63010eb f135227e;

    /* renamed from: a */
    public int f135228a;

    /* renamed from: b */
    public boolean f135229b;

    /* renamed from: c */
    public boolean f135230c;

    static {
        ajm ajm = new ajm();
        f135226d = ajm;
        C62942bv.registerDefaultInstance(ajm.class, ajm);
    }

    private ajm() {
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
                return newMessageInfo(f135226d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0004ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new ajm();
            case 4:
                return new ajl();
            case 5:
                return f135226d;
            case 6:
                C63010eb ebVar = f135227e;
                if (ebVar == null) {
                    synchronized (ajm.class) {
                        ebVar = f135227e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135226d);
                            f135227e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
