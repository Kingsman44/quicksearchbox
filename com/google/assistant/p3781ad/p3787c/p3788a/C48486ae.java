package com.google.assistant.p3781ad.p3787c.p3788a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.ae */
/* compiled from: PG */
public final class C48486ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48486ae f125248d;

    /* renamed from: e */
    private static volatile C63010eb f125249e;

    /* renamed from: a */
    public int f125250a;

    /* renamed from: b */
    public String f125251b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f125252c = emptyProtobufList();

    static {
        C48486ae aeVar = new C48486ae();
        f125248d = aeVar;
        C62942bv.registerDefaultInstance(C48486ae.class, aeVar);
    }

    private C48486ae() {
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
                return newMessageInfo(f125248d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, C48502au.class});
            case 3:
                return new C48486ae();
            case 4:
                return new C48485ad();
            case 5:
                return f125248d;
            case 6:
                C63010eb ebVar = f125249e;
                if (ebVar == null) {
                    synchronized (C48486ae.class) {
                        ebVar = f125249e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125248d);
                            f125249e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
