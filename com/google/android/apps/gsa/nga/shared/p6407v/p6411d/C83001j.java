package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.j */
/* compiled from: PG */
public final class C83001j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83001j f226500c;

    /* renamed from: e */
    private static volatile C63010eb f226501e;

    /* renamed from: a */
    public String f226502a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f226503b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private C62995dn f226504d = C62995dn.f170057a;

    static {
        C83001j jVar = new C83001j();
        f226500c = jVar;
        C62942bv.registerDefaultInstance(C83001j.class, jVar);
    }

    private C83001j() {
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
                return newMessageInfo(f226500c, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u00052", new Object[]{"a", "b", "d", C82992i.f226474a});
            case 3:
                return new C83001j();
            case 4:
                return new C82965h();
            case 5:
                return f226500c;
            case 6:
                C63010eb ebVar = f226501e;
                if (ebVar == null) {
                    synchronized (C83001j.class) {
                        ebVar = f226501e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226500c);
                            f226501e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
