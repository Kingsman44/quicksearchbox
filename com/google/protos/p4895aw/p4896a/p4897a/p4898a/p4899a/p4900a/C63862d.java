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

/* renamed from: com.google.protos.aw.a.a.a.a.a.d */
/* compiled from: PG */
public final class C63862d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63862d f172686c;

    /* renamed from: d */
    public static final C62940bt f172687d;

    /* renamed from: f */
    private static volatile C63010eb f172688f;

    /* renamed from: a */
    public int f172689a;

    /* renamed from: b */
    public String f172690b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f172691e;

    static {
        C63862d dVar = new C63862d();
        f172686c = dVar;
        C62942bv.registerDefaultInstance(C63862d.class, dVar);
        f172687d = C62942bv.newSingularGeneratedExtension(C63944h.f172933b, dVar, dVar, (C62958ce) null, 1004, C63066gd.MESSAGE, C63862d.class);
    }

    private C63862d() {
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
                return newMessageInfo(f172686c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C63862d();
            case 4:
                return new C63861c();
            case 5:
                return f172686c;
            case 6:
                C63010eb ebVar = f172688f;
                if (ebVar == null) {
                    synchronized (C63862d.class) {
                        ebVar = f172688f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172686c);
                            f172688f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
