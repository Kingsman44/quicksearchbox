package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.h */
/* compiled from: PG */
public final class C88458h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C88458h f239136h;

    /* renamed from: i */
    private static volatile C63010eb f239137i;

    /* renamed from: a */
    public int f239138a;

    /* renamed from: b */
    public long f239139b;

    /* renamed from: c */
    public int f239140c;

    /* renamed from: d */
    public C88455e f239141d;

    /* renamed from: e */
    public C88457g f239142e;

    /* renamed from: f */
    public String f239143f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f239144g = BuildConfig.FLAVOR;

    static {
        C88458h hVar = new C88458h();
        f239136h = hVar;
        C62942bv.registerDefaultInstance(C88458h.class, hVar);
    }

    private C88458h() {
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
                return newMessageInfo(f239136h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, C88429b.f239081a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C88458h();
            case 4:
                return new C88398a();
            case 5:
                return f239136h;
            case 6:
                C63010eb ebVar = f239137i;
                if (ebVar == null) {
                    synchronized (C88458h.class) {
                        ebVar = f239137i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239136h);
                            f239137i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
