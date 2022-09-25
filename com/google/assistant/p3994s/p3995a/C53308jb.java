package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.s.a.jb */
/* compiled from: PG */
public final class C53308jb extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C53308jb f139794f;

    /* renamed from: h */
    private static volatile C63010eb f139795h;

    /* renamed from: a */
    public int f139796a;

    /* renamed from: b */
    public C63204j f139797b;

    /* renamed from: c */
    public boolean f139798c;

    /* renamed from: d */
    public int f139799d;

    /* renamed from: e */
    public C62961ch f139800e = emptyIntList();

    /* renamed from: g */
    private byte f139801g = 2;

    static {
        C53308jb jbVar = new C53308jb();
        f139794f = jbVar;
        C62942bv.registerDefaultInstance(C53308jb.class, jbVar);
    }

    private C53308jb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139801g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139801g = b;
                return null;
            case 2:
                return newMessageInfo(f139794f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003င\u0002\u0005'", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C53308jb();
            case 4:
                return new C53307ja();
            case 5:
                return f139794f;
            case 6:
                C63010eb ebVar = f139795h;
                if (ebVar == null) {
                    synchronized (C53308jb.class) {
                        ebVar = f139795h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139794f);
                            f139795h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
