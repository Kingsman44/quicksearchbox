package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53446oe;
import com.google.assistant.p3994s.p3995a.C53448og;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.ag */
/* compiled from: PG */
public final class C16333ag extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C16333ag f48074n;

    /* renamed from: p */
    private static volatile C63010eb f48075p;

    /* renamed from: a */
    public int f48076a;

    /* renamed from: b */
    public boolean f48077b = true;

    /* renamed from: c */
    public String f48078c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f48079d;

    /* renamed from: e */
    public int f48080e;

    /* renamed from: f */
    public C62995dn f48081f = C62995dn.f170057a;

    /* renamed from: g */
    public C16330ad f48082g;

    /* renamed from: h */
    public C62971cq f48083h = C62942bv.emptyProtobufList();

    /* renamed from: i */
    public C16335ai f48084i;

    /* renamed from: j */
    public C48952az f48085j;

    /* renamed from: k */
    public C53448og f48086k;

    /* renamed from: l */
    public C53446oe f48087l;

    /* renamed from: m */
    public int f48088m;

    /* renamed from: o */
    private byte f48089o = 2;

    static {
        C16333ag agVar = new C16333ag();
        f48074n = agVar;
        C62942bv.registerDefaultInstance(C16333ag.class, agVar);
    }

    private C16333ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48089o);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48089o = b;
                return null;
            case 2:
                return newMessageInfo(f48074n, "\u0001\f\u0000\u0001\u0003\u0013\f\u0001\u0001\u0002\u0003ဇ\u0000\u0004ဈ\u0001\u0006ᐉ\u0004\u0007ဉ\u0006\bဇ\u0002\u000b2\r\u001a\u000eᐉ\u0005\u0010င\t\u0011ဌ\u0003\u0012ဉ\b\u0013ဉ\u0007", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, "j", "d", C10662f.f35572a, C16332af.f48073a, C19618h.f54585a, "i", "m", "e", C16327aa.m33332b(), "l", C19621k.f54601a});
            case 3:
                return new C16333ag();
            case 4:
                return new C16331ae();
            case 5:
                return f48074n;
            case 6:
                C63010eb ebVar = f48075p;
                if (ebVar == null) {
                    synchronized (C16333ag.class) {
                        ebVar = f48075p;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48074n);
                            f48075p = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
