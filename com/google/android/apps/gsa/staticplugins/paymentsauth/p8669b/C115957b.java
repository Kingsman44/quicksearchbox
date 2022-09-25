package com.google.android.apps.gsa.staticplugins.paymentsauth.p8669b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.b.b */
/* compiled from: PG */
public final class C115957b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C115957b f321524c;

    /* renamed from: d */
    private static volatile C63010eb f321525d;

    /* renamed from: a */
    public int f321526a;

    /* renamed from: b */
    public String f321527b = BuildConfig.FLAVOR;

    static {
        C115957b bVar = new C115957b();
        f321524c = bVar;
        C62942bv.registerDefaultInstance(C115957b.class, bVar);
    }

    private C115957b() {
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
                return newMessageInfo(f321524c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C115957b();
            case 4:
                return new C115956a();
            case 5:
                return f321524c;
            case 6:
                C63010eb ebVar = f321525d;
                if (ebVar == null) {
                    synchronized (C115957b.class) {
                        ebVar = f321525d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f321524c);
                            f321525d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
