package com.google.nlp.p4735b.p4736a.p4738b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.b.d */
/* compiled from: PG */
public final class C62822d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62822d f169650b;

    /* renamed from: d */
    private static volatile C63010eb f169651d;

    /* renamed from: a */
    public String f169652a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f169653c;

    static {
        C62822d dVar = new C62822d();
        f169650b = dVar;
        C62942bv.registerDefaultInstance(C62822d.class, dVar);
    }

    private C62822d() {
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
                return newMessageInfo(f169650b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62822d();
            case 4:
                return new C62821c();
            case 5:
                return f169650b;
            case 6:
                C63010eb ebVar = f169651d;
                if (ebVar == null) {
                    synchronized (C62822d.class) {
                        ebVar = f169651d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169650b);
                            f169651d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
