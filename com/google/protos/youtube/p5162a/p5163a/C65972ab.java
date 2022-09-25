package com.google.protos.youtube.p5162a.p5163a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.a.a.ab */
/* compiled from: PG */
public final class C65972ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65972ab f179440b;

    /* renamed from: d */
    private static volatile C63010eb f179441d;

    /* renamed from: a */
    public String f179442a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f179443c;

    static {
        C65972ab abVar = new C65972ab();
        f179440b = abVar;
        C62942bv.registerDefaultInstance(C65972ab.class, abVar);
    }

    private C65972ab() {
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
                return newMessageInfo(f179440b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C65972ab();
            case 4:
                return new C65971aa();
            case 5:
                return f179440b;
            case 6:
                C63010eb ebVar = f179441d;
                if (ebVar == null) {
                    synchronized (C65972ab.class) {
                        ebVar = f179441d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179440b);
                            f179441d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
