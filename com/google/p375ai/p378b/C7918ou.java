package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.ou */
/* compiled from: PG */
public final class C7918ou extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C7918ou f27824h;

    /* renamed from: j */
    private static volatile C63010eb f27825j;

    /* renamed from: a */
    public int f27826a;

    /* renamed from: b */
    public long f27827b;

    /* renamed from: c */
    public C62971cq f27828c = emptyProtobufList();

    /* renamed from: d */
    public C7912oo f27829d;

    /* renamed from: e */
    public long f27830e;

    /* renamed from: f */
    public long f27831f;

    /* renamed from: g */
    public C63088z f27832g;

    /* renamed from: i */
    private byte f27833i = 2;

    static {
        C7918ou ouVar = new C7918ou();
        f27824h = ouVar;
        C62942bv.registerDefaultInstance(C7918ou.class, ouVar);
    }

    private C7918ou() {
        emptyProtobufList();
        emptyProtobufList();
        this.f27832g = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27833i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27833i = b;
                return null;
            case 2:
                return newMessageInfo(f27824h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0002\u0001ဂ\u0000\u0002Л\u0003ᐉ\u0001\u0006ည\u0004\u0007ဂ\u0002\tဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, C7917ot.class, "d", C30325g.f82003a, "e", C10662f.f35572a});
            case 3:
                return new C7918ou();
            case 4:
                return new C7913op();
            case 5:
                return f27824h;
            case 6:
                C63010eb ebVar = f27825j;
                if (ebVar == null) {
                    synchronized (C7918ou.class) {
                        ebVar = f27825j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27824h);
                            f27825j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
