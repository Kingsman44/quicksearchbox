package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.ax */
/* compiled from: PG */
public final class C65766ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65766ax f178787c;

    /* renamed from: d */
    public static final C62940bt f178788d;

    /* renamed from: f */
    private static volatile C63010eb f178789f;

    /* renamed from: a */
    public int f178790a;

    /* renamed from: b */
    public C51334dw f178791b;

    /* renamed from: e */
    private byte f178792e = 2;

    static {
        C65766ax axVar = new C65766ax();
        f178787c = axVar;
        C62942bv.registerDefaultInstance(C65766ax.class, axVar);
        f178788d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, axVar, axVar, (C62958ce) null, 371243478, C63066gd.MESSAGE, C65766ax.class);
    }

    private C65766ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178792e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178792e = b;
                return null;
            case 2:
                return newMessageInfo(f178787c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65766ax();
            case 4:
                return new C65765aw();
            case 5:
                return f178787c;
            case 6:
                C63010eb ebVar = f178789f;
                if (ebVar == null) {
                    synchronized (C65766ax.class) {
                        ebVar = f178789f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178787c);
                            f178789f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
