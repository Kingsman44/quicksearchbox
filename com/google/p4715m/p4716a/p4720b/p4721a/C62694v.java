package com.google.p4715m.p4716a.p4720b.p4721a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.v */
/* compiled from: PG */
public final class C62694v extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62694v f169260e;

    /* renamed from: f */
    private static volatile C63010eb f169261f;

    /* renamed from: a */
    public int f169262a;

    /* renamed from: b */
    public C62971cq f169263b = emptyProtobufList();

    /* renamed from: c */
    public String f169264c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f169265d = BuildConfig.FLAVOR;

    static {
        C62694v vVar = new C62694v();
        f169260e = vVar;
        C62942bv.registerDefaultInstance(C62694v.class, vVar);
    }

    private C62694v() {
    }

    /* renamed from: a */
    public final void mo58575a() {
        C62971cq cqVar = this.f169263b;
        if (!cqVar.mo58948c()) {
            this.f169263b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f169260e, "\u0001\u0003\u0000\u0001\u0002\u0006\u0003\u0000\u0001\u0000\u0002\u001b\u0003ဈ\u0001\u0006ဈ\u0002", new Object[]{"a", "b", C62678f.class, C45240c.f118157a, "d"});
            case 3:
                return new C62694v();
            case 4:
                return new C62693u();
            case 5:
                return f169260e;
            case 6:
                C63010eb ebVar = f169261f;
                if (ebVar == null) {
                    synchronized (C62694v.class) {
                        ebVar = f169261f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169260e);
                            f169261f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
