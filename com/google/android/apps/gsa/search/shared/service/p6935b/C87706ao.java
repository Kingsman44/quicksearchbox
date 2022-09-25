package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ao */
/* compiled from: PG */
public final class C87706ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87706ao f237167c;

    /* renamed from: d */
    private static volatile C63010eb f237168d;

    /* renamed from: a */
    public int f237169a;

    /* renamed from: b */
    public C63088z f237170b = C63088z.f170246b;

    static {
        C87706ao aoVar = new C87706ao();
        f237167c = aoVar;
        C62942bv.registerDefaultInstance(C87706ao.class, aoVar);
    }

    private C87706ao() {
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
                return newMessageInfo(f237167c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87706ao();
            case 4:
                return new C87705an();
            case 5:
                return f237167c;
            case 6:
                C63010eb ebVar = f237168d;
                if (ebVar == null) {
                    synchronized (C87706ao.class) {
                        ebVar = f237168d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237167c);
                            f237168d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
