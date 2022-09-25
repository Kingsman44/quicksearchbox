package com.google.android.apps.search.googleapp.collections;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.collections.l */
/* compiled from: PG */
public final class C133514l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133514l f363786c;

    /* renamed from: d */
    private static volatile C63010eb f363787d;

    /* renamed from: a */
    public int f363788a;

    /* renamed from: b */
    public String f363789b = BuildConfig.FLAVOR;

    static {
        C133514l lVar = new C133514l();
        f363786c = lVar;
        C62942bv.registerDefaultInstance(C133514l.class, lVar);
    }

    private C133514l() {
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
                return newMessageInfo(f363786c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C133514l();
            case 4:
                return new C133513k();
            case 5:
                return f363786c;
            case 6:
                C63010eb ebVar = f363787d;
                if (ebVar == null) {
                    synchronized (C133514l.class) {
                        ebVar = f363787d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363786c);
                            f363787d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
