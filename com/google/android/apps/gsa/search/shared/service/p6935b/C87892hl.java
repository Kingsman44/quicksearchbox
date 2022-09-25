package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.common.p4552o.p4570p.C60386g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hl */
/* compiled from: PG */
public final class C87892hl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87892hl f237768c;

    /* renamed from: d */
    private static volatile C63010eb f237769d;

    /* renamed from: a */
    public int f237770a;

    /* renamed from: b */
    public C60386g f237771b;

    static {
        C87892hl hlVar = new C87892hl();
        f237768c = hlVar;
        C62942bv.registerDefaultInstance(C87892hl.class, hlVar);
    }

    private C87892hl() {
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
                return newMessageInfo(f237768c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87892hl();
            case 4:
                return new C87891hk();
            case 5:
                return f237768c;
            case 6:
                C63010eb ebVar = f237769d;
                if (ebVar == null) {
                    synchronized (C87892hl.class) {
                        ebVar = f237769d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237768c);
                            f237769d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
