package com.google.p395al.p398b.p399a.p402b.p403a.p407d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.b.a.d.b */
/* compiled from: PG */
public final class C8441b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8441b f29337b;

    /* renamed from: c */
    private static volatile C63010eb f29338c;

    /* renamed from: a */
    public String f29339a = BuildConfig.FLAVOR;

    static {
        C8441b bVar = new C8441b();
        f29337b = bVar;
        C62942bv.registerDefaultInstance(C8441b.class, bVar);
    }

    private C8441b() {
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
                return newMessageInfo(f29337b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C8441b();
            case 4:
                return new C8440a();
            case 5:
                return f29337b;
            case 6:
                C63010eb ebVar = f29338c;
                if (ebVar == null) {
                    synchronized (C8441b.class) {
                        ebVar = f29338c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29337b);
                            f29338c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
