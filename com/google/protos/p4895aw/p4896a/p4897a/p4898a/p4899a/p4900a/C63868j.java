package com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;

/* renamed from: com.google.protos.aw.a.a.a.a.a.j */
/* compiled from: PG */
public final class C63868j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63868j f172703b;

    /* renamed from: c */
    public static final C62940bt f172704c;

    /* renamed from: e */
    private static volatile C63010eb f172705e;

    /* renamed from: a */
    public String f172706a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f172707d;

    static {
        C63868j jVar = new C63868j();
        f172703b = jVar;
        C62942bv.registerDefaultInstance(C63868j.class, jVar);
        f172704c = C62942bv.newSingularGeneratedExtension(C63944h.f172933b, jVar, jVar, (C62958ce) null, 1001, C63066gd.MESSAGE, C63868j.class);
    }

    private C63868j() {
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
                return newMessageInfo(f172703b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C63868j();
            case 4:
                return new C63867i();
            case 5:
                return f172703b;
            case 6:
                C63010eb ebVar = f172705e;
                if (ebVar == null) {
                    synchronized (C63868j.class) {
                        ebVar = f172705e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172703b);
                            f172705e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
