package com.google.p395al.p398b.p399a.p402b.p403a.p404a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.b.a.a.b */
/* compiled from: PG */
public final class C8429b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8429b f29312c;

    /* renamed from: d */
    private static volatile C63010eb f29313d;

    /* renamed from: a */
    public int f29314a;

    /* renamed from: b */
    public String f29315b = BuildConfig.FLAVOR;

    static {
        C8429b bVar = new C8429b();
        f29312c = bVar;
        C62942bv.registerDefaultInstance(C8429b.class, bVar);
    }

    private C8429b() {
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
                return newMessageInfo(f29312c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8429b();
            case 4:
                return new C8428a();
            case 5:
                return f29312c;
            case 6:
                C63010eb ebVar = f29313d;
                if (ebVar == null) {
                    synchronized (C8429b.class) {
                        ebVar = f29313d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29312c);
                            f29313d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
