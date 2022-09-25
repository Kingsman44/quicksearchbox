package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.u */
/* compiled from: PG */
public final class C80075u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C80075u f219722b;

    /* renamed from: c */
    private static volatile C63010eb f219723c;

    /* renamed from: a */
    public String f219724a = BuildConfig.FLAVOR;

    static {
        C80075u uVar = new C80075u();
        f219722b = uVar;
        C62942bv.registerDefaultInstance(C80075u.class, uVar);
    }

    private C80075u() {
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
                return newMessageInfo(f219722b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C80075u();
            case 4:
                return new C80074t();
            case 5:
                return f219722b;
            case 6:
                C63010eb ebVar = f219723c;
                if (ebVar == null) {
                    synchronized (C80075u.class) {
                        ebVar = f219723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219722b);
                            f219723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
