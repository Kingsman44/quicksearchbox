package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.nv */
/* compiled from: PG */
public final class C55315nv extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55315nv f145726b;

    /* renamed from: c */
    public static final C62940bt f145727c;

    /* renamed from: e */
    private static volatile C63010eb f145728e;

    /* renamed from: a */
    public C62971cq f145729a = emptyProtobufList();

    /* renamed from: d */
    private byte f145730d = 2;

    static {
        C55315nv nvVar = new C55315nv();
        f145726b = nvVar;
        C62942bv.registerDefaultInstance(C55315nv.class, nvVar);
        f145727c = C62942bv.newSingularGeneratedExtension(C55317nx.f145731c, nvVar, nvVar, (C62958ce) null, 85398825, C63066gd.MESSAGE, C55315nv.class);
    }

    private C55315nv() {
    }

    /* renamed from: a */
    public final void mo54240a() {
        C62971cq cqVar = this.f145729a;
        if (!cqVar.mo58948c()) {
            this.f145729a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145730d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145730d = b;
                return null;
            case 2:
                return newMessageInfo(f145726b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55093fp.class});
            case 3:
                return new C55315nv();
            case 4:
                return new C55314nu();
            case 5:
                return f145726b;
            case 6:
                C63010eb ebVar = f145728e;
                if (ebVar == null) {
                    synchronized (C55315nv.class) {
                        ebVar = f145728e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145726b);
                            f145728e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
