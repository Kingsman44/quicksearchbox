package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.b */
/* compiled from: PG */
public final class C12984b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C12984b f40359e;

    /* renamed from: f */
    private static volatile C63010eb f40360f;

    /* renamed from: a */
    public int f40361a;

    /* renamed from: b */
    public C52829f f40362b;

    /* renamed from: c */
    public long f40363c;

    /* renamed from: d */
    public String f40364d = BuildConfig.FLAVOR;

    static {
        C12984b bVar = new C12984b();
        f40359e = bVar;
        C62942bv.registerDefaultInstance(C12984b.class, bVar);
    }

    private C12984b() {
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
                return newMessageInfo(f40359e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C12984b();
            case 4:
                return new C12964a();
            case 5:
                return f40359e;
            case 6:
                C63010eb ebVar = f40360f;
                if (ebVar == null) {
                    synchronized (C12984b.class) {
                        ebVar = f40360f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40359e);
                            f40360f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
