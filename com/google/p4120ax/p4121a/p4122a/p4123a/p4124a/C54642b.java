package com.google.p4120ax.p4121a.p4122a.p4123a.p4124a;

import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ax.a.a.a.a.b */
/* compiled from: PG */
public final class C54642b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C54642b f143461e;

    /* renamed from: f */
    private static volatile C63010eb f143462f;

    /* renamed from: a */
    public int f143463a;

    /* renamed from: b */
    public int f143464b = 1;

    /* renamed from: c */
    public int f143465c;

    /* renamed from: d */
    public int f143466d;

    static {
        C54642b bVar = new C54642b();
        f143461e = bVar;
        C62942bv.registerDefaultInstance(C54642b.class, bVar);
    }

    private C54642b() {
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
                return newMessageInfo(f143461e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C9855w.m24618b(), C45240c.f118157a, "d"});
            case 3:
                return new C54642b();
            case 4:
                return new C54641a();
            case 5:
                return f143461e;
            case 6:
                C63010eb ebVar = f143462f;
                if (ebVar == null) {
                    synchronized (C54642b.class) {
                        ebVar = f143462f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143461e);
                            f143462f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
