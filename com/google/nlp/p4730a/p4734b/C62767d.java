package com.google.nlp.p4730a.p4734b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.b.d */
/* compiled from: PG */
public final class C62767d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62767d f169504c;

    /* renamed from: e */
    private static volatile C63010eb f169505e;

    /* renamed from: a */
    public int f169506a = 0;

    /* renamed from: b */
    public Object f169507b;

    /* renamed from: d */
    private byte f169508d = 2;

    static {
        C62767d dVar = new C62767d();
        f169504c = dVar;
        C62942bv.registerDefaultInstance(C62767d.class, dVar);
    }

    private C62767d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169508d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169508d = b;
                return null;
            case 2:
                return newMessageInfo(f169504c, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"b", "a", C62765b.class, C62774k.class, C62769f.class});
            case 3:
                return new C62767d();
            case 4:
                return new C62766c();
            case 5:
                return f169504c;
            case 6:
                C63010eb ebVar = f169505e;
                if (ebVar == null) {
                    synchronized (C62767d.class) {
                        ebVar = f169505e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169504c);
                            f169505e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
