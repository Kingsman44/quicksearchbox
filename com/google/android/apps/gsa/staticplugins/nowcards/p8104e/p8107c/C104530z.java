package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7665fk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.z */
/* compiled from: PG */
public final class C104530z extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C104530z f290737d;

    /* renamed from: f */
    private static volatile C63010eb f290738f;

    /* renamed from: a */
    public int f290739a;

    /* renamed from: b */
    public C7665fk f290740b;

    /* renamed from: c */
    public boolean f290741c;

    /* renamed from: e */
    private byte f290742e = 2;

    static {
        C104530z zVar = new C104530z();
        f290737d = zVar;
        C62942bv.registerDefaultInstance(C104530z.class, zVar);
    }

    private C104530z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290742e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290742e = b;
                return null;
            case 2:
                return newMessageInfo(f290737d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C104530z();
            case 4:
                return new C104529y();
            case 5:
                return f290737d;
            case 6:
                C63010eb ebVar = f290738f;
                if (ebVar == null) {
                    synchronized (C104530z.class) {
                        ebVar = f290738f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290737d);
                            f290738f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
