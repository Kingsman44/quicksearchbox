package com.google.android.libraries.gsa.actionusermodel;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
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
import com.google.protos.p4985f.p4986a.p4987a.C64646b;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bc */
/* compiled from: PG */
public final class C22073bc extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C22073bc f60820k;

    /* renamed from: m */
    private static volatile C63010eb f60821m;

    /* renamed from: a */
    public int f60822a;

    /* renamed from: b */
    public int f60823b;

    /* renamed from: c */
    public String f60824c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f60825d = emptyProtobufList();

    /* renamed from: e */
    public String f60826e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f60827f = C63088z.f170246b;

    /* renamed from: g */
    public boolean f60828g;

    /* renamed from: h */
    public C64708r f60829h;

    /* renamed from: i */
    public boolean f60830i;

    /* renamed from: j */
    public boolean f60831j;

    /* renamed from: l */
    private byte f60832l = 2;

    static {
        C22073bc bcVar = new C22073bc();
        f60820k = bcVar;
        C62942bv.registerDefaultInstance(C22073bc.class, bcVar);
    }

    private C22073bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f60832l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f60832l = b;
                return null;
            case 2:
                return newMessageInfo(f60820k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဈ\u0002\u0005ည\u0003\u0006ဇ\u0004\u0007ᐉ\u0005\bဇ\u0006\tဇ\u0007", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", C64646b.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C22073bc();
            case 4:
                return new C22072bb();
            case 5:
                return f60820k;
            case 6:
                C63010eb ebVar = f60821m;
                if (ebVar == null) {
                    synchronized (C22073bc.class) {
                        ebVar = f60821m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60820k);
                            f60821m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
