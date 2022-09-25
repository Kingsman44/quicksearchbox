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
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y;

/* renamed from: com.google.protos.aw.a.a.a.a.a.b */
/* compiled from: PG */
public final class C63860b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63860b f172680c;

    /* renamed from: d */
    public static final C62940bt f172681d;

    /* renamed from: f */
    private static volatile C63010eb f172682f;

    /* renamed from: a */
    public C63961y f172683a;

    /* renamed from: b */
    public String f172684b = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f172685e;

    static {
        C63860b bVar = new C63860b();
        f172680c = bVar;
        C62942bv.registerDefaultInstance(C63860b.class, bVar);
        f172681d = C62942bv.newSingularGeneratedExtension(C63944h.f172933b, bVar, bVar, (C62958ce) null, 1003, C63066gd.MESSAGE, C63860b.class);
    }

    private C63860b() {
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
                return newMessageInfo(f172680c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C63860b();
            case 4:
                return new C63859a();
            case 5:
                return f172680c;
            case 6:
                C63010eb ebVar = f172682f;
                if (ebVar == null) {
                    synchronized (C63860b.class) {
                        ebVar = f172682f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172680c);
                            f172682f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
