package com.google.p337aa.p338a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aa.a.l */
/* compiled from: PG */
public final class C6610l extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C6610l f19630i;

    /* renamed from: j */
    private static volatile C63010eb f19631j;

    /* renamed from: a */
    public int f19632a;

    /* renamed from: b */
    public String f19633b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f19634c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f19635d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f19636e;

    /* renamed from: f */
    public String f19637f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f19638g;

    /* renamed from: h */
    public int f19639h;

    static {
        C6610l lVar = new C6610l();
        f19630i = lVar;
        C62942bv.registerDefaultInstance(C6610l.class, lVar);
    }

    private C6610l() {
        emptyProtobufList();
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
                return newMessageInfo(f19630i, "\u0001\u0007\u0000\u0001\u0001\u0012\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0006ဈ\u0001\bဈ\b\u000bဇ\n\fဈ\u000b\rင\f\u0012ဌ\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C6599a.f19621a});
            case 3:
                return new C6610l();
            case 4:
                return new C6609k();
            case 5:
                return f19630i;
            case 6:
                C63010eb ebVar = f19631j;
                if (ebVar == null) {
                    synchronized (C6610l.class) {
                        ebVar = f19631j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19630i);
                            f19631j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
