package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.ae */
/* compiled from: PG */
public final class C80051ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80051ae f219672b;

    /* renamed from: c */
    private static volatile C63010eb f219673c;

    /* renamed from: a */
    public String f219674a = BuildConfig.FLAVOR;

    static {
        C80051ae aeVar = new C80051ae();
        f219672b = aeVar;
        C62942bv.registerDefaultInstance(C80051ae.class, aeVar);
    }

    private C80051ae() {
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
                return newMessageInfo(f219672b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C80051ae();
            case 4:
                return new C80050ad();
            case 5:
                return f219672b;
            case 6:
                C63010eb ebVar = f219673c;
                if (ebVar == null) {
                    synchronized (C80051ae.class) {
                        ebVar = f219673c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219672b);
                            f219673c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
