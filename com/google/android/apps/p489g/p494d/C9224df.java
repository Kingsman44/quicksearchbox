package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7799kj;
import com.google.p375ai.p378b.C7893nw;
import com.google.p375ai.p378b.C7971qt;
import com.google.p375ai.p378b.C8150xj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.df */
/* compiled from: PG */
public final class C9224df extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C9224df f31879l;

    /* renamed from: o */
    private static volatile C63010eb f31880o;

    /* renamed from: a */
    public int f31881a;

    /* renamed from: b */
    public C7971qt f31882b;

    /* renamed from: c */
    public String f31883c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C8150xj f31884d;

    /* renamed from: e */
    public String f31885e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C8150xj f31886f;

    /* renamed from: g */
    public C62971cq f31887g = emptyProtobufList();

    /* renamed from: h */
    public boolean f31888h;

    /* renamed from: i */
    public C7799kj f31889i;

    /* renamed from: j */
    public String f31890j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public boolean f31891k;

    /* renamed from: m */
    private C7726hr f31892m;

    /* renamed from: n */
    private byte f31893n = 2;

    static {
        C9224df dfVar = new C9224df();
        f31879l = dfVar;
        C62942bv.registerDefaultInstance(C9224df.class, dfVar);
    }

    private C9224df() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31893n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31893n = b;
                return null;
            case 2:
                return newMessageInfo(f31879l, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0002\u0001ဉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0006\u0004ᐉ\u0007\u0005ဉ\u0002\u0006ဈ\u0003\u0007ဉ\u0004\b\u001b\tဇ\u0005\u000bဈ\b\rဇ\t", new Object[]{"a", "b", C45240c.f118157a, "i", "m", "d", "e", C10662f.f35572a, C30325g.f82003a, C7893nw.class, C19618h.f54585a, "j", C19621k.f54601a});
            case 3:
                return new C9224df();
            case 4:
                return new C9223de();
            case 5:
                return f31879l;
            case 6:
                C63010eb ebVar = f31880o;
                if (ebVar == null) {
                    synchronized (C9224df.class) {
                        ebVar = f31880o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31879l);
                            f31880o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
