package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.lc */
/* compiled from: PG */
public final class C50115lc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50115lc f130286d;

    /* renamed from: f */
    private static volatile C63010eb f130287f;

    /* renamed from: a */
    public String f130288a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130289b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f130290c = emptyProtobufList();

    /* renamed from: e */
    private int f130291e;

    static {
        C50115lc lcVar = new C50115lc();
        f130286d = lcVar;
        C62942bv.registerDefaultInstance(C50115lc.class, lcVar);
    }

    private C50115lc() {
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
                return newMessageInfo(f130286d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "a", "b", C45240c.f118157a, C50113la.class});
            case 3:
                return new C50115lc();
            case 4:
                return new C50114lb();
            case 5:
                return f130286d;
            case 6:
                C63010eb ebVar = f130287f;
                if (ebVar == null) {
                    synchronized (C50115lc.class) {
                        ebVar = f130287f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130286d);
                            f130287f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
