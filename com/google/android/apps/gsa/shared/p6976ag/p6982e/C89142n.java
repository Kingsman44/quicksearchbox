package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.n */
/* compiled from: PG */
public final class C89142n extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C89142n f241658n;

    /* renamed from: o */
    private static volatile C63010eb f241659o;

    /* renamed from: a */
    public int f241660a;

    /* renamed from: b */
    public int f241661b;

    /* renamed from: c */
    public C62961ch f241662c = emptyIntList();

    /* renamed from: d */
    public String f241663d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f241664e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f241665f;

    /* renamed from: g */
    public int f241666g;

    /* renamed from: h */
    public C63042fg f241667h;

    /* renamed from: i */
    public int f241668i;

    /* renamed from: j */
    public boolean f241669j;

    /* renamed from: k */
    public boolean f241670k;

    /* renamed from: l */
    public boolean f241671l;

    /* renamed from: m */
    public boolean f241672m;

    static {
        C89142n nVar = new C89142n();
        f241658n = nVar;
        C62942bv.registerDefaultInstance(C89142n.class, nVar);
    }

    private C89142n() {
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
                return newMessageInfo(f241658n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဌ\u0000\u0002'\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဌ\u0003\u0006ဌ\u0004\u0007ဉ\u0005\bဌ\u0006\tဇ\u0007\nဇ\b\u000bဇ\t\fဇ\n", new Object[]{"a", "b", C89134f.m144999b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C89139k.m145003b(), C30325g.f82003a, C89137i.m145001b(), C19618h.f54585a, "i", C89141m.m145005b(), "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new C89142n();
            case 4:
                return new C89135g();
            case 5:
                return f241658n;
            case 6:
                C63010eb ebVar = f241659o;
                if (ebVar == null) {
                    synchronized (C89142n.class) {
                        ebVar = f241659o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241658n);
                            f241659o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
