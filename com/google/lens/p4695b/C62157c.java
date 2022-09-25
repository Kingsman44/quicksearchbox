package com.google.lens.p4695b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.b.c */
/* compiled from: PG */
public final class C62157c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62157c f167793d;

    /* renamed from: e */
    private static volatile C63010eb f167794e;

    /* renamed from: a */
    public int f167795a;

    /* renamed from: b */
    public String f167796b = "auto";

    /* renamed from: c */
    public String f167797c = BuildConfig.FLAVOR;

    static {
        C62157c cVar = new C62157c();
        f167793d = cVar;
        C62942bv.registerDefaultInstance(C62157c.class, cVar);
    }

    private C62157c() {
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
                return newMessageInfo(f167793d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62157c();
            case 4:
                return new C62156b();
            case 5:
                return f167793d;
            case 6:
                C63010eb ebVar = f167794e;
                if (ebVar == null) {
                    synchronized (C62157c.class) {
                        ebVar = f167794e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167793d);
                            f167794e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
