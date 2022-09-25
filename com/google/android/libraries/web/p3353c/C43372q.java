package com.google.android.libraries.web.p3353c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.c.q */
/* compiled from: PG */
public final class C43372q extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C43372q f113314c;

    /* renamed from: e */
    private static volatile C63010eb f113315e;

    /* renamed from: a */
    public String f113316a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C43363h f113317b;

    /* renamed from: d */
    private int f113318d;

    static {
        C43372q qVar = new C43372q();
        f113314c = qVar;
        C62942bv.registerDefaultInstance(C43372q.class, qVar);
    }

    private C43372q() {
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
                return newMessageInfo(f113314c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C43372q();
            case 4:
                return new C43371p();
            case 5:
                return f113314c;
            case 6:
                C63010eb ebVar = f113315e;
                if (ebVar == null) {
                    synchronized (C43372q.class) {
                        ebVar = f113315e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113314c);
                            f113315e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
