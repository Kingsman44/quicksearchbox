package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r */
/* compiled from: PG */
public final class C138317r extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C138317r f376326j;

    /* renamed from: k */
    private static volatile C63010eb f376327k;

    /* renamed from: a */
    public int f376328a;

    /* renamed from: b */
    public String f376329b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f376330c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f376331d = emptyProtobufList();

    /* renamed from: e */
    public C138214bv f376332e;

    /* renamed from: f */
    public C138252ch f376333f;

    /* renamed from: g */
    public int f376334g;

    /* renamed from: h */
    public int f376335h;

    /* renamed from: i */
    public C62995dn f376336i = C62995dn.f170057a;

    static {
        C138317r rVar = new C138317r();
        f376326j = rVar;
        C62942bv.registerDefaultInstance(C138317r.class, rVar);
    }

    private C138317r() {
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
                return newMessageInfo(f376326j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဈ\u0001\u0007င\u0005\b2", new Object[]{"a", "b", "d", C138194bb.class, "e", C10662f.f35572a, C30325g.f82003a, C138316q.f376325a, C45240c.f118157a, C19618h.f54585a, "i", C138265p.f376178a});
            case 3:
                return new C138317r();
            case 4:
                return new C138264o();
            case 5:
                return f376326j;
            case 6:
                C63010eb ebVar = f376327k;
                if (ebVar == null) {
                    synchronized (C138317r.class) {
                        ebVar = f376327k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376326j);
                            f376327k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
