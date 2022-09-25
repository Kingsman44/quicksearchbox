package com.google.android.apps.gsa.search.core;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.br */
/* compiled from: PG */
public final class C85667br extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C85667br f231582i;

    /* renamed from: j */
    private static volatile C63010eb f231583j;

    /* renamed from: a */
    public int f231584a;

    /* renamed from: b */
    public String f231585b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f231586c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f231587d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f231588e;

    /* renamed from: f */
    public long f231589f;

    /* renamed from: g */
    public String f231590g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f231591h = BuildConfig.FLAVOR;

    static {
        C85667br brVar = new C85667br();
        f231582i = brVar;
        C62942bv.registerDefaultInstance(C85667br.class, brVar);
    }

    private C85667br() {
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
                return newMessageInfo(f231582i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C85667br();
            case 4:
                return new C85666bq();
            case 5:
                return f231582i;
            case 6:
                C63010eb ebVar = f231583j;
                if (ebVar == null) {
                    synchronized (C85667br.class) {
                        ebVar = f231583j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231582i);
                            f231583j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
