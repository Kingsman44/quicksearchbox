package com.google.android.apps.gsa.opaonboarding.p6462d;

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

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.b */
/* compiled from: PG */
public final class C83915b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C83915b f228541j;

    /* renamed from: k */
    private static volatile C63010eb f228542k;

    /* renamed from: a */
    public int f228543a;

    /* renamed from: b */
    public String f228544b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f228545c;

    /* renamed from: d */
    public String f228546d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f228547e;

    /* renamed from: f */
    public String f228548f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f228549g;

    /* renamed from: h */
    public String f228550h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f228551i;

    static {
        C83915b bVar = new C83915b();
        f228541j = bVar;
        C62942bv.registerDefaultInstance(C83915b.class, bVar);
    }

    private C83915b() {
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
                return newMessageInfo(f228541j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0001\u0002င\u0003\u0003င\u0005\u0004င\u0007\u0005ဈ\u0000\u0006ဈ\u0002\u0007ဈ\u0004\bဈ\u0006", new Object[]{"a", C45240c.f118157a, "e", C30325g.f82003a, "i", "b", "d", C10662f.f35572a, C19618h.f54585a});
            case 3:
                return new C83915b();
            case 4:
                return new C83914a();
            case 5:
                return f228541j;
            case 6:
                C63010eb ebVar = f228542k;
                if (ebVar == null) {
                    synchronized (C83915b.class) {
                        ebVar = f228542k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228541j);
                            f228542k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
