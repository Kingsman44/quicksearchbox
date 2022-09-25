package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.c.a.ab */
/* compiled from: PG */
public final class C20105ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20105ab f56342d;

    /* renamed from: e */
    public static final C62940bt f56343e;

    /* renamed from: g */
    private static volatile C63010eb f56344g;

    /* renamed from: a */
    public int f56345a;

    /* renamed from: b */
    public C56425d f56346b;

    /* renamed from: c */
    public C19926b f56347c;

    /* renamed from: f */
    private byte f56348f = 2;

    static {
        C20105ab abVar = new C20105ab();
        f56342d = abVar;
        C62942bv.registerDefaultInstance(C20105ab.class, abVar);
        f56343e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, abVar, abVar, (C62958ce) null, 124614584, C63066gd.MESSAGE, C20105ab.class);
    }

    private C20105ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56348f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56348f = b;
                return null;
            case 2:
                return newMessageInfo(f56342d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20105ab();
            case 4:
                return new C20104aa();
            case 5:
                return f56342d;
            case 6:
                C63010eb ebVar = f56344g;
                if (ebVar == null) {
                    synchronized (C20105ab.class) {
                        ebVar = f56344g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56342d);
                            f56344g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
