package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.jo */
/* compiled from: PG */
public final class C7777jo extends C62937bq implements C62938br {

    /* renamed from: m */
    public static final C7777jo f27217m;

    /* renamed from: o */
    private static volatile C63010eb f27218o;

    /* renamed from: a */
    public int f27219a;

    /* renamed from: b */
    public String f27220b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f27221c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f27222d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f27223e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f27224f = emptyProtobufList();

    /* renamed from: g */
    public int f27225g = 1;

    /* renamed from: h */
    public int f27226h = 1;

    /* renamed from: i */
    public int f27227i;

    /* renamed from: j */
    public int f27228j;

    /* renamed from: k */
    public C62971cq f27229k = emptyProtobufList();

    /* renamed from: l */
    public C7526an f27230l;

    /* renamed from: n */
    private byte f27231n = 2;

    static {
        C7777jo joVar = new C7777jo();
        f27217m = joVar;
        C62942bv.registerDefaultInstance(C7777jo.class, joVar);
    }

    private C7777jo() {
        C62942bv.emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27231n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f27231n = b;
                return null;
            case 2:
                return newMessageInfo(f27217m, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0002\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0003\u0004\u001b\u0005ဈ\u0000\u0006င\u0006\u0007င\u0007\b\u001b\tဌ\u0004\fဉ\b\u000fဌ\u0005", new Object[]{"a", C45240c.f118157a, "d", "e", C19621k.f54601a, C7526an.class, "b", "i", "j", C10662f.f35572a, C7893nw.class, C30325g.f82003a, C7775jm.f27216a, "l", C19618h.f54585a, C7773jk.f27215a});
            case 3:
                return new C7777jo();
            case 4:
                return new C7772jj();
            case 5:
                return f27217m;
            case 6:
                C63010eb ebVar = f27218o;
                if (ebVar == null) {
                    synchronized (C7777jo.class) {
                        ebVar = f27218o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27217m);
                            f27218o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
