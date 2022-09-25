package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.gs */
/* compiled from: PG */
public final class C49996gs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49996gs f129967d;

    /* renamed from: e */
    private static volatile C63010eb f129968e;

    /* renamed from: a */
    public int f129969a;

    /* renamed from: b */
    public C62971cq f129970b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f129971c = BuildConfig.FLAVOR;

    static {
        C49996gs gsVar = new C49996gs();
        f129967d = gsVar;
        C62942bv.registerDefaultInstance(C49996gs.class, gsVar);
    }

    private C49996gs() {
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
                return newMessageInfo(f129967d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C49996gs();
            case 4:
                return new C49995gr();
            case 5:
                return f129967d;
            case 6:
                C63010eb ebVar = f129968e;
                if (ebVar == null) {
                    synchronized (C49996gs.class) {
                        ebVar = f129968e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129967d);
                            f129968e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
