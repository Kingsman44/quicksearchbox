package com.google.protos.youtube.elements.p5166b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66208dv;

/* renamed from: com.google.protos.youtube.elements.b.d */
/* compiled from: PG */
public final class C66099d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66099d f179742c;

    /* renamed from: d */
    public static final C62940bt f179743d;

    /* renamed from: e */
    private static volatile C63010eb f179744e;

    /* renamed from: a */
    public int f179745a;

    /* renamed from: b */
    public String f179746b = BuildConfig.FLAVOR;

    static {
        C66099d dVar = new C66099d();
        f179742c = dVar;
        C62942bv.registerDefaultInstance(C66099d.class, dVar);
        f179743d = C62942bv.newSingularGeneratedExtension(C66208dv.f180040a, dVar, dVar, (C62958ce) null, 284051629, C63066gd.MESSAGE, C66099d.class);
    }

    private C66099d() {
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
                return newMessageInfo(f179742c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C66099d();
            case 4:
                return new C66098c();
            case 5:
                return f179742c;
            case 6:
                C63010eb ebVar = f179744e;
                if (ebVar == null) {
                    synchronized (C66099d.class) {
                        ebVar = f179744e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179742c);
                            f179744e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
