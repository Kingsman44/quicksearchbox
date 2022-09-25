package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.ac */
/* compiled from: PG */
public final class C62253ac extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C62253ac f168064l;

    /* renamed from: m */
    private static volatile C63010eb f168065m;

    /* renamed from: a */
    public int f168066a;

    /* renamed from: b */
    public String f168067b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f168068c = 4;

    /* renamed from: d */
    public boolean f168069d;

    /* renamed from: e */
    public int f168070e = 1;

    /* renamed from: f */
    public boolean f168071f;

    /* renamed from: g */
    public int f168072g;

    /* renamed from: h */
    public int f168073h;

    /* renamed from: i */
    public int f168074i;

    /* renamed from: j */
    public int f168075j;

    /* renamed from: k */
    public int f168076k;

    static {
        C62253ac acVar = new C62253ac();
        f168064l = acVar;
        C62942bv.registerDefaultInstance(C62253ac.class, acVar);
    }

    private C62253ac() {
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
                return newMessageInfo(f168064l, "\u0001\n\u0000\u0001\u0001\u0014\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002\u0006င\u0005\u000fဇ\u000e\u0010င\u000f\u0011င\u0010\u0012င\u0011\u0013င\u0012\u0014င\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C62253ac();
            case 4:
                return new C62252ab();
            case 5:
                return f168064l;
            case 6:
                C63010eb ebVar = f168065m;
                if (ebVar == null) {
                    synchronized (C62253ac.class) {
                        ebVar = f168065m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168064l);
                            f168065m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
