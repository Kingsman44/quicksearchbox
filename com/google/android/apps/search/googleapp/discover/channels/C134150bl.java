package com.google.android.apps.search.googleapp.discover.channels;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.bl */
/* compiled from: PG */
public final class C134150bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C134150bl f365436c;

    /* renamed from: d */
    private static volatile C63010eb f365437d;

    /* renamed from: a */
    public int f365438a;

    /* renamed from: b */
    public String f365439b = BuildConfig.FLAVOR;

    static {
        C134150bl blVar = new C134150bl();
        f365436c = blVar;
        C62942bv.registerDefaultInstance(C134150bl.class, blVar);
    }

    private C134150bl() {
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
                return newMessageInfo(f365436c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C134150bl();
            case 4:
                return new C134149bk();
            case 5:
                return f365436c;
            case 6:
                C63010eb ebVar = f365437d;
                if (ebVar == null) {
                    synchronized (C134150bl.class) {
                        ebVar = f365437d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365436c);
                            f365437d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
