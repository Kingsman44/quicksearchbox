package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a;

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

/* renamed from: com.google.protos.aw.c.a.a.a.c.a.a.j */
/* compiled from: PG */
public final class C64169j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64169j f173494b;

    /* renamed from: c */
    public static final C62940bt f173495c;

    /* renamed from: e */
    private static volatile C63010eb f173496e;

    /* renamed from: a */
    public String f173497a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f173498d;

    static {
        C64169j jVar = new C64169j();
        f173494b = jVar;
        C62942bv.registerDefaultInstance(C64169j.class, jVar);
        f173495c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, jVar, jVar, (C62958ce) null, 277091159, C63066gd.MESSAGE, C64169j.class);
    }

    private C64169j() {
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
                return newMessageInfo(f173494b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64169j();
            case 4:
                return new C64168i();
            case 5:
                return f173494b;
            case 6:
                C63010eb ebVar = f173496e;
                if (ebVar == null) {
                    synchronized (C64169j.class) {
                        ebVar = f173496e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173494b);
                            f173496e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
