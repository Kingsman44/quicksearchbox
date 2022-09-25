package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.oc */
/* compiled from: PG */
public final class C52340oc extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C52340oc f137370l;

    /* renamed from: m */
    private static volatile C63010eb f137371m;

    /* renamed from: a */
    public int f137372a;

    /* renamed from: b */
    public C62971cq f137373b = emptyProtobufList();

    /* renamed from: c */
    public int f137374c;

    /* renamed from: d */
    public C62910ar f137375d;

    /* renamed from: e */
    public boolean f137376e;

    /* renamed from: f */
    public boolean f137377f;

    /* renamed from: g */
    public C63088z f137378g = C63088z.f170246b;

    /* renamed from: h */
    public int f137379h;

    /* renamed from: i */
    public String f137380i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f137381j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f137382k;

    static {
        C52340oc ocVar = new C52340oc();
        f137370l = ocVar;
        C62942bv.registerDefaultInstance(C52340oc.class, ocVar);
    }

    private C52340oc() {
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
                return newMessageInfo(f137370l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000\u0003ဉ\u0001\u0006ဇ\u0004\u0007ဇ\u0005\bည\u0006\tဌ\u0007\nဈ\b\u000bဈ\t\fဌ\n", new Object[]{"a", "b", C52334nx.class, C45240c.f118157a, C52322nl.f137337a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C52338oa.f137369a, "i", "j", C19621k.f54601a, C52331nu.f137352a});
            case 3:
                return new C52340oc();
            case 4:
                return new C52330nt();
            case 5:
                return f137370l;
            case 6:
                C63010eb ebVar = f137371m;
                if (ebVar == null) {
                    synchronized (C52340oc.class) {
                        ebVar = f137371m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137370l);
                            f137371m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
