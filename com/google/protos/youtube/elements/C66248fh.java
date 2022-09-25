package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.fh */
/* compiled from: PG */
public final class C66248fh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66248fh f180140c;

    /* renamed from: d */
    public static final C62940bt f180141d;

    /* renamed from: e */
    private static volatile C63010eb f180142e;

    /* renamed from: a */
    public int f180143a;

    /* renamed from: b */
    public String f180144b = BuildConfig.FLAVOR;

    static {
        C66248fh fhVar = new C66248fh();
        f180140c = fhVar;
        C62942bv.registerDefaultInstance(C66248fh.class, fhVar);
        f180141d = C62942bv.newSingularGeneratedExtension(C66232es.f180105a, fhVar, fhVar, (C62958ce) null, 172035250, C63066gd.MESSAGE, C66248fh.class);
    }

    private C66248fh() {
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
                return newMessageInfo(f180140c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66248fh();
            case 4:
                return new C66247fg();
            case 5:
                return f180140c;
            case 6:
                C63010eb ebVar = f180142e;
                if (ebVar == null) {
                    synchronized (C66248fh.class) {
                        ebVar = f180142e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180140c);
                            f180142e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
