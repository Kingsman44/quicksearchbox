package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.lr */
/* compiled from: PG */
public final class C55257lr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55257lr f145521c;

    /* renamed from: d */
    public static final C62940bt f145522d;

    /* renamed from: e */
    private static volatile C63010eb f145523e;

    /* renamed from: a */
    public int f145524a;

    /* renamed from: b */
    public String f145525b = BuildConfig.FLAVOR;

    static {
        C55257lr lrVar = new C55257lr();
        f145521c = lrVar;
        C62942bv.registerDefaultInstance(C55257lr.class, lrVar);
        f145522d = C62942bv.newSingularGeneratedExtension(C55213ka.f145356g, lrVar, lrVar, (C62958ce) null, 68627120, C63066gd.MESSAGE, C55257lr.class);
    }

    private C55257lr() {
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
                return newMessageInfo(f145521c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C55257lr();
            case 4:
                return new C55256lq();
            case 5:
                return f145521c;
            case 6:
                C63010eb ebVar = f145523e;
                if (ebVar == null) {
                    synchronized (C55257lr.class) {
                        ebVar = f145523e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145521c);
                            f145523e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
