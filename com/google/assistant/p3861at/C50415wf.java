package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.wf */
/* compiled from: PG */
public final class C50415wf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50415wf f131222b;

    /* renamed from: d */
    private static volatile C63010eb f131223d;

    /* renamed from: a */
    public String f131224a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131225c;

    static {
        C50415wf wfVar = new C50415wf();
        f131222b = wfVar;
        C62942bv.registerDefaultInstance(C50415wf.class, wfVar);
    }

    private C50415wf() {
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
                return newMessageInfo(f131222b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50415wf();
            case 4:
                return new C50414we();
            case 5:
                return f131222b;
            case 6:
                C63010eb ebVar = f131223d;
                if (ebVar == null) {
                    synchronized (C50415wf.class) {
                        ebVar = f131223d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131222b);
                            f131223d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
