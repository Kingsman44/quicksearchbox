package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4438c.p4439a.C57915d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.aqh */
/* compiled from: PG */
public final class aqh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aqh f159744f;

    /* renamed from: g */
    public static final C62940bt f159745g;

    /* renamed from: h */
    private static volatile C63010eb f159746h;

    /* renamed from: a */
    public int f159747a;

    /* renamed from: b */
    public long f159748b;

    /* renamed from: c */
    public long f159749c;

    /* renamed from: d */
    public String f159750d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f159751e = BuildConfig.FLAVOR;

    static {
        aqh aqh = new aqh();
        f159744f = aqh;
        C62942bv.registerDefaultInstance(aqh.class, aqh);
        f159745g = C62942bv.newSingularGeneratedExtension(C57915d.f154905a, aqh, aqh, (C62958ce) null, 295747467, C63066gd.MESSAGE, aqh.class);
    }

    private aqh() {
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
                return newMessageInfo(f159744f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new aqh();
            case 4:
                return new aqg();
            case 5:
                return f159744f;
            case 6:
                C63010eb ebVar = f159746h;
                if (ebVar == null) {
                    synchronized (aqh.class) {
                        ebVar = f159746h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159744f);
                            f159746h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
