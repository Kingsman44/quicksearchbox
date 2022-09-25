package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ft */
/* compiled from: PG */
public final class C59792ft extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C59792ft f161561h;

    /* renamed from: i */
    private static volatile C63010eb f161562i;

    /* renamed from: a */
    public int f161563a;

    /* renamed from: b */
    public int f161564b;

    /* renamed from: c */
    public String f161565c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f161566d;

    /* renamed from: e */
    public int f161567e;

    /* renamed from: f */
    public int f161568f;

    /* renamed from: g */
    public C62971cq f161569g = emptyProtobufList();

    static {
        C59792ft ftVar = new C59792ft();
        f161561h = ftVar;
        C62942bv.registerDefaultInstance(C59792ft.class, ftVar);
    }

    private C59792ft() {
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
                return newMessageInfo(f161561h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0001\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဋ\u0005\u0006\u001b\u0007ဋ\u0004", new Object[]{"a", "b", C59791fs.m92506b(), C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, C59788fp.class, "e"});
            case 3:
                return new C59792ft();
            case 4:
                return new C59789fq();
            case 5:
                return f161561h;
            case 6:
                C63010eb ebVar = f161562i;
                if (ebVar == null) {
                    synchronized (C59792ft.class) {
                        ebVar = f161562i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161561h);
                            f161562i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
