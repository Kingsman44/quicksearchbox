package com.google.p427am.p428a.p429a.p430a.p431a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.a.a.a.a.b */
/* compiled from: PG */
public final class C8606b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8606b f29835e;

    /* renamed from: f */
    private static volatile C63010eb f29836f;

    /* renamed from: a */
    public int f29837a;

    /* renamed from: b */
    public int f29838b = 0;

    /* renamed from: c */
    public Object f29839c;

    /* renamed from: d */
    public String f29840d = BuildConfig.FLAVOR;

    static {
        C8606b bVar = new C8606b();
        f29835e = bVar;
        C62942bv.registerDefaultInstance(C8606b.class, bVar);
    }

    private C8606b() {
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
                return newMessageInfo(f29835e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0001\u0002ျ\u0000\u0003ဵ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C8606b();
            case 4:
                return new C8605a();
            case 5:
                return f29835e;
            case 6:
                C63010eb ebVar = f29836f;
                if (ebVar == null) {
                    synchronized (C8606b.class) {
                        ebVar = f29836f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29835e);
                            f29836f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
