package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.p */
/* compiled from: PG */
public final class C129965p extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C129965p f356456i;

    /* renamed from: j */
    private static volatile C63010eb f356457j;

    /* renamed from: a */
    public int f356458a;

    /* renamed from: b */
    public String f356459b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f356460c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f356461d;

    /* renamed from: e */
    public String f356462e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f356463f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f356464g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f356465h = BuildConfig.FLAVOR;

    static {
        C129965p pVar = new C129965p();
        f356456i = pVar;
        C62942bv.registerDefaultInstance(C129965p.class, pVar);
    }

    private C129965p() {
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
                return newMessageInfo(f356456i, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဇ\u0000\u0004ለ\u0001\u0005ለ\u0002\u0006ለ\u0003\u0007ለ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C129965p();
            case 4:
                return new C129964o();
            case 5:
                return f356456i;
            case 6:
                C63010eb ebVar = f356457j;
                if (ebVar == null) {
                    synchronized (C129965p.class) {
                        ebVar = f356457j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356456i);
                            f356457j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
