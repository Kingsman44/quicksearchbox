package com.google.android.apps.gsa.shared.p7023bg.p7024a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.bg.a.b */
/* compiled from: PG */
public final class C89426b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C89426b f242410f;

    /* renamed from: g */
    private static volatile C63010eb f242411g;

    /* renamed from: a */
    public int f242412a;

    /* renamed from: b */
    public boolean f242413b;

    /* renamed from: c */
    public String f242414c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f242415d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f242416e = BuildConfig.FLAVOR;

    static {
        C89426b bVar = new C89426b();
        f242410f = bVar;
        C62942bv.registerDefaultInstance(C89426b.class, bVar);
    }

    private C89426b() {
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
                return newMessageInfo(f242410f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C89426b();
            case 4:
                return new C89425a();
            case 5:
                return f242410f;
            case 6:
                C63010eb ebVar = f242411g;
                if (ebVar == null) {
                    synchronized (C89426b.class) {
                        ebVar = f242411g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242410f);
                            f242411g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
