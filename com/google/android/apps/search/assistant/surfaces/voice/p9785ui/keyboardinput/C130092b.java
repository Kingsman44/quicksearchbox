package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.b */
/* compiled from: PG */
public final class C130092b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C130092b f356720d;

    /* renamed from: e */
    public static final C62940bt f356721e;

    /* renamed from: g */
    private static volatile C63010eb f356722g;

    /* renamed from: a */
    public int f356723a;

    /* renamed from: b */
    public String f356724b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C129676j f356725c;

    /* renamed from: f */
    private byte f356726f = 2;

    static {
        C130092b bVar = new C130092b();
        f356720d = bVar;
        C62942bv.registerDefaultInstance(C130092b.class, bVar);
        f356721e = C62942bv.newSingularGeneratedExtension(C129676j.f355890c, bVar, bVar, (C62958ce) null, 435379487, C63066gd.MESSAGE, C130092b.class);
    }

    private C130092b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f356726f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f356726f = b;
                return null;
            case 2:
                return newMessageInfo(f356720d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C130092b();
            case 4:
                return new C130055a();
            case 5:
                return f356720d;
            case 6:
                C63010eb ebVar = f356722g;
                if (ebVar == null) {
                    synchronized (C130092b.class) {
                        ebVar = f356722g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356720d);
                            f356722g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
