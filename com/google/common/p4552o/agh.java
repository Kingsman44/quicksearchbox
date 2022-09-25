package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agh */
/* compiled from: PG */
public final class agh extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final agh f158629l;

    /* renamed from: n */
    private static volatile C63010eb f158630n;

    /* renamed from: a */
    public int f158631a;

    /* renamed from: b */
    public String f158632b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f158633c;

    /* renamed from: d */
    public C62971cq f158634d = emptyProtobufList();

    /* renamed from: e */
    public afs f158635e;

    /* renamed from: f */
    public aew f158636f;

    /* renamed from: g */
    public afg f158637g;

    /* renamed from: h */
    public agg f158638h;

    /* renamed from: i */
    public afo f158639i;

    /* renamed from: j */
    public afi f158640j;

    /* renamed from: k */
    public int f158641k;

    /* renamed from: m */
    private byte f158642m = 2;

    static {
        agh agh = new agh();
        f158629l = agh;
        C62942bv.registerDefaultInstance(agh.class, agh);
    }

    private agh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158642m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158642m = b;
                return null;
            case 2:
                return newMessageInfo(f158629l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဉ\u0003\u0006ᐉ\u0006\u0007ဉ\u0007\bᐉ\b\tဌ\n\nဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", ahc.class, "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a, aey.f158499a, C30325g.f82003a});
            case 3:
                return new agh();
            case 4:
                return new aex();
            case 5:
                return f158629l;
            case 6:
                C63010eb ebVar = f158630n;
                if (ebVar == null) {
                    synchronized (agh.class) {
                        ebVar = f158630n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158629l);
                            f158630n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
