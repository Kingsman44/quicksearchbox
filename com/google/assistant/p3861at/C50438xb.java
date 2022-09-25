package com.google.assistant.p3861at;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.xb */
/* compiled from: PG */
public final class C50438xb extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C50438xb f131260n;

    /* renamed from: o */
    private static volatile C63010eb f131261o;

    /* renamed from: a */
    public int f131262a;

    /* renamed from: b */
    public C50451xo f131263b;

    /* renamed from: c */
    public long f131264c;

    /* renamed from: d */
    public C62971cq f131265d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f131266e = emptyProtobufList();

    /* renamed from: f */
    public long f131267f;

    /* renamed from: g */
    public C62971cq f131268g;

    /* renamed from: h */
    public String f131269h;

    /* renamed from: i */
    public int f131270i;

    /* renamed from: j */
    public C50435wz f131271j;

    /* renamed from: k */
    public C63088z f131272k;

    /* renamed from: l */
    public C50389vg f131273l;

    /* renamed from: m */
    public C50406vx f131274m;

    static {
        C50438xb xbVar = new C50438xb();
        f131260n = xbVar;
        C62942bv.registerDefaultInstance(C50438xb.class, xbVar);
    }

    private C50438xb() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        this.f131268g = emptyProtobufList();
        this.f131269h = BuildConfig.FLAVOR;
        this.f131272k = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f131260n, "\u0001\f\u0000\u0001\u0004\u0016\f\u0000\u0003\u0000\u0004ဉ\u0000\u0006\u001b\u0007\u001b\bဂ\u0004\u000b\u001b\fဈ\u0005\rဌ\u0006\u000eဉ\u0007\u000fဂ\u0002\u0013ည\n\u0014ဉ\u000b\u0016ဉ\r", new Object[]{"a", "b", "d", C50421wl.class, "e", C50411wb.class, C10662f.f35572a, C30325g.f82003a, C50397vo.class, C19618h.f54585a, "i", C50446xj.f131298a, "j", C45240c.f118157a, C19621k.f54601a, "l", "m"});
            case 3:
                return new C50438xb();
            case 4:
                return new C50437xa();
            case 5:
                return f131260n;
            case 6:
                C63010eb ebVar = f131261o;
                if (ebVar == null) {
                    synchronized (C50438xb.class) {
                        ebVar = f131261o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131260n);
                            f131261o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
