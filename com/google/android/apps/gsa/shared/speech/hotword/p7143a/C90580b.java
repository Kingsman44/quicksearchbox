package com.google.android.apps.gsa.shared.speech.hotword.p7143a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.a.b */
/* compiled from: PG */
public final class C90580b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C90580b f253237g;

    /* renamed from: h */
    private static volatile C63010eb f253238h;

    /* renamed from: a */
    public int f253239a;

    /* renamed from: b */
    public String f253240b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f253241c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f253242d = "Ok Google";

    /* renamed from: e */
    public boolean f253243e;

    /* renamed from: f */
    public int f253244f;

    static {
        C90580b bVar = new C90580b();
        f253237g = bVar;
        C62942bv.registerDefaultInstance(C90580b.class, bVar);
    }

    private C90580b() {
        C62942bv.emptyProtobufList();
        this.f253244f = 1;
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
                return newMessageInfo(f253237g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C90584f.m147801b()});
            case 3:
                return new C90580b();
            case 4:
                return new C90579a();
            case 5:
                return f253237g;
            case 6:
                C63010eb ebVar = f253238h;
                if (ebVar == null) {
                    synchronized (C90580b.class) {
                        ebVar = f253238h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f253237g);
                            f253238h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
