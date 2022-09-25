package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.dr */
/* compiled from: PG */
public final class C66204dr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66204dr f180028c;

    /* renamed from: d */
    public static final C62940bt f180029d;

    /* renamed from: g */
    private static volatile C63010eb f180030g;

    /* renamed from: a */
    public String f180031a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public CommandOuterClass$Command f180032b;

    /* renamed from: e */
    private int f180033e;

    /* renamed from: f */
    private byte f180034f = 2;

    static {
        C66204dr drVar = new C66204dr();
        f180028c = drVar;
        C62942bv.registerDefaultInstance(C66204dr.class, drVar);
        f180029d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, drVar, drVar, (C62958ce) null, 325347951, C63066gd.MESSAGE, C66204dr.class);
    }

    private C66204dr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180034f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180034f = b;
                return null;
            case 2:
                return newMessageInfo(f180028c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C66204dr();
            case 4:
                return new C66203dq();
            case 5:
                return f180028c;
            case 6:
                C63010eb ebVar = f180030g;
                if (ebVar == null) {
                    synchronized (C66204dr.class) {
                        ebVar = f180030g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180028c);
                            f180030g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
