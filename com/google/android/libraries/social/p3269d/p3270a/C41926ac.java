package com.google.android.libraries.social.p3269d.p3270a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.d.a.ac */
/* compiled from: PG */
public final class C41926ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C41926ac f109377d;

    /* renamed from: g */
    private static volatile C63010eb f109378g;

    /* renamed from: a */
    public int f109379a;

    /* renamed from: b */
    public int f109380b;

    /* renamed from: c */
    public int f109381c;

    /* renamed from: e */
    private C41928c f109382e;

    /* renamed from: f */
    private byte f109383f = 2;

    static {
        C41926ac acVar = new C41926ac();
        f109377d = acVar;
        C62942bv.registerDefaultInstance(C41926ac.class, acVar);
    }

    private C41926ac() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f109383f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f109383f = b;
                return null;
            case 2:
                return newMessageInfo(f109377d, "\u0001\u0003\u0000\u0001\n\r\u0003\u0000\u0000\u0001\nဌ\u0007\u000bဌ\b\rᐉ\n", new Object[]{"a", "b", C41940o.f109472a, C45240c.f118157a, C41933h.f109397a, "e"});
            case 3:
                return new C41926ac();
            case 4:
                return new C41925ab();
            case 5:
                return f109377d;
            case 6:
                C63010eb ebVar = f109378g;
                if (ebVar == null) {
                    synchronized (C41926ac.class) {
                        ebVar = f109378g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109377d);
                            f109378g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
