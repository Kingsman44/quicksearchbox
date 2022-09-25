package com.google.android.apps.search.googleapp.notifications.p10364c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.notifications.c.b */
/* compiled from: PG */
public final class C136764b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136764b f372291c;

    /* renamed from: d */
    private static volatile C63010eb f372292d;

    /* renamed from: a */
    public int f372293a;

    /* renamed from: b */
    public String f372294b = BuildConfig.FLAVOR;

    static {
        C136764b bVar = new C136764b();
        f372291c = bVar;
        C62942bv.registerDefaultInstance(C136764b.class, bVar);
    }

    private C136764b() {
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
                return newMessageInfo(f372291c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C136764b();
            case 4:
                return new C136763a();
            case 5:
                return f372291c;
            case 6:
                C63010eb ebVar = f372292d;
                if (ebVar == null) {
                    synchronized (C136764b.class) {
                        ebVar = f372292d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372291c);
                            f372292d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
