package com.google.protos.youtube.elements;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.youtube.elements.ex */
/* compiled from: PG */
public final class C66237ex extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C66237ex f180114c;

    /* renamed from: d */
    public static final C62940bt f180115d;

    /* renamed from: g */
    private static volatile C63010eb f180116g;

    /* renamed from: a */
    public String f180117a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C66239ez f180118b;

    /* renamed from: e */
    private int f180119e;

    /* renamed from: f */
    private byte f180120f = 2;

    static {
        C66237ex exVar = new C66237ex();
        f180114c = exVar;
        C62942bv.registerDefaultInstance(C66237ex.class, exVar);
        f180115d = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, exVar, exVar, (C62958ce) null, 194114827, C63066gd.MESSAGE, C66237ex.class);
    }

    private C66237ex() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180120f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180120f = b;
                return null;
            case 2:
                return newMessageInfo(f180114c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C66237ex();
            case 4:
                return new C66236ew();
            case 5:
                return f180114c;
            case 6:
                C63010eb ebVar = f180116g;
                if (ebVar == null) {
                    synchronized (C66237ex.class) {
                        ebVar = f180116g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180114c);
                            f180116g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
