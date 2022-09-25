package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4538j.p4539a.C59308f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ub */
/* compiled from: PG */
public final class C50357ub extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50357ub f131060d;

    /* renamed from: f */
    private static volatile C63010eb f131061f;

    /* renamed from: a */
    public String f131062a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f131063b = emptyProtobufList();

    /* renamed from: c */
    public String f131064c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f131065e;

    static {
        C50357ub ubVar = new C50357ub();
        f131060d = ubVar;
        C62942bv.registerDefaultInstance(C50357ub.class, ubVar);
    }

    private C50357ub() {
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
                return newMessageInfo(f131060d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"e", "a", "b", C59308f.class, C45240c.f118157a});
            case 3:
                return new C50357ub();
            case 4:
                return new C50356ua();
            case 5:
                return f131060d;
            case 6:
                C63010eb ebVar = f131061f;
                if (ebVar == null) {
                    synchronized (C50357ub.class) {
                        ebVar = f131061f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131060d);
                            f131061f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
