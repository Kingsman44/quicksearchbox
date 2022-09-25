package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.android.libraries.componentview.components.base.a.by */
/* compiled from: PG */
public final class C19951by extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C19951by f55841h;

    /* renamed from: i */
    public static final C62940bt f55842i;

    /* renamed from: k */
    private static volatile C63010eb f55843k;

    /* renamed from: a */
    public int f55844a;

    /* renamed from: b */
    public C62971cq f55845b = emptyProtobufList();

    /* renamed from: c */
    public boolean f55846c;

    /* renamed from: d */
    public int f55847d;

    /* renamed from: e */
    public C19916aq f55848e;

    /* renamed from: f */
    public boolean f55849f = true;

    /* renamed from: g */
    public C19920au f55850g;

    /* renamed from: j */
    private byte f55851j = 2;

    static {
        C19951by byVar = new C19951by();
        f55841h = byVar;
        C62942bv.registerDefaultInstance(C19951by.class, byVar);
        f55842i = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, byVar, byVar, (C62958ce) null, 108390336, C63066gd.MESSAGE, C19951by.class);
    }

    private C19951by() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55851j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55851j = b;
                return null;
            case 2:
                return newMessageInfo(f55841h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000\u0006ဌ\u0001\u0007ဉ\u0002\bဇ\u0003\tဉ\u0004", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d", C19949bw.f55840a, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C19951by();
            case 4:
                return new C19948bv();
            case 5:
                return f55841h;
            case 6:
                C63010eb ebVar = f55843k;
                if (ebVar == null) {
                    synchronized (C19951by.class) {
                        ebVar = f55843k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55841h);
                            f55843k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
