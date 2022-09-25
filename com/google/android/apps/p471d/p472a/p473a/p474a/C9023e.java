package com.google.android.apps.p471d.p472a.p473a.p474a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.d.a.a.a.e */
/* compiled from: PG */
public final class C9023e extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9023e f31155f;

    /* renamed from: g */
    private static volatile C63010eb f31156g;

    /* renamed from: a */
    public int f31157a;

    /* renamed from: b */
    public C63042fg f31158b;

    /* renamed from: c */
    public String f31159c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62910ar f31160d;

    /* renamed from: e */
    public C9021c f31161e;

    static {
        C9023e eVar = new C9023e();
        f31155f = eVar;
        C62942bv.registerDefaultInstance(C9023e.class, eVar);
    }

    private C9023e() {
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
                return newMessageInfo(f31155f, "\u0000\u0005\u0000\u0000\u0002\n\u0005\u0000\u0000\u0000\u0002\f\u0003\t\u0005Ȉ\u0006\t\n\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C9023e();
            case 4:
                return new C9022d();
            case 5:
                return f31155f;
            case 6:
                C63010eb ebVar = f31156g;
                if (ebVar == null) {
                    synchronized (C9023e.class) {
                        ebVar = f31156g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31155f);
                            f31156g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
