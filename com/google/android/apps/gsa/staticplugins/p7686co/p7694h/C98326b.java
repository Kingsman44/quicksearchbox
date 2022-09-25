package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.b */
/* compiled from: PG */
public final class C98326b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C98326b f274478c;

    /* renamed from: d */
    private static volatile C63010eb f274479d;

    /* renamed from: a */
    public int f274480a;

    /* renamed from: b */
    public String f274481b = BuildConfig.FLAVOR;

    static {
        C98326b bVar = new C98326b();
        f274478c = bVar;
        C62942bv.registerDefaultInstance(C98326b.class, bVar);
    }

    private C98326b() {
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
                return newMessageInfo(f274478c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C98326b();
            case 4:
                return new C98318a();
            case 5:
                return f274478c;
            case 6:
                C63010eb ebVar = f274479d;
                if (ebVar == null) {
                    synchronized (C98326b.class) {
                        ebVar = f274479d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f274478c);
                            f274479d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
