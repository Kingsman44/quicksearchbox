package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.w */
/* compiled from: PG */
public final class C54124w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54124w f142030c;

    /* renamed from: d */
    private static volatile C63010eb f142031d;

    /* renamed from: a */
    public int f142032a;

    /* renamed from: b */
    public String f142033b = BuildConfig.FLAVOR;

    static {
        C54124w wVar = new C54124w();
        f142030c = wVar;
        C62942bv.registerDefaultInstance(C54124w.class, wVar);
    }

    private C54124w() {
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
                return newMessageInfo(f142030c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54124w();
            case 4:
                return new C54123v();
            case 5:
                return f142030c;
            case 6:
                C63010eb ebVar = f142031d;
                if (ebVar == null) {
                    synchronized (C54124w.class) {
                        ebVar = f142031d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142030c);
                            f142031d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
