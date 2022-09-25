package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bj */
/* compiled from: PG */
public final class C51267bj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51267bj f133462e;

    /* renamed from: f */
    private static volatile C63010eb f133463f;

    /* renamed from: a */
    public int f133464a;

    /* renamed from: b */
    public String f133465b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f133466c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f133467d;

    static {
        C51267bj bjVar = new C51267bj();
        f133462e = bjVar;
        C62942bv.registerDefaultInstance(C51267bj.class, bjVar);
    }

    private C51267bj() {
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
                return newMessageInfo(f133462e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0004ဈ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C51267bj();
            case 4:
                return new C51266bi();
            case 5:
                return f133462e;
            case 6:
                C63010eb ebVar = f133463f;
                if (ebVar == null) {
                    synchronized (C51267bj.class) {
                        ebVar = f133463f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133462e);
                            f133463f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
