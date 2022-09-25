package com.google.protos.p5129p.p5131b;

import com.google.assistant.p4008y.p4009a.C53604m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.ag */
/* compiled from: PG */
public final class C65749ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65749ag f178611c;

    /* renamed from: d */
    public static final C62940bt f178612d;

    /* renamed from: f */
    private static volatile C63010eb f178613f;

    /* renamed from: a */
    public int f178614a;

    /* renamed from: b */
    public C53604m f178615b;

    /* renamed from: e */
    private byte f178616e = 2;

    static {
        C65749ag agVar = new C65749ag();
        f178611c = agVar;
        C62942bv.registerDefaultInstance(C65749ag.class, agVar);
        f178612d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, agVar, agVar, (C62958ce) null, 351722624, C63066gd.MESSAGE, C65749ag.class);
    }

    private C65749ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178616e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178616e = b;
                return null;
            case 2:
                return newMessageInfo(f178611c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65749ag();
            case 4:
                return new C65748af();
            case 5:
                return f178611c;
            case 6:
                C63010eb ebVar = f178613f;
                if (ebVar == null) {
                    synchronized (C65749ag.class) {
                        ebVar = f178613f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178611c);
                            f178613f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
