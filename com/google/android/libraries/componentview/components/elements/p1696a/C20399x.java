package com.google.android.libraries.componentview.components.elements.p1696a;

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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.x */
/* compiled from: PG */
public final class C20399x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20399x f57374d;

    /* renamed from: e */
    public static final C62940bt f57375e;

    /* renamed from: g */
    private static volatile C63010eb f57376g;

    /* renamed from: a */
    public int f57377a;

    /* renamed from: b */
    public C62971cq f57378b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f57379c;

    /* renamed from: f */
    private byte f57380f = 2;

    static {
        C20399x xVar = new C20399x();
        f57374d = xVar;
        C62942bv.registerDefaultInstance(C20399x.class, xVar);
        f57375e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, xVar, xVar, (C62958ce) null, 108390323, C63066gd.MESSAGE, C20399x.class);
    }

    private C20399x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57380f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57380f = b;
                return null;
            case 2:
                return newMessageInfo(f57374d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"a", "b", C56425d.class, C45240c.f118157a});
            case 3:
                return new C20399x();
            case 4:
                return new C20398w();
            case 5:
                return f57374d;
            case 6:
                C63010eb ebVar = f57376g;
                if (ebVar == null) {
                    synchronized (C20399x.class) {
                        ebVar = f57376g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57374d);
                            f57376g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
