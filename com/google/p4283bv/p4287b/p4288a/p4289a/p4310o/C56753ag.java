package com.google.p4283bv.p4287b.p4288a.p4289a.p4310o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.o.ag */
/* compiled from: PG */
public final class C56753ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56753ag f151458d;

    /* renamed from: e */
    private static volatile C63010eb f151459e;

    /* renamed from: a */
    public int f151460a;

    /* renamed from: b */
    public String f151461b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f151462c;

    static {
        C56753ag agVar = new C56753ag();
        f151458d = agVar;
        C62942bv.registerDefaultInstance(C56753ag.class, agVar);
    }

    private C56753ag() {
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
                return newMessageInfo(f151458d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56753ag();
            case 4:
                return new C56752af();
            case 5:
                return f151458d;
            case 6:
                C63010eb ebVar = f151459e;
                if (ebVar == null) {
                    synchronized (C56753ag.class) {
                        ebVar = f151459e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151458d);
                            f151459e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
