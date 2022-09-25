package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36617t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.p */
/* compiled from: PG */
public final class C36544p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36544p f95325c;

    /* renamed from: d */
    private static volatile C63010eb f95326d;

    /* renamed from: a */
    public int f95327a = 0;

    /* renamed from: b */
    public Object f95328b;

    static {
        C36544p pVar = new C36544p();
        f95325c = pVar;
        C62942bv.registerDefaultInstance(C36544p.class, pVar);
    }

    private C36544p() {
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
                return newMessageInfo(f95325c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C36550v.class, C36617t.class});
            case 3:
                return new C36544p();
            case 4:
                return new C36543o();
            case 5:
                return f95325c;
            case 6:
                C63010eb ebVar = f95326d;
                if (ebVar == null) {
                    synchronized (C36544p.class) {
                        ebVar = f95326d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95325c);
                            f95326d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
