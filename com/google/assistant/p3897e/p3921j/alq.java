package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.alq */
/* compiled from: PG */
public final class alq extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final alq f135335j;

    /* renamed from: k */
    private static volatile C63010eb f135336k;

    /* renamed from: a */
    public int f135337a;

    /* renamed from: b */
    public int f135338b;

    /* renamed from: c */
    public String f135339c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f135340d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f135341e = "assistant";

    /* renamed from: f */
    public String f135342f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f135343g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f135344h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C62995dn f135345i = C62995dn.f170057a;

    static {
        alq alq = new alq();
        f135335j = alq;
        C62942bv.registerDefaultInstance(alq.class, alq);
    }

    private alq() {
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
                return newMessageInfo(f135335j, "\u0001\b\u0000\u0001\u0001\b\b\u0001\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003ဈ\u0005\u0004ဈ\u0006\u0005ဌ\u0000\u0006ဈ\u0004\u00072\bဈ\u0003", new Object[]{"a", C45240c.f118157a, "d", C30325g.f82003a, C19618h.f54585a, "b", alo.f135334a, C10662f.f35572a, "i", aln.f135333a, "e"});
            case 3:
                return new alq();
            case 4:
                return new alm();
            case 5:
                return f135335j;
            case 6:
                C63010eb ebVar = f135336k;
                if (ebVar == null) {
                    synchronized (alq.class) {
                        ebVar = f135336k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135335j);
                            f135336k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
