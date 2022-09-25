package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.o */
/* compiled from: PG */
public final class C83006o extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C83006o f226508g;

    /* renamed from: h */
    private static volatile C63010eb f226509h;

    /* renamed from: a */
    public int f226510a;

    /* renamed from: b */
    public int f226511b;

    /* renamed from: c */
    public C62971cq f226512c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f226513d;

    /* renamed from: e */
    public boolean f226514e;

    /* renamed from: f */
    public boolean f226515f;

    static {
        C83006o oVar = new C83006o();
        f226508g = oVar;
        C62942bv.registerDefaultInstance(C83006o.class, oVar);
    }

    private C83006o() {
        C62942bv.emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo76642a() {
        C62971cq cqVar = this.f226512c;
        if (!cqVar.mo58948c()) {
            this.f226512c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f226508g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001a\u0003င\u0001\u0004ဇ\u0002\u0006ဇ\u0003", new Object[]{"a", "b", C83005n.f226507a, C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C83006o();
            case 4:
                return new C83004m();
            case 5:
                return f226508g;
            case 6:
                C63010eb ebVar = f226509h;
                if (ebVar == null) {
                    synchronized (C83006o.class) {
                        ebVar = f226509h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226508g);
                            f226509h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
