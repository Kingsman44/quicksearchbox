package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3830c.p3831a.C49349z;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bu */
/* compiled from: PG */
public final class C49863bu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49863bu f129572f;

    /* renamed from: g */
    private static volatile C63010eb f129573g;

    /* renamed from: a */
    public int f129574a;

    /* renamed from: b */
    public int f129575b = 0;

    /* renamed from: c */
    public Object f129576c;

    /* renamed from: d */
    public int f129577d;

    /* renamed from: e */
    public C51058ev f129578e;

    static {
        C49863bu buVar = new C49863bu();
        f129572f = buVar;
        C62942bv.registerDefaultInstance(C49863bu.class, buVar);
    }

    private C49863bu() {
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
                return newMessageInfo(f129572f, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ျ\u0000\u0005ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C49349z.f127554a, "e", C49862bt.class});
            case 3:
                return new C49863bu();
            case 4:
                return new C49860br();
            case 5:
                return f129572f;
            case 6:
                C63010eb ebVar = f129573g;
                if (ebVar == null) {
                    synchronized (C49863bu.class) {
                        ebVar = f129573g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129572f);
                            f129573g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
