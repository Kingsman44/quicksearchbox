package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.v */
/* compiled from: PG */
public final class C57661v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57661v f153979d;

    /* renamed from: e */
    private static volatile C63010eb f153980e;

    /* renamed from: a */
    public String f153981a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f153982b;

    /* renamed from: c */
    public int f153983c;

    static {
        C57661v vVar = new C57661v();
        f153979d = vVar;
        C62942bv.registerDefaultInstance(C57661v.class, vVar);
    }

    private C57661v() {
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
                return newMessageInfo(f153979d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57661v();
            case 4:
                return new C57660u();
            case 5:
                return f153979d;
            case 6:
                C63010eb ebVar = f153980e;
                if (ebVar == null) {
                    synchronized (C57661v.class) {
                        ebVar = f153980e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153979d);
                            f153980e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
