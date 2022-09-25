package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e;

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

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.d */
/* compiled from: PG */
public final class C80391d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C80391d f220635i;

    /* renamed from: j */
    private static volatile C63010eb f220636j;

    /* renamed from: a */
    public int f220637a;

    /* renamed from: b */
    public String f220638b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f220639c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f220640d;

    /* renamed from: e */
    public String f220641e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f220642f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f220643g;

    /* renamed from: h */
    public String f220644h = BuildConfig.FLAVOR;

    static {
        C80391d dVar = new C80391d();
        f220635i = dVar;
        C62942bv.registerDefaultInstance(C80391d.class, dVar);
    }

    private C80391d() {
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
                return newMessageInfo(f220635i, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\u0007\u0006Ȉ\u0007Ȉ\b\u0002\tȈ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C80391d();
            case 4:
                return new C80370b();
            case 5:
                return f220635i;
            case 6:
                C63010eb ebVar = f220636j;
                if (ebVar == null) {
                    synchronized (C80391d.class) {
                        ebVar = f220636j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220635i);
                            f220636j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
