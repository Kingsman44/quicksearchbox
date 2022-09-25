package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ui */
/* compiled from: PG */
public final class C50364ui extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50364ui f131105e;

    /* renamed from: f */
    private static volatile C63010eb f131106f;

    /* renamed from: a */
    public int f131107a;

    /* renamed from: b */
    public int f131108b;

    /* renamed from: c */
    public aed f131109c;

    /* renamed from: d */
    public String f131110d = BuildConfig.FLAVOR;

    static {
        C50364ui uiVar = new C50364ui();
        f131105e = uiVar;
        C62942bv.registerDefaultInstance(C50364ui.class, uiVar);
    }

    private C50364ui() {
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
                return newMessageInfo(f131105e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", aee.f129104a, C45240c.f118157a, "d"});
            case 3:
                return new C50364ui();
            case 4:
                return new C50363uh();
            case 5:
                return f131105e;
            case 6:
                C63010eb ebVar = f131106f;
                if (ebVar == null) {
                    synchronized (C50364ui.class) {
                        ebVar = f131106f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131105e);
                            f131106f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
