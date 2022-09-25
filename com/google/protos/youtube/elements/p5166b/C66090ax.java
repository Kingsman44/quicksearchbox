package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.b.ax */
/* compiled from: PG */
public final class C66090ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66090ax f179714c;

    /* renamed from: d */
    private static volatile C63010eb f179715d;

    /* renamed from: a */
    public int f179716a;

    /* renamed from: b */
    public String f179717b = BuildConfig.FLAVOR;

    static {
        C66090ax axVar = new C66090ax();
        f179714c = axVar;
        C62942bv.registerDefaultInstance(C66090ax.class, axVar);
    }

    private C66090ax() {
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
                return newMessageInfo(f179714c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66090ax();
            case 4:
                return new C66089aw();
            case 5:
                return f179714c;
            case 6:
                C63010eb ebVar = f179715d;
                if (ebVar == null) {
                    synchronized (C66090ax.class) {
                        ebVar = f179715d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179714c);
                            f179715d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
