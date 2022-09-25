package com.google.android.apps.search.assistant.platform.pcp.p9326c;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.c.b */
/* compiled from: PG */
public final class C123651b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C123651b f341596e;

    /* renamed from: h */
    private static volatile C63010eb f341597h;

    /* renamed from: a */
    public int f341598a;

    /* renamed from: b */
    public C62961ch f341599b = emptyIntList();

    /* renamed from: c */
    public boolean f341600c;

    /* renamed from: d */
    public C123755bv f341601d;

    /* renamed from: f */
    private int f341602f;

    /* renamed from: g */
    private byte f341603g = 2;

    static {
        C123651b bVar = new C123651b();
        f341596e = bVar;
        C62942bv.registerDefaultInstance(C123651b.class, bVar);
    }

    private C123651b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341603g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341603g = b;
                return null;
            case 2:
                return newMessageInfo(f341596e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဌ\u0000\u0002\u0016\u0003ဇ\u0001\u0004ᐉ\u0002", new Object[]{C10662f.f35572a, "a", C53306j.m86810b(), "b", C45240c.f118157a, "d"});
            case 3:
                return new C123651b();
            case 4:
                return new C123650a();
            case 5:
                return f341596e;
            case 6:
                C63010eb ebVar = f341597h;
                if (ebVar == null) {
                    synchronized (C123651b.class) {
                        ebVar = f341597h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341596e);
                            f341597h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
