package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bp */
/* compiled from: PG */
public final class C123749bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123749bp f341822c;

    /* renamed from: d */
    private static volatile C63010eb f341823d;

    /* renamed from: a */
    public int f341824a;

    /* renamed from: b */
    public int f341825b;

    static {
        C123749bp bpVar = new C123749bp();
        f341822c = bpVar;
        C62942bv.registerDefaultInstance(C123749bp.class, bpVar);
    }

    private C123749bp() {
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
                return newMessageInfo(f341822c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C123749bp();
            case 4:
                return new C123748bo();
            case 5:
                return f341822c;
            case 6:
                C63010eb ebVar = f341823d;
                if (ebVar == null) {
                    synchronized (C123749bp.class) {
                        ebVar = f341823d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341822c);
                            f341823d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
