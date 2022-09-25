package com.google.common.p4538j.p4539a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.j.a.f */
/* compiled from: PG */
public final class C59308f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59308f f157472b;

    /* renamed from: d */
    private static volatile C63010eb f157473d;

    /* renamed from: a */
    public String f157474a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f157475c;

    static {
        C59308f fVar = new C59308f();
        f157472b = fVar;
        C62942bv.registerDefaultInstance(C59308f.class, fVar);
    }

    private C59308f() {
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
                return newMessageInfo(f157472b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C59308f();
            case 4:
                return new C59307e();
            case 5:
                return f157472b;
            case 6:
                C63010eb ebVar = f157473d;
                if (ebVar == null) {
                    synchronized (C59308f.class) {
                        ebVar = f157473d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157472b);
                            f157473d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
