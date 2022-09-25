package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.b */
/* compiled from: PG */
public final class C40278b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C40278b f105799e;

    /* renamed from: f */
    private static volatile C63010eb f105800f;

    /* renamed from: a */
    public int f105801a;

    /* renamed from: b */
    public String f105802b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f105803c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f105804d;

    static {
        C40278b bVar = new C40278b();
        f105799e = bVar;
        C62942bv.registerDefaultInstance(C40278b.class, bVar);
    }

    private C40278b() {
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
                return newMessageInfo(f105799e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C40278b();
            case 4:
                return new C40260a();
            case 5:
                return f105799e;
            case 6:
                C63010eb ebVar = f105800f;
                if (ebVar == null) {
                    synchronized (C40278b.class) {
                        ebVar = f105800f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f105799e);
                            f105800f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
