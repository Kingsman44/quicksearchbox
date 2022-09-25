package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.kv */
/* compiled from: PG */
public final class C87983kv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87983kv f237942c;

    /* renamed from: d */
    private static volatile C63010eb f237943d;

    /* renamed from: a */
    public int f237944a;

    /* renamed from: b */
    public String f237945b = BuildConfig.FLAVOR;

    static {
        C87983kv kvVar = new C87983kv();
        f237942c = kvVar;
        C62942bv.registerDefaultInstance(C87983kv.class, kvVar);
    }

    private C87983kv() {
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
                return newMessageInfo(f237942c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87983kv();
            case 4:
                return new C87982ku();
            case 5:
                return f237942c;
            case 6:
                C63010eb ebVar = f237943d;
                if (ebVar == null) {
                    synchronized (C87983kv.class) {
                        ebVar = f237943d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237942c);
                            f237943d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
