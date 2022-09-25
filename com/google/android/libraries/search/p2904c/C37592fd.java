package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.android.libraries.search.p2904c.p2916e.C37539c;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.fd */
/* compiled from: PG */
public final class C37592fd extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C37592fd f99888n;

    /* renamed from: p */
    private static volatile C63010eb f99889p;

    /* renamed from: a */
    public int f99890a;

    /* renamed from: b */
    public int f99891b = 0;

    /* renamed from: c */
    public Object f99892c;

    /* renamed from: d */
    public int f99893d;

    /* renamed from: e */
    public long f99894e;

    /* renamed from: f */
    public long f99895f;

    /* renamed from: g */
    public int f99896g;

    /* renamed from: h */
    public C37493b f99897h;

    /* renamed from: i */
    public C62971cq f99898i = emptyProtobufList();

    /* renamed from: j */
    public int f99899j;

    /* renamed from: k */
    public C37773c f99900k;

    /* renamed from: l */
    public long f99901l;

    /* renamed from: m */
    public int f99902m;

    /* renamed from: o */
    private byte f99903o = 2;

    static {
        C37592fd fdVar = new C37592fd();
        f99888n = fdVar;
        C62942bv.registerDefaultInstance(C37592fd.class, fdVar);
    }

    private C37592fd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f99903o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f99903o = b;
                return null;
            case 2:
                return newMessageInfo(f99888n, "\u0001\u000f\u0001\u0001\u0001Ì\u000f\u0000\u0001\u0001\u0001ဌ\u0000dဂ\u0001eဂ\u0002fဌ\u0003gဉ\u0004h\u001biဌ\u0005jဉ\u0006kဂ\u0007lဌ\bÈᐼ\u0000Éြ\u0000Êြ\u0000Ëြ\u0000Ìြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C37599fk.f99921a, "e", C10662f.f35572a, C30325g.f82003a, C37565ef.m66574b(), C19618h.f54585a, "i", C37539c.class, "j", C37411bp.f99342a, C19621k.f54601a, "l", "m", C37384h.m66406b(), C37407bl.class, C37410bo.class, C37662hi.class, C37346ak.class, C37462ck.class});
            case 3:
                return new C37592fd();
            case 4:
                return new C37590fb();
            case 5:
                return f99888n;
            case 6:
                C63010eb ebVar = f99889p;
                if (ebVar == null) {
                    synchronized (C37592fd.class) {
                        ebVar = f99889p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99888n);
                            f99889p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
