package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.oy */
/* compiled from: PG */
public final class C88094oy extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C88094oy f238174g;

    /* renamed from: h */
    private static volatile C63010eb f238175h;

    /* renamed from: a */
    public int f238176a;

    /* renamed from: b */
    public C63088z f238177b = C63088z.f170246b;

    /* renamed from: c */
    public int f238178c;

    /* renamed from: d */
    public String f238179d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C63088z f238180e = C63088z.f170246b;

    /* renamed from: f */
    public int f238181f;

    static {
        C88094oy oyVar = new C88094oy();
        f238174g = oyVar;
        C62942bv.registerDefaultInstance(C88094oy.class, oyVar);
    }

    private C88094oy() {
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
                return newMessageInfo(f238174g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C51209d.m86087b()});
            case 3:
                return new C88094oy();
            case 4:
                return new C88093ox();
            case 5:
                return f238174g;
            case 6:
                C63010eb ebVar = f238175h;
                if (ebVar == null) {
                    synchronized (C88094oy.class) {
                        ebVar = f238175h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238174g);
                            f238175h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
