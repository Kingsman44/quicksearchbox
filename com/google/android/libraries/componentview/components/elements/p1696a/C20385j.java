package com.google.android.libraries.componentview.components.elements.p1696a;

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

/* renamed from: com.google.android.libraries.componentview.components.elements.a.j */
/* compiled from: PG */
public final class C20385j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20385j f57318d;

    /* renamed from: e */
    public static final C62940bt f57319e;

    /* renamed from: g */
    private static volatile C63010eb f57320g;

    /* renamed from: a */
    public int f57321a;

    /* renamed from: b */
    public C20381f f57322b;

    /* renamed from: c */
    public int f57323c = 4;

    /* renamed from: f */
    private byte f57324f = 2;

    static {
        C20385j jVar = new C20385j();
        f57318d = jVar;
        C62942bv.registerDefaultInstance(C20385j.class, jVar);
        f57319e = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, jVar, jVar, (C62958ce) null, 148720204, C63066gd.MESSAGE, C20385j.class);
    }

    private C20385j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57324f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57324f = b;
                return null;
            case 2:
                return newMessageInfo(f57318d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20385j();
            case 4:
                return new C20384i();
            case 5:
                return f57318d;
            case 6:
                C63010eb ebVar = f57320g;
                if (ebVar == null) {
                    synchronized (C20385j.class) {
                        ebVar = f57320g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57318d);
                            f57320g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
