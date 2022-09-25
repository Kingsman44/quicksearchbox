package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.y */
/* compiled from: PG */
public final class C9857y extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9857y f33883f;

    /* renamed from: g */
    private static volatile C63010eb f33884g;

    /* renamed from: a */
    public int f33885a;

    /* renamed from: b */
    public int f33886b = 1;

    /* renamed from: c */
    public boolean f33887c;

    /* renamed from: d */
    public int f33888d;

    /* renamed from: e */
    public int f33889e;

    static {
        C9857y yVar = new C9857y();
        f33883f = yVar;
        C62942bv.registerDefaultInstance(C9857y.class, yVar);
    }

    private C9857y() {
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
                return newMessageInfo(f33883f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004င\u0003", new Object[]{"a", "b", C9855w.m24618b(), C45240c.f118157a, "d", C9852t.f33876a, "e"});
            case 3:
                return new C9857y();
            case 4:
                return new C9856x();
            case 5:
                return f33883f;
            case 6:
                C63010eb ebVar = f33884g;
                if (ebVar == null) {
                    synchronized (C9857y.class) {
                        ebVar = f33884g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f33883f);
                            f33884g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
