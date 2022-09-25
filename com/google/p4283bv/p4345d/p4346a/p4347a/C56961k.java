package com.google.p4283bv.p4345d.p4346a.p4347a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7520ah;
import com.google.p375ai.p378b.C7704gw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.a.a.k */
/* compiled from: PG */
public final class C56961k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56961k f152007e;

    /* renamed from: g */
    private static volatile C63010eb f152008g;

    /* renamed from: a */
    public int f152009a;

    /* renamed from: b */
    public int f152010b;

    /* renamed from: c */
    public C62971cq f152011c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f152012d = emptyProtobufList();

    /* renamed from: f */
    private byte f152013f = 2;

    static {
        C56961k kVar = new C56961k();
        f152007e = kVar;
        C62942bv.registerDefaultInstance(C56961k.class, kVar);
    }

    private C56961k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152013f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152013f = b;
                return null;
            case 2:
                return newMessageInfo(f152007e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001ဌ\u0000\u0002Л\u0003Л", new Object[]{"a", "b", C56959i.f152006a, C45240c.f118157a, C7520ah.class, "d", C7704gw.class});
            case 3:
                return new C56961k();
            case 4:
                return new C56958h();
            case 5:
                return f152007e;
            case 6:
                C63010eb ebVar = f152008g;
                if (ebVar == null) {
                    synchronized (C56961k.class) {
                        ebVar = f152008g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152007e);
                            f152008g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
