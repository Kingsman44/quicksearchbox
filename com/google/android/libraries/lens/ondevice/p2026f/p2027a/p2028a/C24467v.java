package com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.f.a.a.v */
/* compiled from: PG */
public final class C24467v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24467v f66971c;

    /* renamed from: d */
    private static volatile C63010eb f66972d;

    /* renamed from: a */
    public int f66973a;

    /* renamed from: b */
    public C24465t f66974b;

    static {
        C24467v vVar = new C24467v();
        f66971c = vVar;
        C62942bv.registerDefaultInstance(C24467v.class, vVar);
    }

    private C24467v() {
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
                return newMessageInfo(f66971c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C24467v();
            case 4:
                return new C24466u();
            case 5:
                return f66971c;
            case 6:
                C63010eb ebVar = f66972d;
                if (ebVar == null) {
                    synchronized (C24467v.class) {
                        ebVar = f66972d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66971c);
                            f66972d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
