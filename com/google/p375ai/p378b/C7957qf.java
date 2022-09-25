package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.C57529n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.qf */
/* compiled from: PG */
public final class C7957qf extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C7957qf f27953f;

    /* renamed from: i */
    private static volatile C63010eb f27954i;

    /* renamed from: a */
    public C62971cq f27955a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f27956b = emptyProtobufList();

    /* renamed from: c */
    public C62961ch f27957c = emptyIntList();

    /* renamed from: d */
    public C7639el f27958d;

    /* renamed from: e */
    public int f27959e;

    /* renamed from: g */
    private int f27960g;

    /* renamed from: h */
    private byte f27961h = 2;

    static {
        C7957qf qfVar = new C7957qf();
        f27953f = qfVar;
        C62942bv.registerDefaultInstance(C7957qf.class, qfVar);
    }

    private C7957qf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27961h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27961h = b;
                return null;
            case 2:
                return newMessageInfo(f27953f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0002\u0001Л\u0002Л\u0004\u0016\u0005ဉ\u0001\u0006ဌ\u0002", new Object[]{C30325g.f82003a, "a", C7653ez.class, "b", C7659fe.class, C45240c.f118157a, "d", "e", C57529n.f153694a});
            case 3:
                return new C7957qf();
            case 4:
                return new C7956qe();
            case 5:
                return f27953f;
            case 6:
                C63010eb ebVar = f27954i;
                if (ebVar == null) {
                    synchronized (C7957qf.class) {
                        ebVar = f27954i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27953f);
                            f27954i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
