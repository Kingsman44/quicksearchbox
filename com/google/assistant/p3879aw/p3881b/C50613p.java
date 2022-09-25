package com.google.assistant.p3879aw.p3881b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.assistant.aw.b.p */
/* compiled from: PG */
public final class C50613p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50613p f131682d;

    /* renamed from: e */
    private static volatile C63010eb f131683e;

    /* renamed from: a */
    public int f131684a;

    /* renamed from: b */
    public C63070h f131685b;

    /* renamed from: c */
    public String f131686c = BuildConfig.FLAVOR;

    static {
        C50613p pVar = new C50613p();
        f131682d = pVar;
        C62942bv.registerDefaultInstance(C50613p.class, pVar);
    }

    private C50613p() {
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
                return newMessageInfo(f131682d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50613p();
            case 4:
                return new C50612o();
            case 5:
                return f131682d;
            case 6:
                C63010eb ebVar = f131683e;
                if (ebVar == null) {
                    synchronized (C50613p.class) {
                        ebVar = f131683e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131682d);
                            f131683e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
