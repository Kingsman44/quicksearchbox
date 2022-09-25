package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.kp */
/* compiled from: PG */
public final class C87977kp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87977kp f237929c;

    /* renamed from: d */
    private static volatile C63010eb f237930d;

    /* renamed from: a */
    public int f237931a;

    /* renamed from: b */
    public String f237932b = BuildConfig.FLAVOR;

    static {
        C87977kp kpVar = new C87977kp();
        f237929c = kpVar;
        C62942bv.registerDefaultInstance(C87977kp.class, kpVar);
    }

    private C87977kp() {
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
                return newMessageInfo(f237929c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87977kp();
            case 4:
                return new C87976ko();
            case 5:
                return f237929c;
            case 6:
                C63010eb ebVar = f237930d;
                if (ebVar == null) {
                    synchronized (C87977kp.class) {
                        ebVar = f237930d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237929c);
                            f237930d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
