package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.in */
/* compiled from: PG */
public final class C87921in extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87921in f237823c;

    /* renamed from: e */
    private static volatile C63010eb f237824e;

    /* renamed from: a */
    public int f237825a = 0;

    /* renamed from: b */
    public Object f237826b;

    /* renamed from: d */
    private byte f237827d = 2;

    static {
        C87921in inVar = new C87921in();
        f237823c = inVar;
        C62942bv.registerDefaultInstance(C87921in.class, inVar);
    }

    private C87921in() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237827d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237827d = b;
                return null;
            case 2:
                return newMessageInfo(f237823c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C87913if.class, C87920im.class});
            case 3:
                return new C87921in();
            case 4:
                return new C87911id();
            case 5:
                return f237823c;
            case 6:
                C63010eb ebVar = f237824e;
                if (ebVar == null) {
                    synchronized (C87921in.class) {
                        ebVar = f237824e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237823c);
                            f237824e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
