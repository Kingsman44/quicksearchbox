package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ai.b.wr */
/* compiled from: PG */
public final class C8131wr extends C62942bv implements C63001dt {

    /* renamed from: p */
    public static final C8131wr f28584p;

    /* renamed from: r */
    private static volatile C63010eb f28585r;

    /* renamed from: a */
    public int f28586a;

    /* renamed from: b */
    public int f28587b;

    /* renamed from: c */
    public int f28588c;

    /* renamed from: d */
    public long f28589d;

    /* renamed from: e */
    public String f28590e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f28591f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f28592g = emptyProtobufList();

    /* renamed from: h */
    public String f28593h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f28594i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f28595j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f28596k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f28597l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f28598m;

    /* renamed from: n */
    public C7526an f28599n;

    /* renamed from: o */
    public C8118we f28600o;

    /* renamed from: q */
    private byte f28601q = 2;

    static {
        C8131wr wrVar = new C8131wr();
        f28584p = wrVar;
        C62942bv.registerDefaultInstance(C8131wr.class, wrVar);
    }

    private C8131wr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28601q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28601q = b;
                return null;
            case 2:
                return newMessageInfo(f28584p, "\u0001\u000e\u0000\u0001\u0001\u0018\u000e\u0000\u0002\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဂ\u0002\u0006ဈ\u0003\u0007\u001b\tЛ\u000bဈ\u0004\fဈ\u0005\rဈ\u0006\u000eဈ\u0007\u000fဈ\b\u0016ဇ\u000b\u0017ဉ\f\u0018ဉ\r", new Object[]{"a", "b", C8110vx.m22950b(), C45240c.f118157a, C8125wl.f28562a, "d", "e", C10662f.f35572a, C8120wg.class, C30325g.f82003a, C8124wk.class, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a});
            case 3:
                return new C8131wr();
            case 4:
                return new C8114wa();
            case 5:
                return f28584p;
            case 6:
                C63010eb ebVar = f28585r;
                if (ebVar == null) {
                    synchronized (C8131wr.class) {
                        ebVar = f28585r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28584p);
                            f28585r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
