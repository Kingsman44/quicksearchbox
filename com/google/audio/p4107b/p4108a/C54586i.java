package com.google.audio.p4107b.p4108a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.i */
/* compiled from: PG */
public final class C54586i extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C54586i f143314e;

    /* renamed from: g */
    private static volatile C63010eb f143315g;

    /* renamed from: a */
    public int f143316a;

    /* renamed from: b */
    public float f143317b;

    /* renamed from: c */
    public C54597t f143318c;

    /* renamed from: d */
    public C54599v f143319d;

    /* renamed from: f */
    private byte f143320f = 2;

    static {
        C54586i iVar = new C54586i();
        f143314e = iVar;
        C62942bv.registerDefaultInstance(C54586i.class, iVar);
    }

    private C54586i() {
        C62942bv.emptyProtobufList();
        emptyBooleanList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143320f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143320f = b;
                return null;
            case 2:
                return newMessageInfo(f143314e, "\u0001\u0003\u0000\u0001\u0003\u0016\u0003\u0000\u0000\u0000\u0003ဉ\r\u0015ခ\u0001\u0016ဉ\u0012", new Object[]{"a", C45240c.f118157a, "b", "d"});
            case 3:
                return new C54586i();
            case 4:
                return new C54585h();
            case 5:
                return f143314e;
            case 6:
                C63010eb ebVar = f143315g;
                if (ebVar == null) {
                    synchronized (C54586i.class) {
                        ebVar = f143315g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143314e);
                            f143315g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
