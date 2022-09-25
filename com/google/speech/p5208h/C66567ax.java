package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.speech.h.ax */
/* compiled from: PG */
public final class C66567ax extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66567ax f181069f;

    /* renamed from: g */
    public static final C62940bt f181070g;

    /* renamed from: h */
    private static volatile C63010eb f181071h;

    /* renamed from: a */
    public int f181072a;

    /* renamed from: b */
    public String f181073b = "/search";

    /* renamed from: c */
    public C62971cq f181074c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f181075d = emptyProtobufList();

    /* renamed from: e */
    public boolean f181076e;

    static {
        C66567ax axVar = new C66567ax();
        f181069f = axVar;
        C62942bv.registerDefaultInstance(C66567ax.class, axVar);
        f181070g = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, axVar, axVar, (C62958ce) null, 34352150, C63066gd.MESSAGE, C66567ax.class);
    }

    private C66567ax() {
    }

    /* renamed from: a */
    public final void mo59679a() {
        C62971cq cqVar = this.f181075d;
        if (!cqVar.mo58948c()) {
            this.f181075d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f181069f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဈ\u0000\u0005ဇ\u0002", new Object[]{"a", C45240c.f118157a, C66560aq.class, "d", C66563at.class, "b", "e"});
            case 3:
                return new C66567ax();
            case 4:
                return new C66566aw();
            case 5:
                return f181069f;
            case 6:
                C63010eb ebVar = f181071h;
                if (ebVar == null) {
                    synchronized (C66567ax.class) {
                        ebVar = f181071h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181069f);
                            f181071h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
