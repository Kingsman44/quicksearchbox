package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.android.libraries.search.assistant.p2786t.p2787a.C36451b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.b */
/* compiled from: PG */
public final class C36408b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36408b f95087c;

    /* renamed from: d */
    private static volatile C63010eb f95088d;

    /* renamed from: a */
    public int f95089a = 0;

    /* renamed from: b */
    public Object f95090b;

    static {
        C36408b bVar = new C36408b();
        f95087c = bVar;
        C62942bv.registerDefaultInstance(C36408b.class, bVar);
    }

    private C36408b() {
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
                return newMessageInfo(f95087c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C36451b.class, C36427u.class});
            case 3:
                return new C36408b();
            case 4:
                return new C36407a();
            case 5:
                return f95087c;
            case 6:
                C63010eb ebVar = f95088d;
                if (ebVar == null) {
                    synchronized (C36408b.class) {
                        ebVar = f95088d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95087c);
                            f95088d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
