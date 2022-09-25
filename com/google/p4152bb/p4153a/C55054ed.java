package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ed */
/* compiled from: PG */
public final class C55054ed extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55054ed f144840b;

    /* renamed from: c */
    public static final C62940bt f144841c;

    /* renamed from: e */
    private static volatile C63010eb f144842e;

    /* renamed from: a */
    public String f144843a = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f144844d;

    static {
        C55054ed edVar = new C55054ed();
        f144840b = edVar;
        C62942bv.registerDefaultInstance(C55054ed.class, edVar);
        f144841c = C62942bv.newSingularGeneratedExtension(C55029df.f144771d, edVar, edVar, (C62958ce) null, 83487759, C63066gd.MESSAGE, C55054ed.class);
    }

    private C55054ed() {
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
                return newMessageInfo(f144840b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
            case 3:
                return new C55054ed();
            case 4:
                return new C55053ec();
            case 5:
                return f144840b;
            case 6:
                C63010eb ebVar = f144842e;
                if (ebVar == null) {
                    synchronized (C55054ed.class) {
                        ebVar = f144842e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144840b);
                            f144842e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
