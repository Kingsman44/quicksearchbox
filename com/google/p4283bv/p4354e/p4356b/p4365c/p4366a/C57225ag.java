package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ag */
/* compiled from: PG */
public final class C57225ag extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57225ag f152763d;

    /* renamed from: e */
    private static volatile C63010eb f152764e;

    /* renamed from: a */
    public int f152765a;

    /* renamed from: b */
    public String f152766b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f152767c = BuildConfig.FLAVOR;

    static {
        C57225ag agVar = new C57225ag();
        f152763d = agVar;
        C62942bv.registerDefaultInstance(C57225ag.class, agVar);
    }

    private C57225ag() {
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
                return newMessageInfo(f152763d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57225ag();
            case 4:
                return new C57224af();
            case 5:
                return f152763d;
            case 6:
                C63010eb ebVar = f152764e;
                if (ebVar == null) {
                    synchronized (C57225ag.class) {
                        ebVar = f152764e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152763d);
                            f152764e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
