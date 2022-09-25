package com.google.android.ssb;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.ssb.i */
/* compiled from: PG */
public final class C45352i extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C45352i f118549k;

    /* renamed from: l */
    private static volatile C63010eb f118550l;

    /* renamed from: a */
    public int f118551a;

    /* renamed from: b */
    public boolean f118552b;

    /* renamed from: c */
    public String f118553c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f118554d;

    /* renamed from: e */
    public int f118555e;

    /* renamed from: f */
    public boolean f118556f;

    /* renamed from: g */
    public C45354k f118557g;

    /* renamed from: h */
    public int f118558h;

    /* renamed from: i */
    public C45345b f118559i;

    /* renamed from: j */
    public C62961ch f118560j = emptyIntList();

    static {
        C45352i iVar = new C45352i();
        f118549k = iVar;
        C62942bv.registerDefaultInstance(C45352i.class, iVar);
    }

    private C45352i() {
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
                return newMessageInfo(f118549k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0004ဌ\u0004\u0006ဇ\u0003\u0007ဇ\u0005\bဉ\u0006\tဌ\u0007\nဉ\b\u000b\u0016", new Object[]{"a", "b", C45240c.f118157a, "e", C45350g.m80861b(), "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C45348e.f118540a, "i", "j"});
            case 3:
                return new C45352i();
            case 4:
                return new C45351h();
            case 5:
                return f118549k;
            case 6:
                C63010eb ebVar = f118550l;
                if (ebVar == null) {
                    synchronized (C45352i.class) {
                        ebVar = f118550l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f118549k);
                            f118550l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
