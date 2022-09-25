package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ab */
/* compiled from: PG */
public final class C10098ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C10098ab f34383d;

    /* renamed from: e */
    private static volatile C63010eb f34384e;

    /* renamed from: a */
    public int f34385a;

    /* renamed from: b */
    public boolean f34386b;

    /* renamed from: c */
    public boolean f34387c = true;

    static {
        C10098ab abVar = new C10098ab();
        f34383d = abVar;
        C62942bv.registerDefaultInstance(C10098ab.class, abVar);
    }

    private C10098ab() {
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
                return newMessageInfo(f34383d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C10098ab();
            case 4:
                return new C10097aa();
            case 5:
                return f34383d;
            case 6:
                C63010eb ebVar = f34384e;
                if (ebVar == null) {
                    synchronized (C10098ab.class) {
                        ebVar = f34384e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34383d);
                            f34384e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
