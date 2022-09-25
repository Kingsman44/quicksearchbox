package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.v */
/* compiled from: PG */
public final class C10277v extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C10277v f34824h;

    /* renamed from: i */
    private static volatile C63010eb f34825i;

    /* renamed from: a */
    public int f34826a;

    /* renamed from: b */
    public int f34827b = 0;

    /* renamed from: c */
    public Object f34828c;

    /* renamed from: d */
    public C49838aw f34829d;

    /* renamed from: e */
    public C49826ak f34830e;

    /* renamed from: f */
    public int f34831f;

    /* renamed from: g */
    public long f34832g;

    static {
        C10277v vVar = new C10277v();
        f34824h = vVar;
        C62942bv.registerDefaultInstance(C10277v.class, vVar);
    }

    private C10277v() {
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
                return newMessageInfo(f34824h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ျ\u0000\u0004ဌ\u0004\u0005ဂ\u0005\u0006ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C10275t.f34823a, C30325g.f82003a});
            case 3:
                return new C10277v();
            case 4:
                return new C10274s();
            case 5:
                return f34824h;
            case 6:
                C63010eb ebVar = f34825i;
                if (ebVar == null) {
                    synchronized (C10277v.class) {
                        ebVar = f34825i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34824h);
                            f34825i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
