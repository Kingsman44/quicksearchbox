package com.google.android.apps.gsa.assist;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.ag */
/* compiled from: PG */
public final class C9336ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9336ag f32390d;

    /* renamed from: e */
    private static volatile C63010eb f32391e;

    /* renamed from: a */
    public int f32392a;

    /* renamed from: b */
    public String f32393b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f32394c = BuildConfig.FLAVOR;

    static {
        C9336ag agVar = new C9336ag();
        f32390d = agVar;
        C62942bv.registerDefaultInstance(C9336ag.class, agVar);
    }

    private C9336ag() {
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
                return newMessageInfo(f32390d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9336ag();
            case 4:
                return new C9335af();
            case 5:
                return f32390d;
            case 6:
                C63010eb ebVar = f32391e;
                if (ebVar == null) {
                    synchronized (C9336ag.class) {
                        ebVar = f32391e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32390d);
                            f32391e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
