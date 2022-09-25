package com.google.p4419bx;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bx.c */
/* compiled from: PG */
public final class C57862c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57862c f154575d;

    /* renamed from: e */
    private static volatile C63010eb f154576e;

    /* renamed from: a */
    public int f154577a;

    /* renamed from: b */
    public int f154578b;

    /* renamed from: c */
    public String f154579c = BuildConfig.FLAVOR;

    static {
        C57862c cVar = new C57862c();
        f154575d = cVar;
        C62942bv.registerDefaultInstance(C57862c.class, cVar);
    }

    private C57862c() {
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
                return newMessageInfo(f154575d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57862c();
            case 4:
                return new C57861b();
            case 5:
                return f154575d;
            case 6:
                C63010eb ebVar = f154576e;
                if (ebVar == null) {
                    synchronized (C57862c.class) {
                        ebVar = f154576e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154575d);
                            f154576e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
