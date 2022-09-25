package com.google.protos.p5064h;

import com.google.p4152bb.p4153a.C55421x;
import com.google.p5277z.p5278a.p5279a.p5280a.C67971d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.b */
/* compiled from: PG */
public final class C65454b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65454b f177924c;

    /* renamed from: e */
    private static volatile C63010eb f177925e;

    /* renamed from: a */
    public int f177926a = 0;

    /* renamed from: b */
    public Object f177927b;

    /* renamed from: d */
    private byte f177928d = 2;

    static {
        C65454b bVar = new C65454b();
        f177924c = bVar;
        C62942bv.registerDefaultInstance(C65454b.class, bVar);
    }

    private C65454b() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177928d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177928d = b;
                return null;
            case 2:
                return newMessageInfo(f177924c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ဿ\u0000\u0004ြ\u0000\u0005ျ\u0000", new Object[]{"b", "a", C55421x.m87687b(), C67971d.class});
            case 3:
                return new C65454b();
            case 4:
                return new C65451a();
            case 5:
                return f177924c;
            case 6:
                C63010eb ebVar = f177925e;
                if (ebVar == null) {
                    synchronized (C65454b.class) {
                        ebVar = f177925e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177924c);
                            f177925e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
