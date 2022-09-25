package com.google.p4017at.p4027c.p4028a.p4029a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.aa */
/* compiled from: PG */
public final class C53835aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53835aa f141299b;

    /* renamed from: c */
    private static volatile C63010eb f141300c;

    /* renamed from: a */
    public String f141301a = BuildConfig.FLAVOR;

    static {
        C53835aa aaVar = new C53835aa();
        f141299b = aaVar;
        C62942bv.registerDefaultInstance(C53835aa.class, aaVar);
    }

    private C53835aa() {
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
                return newMessageInfo(f141299b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C53835aa();
            case 4:
                return new C53866z();
            case 5:
                return f141299b;
            case 6:
                C63010eb ebVar = f141300c;
                if (ebVar == null) {
                    synchronized (C53835aa.class) {
                        ebVar = f141300c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141299b);
                            f141300c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
