package com.google.protos.p4985f.p5030q.p5032b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.f.q.b.bg */
/* compiled from: PG */
public final class C65049bg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C65049bg f176149f;

    /* renamed from: i */
    private static volatile C63010eb f176150i;

    /* renamed from: a */
    public int f176151a;

    /* renamed from: b */
    public C62971cq f176152b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public long f176153c;

    /* renamed from: d */
    public boolean f176154d;

    /* renamed from: e */
    public C65768az f176155e;

    /* renamed from: g */
    private int f176156g;

    /* renamed from: h */
    private byte f176157h = 2;

    static {
        C65049bg bgVar = new C65049bg();
        f176149f = bgVar;
        C62942bv.registerDefaultInstance(C65049bg.class, bgVar);
    }

    private C65049bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176157h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176157h = b;
                return null;
            case 2:
                return newMessageInfo(f176149f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u001a\u0003ဂ\u0001\u0004ဇ\u0002\u0005ᐉ\u0003", new Object[]{C30325g.f82003a, "a", C65753ak.m96798c(), "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C65049bg();
            case 4:
                return new C65048bf();
            case 5:
                return f176149f;
            case 6:
                C63010eb ebVar = f176150i;
                if (ebVar == null) {
                    synchronized (C65049bg.class) {
                        ebVar = f176150i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176149f);
                            f176150i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
