package com.google.android.apps.gsa.staticplugins.opa.p8400n;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.n.b */
/* compiled from: PG */
public final class C109724b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C109724b f305681c;

    /* renamed from: d */
    private static volatile C63010eb f305682d;

    /* renamed from: a */
    public int f305683a;

    /* renamed from: b */
    public String f305684b = BuildConfig.FLAVOR;

    static {
        C109724b bVar = new C109724b();
        f305681c = bVar;
        C62942bv.registerDefaultInstance(C109724b.class, bVar);
    }

    private C109724b() {
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
                return newMessageInfo(f305681c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C109724b();
            case 4:
                return new C109723a();
            case 5:
                return f305681c;
            case 6:
                C63010eb ebVar = f305682d;
                if (ebVar == null) {
                    synchronized (C109724b.class) {
                        ebVar = f305682d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f305681c);
                            f305682d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
