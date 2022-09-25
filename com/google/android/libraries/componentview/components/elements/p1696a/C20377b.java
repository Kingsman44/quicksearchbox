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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.b */
/* compiled from: PG */
public final class C20377b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C20377b f57291e;

    /* renamed from: f */
    public static final C62940bt f57292f;

    /* renamed from: h */
    private static volatile C63010eb f57293h;

    /* renamed from: a */
    public int f57294a;

    /* renamed from: b */
    public C62971cq f57295b = emptyProtobufList();

    /* renamed from: c */
    public C19916aq f57296c;

    /* renamed from: d */
    public C20379d f57297d;

    /* renamed from: g */
    private byte f57298g = 2;

    static {
        C20377b bVar = new C20377b();
        f57291e = bVar;
        C62942bv.registerDefaultInstance(C20377b.class, bVar);
        f57292f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 108390327, C63066gd.MESSAGE, C20377b.class);
    }

    private C20377b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57298g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57298g = b;
                return null;
            case 2:
                return newMessageInfo(f57291e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", C56425d.class, C45240c.f118157a, "d"});
            case 3:
                return new C20377b();
            case 4:
                return new C20376a();
            case 5:
                return f57291e;
            case 6:
                C63010eb ebVar = f57293h;
                if (ebVar == null) {
                    synchronized (C20377b.class) {
                        ebVar = f57293h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57291e);
                            f57293h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
