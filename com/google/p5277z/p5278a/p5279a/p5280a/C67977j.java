package com.google.p5277z.p5278a.p5279a.p5280a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4883as.p4885b.C63780a;

/* renamed from: com.google.z.a.a.a.j */
/* compiled from: PG */
public final class C67977j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67977j f184204b;

    /* renamed from: d */
    private static volatile C63010eb f184205d;

    /* renamed from: a */
    public int f184206a;

    /* renamed from: c */
    private int f184207c;

    static {
        C67977j jVar = new C67977j();
        f184204b = jVar;
        C62942bv.registerDefaultInstance(C67977j.class, jVar);
    }

    private C67977j() {
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
                return newMessageInfo(f184204b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C63780a.f172537a});
            case 3:
                return new C67977j();
            case 4:
                return new C67976i();
            case 5:
                return f184204b;
            case 6:
                C63010eb ebVar = f184205d;
                if (ebVar == null) {
                    synchronized (C67977j.class) {
                        ebVar = f184205d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184204b);
                            f184205d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
