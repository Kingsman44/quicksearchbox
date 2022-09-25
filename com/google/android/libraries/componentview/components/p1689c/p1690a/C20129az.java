package com.google.android.libraries.componentview.components.p1689c.p1690a;

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

/* renamed from: com.google.android.libraries.componentview.components.c.a.az */
/* compiled from: PG */
public final class C20129az extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20129az f56419c;

    /* renamed from: d */
    public static final C62940bt f56420d;

    /* renamed from: g */
    private static volatile C63010eb f56421g;

    /* renamed from: a */
    public C62971cq f56422a = emptyProtobufList();

    /* renamed from: b */
    public boolean f56423b;

    /* renamed from: e */
    private int f56424e;

    /* renamed from: f */
    private byte f56425f = 2;

    static {
        C20129az azVar = new C20129az();
        f56419c = azVar;
        C62942bv.registerDefaultInstance(C20129az.class, azVar);
        f56420d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, azVar, azVar, (C62958ce) null, 133035259, C63066gd.MESSAGE, C20129az.class);
    }

    private C20129az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56425f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56425f = b;
                return null;
            case 2:
                return newMessageInfo(f56419c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000", new Object[]{"e", "a", C56425d.class, "b"});
            case 3:
                return new C20129az();
            case 4:
                return new C20128ay();
            case 5:
                return f56419c;
            case 6:
                C63010eb ebVar = f56421g;
                if (ebVar == null) {
                    synchronized (C20129az.class) {
                        ebVar = f56421g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56419c);
                            f56421g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
