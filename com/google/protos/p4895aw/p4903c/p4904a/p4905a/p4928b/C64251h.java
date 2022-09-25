package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4928b;

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

/* renamed from: com.google.protos.aw.c.a.a.b.h */
/* compiled from: PG */
public final class C64251h extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64251h f173721g;

    /* renamed from: h */
    public static final C62940bt f173722h;

    /* renamed from: j */
    private static volatile C63010eb f173723j;

    /* renamed from: a */
    public int f173724a;

    /* renamed from: b */
    public String f173725b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f173726c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f173727d;

    /* renamed from: e */
    public CommandOuterClass$Command f173728e;

    /* renamed from: f */
    public CommandOuterClass$Command f173729f;

    /* renamed from: i */
    private byte f173730i = 2;

    static {
        C64251h hVar = new C64251h();
        f173721g = hVar;
        C62942bv.registerDefaultInstance(C64251h.class, hVar);
        f173722h = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, hVar, hVar, (C62958ce) null, 232159216, C63066gd.MESSAGE, C64251h.class);
    }

    private C64251h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173730i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173730i = b;
                return null;
            case 2:
                return newMessageInfo(f173721g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C64249f.f173720a, "e", C10662f.f35572a});
            case 3:
                return new C64251h();
            case 4:
                return new C64248e();
            case 5:
                return f173721g;
            case 6:
                C63010eb ebVar = f173723j;
                if (ebVar == null) {
                    synchronized (C64251h.class) {
                        ebVar = f173723j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173721g);
                            f173723j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
