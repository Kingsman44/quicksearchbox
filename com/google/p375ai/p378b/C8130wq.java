package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wq */
/* compiled from: PG */
public final class C8130wq extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C8130wq f28570m;

    /* renamed from: n */
    private static volatile C63010eb f28571n;

    /* renamed from: a */
    public int f28572a;

    /* renamed from: b */
    public C8129wp f28573b;

    /* renamed from: c */
    public C8129wp f28574c;

    /* renamed from: d */
    public double f28575d;

    /* renamed from: e */
    public String f28576e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f28577f;

    /* renamed from: g */
    public int f28578g;

    /* renamed from: h */
    public double f28579h;

    /* renamed from: i */
    public int f28580i;

    /* renamed from: j */
    public int f28581j;

    /* renamed from: k */
    public int f28582k;

    /* renamed from: l */
    public int f28583l;

    static {
        C8130wq wqVar = new C8130wq();
        f28570m = wqVar;
        C62942bv.registerDefaultInstance(C8130wq.class, wqVar);
    }

    private C8130wq() {
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
                return newMessageInfo(f28570m, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004က\u0002\u0005ဈ\u0003\u0007င\u0004\nင\u0005\u000bက\u0006\fင\u0007\rင\b\u000eင\t\u000fင\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C8130wq();
            case 4:
                return new C8127wn();
            case 5:
                return f28570m;
            case 6:
                C63010eb ebVar = f28571n;
                if (ebVar == null) {
                    synchronized (C8130wq.class) {
                        ebVar = f28571n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28570m);
                            f28571n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
