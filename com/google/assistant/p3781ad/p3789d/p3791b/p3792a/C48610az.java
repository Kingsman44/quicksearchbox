package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.az */
/* compiled from: PG */
public final class C48610az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48610az f125624d;

    /* renamed from: e */
    private static volatile C63010eb f125625e;

    /* renamed from: a */
    public String f125626a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f125627b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public long f125628c;

    static {
        C48610az azVar = new C48610az();
        f125624d = azVar;
        C62942bv.registerDefaultInstance(C48610az.class, azVar);
    }

    private C48610az() {
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
                return newMessageInfo(f125624d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0004\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48610az();
            case 4:
                return new C48609ay();
            case 5:
                return f125624d;
            case 6:
                C63010eb ebVar = f125625e;
                if (ebVar == null) {
                    synchronized (C48610az.class) {
                        ebVar = f125625e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125624d);
                            f125625e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
