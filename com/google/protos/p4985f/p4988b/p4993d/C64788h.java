package com.google.protos.p4985f.p4988b.p4993d;

import com.google.assistant.p3897e.p3921j.ade;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4993d.p4994a.C64771b;
import com.google.protos.p4985f.p4988b.p4993d.p4994a.C64773d;
import com.google.protos.p4985f.p4988b.p4993d.p4994a.C64775f;
import com.google.protos.p4985f.p4988b.p4993d.p4994a.C64777h;
import com.google.protos.p4985f.p4988b.p4993d.p4994a.C64779j;
import com.google.protos.p4985f.p4988b.p4993d.p4994a.C64781l;

/* renamed from: com.google.protos.f.b.d.h */
/* compiled from: PG */
public final class C64788h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64788h f175594c;

    /* renamed from: d */
    private static volatile C63010eb f175595d;

    /* renamed from: a */
    public int f175596a = 0;

    /* renamed from: b */
    public Object f175597b;

    static {
        C64788h hVar = new C64788h();
        f175594c = hVar;
        C62942bv.registerDefaultInstance(C64788h.class, hVar);
    }

    private C64788h() {
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
                return newMessageInfo(f175594c, "\u0001\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003်\u0000\u0004ျ\u0000\u0005ျ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000", new Object[]{"b", "a", C64784d.class, C64781l.class, C64771b.class, C64773d.class, C64775f.class, C64779j.class, ade.class, C64777h.class});
            case 3:
                return new C64788h();
            case 4:
                return new C64787g();
            case 5:
                return f175594c;
            case 6:
                C63010eb ebVar = f175595d;
                if (ebVar == null) {
                    synchronized (C64788h.class) {
                        ebVar = f175595d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175594c);
                            f175595d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
