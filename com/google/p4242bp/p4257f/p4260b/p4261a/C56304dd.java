package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.dd */
/* compiled from: PG */
public final class C56304dd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56304dd f150050b;

    /* renamed from: d */
    private static volatile C63010eb f150051d;

    /* renamed from: a */
    public C62971cq f150052a = emptyProtobufList();

    /* renamed from: c */
    private byte f150053c = 2;

    static {
        C56304dd ddVar = new C56304dd();
        f150050b = ddVar;
        C62942bv.registerDefaultInstance(C56304dd.class, ddVar);
    }

    private C56304dd() {
    }

    /* renamed from: a */
    public final void mo54350a() {
        C62971cq cqVar = this.f150052a;
        if (!cqVar.mo58948c()) {
            this.f150052a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150053c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150053c = b;
                return null;
            case 2:
                return newMessageInfo(f150050b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C56302db.class});
            case 3:
                return new C56304dd();
            case 4:
                return new C56303dc();
            case 5:
                return f150050b;
            case 6:
                C63010eb ebVar = f150051d;
                if (ebVar == null) {
                    synchronized (C56304dd.class) {
                        ebVar = f150051d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150050b);
                            f150051d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
