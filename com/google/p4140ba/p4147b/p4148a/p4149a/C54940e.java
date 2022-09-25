package com.google.p4140ba.p4147b.p4148a.p4149a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.b.a.a.e */
/* compiled from: PG */
public final class C54940e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54940e f144433c;

    /* renamed from: e */
    private static volatile C63010eb f144434e;

    /* renamed from: a */
    public int f144435a = 0;

    /* renamed from: b */
    public Object f144436b;

    /* renamed from: d */
    private byte f144437d = 2;

    static {
        C54940e eVar = new C54940e();
        f144433c = eVar;
        C62942bv.registerDefaultInstance(C54940e.class, eVar);
    }

    private C54940e() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144437d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144437d = b;
                return null;
            case 2:
                return newMessageInfo(f144433c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဿ\u0000\u0002ျ\u0000", new Object[]{"b", "a", C54939d.f144432a});
            case 3:
                return new C54940e();
            case 4:
                return new C54938c();
            case 5:
                return f144433c;
            case 6:
                C63010eb ebVar = f144434e;
                if (ebVar == null) {
                    synchronized (C54940e.class) {
                        ebVar = f144434e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144433c);
                            f144434e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
