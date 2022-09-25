package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.bp */
/* compiled from: PG */
public final class C66838bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66838bp f181748d;

    /* renamed from: f */
    private static volatile C63010eb f181749f;

    /* renamed from: a */
    public C62995dn f181750a = C62995dn.f170057a;

    /* renamed from: b */
    public C66840br f181751b;

    /* renamed from: c */
    public boolean f181752c;

    /* renamed from: e */
    private int f181753e;

    static {
        C66838bp bpVar = new C66838bp();
        f181748d = bpVar;
        C62942bv.registerDefaultInstance(C66838bp.class, bpVar);
    }

    private C66838bp() {
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
                return newMessageInfo(f181748d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"e", "a", C66837bo.f181747a, "b", C45240c.f118157a});
            case 3:
                return new C66838bp();
            case 4:
                return new C66836bn();
            case 5:
                return f181748d;
            case 6:
                C63010eb ebVar = f181749f;
                if (ebVar == null) {
                    synchronized (C66838bp.class) {
                        ebVar = f181749f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181748d);
                            f181749f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
