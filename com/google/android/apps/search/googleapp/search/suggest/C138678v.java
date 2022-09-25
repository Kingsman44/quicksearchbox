package com.google.android.apps.search.googleapp.search.suggest;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.v */
/* compiled from: PG */
public final class C138678v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C138678v f377195e;

    /* renamed from: g */
    private static volatile C63010eb f377196g;

    /* renamed from: a */
    public int f377197a;

    /* renamed from: b */
    public String f377198b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f377199c = emptyProtobufList();

    /* renamed from: d */
    public C138542t f377200d;

    /* renamed from: f */
    private byte f377201f = 2;

    static {
        C138678v vVar = new C138678v();
        f377195e = vVar;
        C62942bv.registerDefaultInstance(C138678v.class, vVar);
    }

    private C138678v() {
    }

    /* renamed from: a */
    public final void mo114465a() {
        C62971cq cqVar = this.f377199c;
        if (!cqVar.mo58948c()) {
            this.f377199c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f377201f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f377201f = b;
                return null;
            case 2:
                return newMessageInfo(f377195e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C138030av.class, "d"});
            case 3:
                return new C138678v();
            case 4:
                return new C138543u();
            case 5:
                return f377195e;
            case 6:
                C63010eb ebVar = f377196g;
                if (ebVar == null) {
                    synchronized (C138678v.class) {
                        ebVar = f377196g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f377195e);
                            f377196g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
