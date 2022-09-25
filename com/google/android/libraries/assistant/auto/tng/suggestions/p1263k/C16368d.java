package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.d */
/* compiled from: PG */
public final class C16368d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C16368d f48181i;

    /* renamed from: j */
    private static volatile C63010eb f48182j;

    /* renamed from: a */
    public int f48183a;

    /* renamed from: b */
    public String f48184b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f48185c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f48186d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f48187e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f48188f = C62942bv.emptyProtobufList();

    /* renamed from: g */
    public String f48189g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f48190h = BuildConfig.FLAVOR;

    static {
        C16368d dVar = new C16368d();
        f48181i = dVar;
        C62942bv.registerDefaultInstance(C16368d.class, dVar);
    }

    private C16368d() {
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
                return newMessageInfo(f48181i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C16368d();
            case 4:
                return new C16367c();
            case 5:
                return f48181i;
            case 6:
                C63010eb ebVar = f48182j;
                if (ebVar == null) {
                    synchronized (C16368d.class) {
                        ebVar = f48182j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48181i);
                            f48182j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
