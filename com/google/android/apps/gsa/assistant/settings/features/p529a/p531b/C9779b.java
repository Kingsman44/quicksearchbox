package com.google.android.apps.gsa.assistant.settings.features.p529a.p531b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.a.b.b */
/* compiled from: PG */
public final class C9779b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9779b f33746d;

    /* renamed from: e */
    private static volatile C63010eb f33747e;

    /* renamed from: a */
    public int f33748a;

    /* renamed from: b */
    public boolean f33749b;

    /* renamed from: c */
    public boolean f33750c;

    static {
        C9779b bVar = new C9779b();
        f33746d = bVar;
        C62942bv.registerDefaultInstance(C9779b.class, bVar);
    }

    private C9779b() {
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
                return newMessageInfo(f33746d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9779b();
            case 4:
                return new C9778a();
            case 5:
                return f33746d;
            case 6:
                C63010eb ebVar = f33747e;
                if (ebVar == null) {
                    synchronized (C9779b.class) {
                        ebVar = f33747e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f33746d);
                            f33747e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
