package com.google.assistant.p4001w.p4002a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.w.a.n */
/* compiled from: PG */
public final class C53507n extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C53507n f140428l;

    /* renamed from: m */
    private static volatile C63010eb f140429m;

    /* renamed from: a */
    public int f140430a;

    /* renamed from: b */
    public int f140431b;

    /* renamed from: c */
    public C53497d f140432c;

    /* renamed from: d */
    public String f140433d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f140434e = emptyProtobufList();

    /* renamed from: f */
    public C63042fg f140435f;

    /* renamed from: g */
    public C62910ar f140436g;

    /* renamed from: h */
    public long f140437h;

    /* renamed from: i */
    public String f140438i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public long f140439j;

    /* renamed from: k */
    public long f140440k;

    static {
        C53507n nVar = new C53507n();
        f140428l = nVar;
        C62942bv.registerDefaultInstance(C53507n.class, nVar);
    }

    private C53507n() {
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
                return newMessageInfo(f140428l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဂ\u0005\bဈ\u0006\tဂ\u0007\nဂ\b", new Object[]{"a", "b", C53494a.f140386a, C45240c.f118157a, "d", "e", C53497d.class, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C53507n();
            case 4:
                return new C53506m();
            case 5:
                return f140428l;
            case 6:
                C63010eb ebVar = f140429m;
                if (ebVar == null) {
                    synchronized (C53507n.class) {
                        ebVar = f140429m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140428l);
                            f140429m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
