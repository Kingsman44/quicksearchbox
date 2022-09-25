package com.google.assistant.p3860as;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4479cg.C58077i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bc */
/* compiled from: PG */
public final class C49767bc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49767bc f128506e;

    /* renamed from: i */
    private static volatile C63010eb f128507i;

    /* renamed from: a */
    public int f128508a;

    /* renamed from: b */
    public C62971cq f128509b = emptyProtobufList();

    /* renamed from: c */
    public int f128510c;

    /* renamed from: d */
    public int f128511d;

    /* renamed from: f */
    private int f128512f;

    /* renamed from: g */
    private C61752n f128513g;

    /* renamed from: h */
    private byte f128514h = 2;

    static {
        C49767bc bcVar = new C49767bc();
        f128506e = bcVar;
        C62942bv.registerDefaultInstance(C49767bc.class, bcVar);
    }

    private C49767bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128514h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128514h = b;
                return null;
            case 2:
                return newMessageInfo(f128506e, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u001b\u0002င\u0000\u0003ဌ\u0001\u0004ᐉ\u0004\u0005ဌ\u0002", new Object[]{"a", "b", C49771bg.class, C45240c.f118157a, "d", C58077i.m88833b(), C30325g.f82003a, C10662f.f35572a, C49778bn.f128541a});
            case 3:
                return new C49767bc();
            case 4:
                return new C49766bb();
            case 5:
                return f128506e;
            case 6:
                C63010eb ebVar = f128507i;
                if (ebVar == null) {
                    synchronized (C49767bc.class) {
                        ebVar = f128507i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128506e);
                            f128507i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
