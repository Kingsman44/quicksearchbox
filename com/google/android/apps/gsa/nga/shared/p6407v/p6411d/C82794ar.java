package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.ar */
/* compiled from: PG */
public final class C82794ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82794ar f225579c;

    /* renamed from: e */
    private static volatile C63010eb f225580e;

    /* renamed from: a */
    public boolean f225581a;

    /* renamed from: b */
    public String f225582b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f225583d;

    static {
        C82794ar arVar = new C82794ar();
        f225579c = arVar;
        C62942bv.registerDefaultInstance(C82794ar.class, arVar);
    }

    private C82794ar() {
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
                return newMessageInfo(f225579c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C82794ar();
            case 4:
                return new C82793aq();
            case 5:
                return f225579c;
            case 6:
                C63010eb ebVar = f225580e;
                if (ebVar == null) {
                    synchronized (C82794ar.class) {
                        ebVar = f225580e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225579c);
                            f225580e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
