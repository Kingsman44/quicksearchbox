package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.ao */
/* compiled from: PG */
public final class C65757ao extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65757ao f178765c;

    /* renamed from: d */
    public static final C62940bt f178766d;

    /* renamed from: f */
    private static volatile C63010eb f178767f;

    /* renamed from: a */
    public int f178768a;

    /* renamed from: b */
    public C51715bm f178769b;

    /* renamed from: e */
    private byte f178770e = 2;

    static {
        C65757ao aoVar = new C65757ao();
        f178765c = aoVar;
        C62942bv.registerDefaultInstance(C65757ao.class, aoVar);
        f178766d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, aoVar, aoVar, (C62958ce) null, 310161500, C63066gd.MESSAGE, C65757ao.class);
    }

    private C65757ao() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178770e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178770e = b;
                return null;
            case 2:
                return newMessageInfo(f178765c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65757ao();
            case 4:
                return new C65756an();
            case 5:
                return f178765c;
            case 6:
                C63010eb ebVar = f178767f;
                if (ebVar == null) {
                    synchronized (C65757ao.class) {
                        ebVar = f178767f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178765c);
                            f178767f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
