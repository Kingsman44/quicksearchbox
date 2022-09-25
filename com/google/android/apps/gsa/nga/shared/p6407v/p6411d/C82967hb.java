package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hb */
/* compiled from: PG */
public final class C82967hb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82967hb f226354e;

    /* renamed from: g */
    private static volatile C63010eb f226355g;

    /* renamed from: a */
    public int f226356a;

    /* renamed from: b */
    public long f226357b;

    /* renamed from: c */
    public C66722az f226358c;

    /* renamed from: d */
    public long f226359d;

    /* renamed from: f */
    private byte f226360f = 2;

    static {
        C82967hb hbVar = new C82967hb();
        f226354e = hbVar;
        C62942bv.registerDefaultInstance(C82967hb.class, hbVar);
    }

    private C82967hb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f226360f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f226360f = b;
                return null;
            case 2:
                return newMessageInfo(f226354e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0003ဂ\u0002\u0004ᐉ\u0001", new Object[]{"a", "b", "d", C45240c.f118157a});
            case 3:
                return new C82967hb();
            case 4:
                return new C82966ha();
            case 5:
                return f226354e;
            case 6:
                C63010eb ebVar = f226355g;
                if (ebVar == null) {
                    synchronized (C82967hb.class) {
                        ebVar = f226355g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226354e);
                            f226355g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
