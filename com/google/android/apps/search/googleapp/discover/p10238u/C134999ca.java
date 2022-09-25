package com.google.android.apps.search.googleapp.discover.p10238u;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ca */
/* compiled from: PG */
public final class C134999ca extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C134999ca f367585g;

    /* renamed from: h */
    private static volatile C63010eb f367586h;

    /* renamed from: a */
    public int f367587a;

    /* renamed from: b */
    public String f367588b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f367589c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f367590d;

    /* renamed from: e */
    public String f367591e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63042fg f367592f;

    static {
        C134999ca caVar = new C134999ca();
        f367585g = caVar;
        C62942bv.registerDefaultInstance(C134999ca.class, caVar);
    }

    private C134999ca() {
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
                return newMessageInfo(f367585g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C57259bn.m88290b(), "e", C10662f.f35572a});
            case 3:
                return new C134999ca();
            case 4:
                return new C134994bz();
            case 5:
                return f367585g;
            case 6:
                C63010eb ebVar = f367586h;
                if (ebVar == null) {
                    synchronized (C134999ca.class) {
                        ebVar = f367586h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367585g);
                            f367586h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
