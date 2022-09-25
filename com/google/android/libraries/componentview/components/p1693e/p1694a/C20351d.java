package com.google.android.libraries.componentview.components.p1693e.p1694a;

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

/* renamed from: com.google.android.libraries.componentview.components.e.a.d */
/* compiled from: PG */
public final class C20351d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20351d f57207c;

    /* renamed from: d */
    public static final C62940bt f57208d;

    /* renamed from: g */
    private static volatile C63010eb f57209g;

    /* renamed from: a */
    public C62971cq f57210a = emptyProtobufList();

    /* renamed from: b */
    public int f57211b;

    /* renamed from: e */
    private int f57212e;

    /* renamed from: f */
    private byte f57213f = 2;

    static {
        C20351d dVar = new C20351d();
        f57207c = dVar;
        C62942bv.registerDefaultInstance(C20351d.class, dVar);
        f57208d = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, dVar, dVar, (C62958ce) null, 108390321, C63066gd.MESSAGE, C20351d.class);
    }

    private C20351d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f57213f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f57213f = b;
                return null;
            case 2:
                return newMessageInfo(f57207c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဋ\u0000", new Object[]{"e", "a", C56425d.class, "b"});
            case 3:
                return new C20351d();
            case 4:
                return new C20350c();
            case 5:
                return f57207c;
            case 6:
                C63010eb ebVar = f57209g;
                if (ebVar == null) {
                    synchronized (C20351d.class) {
                        ebVar = f57209g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f57207c);
                            f57209g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
