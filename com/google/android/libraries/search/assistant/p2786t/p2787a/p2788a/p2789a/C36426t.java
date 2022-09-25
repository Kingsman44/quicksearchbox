package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.t */
/* compiled from: PG */
public final class C36426t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C36426t f95114d;

    /* renamed from: e */
    private static volatile C63010eb f95115e;

    /* renamed from: a */
    public int f95116a;

    /* renamed from: b */
    public String f95117b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f95118c;

    static {
        C36426t tVar = new C36426t();
        f95114d = tVar;
        C62942bv.registerDefaultInstance(C36426t.class, tVar);
    }

    private C36426t() {
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
                return newMessageInfo(f95114d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C36426t();
            case 4:
                return new C36425s();
            case 5:
                return f95114d;
            case 6:
                C63010eb ebVar = f95115e;
                if (ebVar == null) {
                    synchronized (C36426t.class) {
                        ebVar = f95115e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95114d);
                            f95115e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
