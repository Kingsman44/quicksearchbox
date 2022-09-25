package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ae */
/* compiled from: PG */
public final class C53970ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53970ae f141610b;

    /* renamed from: c */
    private static volatile C63010eb f141611c;

    /* renamed from: a */
    public String f141612a = BuildConfig.FLAVOR;

    static {
        C53970ae aeVar = new C53970ae();
        f141610b = aeVar;
        C62942bv.registerDefaultInstance(C53970ae.class, aeVar);
    }

    private C53970ae() {
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
                return newMessageInfo(f141610b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C53970ae();
            case 4:
                return new C53969ad();
            case 5:
                return f141610b;
            case 6:
                C63010eb ebVar = f141611c;
                if (ebVar == null) {
                    synchronized (C53970ae.class) {
                        ebVar = f141611c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141610b);
                            f141611c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
