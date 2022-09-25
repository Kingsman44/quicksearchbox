package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9810d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.d.f */
/* compiled from: PG */
public final class C129364f extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C129364f f355269f;

    /* renamed from: g */
    private static volatile C63010eb f355270g;

    /* renamed from: a */
    public int f355271a;

    /* renamed from: b */
    public String f355272b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f355273c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f355274d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f355275e = BuildConfig.FLAVOR;

    static {
        C129364f fVar = new C129364f();
        f355269f = fVar;
        C62942bv.registerDefaultInstance(C129364f.class, fVar);
    }

    private C129364f() {
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
                return newMessageInfo(f355269f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C129364f();
            case 4:
                return new C129363e();
            case 5:
                return f355269f;
            case 6:
                C63010eb ebVar = f355270g;
                if (ebVar == null) {
                    synchronized (C129364f.class) {
                        ebVar = f355270g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f355269f);
                            f355270g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
