package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.m */
/* compiled from: PG */
public final class C16763m extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16763m f49047e;

    /* renamed from: f */
    private static volatile C63010eb f49048f;

    /* renamed from: a */
    public int f49049a;

    /* renamed from: b */
    public int f49050b = 0;

    /* renamed from: c */
    public Object f49051c;

    /* renamed from: d */
    public String f49052d = BuildConfig.FLAVOR;

    static {
        C16763m mVar = new C16763m();
        f49047e = mVar;
        C62942bv.registerDefaultInstance(C16763m.class, mVar);
    }

    private C16763m() {
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
                return newMessageInfo(f49047e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ျ\u0000\u0003ွ\u0000\u0004့\u0000\u0005်\u0000", new Object[]{C45240c.f118157a, "b", "a", "d"});
            case 3:
                return new C16763m();
            case 4:
                return new C16762l();
            case 5:
                return f49047e;
            case 6:
                C63010eb ebVar = f49048f;
                if (ebVar == null) {
                    synchronized (C16763m.class) {
                        ebVar = f49048f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49047e);
                            f49048f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
