package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34093db;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.d */
/* compiled from: PG */
public final class C127617d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C127617d f351336e;

    /* renamed from: g */
    private static volatile C63010eb f351337g;

    /* renamed from: a */
    public int f351338a;

    /* renamed from: b */
    public String f351339b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C34065ca f351340c;

    /* renamed from: d */
    public C34093db f351341d;

    /* renamed from: f */
    private byte f351342f = 2;

    static {
        C127617d dVar = new C127617d();
        f351336e = dVar;
        C62942bv.registerDefaultInstance(C127617d.class, dVar);
    }

    private C127617d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f351342f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f351342f = b;
                return null;
            case 2:
                return newMessageInfo(f351336e, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ለ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C127617d();
            case 4:
                return new C127616c();
            case 5:
                return f351336e;
            case 6:
                C63010eb ebVar = f351337g;
                if (ebVar == null) {
                    synchronized (C127617d.class) {
                        ebVar = f351337g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351336e);
                            f351337g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
