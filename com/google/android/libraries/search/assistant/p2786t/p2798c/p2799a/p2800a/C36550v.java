package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.a.v */
/* compiled from: PG */
public final class C36550v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36550v f95335c;

    /* renamed from: d */
    private static volatile C63010eb f95336d;

    /* renamed from: a */
    public int f95337a;

    /* renamed from: b */
    public String f95338b = BuildConfig.FLAVOR;

    static {
        C36550v vVar = new C36550v();
        f95335c = vVar;
        C62942bv.registerDefaultInstance(C36550v.class, vVar);
    }

    private C36550v() {
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
                return newMessageInfo(f95335c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36550v();
            case 4:
                return new C36549u();
            case 5:
                return f95335c;
            case 6:
                C63010eb ebVar = f95336d;
                if (ebVar == null) {
                    synchronized (C36550v.class) {
                        ebVar = f95336d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95335c);
                            f95336d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
