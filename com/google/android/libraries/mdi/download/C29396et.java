package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.mdi.download.et */
/* compiled from: PG */
public final class C29396et extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C29396et f79691f;

    /* renamed from: g */
    private static volatile C63010eb f79692g;

    /* renamed from: a */
    public int f79693a;

    /* renamed from: b */
    public C63042fg f79694b;

    /* renamed from: c */
    public C62971cq f79695c = emptyProtobufList();

    /* renamed from: d */
    public boolean f79696d;

    /* renamed from: e */
    public C29400ex f79697e;

    static {
        C29396et etVar = new C29396et();
        f79691f = etVar;
        C62942bv.registerDefaultInstance(C29396et.class, etVar);
    }

    private C29396et() {
    }

    /* renamed from: a */
    public final void mo34703a() {
        C62971cq cqVar = this.f79695c;
        if (!cqVar.mo58948c()) {
            this.f79695c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f79691f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C29384eh.class, "d", "e"});
            case 3:
                return new C29396et();
            case 4:
                return new C29395es();
            case 5:
                return f79691f;
            case 6:
                C63010eb ebVar = f79692g;
                if (ebVar == null) {
                    synchronized (C29396et.class) {
                        ebVar = f79692g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79691f);
                            f79692g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
