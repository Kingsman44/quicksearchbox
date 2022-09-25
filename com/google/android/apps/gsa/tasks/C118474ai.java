package com.google.android.apps.gsa.tasks;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.ai */
/* compiled from: PG */
public final class C118474ai extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C118474ai f328830g;

    /* renamed from: h */
    private static volatile C63010eb f328831h;

    /* renamed from: a */
    public int f328832a;

    /* renamed from: b */
    public long f328833b;

    /* renamed from: c */
    public int f328834c;

    /* renamed from: d */
    public boolean f328835d;

    /* renamed from: e */
    public boolean f328836e;

    /* renamed from: f */
    public boolean f328837f = true;

    static {
        C118474ai aiVar = new C118474ai();
        f328830g = aiVar;
        C62942bv.registerDefaultInstance(C118474ai.class, aiVar);
    }

    private C118474ai() {
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
                return newMessageInfo(f328830g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, C118469ad.f328818a, "d", "e", C10662f.f35572a});
            case 3:
                return new C118474ai();
            case 4:
                return new C118473ah();
            case 5:
                return f328830g;
            case 6:
                C63010eb ebVar = f328831h;
                if (ebVar == null) {
                    synchronized (C118474ai.class) {
                        ebVar = f328831h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328830g);
                            f328831h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
