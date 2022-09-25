package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.l */
/* compiled from: PG */
public final class C80464l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80464l f220835f;

    /* renamed from: g */
    private static volatile C63010eb f220836g;

    /* renamed from: a */
    public int f220837a;

    /* renamed from: b */
    public String f220838b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f220839c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f220840d = emptyProtobufList();

    /* renamed from: e */
    public int f220841e;

    static {
        C80464l lVar = new C80464l();
        f220835f = lVar;
        C62942bv.registerDefaultInstance(C80464l.class, lVar);
    }

    private C80464l() {
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
                return newMessageInfo(f220835f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"a", "b", C45240c.f118157a, C80468p.class, "d", C80462j.class, "e"});
            case 3:
                return new C80464l();
            case 4:
                return new C80463k();
            case 5:
                return f220835f;
            case 6:
                C63010eb ebVar = f220836g;
                if (ebVar == null) {
                    synchronized (C80464l.class) {
                        ebVar = f220836g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220835f);
                            f220836g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
