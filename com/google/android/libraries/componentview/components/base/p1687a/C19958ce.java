package com.google.android.libraries.componentview.components.base.p1687a;

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

/* renamed from: com.google.android.libraries.componentview.components.base.a.ce */
/* compiled from: PG */
public final class C19958ce extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19958ce f55876e;

    /* renamed from: f */
    public static final C62940bt f55877f;

    /* renamed from: h */
    private static volatile C63010eb f55878h;

    /* renamed from: a */
    public int f55879a;

    /* renamed from: b */
    public C62971cq f55880b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f55881c;

    /* renamed from: d */
    public boolean f55882d;

    /* renamed from: g */
    private byte f55883g = 2;

    static {
        C19958ce ceVar = new C19958ce();
        f55876e = ceVar;
        C62942bv.registerDefaultInstance(C19958ce.class, ceVar);
        f55877f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, ceVar, ceVar, (C62958ce) null, 164126106, C63066gd.MESSAGE, C19958ce.class);
    }

    private C19958ce() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55883g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55883g = b;
                return null;
            case 2:
                return newMessageInfo(f55876e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d"});
            case 3:
                return new C19958ce();
            case 4:
                return new C19957cd();
            case 5:
                return f55876e;
            case 6:
                C63010eb ebVar = f55878h;
                if (ebVar == null) {
                    synchronized (C19958ce.class) {
                        ebVar = f55878h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55876e);
                            f55878h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
