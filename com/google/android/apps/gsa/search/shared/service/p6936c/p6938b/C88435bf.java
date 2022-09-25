package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p5451f.p5452a.p5453a.p5454a.C69396ar;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.bf */
/* compiled from: PG */
public final class C88435bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88435bf f239094c;

    /* renamed from: e */
    private static volatile C63010eb f239095e;

    /* renamed from: a */
    public int f239096a = 0;

    /* renamed from: b */
    public Object f239097b;

    /* renamed from: d */
    private byte f239098d = 2;

    static {
        C88435bf bfVar = new C88435bf();
        f239094c = bfVar;
        C62942bv.registerDefaultInstance(C88435bf.class, bfVar);
    }

    private C88435bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f239098d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f239098d = b;
                return null;
            case 2:
                return newMessageInfo(f239094c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0001\u0001့\u0000\u0002ᐼ\u0000\u0003်\u0000", new Object[]{"b", "a", C69396ar.class});
            case 3:
                return new C88435bf();
            case 4:
                return new C88434be();
            case 5:
                return f239094c;
            case 6:
                C63010eb ebVar = f239095e;
                if (ebVar == null) {
                    synchronized (C88435bf.class) {
                        ebVar = f239095e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239094c);
                            f239095e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
