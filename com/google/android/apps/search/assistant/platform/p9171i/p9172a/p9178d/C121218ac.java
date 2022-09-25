package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.android.libraries.assistant.p1594s.p1597b.C19145af;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.ac */
/* compiled from: PG */
public final class C121218ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C121218ac f336737c;

    /* renamed from: d */
    private static volatile C63010eb f336738d;

    /* renamed from: a */
    public int f336739a;

    /* renamed from: b */
    public C19145af f336740b;

    static {
        C121218ac acVar = new C121218ac();
        f336737c = acVar;
        C62942bv.registerDefaultInstance(C121218ac.class, acVar);
    }

    private C121218ac() {
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
                return newMessageInfo(f336737c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C121218ac();
            case 4:
                return new C121217ab();
            case 5:
                return f336737c;
            case 6:
                C63010eb ebVar = f336738d;
                if (ebVar == null) {
                    synchronized (C121218ac.class) {
                        ebVar = f336738d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336737c);
                            f336738d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
