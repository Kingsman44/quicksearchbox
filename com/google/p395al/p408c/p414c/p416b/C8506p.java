package com.google.p395al.p408c.p414c.p416b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.p */
/* compiled from: PG */
public final class C8506p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8506p f29511d;

    /* renamed from: f */
    private static volatile C63010eb f29512f;

    /* renamed from: a */
    public String f29513a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f29514b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f29515c = emptyProtobufList();

    /* renamed from: e */
    private int f29516e;

    static {
        C8506p pVar = new C8506p();
        f29511d = pVar;
        C62942bv.registerDefaultInstance(C8506p.class, pVar);
    }

    private C8506p() {
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
                return newMessageInfo(f29511d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001b", new Object[]{"e", "a", "b", C45240c.f118157a, C8508r.class});
            case 3:
                return new C8506p();
            case 4:
                return new C8505o();
            case 5:
                return f29511d;
            case 6:
                C63010eb ebVar = f29512f;
                if (ebVar == null) {
                    synchronized (C8506p.class) {
                        ebVar = f29512f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29511d);
                            f29512f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
