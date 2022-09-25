package com.google.p4283bv.p4287b.p4288a.p4289a.p4297b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.b.n */
/* compiled from: PG */
public final class C56666n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56666n f151268b;

    /* renamed from: d */
    private static volatile C63010eb f151269d;

    /* renamed from: a */
    public String f151270a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f151271c;

    static {
        C56666n nVar = new C56666n();
        f151268b = nVar;
        C62942bv.registerDefaultInstance(C56666n.class, nVar);
    }

    private C56666n() {
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
                return newMessageInfo(f151268b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56666n();
            case 4:
                return new C56665m();
            case 5:
                return f151268b;
            case 6:
                C63010eb ebVar = f151269d;
                if (ebVar == null) {
                    synchronized (C56666n.class) {
                        ebVar = f151269d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151268b);
                            f151269d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
