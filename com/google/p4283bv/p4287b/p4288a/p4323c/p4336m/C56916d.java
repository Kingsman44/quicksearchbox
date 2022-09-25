package com.google.p4283bv.p4287b.p4288a.p4323c.p4336m;

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

/* renamed from: com.google.bv.b.a.c.m.d */
/* compiled from: PG */
public final class C56916d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56916d f151892c;

    /* renamed from: d */
    public static final C62940bt f151893d;

    /* renamed from: e */
    private static volatile C63010eb f151894e;

    /* renamed from: a */
    public int f151895a;

    /* renamed from: b */
    public String f151896b = BuildConfig.FLAVOR;

    static {
        C56916d dVar = new C56916d();
        f151892c = dVar;
        C62942bv.registerDefaultInstance(C56916d.class, dVar);
        f151893d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 353237195, C63066gd.MESSAGE, C56916d.class);
    }

    private C56916d() {
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
                return newMessageInfo(f151892c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56916d();
            case 4:
                return new C56915c();
            case 5:
                return f151892c;
            case 6:
                C63010eb ebVar = f151894e;
                if (ebVar == null) {
                    synchronized (C56916d.class) {
                        ebVar = f151894e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151892c);
                            f151894e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
