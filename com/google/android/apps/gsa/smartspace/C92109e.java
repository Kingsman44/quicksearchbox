package com.google.android.apps.gsa.smartspace;

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

@Deprecated
/* renamed from: com.google.android.apps.gsa.smartspace.e */
/* compiled from: PG */
public final class C92109e extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C92109e f256805i;

    /* renamed from: j */
    private static volatile C63010eb f256806j;

    /* renamed from: a */
    public int f256807a;

    /* renamed from: b */
    public String f256808b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f256809c;

    /* renamed from: d */
    public String f256810d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f256811e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f256812f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public long f256813g;

    /* renamed from: h */
    public int f256814h;

    static {
        C92109e eVar = new C92109e();
        f256805i = eVar;
        C62942bv.registerDefaultInstance(C92109e.class, eVar);
    }

    private C92109e() {
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
                return newMessageInfo(f256805i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0007ဂ\u0006\bဌ\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C92084c.f256719a});
            case 3:
                return new C92109e();
            case 4:
                return new C92036b();
            case 5:
                return f256805i;
            case 6:
                C63010eb ebVar = f256806j;
                if (ebVar == null) {
                    synchronized (C92109e.class) {
                        ebVar = f256806j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256805i);
                            f256806j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
