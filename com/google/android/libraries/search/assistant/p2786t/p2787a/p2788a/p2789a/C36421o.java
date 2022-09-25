package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.android.libraries.search.assistant.p2786t.p2787a.C36455f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.o */
/* compiled from: PG */
public final class C36421o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36421o f95108c;

    /* renamed from: d */
    private static volatile C63010eb f95109d;

    /* renamed from: a */
    public int f95110a;

    /* renamed from: b */
    public C36455f f95111b;

    static {
        C36421o oVar = new C36421o();
        f95108c = oVar;
        C62942bv.registerDefaultInstance(C36421o.class, oVar);
    }

    private C36421o() {
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
                return newMessageInfo(f95108c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36421o();
            case 4:
                return new C36420n();
            case 5:
                return f95108c;
            case 6:
                C63010eb ebVar = f95109d;
                if (ebVar == null) {
                    synchronized (C36421o.class) {
                        ebVar = f95109d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95108c);
                            f95109d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
