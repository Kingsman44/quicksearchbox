package com.google.android.libraries.assistant.p1467d.p1471b;

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

/* renamed from: com.google.android.libraries.assistant.d.b.u */
/* compiled from: PG */
public final class C17835u extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C17835u f51168i;

    /* renamed from: j */
    private static volatile C63010eb f51169j;

    /* renamed from: a */
    public int f51170a;

    /* renamed from: b */
    public int f51171b;

    /* renamed from: c */
    public int f51172c;

    /* renamed from: d */
    public String f51173d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f51174e;

    /* renamed from: f */
    public int f51175f;

    /* renamed from: g */
    public int f51176g;

    /* renamed from: h */
    public boolean f51177h = true;

    static {
        C17835u uVar = new C17835u();
        f51168i = uVar;
        C62942bv.registerDefaultInstance(C17835u.class, uVar);
    }

    private C17835u() {
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
                return newMessageInfo(f51168i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C17833s.f51167a, C45240c.f118157a, "d", "e", C17831q.f51165a, C10662f.f35572a, C30325g.f82003a, C17832r.f51166a, C19618h.f54585a});
            case 3:
                return new C17835u();
            case 4:
                return new C17830p();
            case 5:
                return f51168i;
            case 6:
                C63010eb ebVar = f51169j;
                if (ebVar == null) {
                    synchronized (C17835u.class) {
                        ebVar = f51169j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51168i);
                            f51169j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
