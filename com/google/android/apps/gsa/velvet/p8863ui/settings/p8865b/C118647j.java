package com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b.j */
/* compiled from: PG */
public final class C118647j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C118647j f330999e;

    /* renamed from: f */
    private static volatile C63010eb f331000f;

    /* renamed from: a */
    public C62971cq f331001a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f331002b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f331003c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f331004d = emptyProtobufList();

    static {
        C118647j jVar = new C118647j();
        f330999e = jVar;
        C62942bv.registerDefaultInstance(C118647j.class, jVar);
    }

    private C118647j() {
    }

    /* renamed from: a */
    public final void mo103833a() {
        C62971cq cqVar = this.f331003c;
        if (!cqVar.mo58948c()) {
            this.f331003c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f330999e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", C118642e.class, "b", C118644g.class, C45240c.f118157a, C118640c.class, "d", C118646i.class});
            case 3:
                return new C118647j();
            case 4:
                return new C118638a();
            case 5:
                return f330999e;
            case 6:
                C63010eb ebVar = f331000f;
                if (ebVar == null) {
                    synchronized (C118647j.class) {
                        ebVar = f331000f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330999e);
                            f331000f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
