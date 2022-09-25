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

/* renamed from: com.google.bb.a.op */
/* compiled from: PG */
public final class C55336op extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55336op f145790b;

    /* renamed from: c */
    public static final C62940bt f145791c;

    /* renamed from: d */
    private static volatile C63010eb f145792d;

    /* renamed from: a */
    public C62971cq f145793a = emptyProtobufList();

    static {
        C55336op opVar = new C55336op();
        f145790b = opVar;
        C62942bv.registerDefaultInstance(C55336op.class, opVar);
        f145791c = C62942bv.newSingularGeneratedExtension(C55330oj.f145769e, opVar, opVar, (C62958ce) null, 84371737, C63066gd.MESSAGE, C55336op.class);
    }

    private C55336op() {
    }

    /* renamed from: a */
    public final void mo54244a() {
        C62971cq cqVar = this.f145793a;
        if (!cqVar.mo58948c()) {
            this.f145793a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f145790b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C55335oo.class});
            case 3:
                return new C55336op();
            case 4:
                return new C55333om();
            case 5:
                return f145790b;
            case 6:
                C63010eb ebVar = f145792d;
                if (ebVar == null) {
                    synchronized (C55336op.class) {
                        ebVar = f145792d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145790b);
                            f145792d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
