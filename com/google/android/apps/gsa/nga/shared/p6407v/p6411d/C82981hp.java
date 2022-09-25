package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.hp */
/* compiled from: PG */
public final class C82981hp extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C82981hp f226382f;

    /* renamed from: g */
    private static volatile C63010eb f226383g;

    /* renamed from: a */
    public int f226384a;

    /* renamed from: b */
    public int f226385b = 1;

    /* renamed from: c */
    public String f226386c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f226387d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f226388e;

    static {
        C82981hp hpVar = new C82981hp();
        f226382f = hpVar;
        C62942bv.registerDefaultInstance(C82981hp.class, hpVar);
    }

    private C82981hp() {
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
                return newMessageInfo(f226382f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", C82983hr.m132444b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C82981hp();
            case 4:
                return new C82980ho();
            case 5:
                return f226382f;
            case 6:
                C63010eb ebVar = f226383g;
                if (ebVar == null) {
                    synchronized (C82981hp.class) {
                        ebVar = f226383g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226382f);
                            f226383g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
