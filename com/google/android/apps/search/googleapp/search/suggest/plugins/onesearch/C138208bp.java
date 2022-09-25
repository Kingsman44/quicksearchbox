package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.bp */
/* compiled from: PG */
public final class C138208bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138208bp f376038d;

    /* renamed from: f */
    private static volatile C63010eb f376039f;

    /* renamed from: a */
    public C62971cq f376040a = emptyProtobufList();

    /* renamed from: b */
    public long f376041b;

    /* renamed from: c */
    public String f376042c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f376043e;

    static {
        C138208bp bpVar = new C138208bp();
        f376038d = bpVar;
        C62942bv.registerDefaultInstance(C138208bp.class, bpVar);
    }

    private C138208bp() {
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
                return newMessageInfo(f376038d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဃ\u0000\u0004ဈ\u0001", new Object[]{"e", "a", C138207bo.class, "b", C45240c.f118157a});
            case 3:
                return new C138208bp();
            case 4:
                return new C138201bi();
            case 5:
                return f376038d;
            case 6:
                C63010eb ebVar = f376039f;
                if (ebVar == null) {
                    synchronized (C138208bp.class) {
                        ebVar = f376039f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376038d);
                            f376039f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
