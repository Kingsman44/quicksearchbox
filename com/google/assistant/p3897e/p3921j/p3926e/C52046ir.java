package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ir */
/* compiled from: PG */
public final class C52046ir extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52046ir f136598g;

    /* renamed from: h */
    private static volatile C63010eb f136599h;

    /* renamed from: a */
    public int f136600a;

    /* renamed from: b */
    public int f136601b = 0;

    /* renamed from: c */
    public Object f136602c;

    /* renamed from: d */
    public int f136603d;

    /* renamed from: e */
    public String f136604e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f136605f = BuildConfig.FLAVOR;

    static {
        C52046ir irVar = new C52046ir();
        f136598g = irVar;
        C62942bv.registerDefaultInstance(C52046ir.class, irVar);
    }

    private C52046ir() {
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
                return newMessageInfo(f136598g, "\u0001\u0004\u0001\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ျ\u0000\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{C45240c.f118157a, "b", "a", "d", C52044ip.f136597a, "e", C10662f.f35572a});
            case 3:
                return new C52046ir();
            case 4:
                return new C52043io();
            case 5:
                return f136598g;
            case 6:
                C63010eb ebVar = f136599h;
                if (ebVar == null) {
                    synchronized (C52046ir.class) {
                        ebVar = f136599h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136598g);
                            f136599h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
