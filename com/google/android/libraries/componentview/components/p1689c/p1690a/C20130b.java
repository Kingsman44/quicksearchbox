package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.libraries.componentview.components.base.p1687a.C19926b;
import com.google.android.libraries.componentview.components.base.p1687a.C19983f;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
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

/* renamed from: com.google.android.libraries.componentview.components.c.a.b */
/* compiled from: PG */
public final class C20130b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C20130b f56426g;

    /* renamed from: h */
    public static final C62940bt f56427h;

    /* renamed from: j */
    private static volatile C63010eb f56428j;

    /* renamed from: a */
    public int f56429a;

    /* renamed from: b */
    public C56425d f56430b;

    /* renamed from: c */
    public C19983f f56431c;

    /* renamed from: d */
    public C19983f f56432d;

    /* renamed from: e */
    public int f56433e;

    /* renamed from: f */
    public C19926b f56434f;

    /* renamed from: i */
    private byte f56435i = 2;

    static {
        C20130b bVar = new C20130b();
        f56426g = bVar;
        C62942bv.registerDefaultInstance(C20130b.class, bVar);
        f56427h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 123170109, C63066gd.MESSAGE, C20130b.class);
    }

    private C20130b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56435i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56435i = b;
                return null;
            case 2:
                return newMessageInfo(f56426g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C20130b();
            case 4:
                return new C20103a();
            case 5:
                return f56426g;
            case 6:
                C63010eb ebVar = f56428j;
                if (ebVar == null) {
                    synchronized (C20130b.class) {
                        ebVar = f56428j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56426g);
                            f56428j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
