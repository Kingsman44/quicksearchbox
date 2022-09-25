package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.al */
/* compiled from: PG */
public final class C124441al extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C124441al f343439b;

    /* renamed from: d */
    private static volatile C63010eb f343440d;

    /* renamed from: a */
    public String f343441a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f343442c;

    static {
        C124441al alVar = new C124441al();
        f343439b = alVar;
        C62942bv.registerDefaultInstance(C124441al.class, alVar);
    }

    private C124441al() {
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
                return newMessageInfo(f343439b, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ለ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C124441al();
            case 4:
                return new C124440ak();
            case 5:
                return f343439b;
            case 6:
                C63010eb ebVar = f343440d;
                if (ebVar == null) {
                    synchronized (C124441al.class) {
                        ebVar = f343440d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343439b);
                            f343440d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
