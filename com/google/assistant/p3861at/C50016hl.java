package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.hl */
/* compiled from: PG */
public final class C50016hl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50016hl f130026e;

    /* renamed from: g */
    private static volatile C63010eb f130027g;

    /* renamed from: a */
    public String f130028a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f130029b;

    /* renamed from: c */
    public boolean f130030c;

    /* renamed from: d */
    public boolean f130031d;

    /* renamed from: f */
    private int f130032f;

    static {
        C50016hl hlVar = new C50016hl();
        f130026e = hlVar;
        C62942bv.registerDefaultInstance(C50016hl.class, hlVar);
    }

    private C50016hl() {
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
                return newMessageInfo(f130026e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဇ\u0001\u0004ဈ\u0000\u0005ဇ\u0002\u0006ဇ\u0004", new Object[]{C10662f.f35572a, "b", "a", C45240c.f118157a, "d"});
            case 3:
                return new C50016hl();
            case 4:
                return new C50015hk();
            case 5:
                return f130026e;
            case 6:
                C63010eb ebVar = f130027g;
                if (ebVar == null) {
                    synchronized (C50016hl.class) {
                        ebVar = f130027g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130026e);
                            f130027g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
