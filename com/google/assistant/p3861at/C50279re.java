package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.re */
/* compiled from: PG */
public final class C50279re extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50279re f130752d;

    /* renamed from: f */
    private static volatile C63010eb f130753f;

    /* renamed from: a */
    public String f130754a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130755b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C50275ra f130756c;

    /* renamed from: e */
    private int f130757e;

    static {
        C50279re reVar = new C50279re();
        f130752d = reVar;
        C62942bv.registerDefaultInstance(C50279re.class, reVar);
    }

    private C50279re() {
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
                return newMessageInfo(f130752d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C50279re();
            case 4:
                return new C50278rd();
            case 5:
                return f130752d;
            case 6:
                C63010eb ebVar = f130753f;
                if (ebVar == null) {
                    synchronized (C50279re.class) {
                        ebVar = f130753f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130752d);
                            f130753f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
