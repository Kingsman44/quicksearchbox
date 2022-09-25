package com.google.assistant.p3897e.p3921j;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.en */
/* compiled from: PG */
public final class C52081en extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C52081en f136679i;

    /* renamed from: j */
    private static volatile C63010eb f136680j;

    /* renamed from: a */
    public int f136681a;

    /* renamed from: b */
    public C63088z f136682b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f136683c = C63088z.f170246b;

    /* renamed from: d */
    public C62971cq f136684d = emptyProtobufList();

    /* renamed from: e */
    public C52091ex f136685e;

    /* renamed from: f */
    public C62995dn f136686f = C62995dn.f170057a;

    /* renamed from: g */
    public C52085er f136687g;

    /* renamed from: h */
    public String f136688h = BuildConfig.FLAVOR;

    static {
        C52081en enVar = new C52081en();
        f136679i = enVar;
        C62942bv.registerDefaultInstance(C52081en.class, enVar);
    }

    private C52081en() {
    }

    /* renamed from: a */
    public final void mo53787a() {
        C62971cq cqVar = this.f136684d;
        if (!cqVar.mo58948c()) {
            this.f136684d = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f136679i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0001\u0001\u0000\u0001ည\u0000\u0002ည\u0002\u0003\u001b\u0004ဉ\u0004\u00072\bဉ\u0006\tဈ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C52083ep.class, "e", C10662f.f35572a, C52080em.f136678a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C52081en();
            case 4:
                return new C52079el();
            case 5:
                return f136679i;
            case 6:
                C63010eb ebVar = f136680j;
                if (ebVar == null) {
                    synchronized (C52081en.class) {
                        ebVar = f136680j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136679i);
                            f136680j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
