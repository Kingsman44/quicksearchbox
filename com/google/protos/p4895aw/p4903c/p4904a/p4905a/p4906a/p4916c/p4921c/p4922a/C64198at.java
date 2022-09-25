package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

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

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.at */
/* compiled from: PG */
public final class C64198at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C64198at f173576g;

    /* renamed from: h */
    public static final C62940bt f173577h;

    /* renamed from: j */
    private static volatile C63010eb f173578j;

    /* renamed from: a */
    public int f173579a;

    /* renamed from: b */
    public boolean f173580b;

    /* renamed from: c */
    public CommandOuterClass$Command f173581c;

    /* renamed from: d */
    public CommandOuterClass$Command f173582d;

    /* renamed from: e */
    public String f173583e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f173584f = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f173585i = 2;

    static {
        C64198at atVar = new C64198at();
        f173576g = atVar;
        C62942bv.registerDefaultInstance(C64198at.class, atVar);
        f173577h = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, atVar, atVar, (C62958ce) null, 308676108, C63066gd.MESSAGE, C64198at.class);
    }

    private C64198at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173585i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173585i = b;
                return null;
            case 2:
                return newMessageInfo(f173576g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဈ\u0004\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, "e"});
            case 3:
                return new C64198at();
            case 4:
                return new C64197as();
            case 5:
                return f173576g;
            case 6:
                C63010eb ebVar = f173578j;
                if (ebVar == null) {
                    synchronized (C64198at.class) {
                        ebVar = f173578j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173576g);
                            f173578j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
