package com.google.android.apps.search.assistant.surfaces.roti.home;

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
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bh */
/* compiled from: PG */
public final class C126797bh extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C126797bh f349177j;

    /* renamed from: k */
    private static volatile C63010eb f349178k;

    /* renamed from: a */
    public int f349179a;

    /* renamed from: b */
    public String f349180b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f349181c;

    /* renamed from: d */
    public String f349182d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62961ch f349183e = emptyIntList();

    /* renamed from: f */
    public C126843d f349184f;

    /* renamed from: g */
    public C63042fg f349185g;

    /* renamed from: h */
    public boolean f349186h;

    /* renamed from: i */
    public boolean f349187i;

    static {
        C126797bh bhVar = new C126797bh();
        f349177j = bhVar;
        C62942bv.registerDefaultInstance(C126797bh.class, bhVar);
    }

    private C126797bh() {
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
                return newMessageInfo(f349177j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004'\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C126797bh();
            case 4:
                return new C126796bg();
            case 5:
                return f349177j;
            case 6:
                C63010eb ebVar = f349178k;
                if (ebVar == null) {
                    synchronized (C126797bh.class) {
                        ebVar = f349178k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f349177j);
                            f349178k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
