package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aim */
/* compiled from: PG */
public final class aim extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aim f129406d;

    /* renamed from: e */
    private static volatile C63010eb f129407e;

    /* renamed from: a */
    public int f129408a;

    /* renamed from: b */
    public boolean f129409b;

    /* renamed from: c */
    public boolean f129410c;

    static {
        aim aim = new aim();
        f129406d = aim;
        C62942bv.registerDefaultInstance(aim.class, aim);
    }

    private aim() {
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
                return newMessageInfo(f129406d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aim();
            case 4:
                return new ail();
            case 5:
                return f129406d;
            case 6:
                C63010eb ebVar = f129407e;
                if (ebVar == null) {
                    synchronized (aim.class) {
                        ebVar = f129407e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129406d);
                            f129407e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
