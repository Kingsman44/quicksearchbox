package com.google.android.libraries.assistant.auto.tng.p984g.p985a.p986a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.g.a.a.b */
/* compiled from: PG */
public final class C13568b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C13568b f41559c;

    /* renamed from: d */
    private static volatile C63010eb f41560d;

    /* renamed from: a */
    public int f41561a;

    /* renamed from: b */
    public String f41562b = BuildConfig.FLAVOR;

    static {
        C13568b bVar = new C13568b();
        f41559c = bVar;
        C62942bv.registerDefaultInstance(C13568b.class, bVar);
    }

    private C13568b() {
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
                return newMessageInfo(f41559c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C13568b();
            case 4:
                return new C13561a();
            case 5:
                return f41559c;
            case 6:
                C63010eb ebVar = f41560d;
                if (ebVar == null) {
                    synchronized (C13568b.class) {
                        ebVar = f41560d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41559c);
                            f41560d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
