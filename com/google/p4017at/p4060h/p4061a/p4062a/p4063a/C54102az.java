package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.az */
/* compiled from: PG */
public final class C54102az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54102az f141951c;

    /* renamed from: e */
    private static volatile C63010eb f141952e;

    /* renamed from: a */
    public boolean f141953a;

    /* renamed from: b */
    public String f141954b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f141955d;

    static {
        C54102az azVar = new C54102az();
        f141951c = azVar;
        C62942bv.registerDefaultInstance(C54102az.class, azVar);
    }

    private C54102az() {
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
                return newMessageInfo(f141951c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဈ\u0002", new Object[]{"d", "a", "b"});
            case 3:
                return new C54102az();
            case 4:
                return new C54101ay();
            case 5:
                return f141951c;
            case 6:
                C63010eb ebVar = f141952e;
                if (ebVar == null) {
                    synchronized (C54102az.class) {
                        ebVar = f141952e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141951c);
                            f141952e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
