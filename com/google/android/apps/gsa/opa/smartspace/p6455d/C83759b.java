package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.b */
/* compiled from: PG */
public final class C83759b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83759b f228297b;

    /* renamed from: d */
    private static volatile C63010eb f228298d;

    /* renamed from: a */
    public String f228299a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f228300c;

    static {
        C83759b bVar = new C83759b();
        f228297b = bVar;
        C62942bv.registerDefaultInstance(C83759b.class, bVar);
    }

    private C83759b() {
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
                return newMessageInfo(f228297b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C83759b();
            case 4:
                return new C83758a();
            case 5:
                return f228297b;
            case 6:
                C63010eb ebVar = f228298d;
                if (ebVar == null) {
                    synchronized (C83759b.class) {
                        ebVar = f228298d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228297b);
                            f228298d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
