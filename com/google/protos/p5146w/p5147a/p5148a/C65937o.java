package com.google.protos.p5146w.p5147a.p5148a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.w.a.a.o */
/* compiled from: PG */
public final class C65937o extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C65937o f179332k;

    /* renamed from: l */
    public static final C62940bt f179333l;

    /* renamed from: n */
    private static volatile C63010eb f179334n;

    /* renamed from: a */
    public int f179335a;

    /* renamed from: b */
    public String f179336b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f179337c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f179338d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f179339e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f179340f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f179341g;

    /* renamed from: h */
    public String f179342h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f179343i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f179344j = BuildConfig.FLAVOR;

    /* renamed from: m */
    private byte f179345m = 2;

    static {
        C65937o oVar = new C65937o();
        f179332k = oVar;
        C62942bv.registerDefaultInstance(C65937o.class, oVar);
        f179333l = C62942bv.newSingularGeneratedExtension(C65930h.f179300i, oVar, oVar, (C62958ce) null, 2003, C63066gd.MESSAGE, C65937o.class);
    }

    private C65937o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179345m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179345m = b;
                return null;
            case 2:
                return newMessageInfo(f179332k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\bဈ\u0006\u000bဈ\b\rဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C65937o();
            case 4:
                return new C65936n();
            case 5:
                return f179332k;
            case 6:
                C63010eb ebVar = f179334n;
                if (ebVar == null) {
                    synchronized (C65937o.class) {
                        ebVar = f179334n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179332k);
                            f179334n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
