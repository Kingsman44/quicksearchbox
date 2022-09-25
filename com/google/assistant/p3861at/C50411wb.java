package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.wb */
/* compiled from: PG */
public final class C50411wb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50411wb f131210f;

    /* renamed from: g */
    private static volatile C63010eb f131211g;

    /* renamed from: a */
    public int f131212a;

    /* renamed from: b */
    public long f131213b;

    /* renamed from: c */
    public C50419wj f131214c;

    /* renamed from: d */
    public C50415wf f131215d;

    /* renamed from: e */
    public C63088z f131216e = C63088z.f170246b;

    static {
        C50411wb wbVar = new C50411wb();
        f131210f = wbVar;
        C62942bv.registerDefaultInstance(C50411wb.class, wbVar);
    }

    private C50411wb() {
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
                return newMessageInfo(f131210f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ည\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C50411wb();
            case 4:
                return new C50410wa();
            case 5:
                return f131210f;
            case 6:
                C63010eb ebVar = f131211g;
                if (ebVar == null) {
                    synchronized (C50411wb.class) {
                        ebVar = f131211g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131210f);
                            f131211g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
