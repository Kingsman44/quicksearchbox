package com.google.android.libraries.componentview.components.base.p1687a;

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

/* renamed from: com.google.android.libraries.componentview.components.base.a.ca */
/* compiled from: PG */
public final class C19954ca extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19954ca f55852e;

    /* renamed from: f */
    public static final C62940bt f55853f;

    /* renamed from: h */
    private static volatile C63010eb f55854h;

    /* renamed from: a */
    public int f55855a;

    /* renamed from: b */
    public C56425d f55856b;

    /* renamed from: c */
    public C19983f f55857c;

    /* renamed from: d */
    public C19926b f55858d;

    /* renamed from: g */
    private byte f55859g = 2;

    static {
        C19954ca caVar = new C19954ca();
        f55852e = caVar;
        C62942bv.registerDefaultInstance(C19954ca.class, caVar);
        f55853f = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, caVar, caVar, (C62958ce) null, 108390334, C63066gd.MESSAGE, C19954ca.class);
    }

    private C19954ca() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55859g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55859g = b;
                return null;
            case 2:
                return newMessageInfo(f55852e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0001\u0002ᐉ\u0000\u0003ဉ\u0001\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19954ca();
            case 4:
                return new C19952bz();
            case 5:
                return f55852e;
            case 6:
                C63010eb ebVar = f55854h;
                if (ebVar == null) {
                    synchronized (C19954ca.class) {
                        ebVar = f55854h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55852e);
                            f55854h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
