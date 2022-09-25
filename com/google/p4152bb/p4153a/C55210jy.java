package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.jy */
/* compiled from: PG */
public final class C55210jy extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55210jy f145342e;

    /* renamed from: f */
    private static volatile C63010eb f145343f;

    /* renamed from: a */
    public int f145344a;

    /* renamed from: b */
    public String f145345b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f145346c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f145347d;

    static {
        C55210jy jyVar = new C55210jy();
        f145342e = jyVar;
        C62942bv.registerDefaultInstance(C55210jy.class, jyVar);
    }

    private C55210jy() {
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
                return newMessageInfo(f145342e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55210jy();
            case 4:
                return new C55209jx();
            case 5:
                return f145342e;
            case 6:
                C63010eb ebVar = f145343f;
                if (ebVar == null) {
                    synchronized (C55210jy.class) {
                        ebVar = f145343f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145342e);
                            f145343f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
