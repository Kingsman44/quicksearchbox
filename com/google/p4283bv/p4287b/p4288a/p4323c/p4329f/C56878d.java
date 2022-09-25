package com.google.p4283bv.p4287b.p4288a.p4323c.p4329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4303h.C56700f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.f.d */
/* compiled from: PG */
public final class C56878d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C56878d f151763f;

    /* renamed from: g */
    public static final C62940bt f151764g;

    /* renamed from: i */
    private static volatile C63010eb f151765i;

    /* renamed from: a */
    public int f151766a;

    /* renamed from: b */
    public String f151767b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f151768c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f151769d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56700f f151770e;

    /* renamed from: h */
    private byte f151771h = 2;

    static {
        C56878d dVar = new C56878d();
        f151763f = dVar;
        C62942bv.registerDefaultInstance(C56878d.class, dVar);
        f151764g = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 324682007, C63066gd.MESSAGE, C56878d.class);
    }

    private C56878d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151771h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151771h = b;
                return null;
            case 2:
                return newMessageInfo(f151763f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C56878d();
            case 4:
                return new C56877c();
            case 5:
                return f151763f;
            case 6:
                C63010eb ebVar = f151765i;
                if (ebVar == null) {
                    synchronized (C56878d.class) {
                        ebVar = f151765i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151763f);
                            f151765i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
