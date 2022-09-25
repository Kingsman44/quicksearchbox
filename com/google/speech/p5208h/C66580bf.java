package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.speech.p5207g.C66504b;

/* renamed from: com.google.speech.h.bf */
/* compiled from: PG */
public final class C66580bf extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66580bf f181101f;

    /* renamed from: g */
    public static final C62940bt f181102g;

    /* renamed from: h */
    private static volatile C63010eb f181103h;

    /* renamed from: a */
    public int f181104a;

    /* renamed from: b */
    public String f181105b = "en-US";

    /* renamed from: c */
    public C66504b f181106c;

    /* renamed from: d */
    public int f181107d;

    /* renamed from: e */
    public boolean f181108e;

    static {
        C66580bf bfVar = new C66580bf();
        f181101f = bfVar;
        C62942bv.registerDefaultInstance(C66580bf.class, bfVar);
        f181102g = C62942bv.newSingularGeneratedExtension(C66607ce.f181191f, bfVar, bfVar, (C62958ce) null, 143993928, C63066gd.MESSAGE, C66580bf.class);
    }

    private C66580bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f181101f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0004ဇ\u0004\u0007ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C66578bd.f181100a});
            case 3:
                return new C66580bf();
            case 4:
                return new C66577bc();
            case 5:
                return f181101f;
            case 6:
                C63010eb ebVar = f181103h;
                if (ebVar == null) {
                    synchronized (C66580bf.class) {
                        ebVar = f181103h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181101f);
                            f181103h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
