package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahh */
/* compiled from: PG */
public final class ahh extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final ahh f129301g;

    /* renamed from: h */
    private static volatile C63010eb f129302h;

    /* renamed from: a */
    public int f129303a;

    /* renamed from: b */
    public int f129304b;

    /* renamed from: c */
    public String f129305c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public ahf f129306d;

    /* renamed from: e */
    public boolean f129307e;

    /* renamed from: f */
    public boolean f129308f;

    static {
        ahh ahh = new ahh();
        f129301g = ahh;
        C62942bv.registerDefaultInstance(ahh.class, ahh);
    }

    private ahh() {
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
                return newMessageInfo(f129301g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new ahh();
            case 4:
                return new ahg();
            case 5:
                return f129301g;
            case 6:
                C63010eb ebVar = f129302h;
                if (ebVar == null) {
                    synchronized (ahh.class) {
                        ebVar = f129302h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129301g);
                            f129302h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
