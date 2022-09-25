package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.o */
/* compiled from: PG */
public final class C48654o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48654o f125744d;

    /* renamed from: e */
    private static volatile C63010eb f125745e;

    /* renamed from: a */
    public int f125746a;

    /* renamed from: b */
    public long f125747b;

    /* renamed from: c */
    public String f125748c = BuildConfig.FLAVOR;

    static {
        C48654o oVar = new C48654o();
        f125744d = oVar;
        C62942bv.registerDefaultInstance(C48654o.class, oVar);
    }

    private C48654o() {
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
                return newMessageInfo(f125744d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ለ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48654o();
            case 4:
                return new C48653n();
            case 5:
                return f125744d;
            case 6:
                C63010eb ebVar = f125745e;
                if (ebVar == null) {
                    synchronized (C48654o.class) {
                        ebVar = f125745e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125744d);
                            f125745e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
