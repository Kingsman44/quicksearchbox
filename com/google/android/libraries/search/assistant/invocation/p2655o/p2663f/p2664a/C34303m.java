package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.m */
/* compiled from: PG */
public final class C34303m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C34303m f91223d;

    /* renamed from: e */
    private static volatile C63010eb f91224e;

    /* renamed from: a */
    public int f91225a;

    /* renamed from: b */
    public int f91226b;

    /* renamed from: c */
    public String f91227c = BuildConfig.FLAVOR;

    static {
        C34303m mVar = new C34303m();
        f91223d = mVar;
        C62942bv.registerDefaultInstance(C34303m.class, mVar);
    }

    private C34303m() {
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
                return newMessageInfo(f91223d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ለ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C34303m();
            case 4:
                return new C34301k();
            case 5:
                return f91223d;
            case 6:
                C63010eb ebVar = f91224e;
                if (ebVar == null) {
                    synchronized (C34303m.class) {
                        ebVar = f91224e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91223d);
                            f91224e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
