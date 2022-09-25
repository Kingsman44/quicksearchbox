package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.bc */
/* compiled from: PG */
public final class C14219bc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14219bc f43036c;

    /* renamed from: e */
    private static volatile C63010eb f43037e;

    /* renamed from: a */
    public int f43038a = 0;

    /* renamed from: b */
    public Object f43039b;

    /* renamed from: d */
    private byte f43040d = 2;

    static {
        C14219bc bcVar = new C14219bc();
        f43036c = bcVar;
        C62942bv.registerDefaultInstance(C14219bc.class, bcVar);
    }

    private C14219bc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43040d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43040d = b;
                return null;
            case 2:
                return newMessageInfo(f43036c, "\u0000\u0014\u0001\u0000\u0002\u001a\u0014\u0000\u0000\u0002\u0002<\u0000\u0003<\u0000\u0004м\u0000\u0006<\u0000\t<\u0000\n<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016м\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000", new Object[]{"b", "a", C14340fp.class, C14344ft.class, C14536mw.class, C14523mj.class, C14280dj.class, C14624qc.class, C14296dz.class, C14294dx.class, C14544nd.class, C14530mq.class, C14237bu.class, C14327fc.class, C14313ep.class, C14311en.class, C14325fa.class, C14213ax.class, C14336fl.class, C14305eh.class, C14200ak.class, C14226bj.class});
            case 3:
                return new C14219bc();
            case 4:
                return new C14217ba();
            case 5:
                return f43036c;
            case 6:
                C63010eb ebVar = f43037e;
                if (ebVar == null) {
                    synchronized (C14219bc.class) {
                        ebVar = f43037e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43036c);
                            f43037e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
