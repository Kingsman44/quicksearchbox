package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.y */
/* compiled from: PG */
public final class C57517y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57517y f153635b;

    /* renamed from: d */
    private static volatile C63010eb f153636d;

    /* renamed from: a */
    public String f153637a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f153638c;

    static {
        C57517y yVar = new C57517y();
        f153635b = yVar;
        C62942bv.registerDefaultInstance(C57517y.class, yVar);
    }

    private C57517y() {
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
                return newMessageInfo(f153635b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57517y();
            case 4:
                return new C57516x();
            case 5:
                return f153635b;
            case 6:
                C63010eb ebVar = f153636d;
                if (ebVar == null) {
                    synchronized (C57517y.class) {
                        ebVar = f153636d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153635b);
                            f153636d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
