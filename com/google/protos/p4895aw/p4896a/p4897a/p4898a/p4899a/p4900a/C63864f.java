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

/* renamed from: com.google.protos.aw.a.a.a.a.a.f */
/* compiled from: PG */
public final class C63864f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63864f f172692c;

    /* renamed from: d */
    public static final C62940bt f172693d;

    /* renamed from: e */
    private static volatile C63010eb f172694e;

    /* renamed from: a */
    public int f172695a;

    /* renamed from: b */
    public String f172696b = BuildConfig.FLAVOR;

    static {
        C63864f fVar = new C63864f();
        f172692c = fVar;
        C62942bv.registerDefaultInstance(C63864f.class, fVar);
        f172693d = C62942bv.newSingularGeneratedExtension(C63944h.f172933b, fVar, fVar, (C62958ce) null, 1005, C63066gd.MESSAGE, C63864f.class);
    }

    private C63864f() {
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
                return newMessageInfo(f172692c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C63864f();
            case 4:
                return new C63863e();
            case 5:
                return f172692c;
            case 6:
                C63010eb ebVar = f172694e;
                if (ebVar == null) {
                    synchronized (C63864f.class) {
                        ebVar = f172694e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172692c);
                            f172694e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
