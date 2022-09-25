package com.google.speech.p5218j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.es */
/* compiled from: PG */
public final class C66929es extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66929es f181924f;

    /* renamed from: h */
    private static volatile C63010eb f181925h;

    /* renamed from: a */
    public int f181926a;

    /* renamed from: b */
    public int f181927b;

    /* renamed from: c */
    public C66931eu f181928c;

    /* renamed from: d */
    public C62971cq f181929d = emptyProtobufList();

    /* renamed from: e */
    public String f181930e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private C66922el f181931g;

    static {
        C66929es esVar = new C66929es();
        f181924f = esVar;
        C62942bv.registerDefaultInstance(C66929es.class, esVar);
    }

    private C66929es() {
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
                return newMessageInfo(f181924f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0006\u001b\u0007ဈ\u0004", new Object[]{"a", "b", C66927eq.f181923a, C45240c.f118157a, C30325g.f82003a, "d", C66925eo.class, "e"});
            case 3:
                return new C66929es();
            case 4:
                return new C66923em();
            case 5:
                return f181924f;
            case 6:
                C63010eb ebVar = f181925h;
                if (ebVar == null) {
                    synchronized (C66929es.class) {
                        ebVar = f181925h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181924f);
                            f181925h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
