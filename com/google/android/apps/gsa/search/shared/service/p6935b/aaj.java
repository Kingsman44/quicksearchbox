package com.google.android.apps.gsa.search.shared.service.p6935b;

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

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aaj */
/* compiled from: PG */
public final class aaj extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final aaj f237075i;

    /* renamed from: j */
    private static volatile C63010eb f237076j;

    /* renamed from: a */
    public int f237077a;

    /* renamed from: b */
    public boolean f237078b;

    /* renamed from: c */
    public boolean f237079c;

    /* renamed from: d */
    public boolean f237080d;

    /* renamed from: e */
    public boolean f237081e;

    /* renamed from: f */
    public String f237082f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public boolean f237083g;

    /* renamed from: h */
    public String f237084h = BuildConfig.FLAVOR;

    static {
        aaj aaj = new aaj();
        f237075i = aaj;
        C62942bv.registerDefaultInstance(aaj.class, aaj);
    }

    private aaj() {
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
                return newMessageInfo(f237075i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new aaj();
            case 4:
                return new aai();
            case 5:
                return f237075i;
            case 6:
                C63010eb ebVar = f237076j;
                if (ebVar == null) {
                    synchronized (aaj.class) {
                        ebVar = f237076j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237075i);
                            f237076j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
