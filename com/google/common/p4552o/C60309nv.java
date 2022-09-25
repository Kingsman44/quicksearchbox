package com.google.common.p4552o;

import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.nv */
/* compiled from: PG */
public final class C60309nv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60309nv f163190c;

    /* renamed from: d */
    public static final C62940bt f163191d;

    /* renamed from: f */
    private static volatile C63010eb f163192f;

    /* renamed from: a */
    public int f163193a = 0;

    /* renamed from: b */
    public Object f163194b;

    /* renamed from: e */
    private byte f163195e = 2;

    static {
        C60309nv nvVar = new C60309nv();
        f163190c = nvVar;
        C62942bv.registerDefaultInstance(C60309nv.class, nvVar);
        f163191d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, nvVar, nvVar, (C62958ce) null, 772, C63066gd.MESSAGE, C60309nv.class);
    }

    private C60309nv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f163195e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f163195e = b;
                return null;
            case 2:
                return newMessageInfo(f163190c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C60218r.class, C60214n.class});
            case 3:
                return new C60309nv();
            case 4:
                return new C60308nu();
            case 5:
                return f163190c;
            case 6:
                C63010eb ebVar = f163192f;
                if (ebVar == null) {
                    synchronized (C60309nv.class) {
                        ebVar = f163192f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163190c);
                            f163192f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
