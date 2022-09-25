package com.google.p4017at.p4027c.p4031b.p4041d.p4042a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.d.a.l */
/* compiled from: PG */
public final class C53917l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53917l f141473b;

    /* renamed from: c */
    private static volatile C63010eb f141474c;

    /* renamed from: a */
    public String f141475a = BuildConfig.FLAVOR;

    static {
        C53917l lVar = new C53917l();
        f141473b = lVar;
        C62942bv.registerDefaultInstance(C53917l.class, lVar);
    }

    private C53917l() {
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
                return newMessageInfo(f141473b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C53917l();
            case 4:
                return new C53916k();
            case 5:
                return f141473b;
            case 6:
                C63010eb ebVar = f141474c;
                if (ebVar == null) {
                    synchronized (C53917l.class) {
                        ebVar = f141474c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141473b);
                            f141474c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
