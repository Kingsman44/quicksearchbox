package com.google.assistant.p3980n.p3985c;

import com.google.assistant.p3803ag.p3809c.C49111gw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.n.c.p */
/* compiled from: PG */
public final class C53025p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53025p f138983b;

    /* renamed from: c */
    public static final C62940bt f138984c;

    /* renamed from: e */
    private static volatile C63010eb f138985e;

    /* renamed from: a */
    public C62971cq f138986a = emptyProtobufList();

    /* renamed from: d */
    private byte f138987d = 2;

    static {
        C53025p pVar = new C53025p();
        f138983b = pVar;
        C62942bv.registerDefaultInstance(C53025p.class, pVar);
        f138984c = C62942bv.newSingularGeneratedExtension(C49111gw.f127019a, pVar, pVar, (C62958ce) null, 102, C63066gd.MESSAGE, C53025p.class);
    }

    private C53025p() {
    }

    /* renamed from: a */
    public final void mo53958a() {
        C62971cq cqVar = this.f138986a;
        if (!cqVar.mo58948c()) {
            this.f138986a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138987d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138987d = b;
                return null;
            case 2:
                return newMessageInfo(f138983b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53020k.class});
            case 3:
                return new C53025p();
            case 4:
                return new C53018i();
            case 5:
                return f138983b;
            case 6:
                C63010eb ebVar = f138985e;
                if (ebVar == null) {
                    synchronized (C53025p.class) {
                        ebVar = f138985e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138983b);
                            f138985e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
