package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.e.b.b.a.aj */
/* compiled from: PG */
public final class C57068aj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57068aj f152347e;

    /* renamed from: g */
    private static volatile C63010eb f152348g;

    /* renamed from: a */
    public int f152349a;

    /* renamed from: b */
    public C62971cq f152350b = emptyProtobufList();

    /* renamed from: c */
    public CommandOuterClass$Command f152351c;

    /* renamed from: d */
    public C60214n f152352d;

    /* renamed from: f */
    private byte f152353f = 2;

    static {
        C57068aj ajVar = new C57068aj();
        f152347e = ajVar;
        C62942bv.registerDefaultInstance(C57068aj.class, ajVar);
    }

    private C57068aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152353f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152353f = b;
                return null;
            case 2:
                return newMessageInfo(f152347e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001\u001b\u0004ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"a", "b", C57072an.class, C45240c.f118157a, "d"});
            case 3:
                return new C57068aj();
            case 4:
                return new C57067ai();
            case 5:
                return f152347e;
            case 6:
                C63010eb ebVar = f152348g;
                if (ebVar == null) {
                    synchronized (C57068aj.class) {
                        ebVar = f152348g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152347e);
                            f152348g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
