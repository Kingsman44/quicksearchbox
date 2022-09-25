package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.a.bb */
/* compiled from: PG */
public final class C80307bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80307bb f220382e;

    /* renamed from: f */
    private static volatile C63010eb f220383f;

    /* renamed from: a */
    public int f220384a;

    /* renamed from: b */
    public int f220385b;

    /* renamed from: c */
    public int f220386c;

    /* renamed from: d */
    public C62971cq f220387d = emptyProtobufList();

    static {
        C80307bb bbVar = new C80307bb();
        f220382e = bbVar;
        C62942bv.registerDefaultInstance(C80307bb.class, bbVar);
    }

    private C80307bb() {
    }

    /* renamed from: a */
    public final void mo74304a() {
        C62971cq cqVar = this.f220387d;
        if (!cqVar.mo58948c()) {
            this.f220387d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f220382e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", C80304az.f220378a, C45240c.f118157a, C55421x.m87687b(), "d", C22104g.class});
            case 3:
                return new C80307bb();
            case 4:
                return new C80303ay();
            case 5:
                return f220382e;
            case 6:
                C63010eb ebVar = f220383f;
                if (ebVar == null) {
                    synchronized (C80307bb.class) {
                        ebVar = f220383f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220382e);
                            f220383f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
