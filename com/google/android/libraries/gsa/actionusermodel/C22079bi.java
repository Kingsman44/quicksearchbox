package com.google.android.libraries.gsa.actionusermodel;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p4986a.C64708r;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bi */
/* compiled from: PG */
public final class C22079bi extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C22079bi f60866l;

    /* renamed from: n */
    private static volatile C63010eb f60867n;

    /* renamed from: a */
    public int f60868a;

    /* renamed from: b */
    public int f60869b;

    /* renamed from: c */
    public String f60870c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f60871d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f60872e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public String f60873f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C63088z f60874g = C63088z.f170246b;

    /* renamed from: h */
    public boolean f60875h;

    /* renamed from: i */
    public C64708r f60876i;

    /* renamed from: j */
    public boolean f60877j;

    /* renamed from: k */
    public boolean f60878k;

    /* renamed from: m */
    private byte f60879m = 2;

    static {
        C22079bi biVar = new C22079bi();
        f60866l = biVar;
        C62942bv.registerDefaultInstance(C22079bi.class, biVar);
    }

    private C22079bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f60879m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f60879m = b;
                return null;
            case 2:
                return newMessageInfo(f60866l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ည\u0004\u0007ဇ\u0005\bᐉ\u0006\tဇ\u0007\nဇ\b", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C22079bi();
            case 4:
                return new C22078bh();
            case 5:
                return f60866l;
            case 6:
                C63010eb ebVar = f60867n;
                if (ebVar == null) {
                    synchronized (C22079bi.class) {
                        ebVar = f60867n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60866l);
                            f60867n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
