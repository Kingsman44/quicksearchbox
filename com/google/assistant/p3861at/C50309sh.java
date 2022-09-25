package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.sh */
/* compiled from: PG */
public final class C50309sh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50309sh f130935d;

    /* renamed from: e */
    private static volatile C63010eb f130936e;

    /* renamed from: a */
    public int f130937a;

    /* renamed from: b */
    public String f130938b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130939c = BuildConfig.FLAVOR;

    static {
        C50309sh shVar = new C50309sh();
        f130935d = shVar;
        C62942bv.registerDefaultInstance(C50309sh.class, shVar);
    }

    private C50309sh() {
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
                return newMessageInfo(f130935d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50309sh();
            case 4:
                return new C50308sg();
            case 5:
                return f130935d;
            case 6:
                C63010eb ebVar = f130936e;
                if (ebVar == null) {
                    synchronized (C50309sh.class) {
                        ebVar = f130936e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130935d);
                            f130936e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
