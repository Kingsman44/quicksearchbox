package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5048z.p5051b.p5052a.C65399a;

/* renamed from: com.google.bb.a.ey */
/* compiled from: PG */
public final class C55075ey extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55075ey f144886c;

    /* renamed from: e */
    private static volatile C63010eb f144887e;

    /* renamed from: a */
    public int f144888a;

    /* renamed from: b */
    public String f144889b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f144890d;

    static {
        C55075ey eyVar = new C55075ey();
        f144886c = eyVar;
        C62942bv.registerDefaultInstance(C55075ey.class, eyVar);
    }

    private C55075ey() {
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
                return newMessageInfo(f144886c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C65399a.f177816a, "b"});
            case 3:
                return new C55075ey();
            case 4:
                return new C55074ex();
            case 5:
                return f144886c;
            case 6:
                C63010eb ebVar = f144887e;
                if (ebVar == null) {
                    synchronized (C55075ey.class) {
                        ebVar = f144887e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144886c);
                            f144887e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
