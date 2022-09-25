package com.google.speech.p5218j.p5219a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.ao */
/* compiled from: PG */
public final class C66711ao extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66711ao f181474d;

    /* renamed from: e */
    private static volatile C63010eb f181475e;

    /* renamed from: a */
    public int f181476a;

    /* renamed from: b */
    public String f181477b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f181478c;

    static {
        C66711ao aoVar = new C66711ao();
        f181474d = aoVar;
        C62942bv.registerDefaultInstance(C66711ao.class, aoVar);
    }

    private C66711ao() {
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
                return newMessageInfo(f181474d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66711ao();
            case 4:
                return new C66710an();
            case 5:
                return f181474d;
            case 6:
                C63010eb ebVar = f181475e;
                if (ebVar == null) {
                    synchronized (C66711ao.class) {
                        ebVar = f181475e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181474d);
                            f181475e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
