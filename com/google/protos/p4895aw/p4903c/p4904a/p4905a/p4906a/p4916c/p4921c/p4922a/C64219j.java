package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.p4283bv.p4354e.p4356b.p4358b.p4359a.C57091f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.j */
/* compiled from: PG */
public final class C64219j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64219j f173636b;

    /* renamed from: c */
    public static final C62940bt f173637c;

    /* renamed from: f */
    private static volatile C63010eb f173638f;

    /* renamed from: a */
    public C57091f f173639a;

    /* renamed from: d */
    private int f173640d;

    /* renamed from: e */
    private byte f173641e = 2;

    static {
        C64219j jVar = new C64219j();
        f173636b = jVar;
        C62942bv.registerDefaultInstance(C64219j.class, jVar);
        f173637c = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, jVar, jVar, (C62958ce) null, 275112716, C63066gd.MESSAGE, C64219j.class);
    }

    private C64219j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173641e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173641e = b;
                return null;
            case 2:
                return newMessageInfo(f173636b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64219j();
            case 4:
                return new C64218i();
            case 5:
                return f173636b;
            case 6:
                C63010eb ebVar = f173638f;
                if (ebVar == null) {
                    synchronized (C64219j.class) {
                        ebVar = f173638f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173636b);
                            f173638f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
