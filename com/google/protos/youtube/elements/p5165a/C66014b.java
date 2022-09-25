package com.google.protos.youtube.elements.p5165a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.a.b */
/* compiled from: PG */
public final class C66014b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66014b f179527c;

    /* renamed from: d */
    public static final C62940bt f179528d;

    /* renamed from: e */
    private static volatile C63010eb f179529e;

    /* renamed from: a */
    public int f179530a;

    /* renamed from: b */
    public String f179531b = BuildConfig.FLAVOR;

    static {
        C66014b bVar = new C66014b();
        f179527c = bVar;
        C62942bv.registerDefaultInstance(C66014b.class, bVar);
        f179528d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 362128797, C63066gd.MESSAGE, C66014b.class);
    }

    private C66014b() {
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
                return newMessageInfo(f179527c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66014b();
            case 4:
                return new C66013a();
            case 5:
                return f179527c;
            case 6:
                C63010eb ebVar = f179529e;
                if (ebVar == null) {
                    synchronized (C66014b.class) {
                        ebVar = f179529e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179527c);
                            f179529e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
