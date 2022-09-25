package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.jw */
/* compiled from: PG */
public final class C50081jw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50081jw f130203d;

    /* renamed from: e */
    private static volatile C63010eb f130204e;

    /* renamed from: a */
    public int f130205a;

    /* renamed from: b */
    public String f130206b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f130207c = emptyProtobufList();

    static {
        C50081jw jwVar = new C50081jw();
        f130203d = jwVar;
        C62942bv.registerDefaultInstance(C50081jw.class, jwVar);
    }

    private C50081jw() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f130203d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C50080jv.class});
            case 3:
                return new C50081jw();
            case 4:
                return new C50078jt();
            case 5:
                return f130203d;
            case 6:
                C63010eb ebVar = f130204e;
                if (ebVar == null) {
                    synchronized (C50081jw.class) {
                        ebVar = f130204e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130203d);
                            f130204e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
