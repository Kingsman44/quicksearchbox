package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.r */
/* compiled from: PG */
public final class C122463r extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C122463r f339493g;

    /* renamed from: h */
    private static volatile C63010eb f339494h;

    /* renamed from: a */
    public boolean f339495a;

    /* renamed from: b */
    public C122465t f339496b;

    /* renamed from: c */
    public boolean f339497c;

    /* renamed from: d */
    public C29690f f339498d;

    /* renamed from: e */
    public boolean f339499e;

    /* renamed from: f */
    public boolean f339500f;

    static {
        C122463r rVar = new C122463r();
        f339493g = rVar;
        C62942bv.registerDefaultInstance(C122463r.class, rVar);
    }

    private C122463r() {
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
                return newMessageInfo(f339493g, "\u0000\u0006\u0000\u0000\f\u0014\u0006\u0000\u0000\u0000\f\t\r\u0007\u000e\t\u0012\u0007\u0013\u0007\u0014\u0007", new Object[]{"b", C45240c.f118157a, "d", "a", "e", C10662f.f35572a});
            case 3:
                return new C122463r();
            case 4:
                return new C122462q();
            case 5:
                return f339493g;
            case 6:
                C63010eb ebVar = f339494h;
                if (ebVar == null) {
                    synchronized (C122463r.class) {
                        ebVar = f339494h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f339493g);
                            f339494h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
