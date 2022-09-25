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

/* renamed from: com.google.android.libraries.componentview.components.c.a.ad */
/* compiled from: PG */
public final class C20107ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C20107ad f56349e;

    /* renamed from: f */
    public static final C62940bt f56350f;

    /* renamed from: h */
    private static volatile C63010eb f56351h;

    /* renamed from: a */
    public int f56352a;

    /* renamed from: b */
    public C56425d f56353b;

    /* renamed from: c */
    public C56425d f56354c;

    /* renamed from: d */
    public C19926b f56355d;

    /* renamed from: g */
    private byte f56356g = 2;

    static {
        C20107ad adVar = new C20107ad();
        f56349e = adVar;
        C62942bv.registerDefaultInstance(C20107ad.class, adVar);
        f56350f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, adVar, adVar, (C62958ce) null, 121698925, C63066gd.MESSAGE, C20107ad.class);
    }

    private C20107ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56356g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56356g = b;
                return null;
            case 2:
                return newMessageInfo(f56349e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C20107ad();
            case 4:
                return new C20106ac();
            case 5:
                return f56349e;
            case 6:
                C63010eb ebVar = f56351h;
                if (ebVar == null) {
                    synchronized (C20107ad.class) {
                        ebVar = f56351h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56349e);
                            f56351h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
