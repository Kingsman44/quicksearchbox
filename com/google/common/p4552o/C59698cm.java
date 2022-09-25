package com.google.common.p4552o;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.cm */
/* compiled from: PG */
public final class C59698cm extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C59698cm f160165g;

    /* renamed from: i */
    private static volatile C63010eb f160166i;

    /* renamed from: a */
    public int f160167a;

    /* renamed from: b */
    public int f160168b;

    /* renamed from: c */
    public C62971cq f160169c = emptyProtobufList();

    /* renamed from: d */
    public int f160170d;

    /* renamed from: e */
    public int f160171e;

    /* renamed from: f */
    public int f160172f;

    /* renamed from: h */
    private byte f160173h = 2;

    static {
        C59698cm cmVar = new C59698cm();
        f160165g = cmVar;
        C62942bv.registerDefaultInstance(C59698cm.class, cmVar);
    }

    private C59698cm() {
    }

    /* renamed from: a */
    public final void mo57046a() {
        C62971cq cqVar = this.f160169c;
        if (!cqVar.mo58948c()) {
            this.f160169c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f160173h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f160173h = b;
                return null;
            case 2:
                return newMessageInfo(f160165g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л\u0005ဌ\u0001\u0006ဌ\u0002\u0007ဌ\u0003", new Object[]{"a", "b", C59695cj.f160164a, C45240c.f118157a, C59694ci.class, "d", C89851ag.m146285b(), "e", C89849ae.m146282b(), C10662f.f35572a, C89849ae.m146282b()});
            case 3:
                return new C59698cm();
            case 4:
                return new C59697cl();
            case 5:
                return f160165g;
            case 6:
                C63010eb ebVar = f160166i;
                if (ebVar == null) {
                    synchronized (C59698cm.class) {
                        ebVar = f160166i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160165g);
                            f160166i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
