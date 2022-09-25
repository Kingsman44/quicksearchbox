package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.bb */
/* compiled from: PG */
public final class C20132bb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C20132bb f56436f;

    /* renamed from: g */
    public static final C62940bt f56437g;

    /* renamed from: i */
    private static volatile C63010eb f56438i;

    /* renamed from: a */
    public int f56439a;

    /* renamed from: b */
    public C62971cq f56440b = emptyProtobufList();

    /* renamed from: c */
    public boolean f56441c;

    /* renamed from: d */
    public int f56442d;

    /* renamed from: e */
    public C19916aq f56443e;

    /* renamed from: h */
    private byte f56444h = 2;

    static {
        C20132bb bbVar = new C20132bb();
        f56436f = bbVar;
        C62942bv.registerDefaultInstance(C20132bb.class, bbVar);
        f56437g = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bbVar, bbVar, (C62958ce) null, 112979086, C63066gd.MESSAGE, C20132bb.class);
    }

    private C20132bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56444h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56444h = b;
                return null;
            case 2:
                return newMessageInfo(f56436f, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0001\u0001\u0001Л\tဉ\u0002\nဇ\u0000\fင\u0001", new Object[]{"a", "b", C56425d.class, "e", C45240c.f118157a, "d"});
            case 3:
                return new C20132bb();
            case 4:
                return new C20131ba();
            case 5:
                return f56436f;
            case 6:
                C63010eb ebVar = f56438i;
                if (ebVar == null) {
                    synchronized (C20132bb.class) {
                        ebVar = f56438i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56436f);
                            f56438i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
