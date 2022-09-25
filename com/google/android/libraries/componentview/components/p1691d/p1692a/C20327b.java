package com.google.android.libraries.componentview.components.p1691d.p1692a;

import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.d.a.b */
/* compiled from: PG */
public final class C20327b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20327b f57125c;

    /* renamed from: d */
    public static final C62940bt f57126d;

    /* renamed from: e */
    private static volatile C63010eb f57127e;

    /* renamed from: a */
    public int f57128a;

    /* renamed from: b */
    public C20329d f57129b;

    static {
        C20327b bVar = new C20327b();
        f57125c = bVar;
        C62942bv.registerDefaultInstance(C20327b.class, bVar);
        f57126d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, bVar, bVar, (C62958ce) null, 128359702, C63066gd.MESSAGE, C20327b.class);
    }

    private C20327b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f57125c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C20327b();
            case 4:
                return new C20326a();
            case 5:
                return f57125c;
            case 6:
                C63010eb ebVar = f57127e;
                if (ebVar == null) {
                    synchronized (C20327b.class) {
                        ebVar = f57127e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57125c);
                            f57127e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
