package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.d.n */
/* compiled from: PG */
public final class C128182n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C128182n f352629e;

    /* renamed from: f */
    private static volatile C63010eb f352630f;

    /* renamed from: a */
    public int f352631a;

    /* renamed from: b */
    public int f352632b = 0;

    /* renamed from: c */
    public Object f352633c;

    /* renamed from: d */
    public int f352634d;

    static {
        C128182n nVar = new C128182n();
        f352629e = nVar;
        C62942bv.registerDefaultInstance(C128182n.class, nVar);
    }

    private C128182n() {
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
                return newMessageInfo(f352629e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001်\u0000\u0002်\u0000\u0003ျ\u0000\u0004ဌ\u0003", new Object[]{C45240c.f118157a, "b", "a", "d", C128181m.m209264b()});
            case 3:
                return new C128182n();
            case 4:
                return new C128179k();
            case 5:
                return f352629e;
            case 6:
                C63010eb ebVar = f352630f;
                if (ebVar == null) {
                    synchronized (C128182n.class) {
                        ebVar = f352630f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f352629e);
                            f352630f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
