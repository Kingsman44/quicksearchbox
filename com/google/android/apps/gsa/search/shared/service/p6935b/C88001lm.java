package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.lm */
/* compiled from: PG */
public final class C88001lm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88001lm f237981c;

    /* renamed from: d */
    private static volatile C63010eb f237982d;

    /* renamed from: a */
    public int f237983a;

    /* renamed from: b */
    public String f237984b = BuildConfig.FLAVOR;

    static {
        C88001lm lmVar = new C88001lm();
        f237981c = lmVar;
        C62942bv.registerDefaultInstance(C88001lm.class, lmVar);
    }

    private C88001lm() {
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
                return newMessageInfo(f237981c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88001lm();
            case 4:
                return new C88000ll();
            case 5:
                return f237981c;
            case 6:
                C63010eb ebVar = f237982d;
                if (ebVar == null) {
                    synchronized (C88001lm.class) {
                        ebVar = f237982d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237981c);
                            f237982d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
