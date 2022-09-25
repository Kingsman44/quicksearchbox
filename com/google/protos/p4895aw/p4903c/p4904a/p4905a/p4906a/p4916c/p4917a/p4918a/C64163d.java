package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.a.a.d */
/* compiled from: PG */
public final class C64163d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64163d f173474d;

    /* renamed from: e */
    public static final C62940bt f173475e;

    /* renamed from: g */
    private static volatile C63010eb f173476g;

    /* renamed from: a */
    public int f173477a;

    /* renamed from: b */
    public C51805du f173478b;

    /* renamed from: c */
    public C87741bw f173479c;

    /* renamed from: f */
    private byte f173480f = 2;

    static {
        C64163d dVar = new C64163d();
        f173474d = dVar;
        C62942bv.registerDefaultInstance(C64163d.class, dVar);
        f173475e = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 250588061, C63066gd.MESSAGE, C64163d.class);
    }

    private C64163d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173480f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173480f = b;
                return null;
            case 2:
                return newMessageInfo(f173474d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64163d();
            case 4:
                return new C64162c();
            case 5:
                return f173474d;
            case 6:
                C63010eb ebVar = f173476g;
                if (ebVar == null) {
                    synchronized (C64163d.class) {
                        ebVar = f173476g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173474d);
                            f173476g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
