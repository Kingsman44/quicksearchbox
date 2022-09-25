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

/* renamed from: com.google.bb.a.ov */
/* compiled from: PG */
public final class C55342ov extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55342ov f145806b;

    /* renamed from: c */
    public static final C62940bt f145807c;

    /* renamed from: d */
    private static volatile C63010eb f145808d;

    /* renamed from: a */
    public C62971cq f145809a = C62942bv.emptyProtobufList();

    static {
        C55342ov ovVar = new C55342ov();
        f145806b = ovVar;
        C62942bv.registerDefaultInstance(C55342ov.class, ovVar);
        f145807c = C62942bv.newSingularGeneratedExtension(C55317nx.f145731c, ovVar, ovVar, (C62958ce) null, 80169334, C63066gd.MESSAGE, C55342ov.class);
    }

    private C55342ov() {
    }

    /* renamed from: a */
    public final void mo54247a() {
        C62971cq cqVar = this.f145809a;
        if (!cqVar.mo58948c()) {
            this.f145809a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f145806b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new C55342ov();
            case 4:
                return new C55341ou();
            case 5:
                return f145806b;
            case 6:
                C63010eb ebVar = f145808d;
                if (ebVar == null) {
                    synchronized (C55342ov.class) {
                        ebVar = f145808d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145806b);
                            f145808d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
