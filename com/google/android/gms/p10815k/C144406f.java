package com.google.android.gms.p10815k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.gms.k.f */
/* compiled from: PG */
public final class C144406f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C144406f f390987b;

    /* renamed from: d */
    private static volatile C63010eb f390988d;

    /* renamed from: a */
    public C62995dn f390989a = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f390990c = C62995dn.f170057a;

    static {
        C144406f fVar = new C144406f();
        f390987b = fVar;
        C62942bv.registerDefaultInstance(C144406f.class, fVar);
    }

    private C144406f() {
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
                return newMessageInfo(f390987b, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0002\u0000\u0000\u00012\u00032", new Object[]{"a", C144404d.f390986a, C45240c.f118157a, C144403c.f390985a});
            case 3:
                return new C144406f();
            case 4:
                return new C144405e();
            case 5:
                return f390987b;
            case 6:
                C63010eb ebVar = f390988d;
                if (ebVar == null) {
                    synchronized (C144406f.class) {
                        ebVar = f390988d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f390987b);
                            f390988d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
