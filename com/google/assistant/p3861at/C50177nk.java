package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.at.nk */
/* compiled from: PG */
public final class C50177nk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50177nk f130438c;

    /* renamed from: e */
    private static volatile C63010eb f130439e;

    /* renamed from: a */
    public String f130440a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130441b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f130442d;

    static {
        C50177nk nkVar = new C50177nk();
        f130438c = nkVar;
        C62942bv.registerDefaultInstance(C50177nk.class, nkVar);
    }

    private C50177nk() {
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
                return newMessageInfo(f130438c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C50177nk();
            case 4:
                return new C50176nj();
            case 5:
                return f130438c;
            case 6:
                C63010eb ebVar = f130439e;
                if (ebVar == null) {
                    synchronized (C50177nk.class) {
                        ebVar = f130439e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130438c);
                            f130439e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
