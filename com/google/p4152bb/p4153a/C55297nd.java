package com.google.p4152bb.p4153a;

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

/* renamed from: com.google.bb.a.nd */
/* compiled from: PG */
public final class C55297nd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55297nd f145670f;

    /* renamed from: g */
    public static final C62940bt f145671g;

    /* renamed from: i */
    private static volatile C63010eb f145672i;

    /* renamed from: a */
    public int f145673a;

    /* renamed from: b */
    public C55296nc f145674b;

    /* renamed from: c */
    public C62971cq f145675c = emptyProtobufList();

    /* renamed from: d */
    public int f145676d;

    /* renamed from: e */
    public C55200jo f145677e;

    /* renamed from: h */
    private byte f145678h = 2;

    static {
        C55297nd ndVar = new C55297nd();
        f145670f = ndVar;
        C62942bv.registerDefaultInstance(C55297nd.class, ndVar);
        f145671g = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, ndVar, ndVar, (C62958ce) null, 64900141, C63066gd.MESSAGE, C55297nd.class);
    }

    private C55297nd() {
    }

    /* renamed from: a */
    public final void mo54234a() {
        C62971cq cqVar = this.f145675c;
        if (!cqVar.mo58948c()) {
            this.f145675c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145678h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145678h = b;
                return null;
            case 2:
                return newMessageInfo(f145670f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C55296nc.class, "d", "e"});
            case 3:
                return new C55297nd();
            case 4:
                return new C55294na();
            case 5:
                return f145670f;
            case 6:
                C63010eb ebVar = f145672i;
                if (ebVar == null) {
                    synchronized (C55297nd.class) {
                        ebVar = f145672i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145670f);
                            f145672i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
