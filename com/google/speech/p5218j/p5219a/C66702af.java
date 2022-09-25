package com.google.speech.p5218j.p5219a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.af */
/* compiled from: PG */
public final class C66702af extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C66702af f181445c;

    /* renamed from: e */
    private static volatile C63010eb f181446e;

    /* renamed from: a */
    public int f181447a;

    /* renamed from: b */
    public String f181448b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private byte f181449d = 2;

    static {
        C66702af afVar = new C66702af();
        f181445c = afVar;
        C62942bv.registerDefaultInstance(C66702af.class, afVar);
    }

    private C66702af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181449d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181449d = b;
                return null;
            case 2:
                return newMessageInfo(f181445c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66702af();
            case 4:
                return new C66701ae();
            case 5:
                return f181445c;
            case 6:
                C63010eb ebVar = f181446e;
                if (ebVar == null) {
                    synchronized (C66702af.class) {
                        ebVar = f181446e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181445c);
                            f181446e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
