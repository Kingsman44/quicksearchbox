package com.google.android.apps.gsa.p496a.p497a.p498a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.a.a.a.e */
/* compiled from: PG */
public final class C9305e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9305e f32293b;

    /* renamed from: c */
    private static volatile C63010eb f32294c;

    /* renamed from: a */
    public C62995dn f32295a = C62995dn.f170057a;

    static {
        C9305e eVar = new C9305e();
        f32293b = eVar;
        C62942bv.registerDefaultInstance(C9305e.class, eVar);
    }

    private C9305e() {
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
                return newMessageInfo(f32293b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"a", C9304d.f32292a});
            case 3:
                return new C9305e();
            case 4:
                return new C9301a();
            case 5:
                return f32293b;
            case 6:
                C63010eb ebVar = f32294c;
                if (ebVar == null) {
                    synchronized (C9305e.class) {
                        ebVar = f32294c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32293b);
                            f32294c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
