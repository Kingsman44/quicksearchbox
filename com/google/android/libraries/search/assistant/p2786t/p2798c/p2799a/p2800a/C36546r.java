package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.google.android.libraries.search.assistant.p2786t.p2798c.C36608k;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.r */
/* compiled from: PG */
public final class C36546r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36546r f95329c;

    /* renamed from: d */
    private static volatile C63010eb f95330d;

    /* renamed from: a */
    public int f95331a;

    /* renamed from: b */
    public C36608k f95332b;

    static {
        C36546r rVar = new C36546r();
        f95329c = rVar;
        C62942bv.registerDefaultInstance(C36546r.class, rVar);
    }

    private C36546r() {
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
                return newMessageInfo(f95329c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36546r();
            case 4:
                return new C36545q();
            case 5:
                return f95329c;
            case 6:
                C63010eb ebVar = f95330d;
                if (ebVar == null) {
                    synchronized (C36546r.class) {
                        ebVar = f95330d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95329c);
                            f95330d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
