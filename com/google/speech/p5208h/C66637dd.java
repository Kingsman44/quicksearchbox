package com.google.speech.p5208h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.h.dd */
/* compiled from: PG */
public final class C66637dd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66637dd f181302c;

    /* renamed from: d */
    public static final C62940bt f181303d;

    /* renamed from: f */
    private static volatile C63010eb f181304f;

    /* renamed from: a */
    public int f181305a;

    /* renamed from: b */
    public int f181306b;

    /* renamed from: e */
    private byte f181307e = 2;

    static {
        C66637dd ddVar = new C66637dd();
        f181302c = ddVar;
        C62942bv.registerDefaultInstance(C66637dd.class, ddVar);
        f181303d = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, ddVar, ddVar, (C62958ce) null, 245329580, C63066gd.MESSAGE, C66637dd.class);
    }

    private C66637dd() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181307e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181307e = b;
                return null;
            case 2:
                return newMessageInfo(f181302c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C66636dc.f181301a});
            case 3:
                return new C66637dd();
            case 4:
                return new C66635db();
            case 5:
                return f181302c;
            case 6:
                C63010eb ebVar = f181304f;
                if (ebVar == null) {
                    synchronized (C66637dd.class) {
                        ebVar = f181304f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181302c);
                            f181304f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
