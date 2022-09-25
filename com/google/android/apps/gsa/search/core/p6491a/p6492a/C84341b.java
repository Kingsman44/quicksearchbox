package com.google.android.apps.gsa.search.core.p6491a.p6492a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.a.a.b */
/* compiled from: PG */
public final class C84341b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C84341b f229550d;

    /* renamed from: e */
    private static volatile C63010eb f229551e;

    /* renamed from: a */
    public int f229552a;

    /* renamed from: b */
    public String f229553b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f229554c;

    static {
        C84341b bVar = new C84341b();
        f229550d = bVar;
        C62942bv.registerDefaultInstance(C84341b.class, bVar);
    }

    private C84341b() {
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
                return newMessageInfo(f229550d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, e.b()});
            case 3:
                return new C84341b();
            case 4:
                return new C84340a();
            case 5:
                return f229550d;
            case 6:
                C63010eb ebVar = f229551e;
                if (ebVar == null) {
                    synchronized (C84341b.class) {
                        ebVar = f229551e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f229550d);
                            f229551e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
