package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.aa */
/* compiled from: PG */
public final class C56220aa extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56220aa f149748b;

    /* renamed from: d */
    private static volatile C63010eb f149749d;

    /* renamed from: a */
    public C62971cq f149750a = emptyProtobufList();

    /* renamed from: c */
    private byte f149751c = 2;

    static {
        C56220aa aaVar = new C56220aa();
        f149748b = aaVar;
        C62942bv.registerDefaultInstance(C56220aa.class, aaVar);
    }

    private C56220aa() {
    }

    /* renamed from: a */
    public final void mo54334a() {
        C62971cq cqVar = this.f149750a;
        if (!cqVar.mo58948c()) {
            this.f149750a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f149751c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f149751c = b;
                return null;
            case 2:
                return newMessageInfo(f149748b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C56327y.class});
            case 3:
                return new C56220aa();
            case 4:
                return new C56328z();
            case 5:
                return f149748b;
            case 6:
                C63010eb ebVar = f149749d;
                if (ebVar == null) {
                    synchronized (C56220aa.class) {
                        ebVar = f149749d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149748b);
                            f149749d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
