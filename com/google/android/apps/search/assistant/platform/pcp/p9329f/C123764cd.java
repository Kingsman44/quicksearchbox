package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.cd */
/* compiled from: PG */
public final class C123764cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123764cd f341880c;

    /* renamed from: d */
    private static volatile C63010eb f341881d;

    /* renamed from: a */
    public int f341882a;

    /* renamed from: b */
    public int f341883b;

    static {
        C123764cd cdVar = new C123764cd();
        f341880c = cdVar;
        C62942bv.registerDefaultInstance(C123764cd.class, cdVar);
    }

    private C123764cd() {
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
                return newMessageInfo(f341880c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C123762cb.m203108b()});
            case 3:
                return new C123764cd();
            case 4:
                return new C123763cc();
            case 5:
                return f341880c;
            case 6:
                C63010eb ebVar = f341881d;
                if (ebVar == null) {
                    synchronized (C123764cd.class) {
                        ebVar = f341881d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341880c);
                            f341881d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
