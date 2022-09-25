package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mv */
/* compiled from: PG */
public final class C88037mv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88037mv f238062e;

    /* renamed from: g */
    private static volatile C63010eb f238063g;

    /* renamed from: a */
    public int f238064a;

    /* renamed from: b */
    public String f238065b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f238066c;

    /* renamed from: d */
    public C62971cq f238067d = emptyProtobufList();

    /* renamed from: f */
    private byte f238068f = 2;

    static {
        C88037mv mvVar = new C88037mv();
        f238062e = mvVar;
        C62942bv.registerDefaultInstance(C88037mv.class, mvVar);
    }

    private C88037mv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238068f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238068f = b;
                return null;
            case 2:
                return newMessageInfo(f238062e, "\u0001\u0003\u0000\u0001\u0006\f\u0003\u0000\u0001\u0001\u0006ဈ\u0000\u000bင\u0001\fЛ", new Object[]{"a", "b", C45240c.f118157a, "d", C88036mu.class});
            case 3:
                return new C88037mv();
            case 4:
                return new C88020me();
            case 5:
                return f238062e;
            case 6:
                C63010eb ebVar = f238063g;
                if (ebVar == null) {
                    synchronized (C88037mv.class) {
                        ebVar = f238063g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238062e);
                            f238063g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
