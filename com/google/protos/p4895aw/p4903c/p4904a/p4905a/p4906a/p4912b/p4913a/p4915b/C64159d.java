package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4915b;

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

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.b.d */
/* compiled from: PG */
public final class C64159d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64159d f173466c;

    /* renamed from: d */
    public static final C62940bt f173467d;

    /* renamed from: e */
    private static volatile C63010eb f173468e;

    /* renamed from: a */
    public int f173469a;

    /* renamed from: b */
    public String f173470b = BuildConfig.FLAVOR;

    static {
        C64159d dVar = new C64159d();
        f173466c = dVar;
        C62942bv.registerDefaultInstance(C64159d.class, dVar);
        f173467d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 391562483, C63066gd.MESSAGE, C64159d.class);
    }

    private C64159d() {
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
                return newMessageInfo(f173466c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64159d();
            case 4:
                return new C64158c();
            case 5:
                return f173466c;
            case 6:
                C63010eb ebVar = f173468e;
                if (ebVar == null) {
                    synchronized (C64159d.class) {
                        ebVar = f173468e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173466c);
                            f173468e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
