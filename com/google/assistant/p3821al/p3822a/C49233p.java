package com.google.assistant.p3821al.p3822a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.p */
/* compiled from: PG */
public final class C49233p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49233p f127285c;

    /* renamed from: d */
    private static volatile C63010eb f127286d;

    /* renamed from: a */
    public int f127287a = 0;

    /* renamed from: b */
    public Object f127288b;

    static {
        C49233p pVar = new C49233p();
        f127285c = pVar;
        C62942bv.registerDefaultInstance(C49233p.class, pVar);
    }

    private C49233p() {
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
                return newMessageInfo(f127285c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C49230m.class, C49219b.class, C49232o.class});
            case 3:
                return new C49233p();
            case 4:
                return new C49220c();
            case 5:
                return f127285c;
            case 6:
                C63010eb ebVar = f127286d;
                if (ebVar == null) {
                    synchronized (C49233p.class) {
                        ebVar = f127286d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127285c);
                            f127286d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
