package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.b.c.i */
/* compiled from: PG */
public final class C17064i extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C17064i f49673f;

    /* renamed from: h */
    private static volatile C63010eb f49674h;

    /* renamed from: a */
    public int f49675a;

    /* renamed from: b */
    public C17036ac f49676b;

    /* renamed from: c */
    public String f49677c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f49678d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C28716av f49679e;

    /* renamed from: g */
    private byte f49680g = 2;

    static {
        C17064i iVar = new C17064i();
        f49673f = iVar;
        C62942bv.registerDefaultInstance(C17064i.class, iVar);
    }

    private C17064i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49680g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49680g = b;
                return null;
            case 2:
                return newMessageInfo(f49673f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C17064i();
            case 4:
                return new C17063h();
            case 5:
                return f49673f;
            case 6:
                C63010eb ebVar = f49674h;
                if (ebVar == null) {
                    synchronized (C17064i.class) {
                        ebVar = f49674h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49673f);
                            f49674h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
