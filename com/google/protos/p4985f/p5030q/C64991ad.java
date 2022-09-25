package com.google.protos.p4985f.p5030q;

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
import com.google.protos.p4985f.p4986a.C64708r;
import com.google.protos.p4985f.p4986a.p4987a.C64646b;

/* renamed from: com.google.protos.f.q.ad */
/* compiled from: PG */
public final class C64991ad extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64991ad f175990i;

    /* renamed from: k */
    private static volatile C63010eb f175991k;

    /* renamed from: a */
    public int f175992a;

    /* renamed from: b */
    public int f175993b;

    /* renamed from: c */
    public String f175994c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f175995d = emptyProtobufList();

    /* renamed from: e */
    public String f175996e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C64708r f175997f;

    /* renamed from: g */
    public double f175998g;

    /* renamed from: h */
    public C64989ab f175999h;

    /* renamed from: j */
    private byte f176000j = 2;

    static {
        C64991ad adVar = new C64991ad();
        f175990i = adVar;
        C62942bv.registerDefaultInstance(C64991ad.class, adVar);
    }

    private C64991ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176000j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176000j = b;
                return null;
            case 2:
                return newMessageInfo(f175990i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဈ\u0002\u0005ᐉ\u0003\u0006က\u0004\u0007ဉ\u0005", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", C64646b.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C64991ad();
            case 4:
                return new C64990ac();
            case 5:
                return f175990i;
            case 6:
                C63010eb ebVar = f175991k;
                if (ebVar == null) {
                    synchronized (C64991ad.class) {
                        ebVar = f175991k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175990i);
                            f175991k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
