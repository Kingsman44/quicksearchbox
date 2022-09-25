package com.google.p4017at.p4060h.p4068b.p4069a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4068b.p4069a.p4070a.C54184b;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.b.a.r */
/* compiled from: PG */
public final class C54201r extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C54201r f142243f;

    /* renamed from: h */
    private static volatile C63010eb f142244h;

    /* renamed from: a */
    public int f142245a;

    /* renamed from: b */
    public C56425d f142246b;

    /* renamed from: c */
    public C62971cq f142247c = emptyProtobufList();

    /* renamed from: d */
    public C54184b f142248d;

    /* renamed from: e */
    public String f142249e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f142250g = 2;

    static {
        C54201r rVar = new C54201r();
        f142243f = rVar;
        C62942bv.registerDefaultInstance(C54201r.class, rVar);
    }

    private C54201r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142250g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142250g = b;
                return null;
            case 2:
                return newMessageInfo(f142243f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᐉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C54190g.class, "d", "e"});
            case 3:
                return new C54201r();
            case 4:
                return new C54200q();
            case 5:
                return f142243f;
            case 6:
                C63010eb ebVar = f142244h;
                if (ebVar == null) {
                    synchronized (C54201r.class) {
                        ebVar = f142244h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142243f);
                            f142244h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
