package com.google.p4500cm.p4514b;

import com.google.p4500cm.p4501a.p4511d.p4512a.p4513a.C58166b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.b.d */
/* compiled from: PG */
public final class C58170d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C58170d f155514c;

    /* renamed from: f */
    private static volatile C63010eb f155515f;

    /* renamed from: a */
    public int f155516a;

    /* renamed from: b */
    public C58166b f155517b;

    /* renamed from: d */
    private int f155518d;

    /* renamed from: e */
    private byte f155519e = 2;

    static {
        C58170d dVar = new C58170d();
        f155514c = dVar;
        C62942bv.registerDefaultInstance(C58170d.class, dVar);
    }

    private C58170d() {
        emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155519e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155519e = b;
                return null;
            case 2:
                return newMessageInfo(f155514c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", C58168b.f155513a, "b"});
            case 3:
                return new C58170d();
            case 4:
                return new C58167a();
            case 5:
                return f155514c;
            case 6:
                C63010eb ebVar = f155515f;
                if (ebVar == null) {
                    synchronized (C58170d.class) {
                        ebVar = f155515f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155514c);
                            f155515f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
