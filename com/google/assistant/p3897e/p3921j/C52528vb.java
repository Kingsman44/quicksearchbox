package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.vb */
/* compiled from: PG */
public final class C52528vb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52528vb f137879b;

    /* renamed from: d */
    private static volatile C63010eb f137880d;

    /* renamed from: a */
    public String f137881a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f137882c;

    static {
        C52528vb vbVar = new C52528vb();
        f137879b = vbVar;
        C62942bv.registerDefaultInstance(C52528vb.class, vbVar);
    }

    private C52528vb() {
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
                return newMessageInfo(f137879b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52528vb();
            case 4:
                return new C52527va();
            case 5:
                return f137879b;
            case 6:
                C63010eb ebVar = f137880d;
                if (ebVar == null) {
                    synchronized (C52528vb.class) {
                        ebVar = f137880d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137879b);
                            f137880d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
