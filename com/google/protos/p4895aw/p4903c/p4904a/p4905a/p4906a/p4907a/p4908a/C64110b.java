package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4908a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.a.a.b */
/* compiled from: PG */
public final class C64110b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64110b f173321g;

    /* renamed from: h */
    public static final C62940bt f173322h;

    /* renamed from: i */
    private static volatile C63010eb f173323i;

    /* renamed from: a */
    public int f173324a;

    /* renamed from: b */
    public int f173325b = 0;

    /* renamed from: c */
    public Object f173326c;

    /* renamed from: d */
    public String f173327d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f173328e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f173329f = BuildConfig.FLAVOR;

    static {
        C64110b bVar = new C64110b();
        f173321g = bVar;
        C62942bv.registerDefaultInstance(C64110b.class, bVar);
        f173322h = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 280742764, C63066gd.MESSAGE, C64110b.class);
    }

    private C64110b() {
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
                return newMessageInfo(f173321g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ျ\u0000\u0004ဈ\u0004\u0006ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a});
            case 3:
                return new C64110b();
            case 4:
                return new C64109a();
            case 5:
                return f173321g;
            case 6:
                C63010eb ebVar = f173323i;
                if (ebVar == null) {
                    synchronized (C64110b.class) {
                        ebVar = f173323i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173321g);
                            f173323i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
