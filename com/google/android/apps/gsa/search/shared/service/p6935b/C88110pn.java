package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.pn */
/* compiled from: PG */
public final class C88110pn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88110pn f238210c;

    /* renamed from: d */
    private static volatile C63010eb f238211d;

    /* renamed from: a */
    public int f238212a;

    /* renamed from: b */
    public String f238213b = BuildConfig.FLAVOR;

    static {
        C88110pn pnVar = new C88110pn();
        f238210c = pnVar;
        C62942bv.registerDefaultInstance(C88110pn.class, pnVar);
    }

    private C88110pn() {
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
                return newMessageInfo(f238210c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88110pn();
            case 4:
                return new C88109pm();
            case 5:
                return f238210c;
            case 6:
                C63010eb ebVar = f238211d;
                if (ebVar == null) {
                    synchronized (C88110pn.class) {
                        ebVar = f238211d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238210c);
                            f238211d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
