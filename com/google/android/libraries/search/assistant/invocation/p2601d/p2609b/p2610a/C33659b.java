package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.b */
/* compiled from: PG */
public final class C33659b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33659b f89952c;

    /* renamed from: d */
    private static volatile C63010eb f89953d;

    /* renamed from: a */
    public int f89954a = 0;

    /* renamed from: b */
    public Object f89955b;

    static {
        C33659b bVar = new C33659b();
        f89952c = bVar;
        C62942bv.registerDefaultInstance(C33659b.class, bVar);
    }

    private C33659b() {
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
                return newMessageInfo(f89952c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00017\u0000\u0002<\u0000", new Object[]{"b", "a", C37418bw.class});
            case 3:
                return new C33659b();
            case 4:
                return new C33639a();
            case 5:
                return f89952c;
            case 6:
                C63010eb ebVar = f89953d;
                if (ebVar == null) {
                    synchronized (C33659b.class) {
                        ebVar = f89953d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89952c);
                            f89953d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
