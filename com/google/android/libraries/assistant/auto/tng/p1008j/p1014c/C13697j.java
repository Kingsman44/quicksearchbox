package com.google.android.libraries.assistant.auto.tng.p1008j.p1014c;

import com.google.android.libraries.assistant.auto.tng.p1008j.p1009a.p1011b.C13641b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.j.c.j */
/* compiled from: PG */
public final class C13697j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13697j f41785c;

    /* renamed from: d */
    private static volatile C63010eb f41786d;

    /* renamed from: a */
    public int f41787a;

    /* renamed from: b */
    public C13641b f41788b;

    static {
        C13697j jVar = new C13697j();
        f41785c = jVar;
        C62942bv.registerDefaultInstance(C13697j.class, jVar);
    }

    private C13697j() {
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
                return newMessageInfo(f41785c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13697j();
            case 4:
                return new C13696i();
            case 5:
                return f41785c;
            case 6:
                C63010eb ebVar = f41786d;
                if (ebVar == null) {
                    synchronized (C13697j.class) {
                        ebVar = f41786d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41785c);
                            f41786d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
