package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pz */
/* compiled from: PG */
public final class C50246pz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50246pz f130660d;

    /* renamed from: f */
    private static volatile C63010eb f130661f;

    /* renamed from: a */
    public int f130662a;

    /* renamed from: b */
    public String f130663b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130664c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f130665e;

    static {
        C50246pz pzVar = new C50246pz();
        f130660d = pzVar;
        C62942bv.registerDefaultInstance(C50246pz.class, pzVar);
    }

    private C50246pz() {
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
                return newMessageInfo(f130660d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", C50245py.m85796b(), "b", C45240c.f118157a});
            case 3:
                return new C50246pz();
            case 4:
                return new C50243pw();
            case 5:
                return f130660d;
            case 6:
                C63010eb ebVar = f130661f;
                if (ebVar == null) {
                    synchronized (C50246pz.class) {
                        ebVar = f130661f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130660d);
                            f130661f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
