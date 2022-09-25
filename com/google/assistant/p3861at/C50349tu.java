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

/* renamed from: com.google.assistant.at.tu */
/* compiled from: PG */
public final class C50349tu extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50349tu f131039f;

    /* renamed from: g */
    private static volatile C63010eb f131040g;

    /* renamed from: a */
    public int f131041a;

    /* renamed from: b */
    public String f131042b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131043c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f131044d = emptyProtobufList();

    /* renamed from: e */
    public String f131045e = BuildConfig.FLAVOR;

    static {
        C50349tu tuVar = new C50349tu();
        f131039f = tuVar;
        C62942bv.registerDefaultInstance(C50349tu.class, tuVar);
    }

    private C50349tu() {
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
                return newMessageInfo(f131039f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0002\u0004ဈ\u0001", new Object[]{"a", "b", "d", C59308f.class, "e", C45240c.f118157a});
            case 3:
                return new C50349tu();
            case 4:
                return new C50348tt();
            case 5:
                return f131039f;
            case 6:
                C63010eb ebVar = f131040g;
                if (ebVar == null) {
                    synchronized (C50349tu.class) {
                        ebVar = f131040g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131039f);
                            f131040g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
