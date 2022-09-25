package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.cr */
/* compiled from: PG */
public final class C80169cr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80169cr f219980e;

    /* renamed from: f */
    private static volatile C63010eb f219981f;

    /* renamed from: a */
    public int f219982a;

    /* renamed from: b */
    public int f219983b;

    /* renamed from: c */
    public String f219984c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f219985d;

    static {
        C80169cr crVar = new C80169cr();
        f219980e = crVar;
        C62942bv.registerDefaultInstance(C80169cr.class, crVar);
    }

    private C80169cr() {
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
                return newMessageInfo(f219980e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C80170cs.f219986a});
            case 3:
                return new C80169cr();
            case 4:
                return new C80168cq();
            case 5:
                return f219980e;
            case 6:
                C63010eb ebVar = f219981f;
                if (ebVar == null) {
                    synchronized (C80169cr.class) {
                        ebVar = f219981f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219980e);
                            f219981f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
