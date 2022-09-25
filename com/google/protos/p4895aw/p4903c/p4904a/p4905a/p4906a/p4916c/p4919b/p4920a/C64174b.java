package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b.p4920a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.b.a.b */
/* compiled from: PG */
public final class C64174b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64174b f173508d;

    /* renamed from: e */
    public static final C62940bt f173509e;

    /* renamed from: f */
    private static volatile C63010eb f173510f;

    /* renamed from: a */
    public int f173511a;

    /* renamed from: b */
    public C63088z f173512b = C63088z.f170246b;

    /* renamed from: c */
    public String f173513c = BuildConfig.FLAVOR;

    static {
        C64174b bVar = new C64174b();
        f173508d = bVar;
        C62942bv.registerDefaultInstance(C64174b.class, bVar);
        f173509e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 428778015, C63066gd.MESSAGE, C64174b.class);
    }

    private C64174b() {
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
                return newMessageInfo(f173508d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64174b();
            case 4:
                return new C64173a();
            case 5:
                return f173508d;
            case 6:
                C63010eb ebVar = f173510f;
                if (ebVar == null) {
                    synchronized (C64174b.class) {
                        ebVar = f173510f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173508d);
                            f173510f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
