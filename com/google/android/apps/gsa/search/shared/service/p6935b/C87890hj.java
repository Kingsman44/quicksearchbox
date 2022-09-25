package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hj */
/* compiled from: PG */
public final class C87890hj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87890hj f237764c;

    /* renamed from: d */
    private static volatile C63010eb f237765d;

    /* renamed from: a */
    public int f237766a;

    /* renamed from: b */
    public String f237767b = BuildConfig.FLAVOR;

    static {
        C87890hj hjVar = new C87890hj();
        f237764c = hjVar;
        C62942bv.registerDefaultInstance(C87890hj.class, hjVar);
    }

    private C87890hj() {
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
                return newMessageInfo(f237764c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87890hj();
            case 4:
                return new C87889hi();
            case 5:
                return f237764c;
            case 6:
                C63010eb ebVar = f237765d;
                if (ebVar == null) {
                    synchronized (C87890hj.class) {
                        ebVar = f237765d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237764c);
                            f237765d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
