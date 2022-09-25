package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.ag */
/* compiled from: PG */
public final class C41667ag extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C41667ag f108943h;

    /* renamed from: i */
    private static volatile C63010eb f108944i;

    /* renamed from: a */
    public int f108945a;

    /* renamed from: b */
    public String f108946b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f108947c;

    /* renamed from: d */
    public boolean f108948d;

    /* renamed from: e */
    public int f108949e;

    /* renamed from: f */
    public boolean f108950f;

    /* renamed from: g */
    public boolean f108951g;

    static {
        C41667ag agVar = new C41667ag();
        f108943h = agVar;
        C62942bv.registerDefaultInstance(C41667ag.class, agVar);
    }

    private C41667ag() {
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
                return newMessageInfo(f108943h, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0001\u0007ဇ\u0002\rင\u0003\u000eဇ\u0004\u000fဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, C41665ae.f108942a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C41667ag();
            case 4:
                return new C41664ad();
            case 5:
                return f108943h;
            case 6:
                C63010eb ebVar = f108944i;
                if (ebVar == null) {
                    synchronized (C41667ag.class) {
                        ebVar = f108944i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108943h);
                            f108944i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
