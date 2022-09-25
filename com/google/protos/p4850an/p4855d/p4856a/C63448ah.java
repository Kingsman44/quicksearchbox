package com.google.protos.p4850an.p4855d.p4856a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.a.ah */
/* compiled from: PG */
public final class C63448ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63448ah f171469b;

    /* renamed from: d */
    private static volatile C63010eb f171470d;

    /* renamed from: a */
    public String f171471a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f171472c;

    static {
        C63448ah ahVar = new C63448ah();
        f171469b = ahVar;
        C62942bv.registerDefaultInstance(C63448ah.class, ahVar);
    }

    private C63448ah() {
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
                return newMessageInfo(f171469b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63448ah();
            case 4:
                return new C63447ag();
            case 5:
                return f171469b;
            case 6:
                C63010eb ebVar = f171470d;
                if (ebVar == null) {
                    synchronized (C63448ah.class) {
                        ebVar = f171470d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171469b);
                            f171470d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
