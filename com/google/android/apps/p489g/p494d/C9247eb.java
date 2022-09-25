package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.eb */
/* compiled from: PG */
public final class C9247eb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9247eb f31972f;

    /* renamed from: g */
    private static volatile C63010eb f31973g;

    /* renamed from: a */
    public int f31974a;

    /* renamed from: b */
    public String f31975b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f31976c;

    /* renamed from: d */
    public boolean f31977d;

    /* renamed from: e */
    public int f31978e;

    static {
        C9247eb ebVar = new C9247eb();
        f31972f = ebVar;
        C62942bv.registerDefaultInstance(C9247eb.class, ebVar);
    }

    private C9247eb() {
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
                return newMessageInfo(f31972f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9247eb();
            case 4:
                return new C9246ea();
            case 5:
                return f31972f;
            case 6:
                C63010eb ebVar = f31973g;
                if (ebVar == null) {
                    synchronized (C9247eb.class) {
                        ebVar = f31973g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31972f);
                            f31973g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
