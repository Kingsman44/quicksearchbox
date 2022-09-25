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

/* renamed from: com.google.android.libraries.gsa.actionusermodel.be */
/* compiled from: PG */
public final class C22075be extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C22075be f60833n;

    /* renamed from: p */
    private static volatile C63010eb f60834p;

    /* renamed from: a */
    public int f60835a;

    /* renamed from: b */
    public int f60836b;

    /* renamed from: c */
    public String f60837c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f60838d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f60839e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f60840f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f60841g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C63088z f60842h = C63088z.f170246b;

    /* renamed from: i */
    public boolean f60843i;

    /* renamed from: j */
    public C64708r f60844j;

    /* renamed from: k */
    public boolean f60845k;

    /* renamed from: l */
    public boolean f60846l;

    /* renamed from: m */
    public boolean f60847m;

    /* renamed from: o */
    private byte f60848o = 2;

    static {
        C22075be beVar = new C22075be();
        f60833n = beVar;
        C62942bv.registerDefaultInstance(C22075be.class, beVar);
    }

    private C22075be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f60848o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f60848o = b;
                return null;
            case 2:
                return newMessageInfo(f60833n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007ည\u0005\bဇ\u0006\tᐉ\u0007\nဇ\b\u000bဇ\t\fဇ\n", new Object[]{"a", "b", C55421x.m87687b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C22075be();
            case 4:
                return new C22074bd();
            case 5:
                return f60833n;
            case 6:
                C63010eb ebVar = f60834p;
                if (ebVar == null) {
                    synchronized (C22075be.class) {
                        ebVar = f60834p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f60833n);
                            f60834p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
