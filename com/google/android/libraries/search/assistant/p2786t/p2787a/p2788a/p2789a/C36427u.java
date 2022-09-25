package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.u */
/* compiled from: PG */
public final class C36427u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36427u f95119c;

    /* renamed from: d */
    private static volatile C63010eb f95120d;

    /* renamed from: a */
    public int f95121a;

    /* renamed from: b */
    public C36426t f95122b;

    static {
        C36427u uVar = new C36427u();
        f95119c = uVar;
        C62942bv.registerDefaultInstance(C36427u.class, uVar);
    }

    private C36427u() {
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
                return newMessageInfo(f95119c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36427u();
            case 4:
                return new C36424r();
            case 5:
                return f95119c;
            case 6:
                C63010eb ebVar = f95120d;
                if (ebVar == null) {
                    synchronized (C36427u.class) {
                        ebVar = f95120d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95119c);
                            f95120d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
