package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.cg */
/* compiled from: PG */
public final class C7580cg extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7580cg f26189d;

    /* renamed from: e */
    private static volatile C63010eb f26190e;

    /* renamed from: a */
    public int f26191a;

    /* renamed from: b */
    public String f26192b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f26193c = BuildConfig.FLAVOR;

    static {
        C7580cg cgVar = new C7580cg();
        f26189d = cgVar;
        C62942bv.registerDefaultInstance(C7580cg.class, cgVar);
    }

    private C7580cg() {
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
                return newMessageInfo(f26189d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C7580cg();
            case 4:
                return new C7579cf();
            case 5:
                return f26189d;
            case 6:
                C63010eb ebVar = f26190e;
                if (ebVar == null) {
                    synchronized (C7580cg.class) {
                        ebVar = f26190e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26189d);
                            f26190e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
