package com.google.assistant.p3886c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.c.bz */
/* compiled from: PG */
public final class C50761bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50761bz f132093d;

    /* renamed from: e */
    public static final C62940bt f132094e;

    /* renamed from: g */
    private static volatile C63010eb f132095g;

    /* renamed from: a */
    public int f132096a;

    /* renamed from: b */
    public C50697ai f132097b;

    /* renamed from: c */
    public long f132098c;

    /* renamed from: f */
    private byte f132099f = 2;

    static {
        C50761bz bzVar = new C50761bz();
        f132093d = bzVar;
        C62942bv.registerDefaultInstance(C50761bz.class, bzVar);
        f132094e = C62942bv.newSingularGeneratedExtension(C50813dj.f132278a, bzVar, bzVar, (C62958ce) null, 351425358, C63066gd.MESSAGE, C50761bz.class);
    }

    private C50761bz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132099f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132099f = b;
                return null;
            case 2:
                return newMessageInfo(f132093d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50761bz();
            case 4:
                return new C50760by();
            case 5:
                return f132093d;
            case 6:
                C63010eb ebVar = f132095g;
                if (ebVar == null) {
                    synchronized (C50761bz.class) {
                        ebVar = f132095g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132093d);
                            f132095g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
