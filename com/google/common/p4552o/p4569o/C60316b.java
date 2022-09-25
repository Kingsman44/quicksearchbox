package com.google.common.p4552o.p4569o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.apr;
import com.google.p4242bp.p4253e.p4255b.p4256a.C56199a;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.o.b */
/* compiled from: PG */
public final class C60316b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60316b f163205e;

    /* renamed from: f */
    public static final C62940bt f163206f;

    /* renamed from: g */
    private static volatile C63010eb f163207g;

    /* renamed from: a */
    public int f163208a;

    /* renamed from: b */
    public String f163209b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f163210c;

    /* renamed from: d */
    public C62910ar f163211d;

    static {
        C60316b bVar = new C60316b();
        f163205e = bVar;
        C62942bv.registerDefaultInstance(C60316b.class, bVar);
        f163206f = C62942bv.newSingularGeneratedExtension(apr.f159695c, bVar, bVar, (C62958ce) null, 306765119, C63066gd.MESSAGE, C60316b.class);
    }

    private C60316b() {
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
                return newMessageInfo(f163205e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C56199a.f149732a, "d"});
            case 3:
                return new C60316b();
            case 4:
                return new C60315a();
            case 5:
                return f163205e;
            case 6:
                C63010eb ebVar = f163207g;
                if (ebVar == null) {
                    synchronized (C60316b.class) {
                        ebVar = f163207g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163205e);
                            f163207g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
