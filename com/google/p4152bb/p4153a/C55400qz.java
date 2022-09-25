package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.qz */
/* compiled from: PG */
public final class C55400qz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55400qz f145967f;

    /* renamed from: g */
    public static final C62940bt f145968g;

    /* renamed from: i */
    private static volatile C63010eb f145969i;

    /* renamed from: a */
    public int f145970a;

    /* renamed from: b */
    public C62971cq f145971b = emptyProtobufList();

    /* renamed from: c */
    public C55365pr f145972c;

    /* renamed from: d */
    public int f145973d;

    /* renamed from: e */
    public C62995dn f145974e = C62995dn.f170057a;

    /* renamed from: h */
    private byte f145975h = 2;

    static {
        C55400qz qzVar = new C55400qz();
        f145967f = qzVar;
        C62942bv.registerDefaultInstance(C55400qz.class, qzVar);
        f145968g = C62942bv.newSingularGeneratedExtension(C54946ad.f144531h, qzVar, qzVar, (C62958ce) null, 120243215, C63066gd.MESSAGE, C55400qz.class);
    }

    private C55400qz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145975h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145975h = b;
                return null;
            case 2:
                return newMessageInfo(f145967f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0001\u0001\u0003\u0001ᐉ\u0001\u0002в\u0003Л\u0005ဌ\u0002", new Object[]{"a", C45240c.f118157a, "e", C55397qw.f145965a, "b", C55403rb.class, "d", C55398qx.f145966a});
            case 3:
                return new C55400qz();
            case 4:
                return new C55396qv();
            case 5:
                return f145967f;
            case 6:
                C63010eb ebVar = f145969i;
                if (ebVar == null) {
                    synchronized (C55400qz.class) {
                        ebVar = f145969i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145967f);
                            f145969i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
