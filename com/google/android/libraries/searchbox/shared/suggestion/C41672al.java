package com.google.android.libraries.searchbox.shared.suggestion;

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

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.al */
/* compiled from: PG */
public final class C41672al extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C41672al f108976i;

    /* renamed from: j */
    private static volatile C63010eb f108977j;

    /* renamed from: a */
    public int f108978a;

    /* renamed from: b */
    public String f108979b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f108980c;

    /* renamed from: d */
    public C62961ch f108981d = emptyIntList();

    /* renamed from: e */
    public C41679e f108982e;

    /* renamed from: f */
    public int f108983f;

    /* renamed from: g */
    public int f108984g;

    /* renamed from: h */
    public int f108985h;

    static {
        C41672al alVar = new C41672al();
        f108976i = alVar;
        C62942bv.registerDefaultInstance(C41672al.class, alVar);
    }

    private C41672al() {
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
                return newMessageInfo(f108976i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u0016\u0004ဉ\u0002\u0005င\u0003\u0006င\u0004\u0007င\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C41672al();
            case 4:
                return new C41671ak();
            case 5:
                return f108976i;
            case 6:
                C63010eb ebVar = f108977j;
                if (ebVar == null) {
                    synchronized (C41672al.class) {
                        ebVar = f108977j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f108976i);
                            f108977j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
