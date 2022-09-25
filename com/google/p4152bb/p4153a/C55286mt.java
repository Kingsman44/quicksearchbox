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

/* renamed from: com.google.bb.a.mt */
/* compiled from: PG */
public final class C55286mt extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55286mt f145628b;

    /* renamed from: c */
    public static final C62940bt f145629c;

    /* renamed from: d */
    public static final C62940bt f145630d;

    /* renamed from: f */
    private static volatile C63010eb f145631f;

    /* renamed from: a */
    public C62971cq f145632a = emptyProtobufList();

    /* renamed from: e */
    private byte f145633e = 2;

    static {
        C55286mt mtVar = new C55286mt();
        f145628b = mtVar;
        C62942bv.registerDefaultInstance(C55286mt.class, mtVar);
        C55286mt mtVar2 = mtVar;
        C55286mt mtVar3 = mtVar;
        f145629c = C62942bv.newSingularGeneratedExtension(C55215kc.f145365c, mtVar2, mtVar3, (C62958ce) null, 87391631, C63066gd.MESSAGE, C55286mt.class);
        f145630d = C62942bv.newSingularGeneratedExtension(C55215kc.f145365c, mtVar2, mtVar3, (C62958ce) null, 104290606, C63066gd.MESSAGE, C55286mt.class);
    }

    private C55286mt() {
    }

    /* renamed from: a */
    public final void mo54231a() {
        C62971cq cqVar = this.f145632a;
        if (!cqVar.mo58948c()) {
            this.f145632a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145633e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145633e = b;
                return null;
            case 2:
                return newMessageInfo(f145628b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55365pr.class});
            case 3:
                return new C55286mt();
            case 4:
                return new C55285ms();
            case 5:
                return f145628b;
            case 6:
                C63010eb ebVar = f145631f;
                if (ebVar == null) {
                    synchronized (C55286mt.class) {
                        ebVar = f145631f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145628b);
                            f145631f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
