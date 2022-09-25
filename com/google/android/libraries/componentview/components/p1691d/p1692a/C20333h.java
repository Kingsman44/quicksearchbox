package com.google.android.libraries.componentview.components.p1691d.p1692a;

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

/* renamed from: com.google.android.libraries.componentview.components.d.a.h */
/* compiled from: PG */
public final class C20333h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C20333h f57141e;

    /* renamed from: f */
    public static final C62940bt f57142f;

    /* renamed from: h */
    private static volatile C63010eb f57143h;

    /* renamed from: a */
    public int f57144a;

    /* renamed from: b */
    public boolean f57145b;

    /* renamed from: c */
    public C56425d f57146c;

    /* renamed from: d */
    public C56425d f57147d;

    /* renamed from: g */
    private byte f57148g = 2;

    static {
        C20333h hVar = new C20333h();
        f57141e = hVar;
        C62942bv.registerDefaultInstance(C20333h.class, hVar);
        f57142f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, hVar, hVar, (C62958ce) null, 129689206, C63066gd.MESSAGE, C20333h.class);
    }

    private C20333h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57148g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57148g = b;
                return null;
            case 2:
                return newMessageInfo(f57141e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C20333h();
            case 4:
                return new C20332g();
            case 5:
                return f57141e;
            case 6:
                C63010eb ebVar = f57143h;
                if (ebVar == null) {
                    synchronized (C20333h.class) {
                        ebVar = f57143h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57141e);
                            f57143h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
