package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80397j;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.afo */
/* compiled from: PG */
public final class afo extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final afo f158558g;

    /* renamed from: h */
    private static volatile C63010eb f158559h;

    /* renamed from: a */
    public int f158560a;

    /* renamed from: b */
    public int f158561b;

    /* renamed from: c */
    public C62971cq f158562c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f158563d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f158564e = emptyProtobufList();

    /* renamed from: f */
    public int f158565f;

    static {
        afo afo = new afo();
        f158558g = afo;
        C62942bv.registerDefaultInstance(afo.class, afo);
    }

    private afo() {
    }

    /* renamed from: a */
    public final void mo56992a() {
        C62971cq cqVar = this.f158562c;
        if (!cqVar.mo58948c()) {
            this.f158562c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f158558g, "\u0001\u0005\u0000\u0001\u0002\u001c\u0005\u0000\u0003\u0000\u0002ဌ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\u001cဌ\u0002", new Object[]{"a", "b", C82835ce.m132410b(), C45240c.f118157a, afl.class, "d", ahs.class, "e", afn.class, C10662f.f35572a, C80397j.f220654a});
            case 3:
                return new afo();
            case 4:
                return new afj();
            case 5:
                return f158558g;
            case 6:
                C63010eb ebVar = f158559h;
                if (ebVar == null) {
                    synchronized (afo.class) {
                        ebVar = f158559h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158558g);
                            f158559h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
