package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3931f.p3939c.C52813ac;
import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.assistant.p3931f.p3939c.C52849z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.h */
/* compiled from: PG */
public final class C16758h extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C16758h f49035i;

    /* renamed from: k */
    private static volatile C63010eb f49036k;

    /* renamed from: a */
    public int f49037a;

    /* renamed from: b */
    public C52849z f49038b;

    /* renamed from: c */
    public C52829f f49039c;

    /* renamed from: d */
    public String f49040d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f49041e;

    /* renamed from: f */
    public C12991i f49042f;

    /* renamed from: g */
    public C52813ac f49043g;

    /* renamed from: h */
    public boolean f49044h;

    /* renamed from: j */
    private byte f49045j = 2;

    static {
        C16758h hVar = new C16758h();
        f49035i = hVar;
        C62942bv.registerDefaultInstance(C16758h.class, hVar);
    }

    private C16758h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49045j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49045j = b;
                return null;
            case 2:
                return newMessageInfo(f49035i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ᐉ\u0004\u0006ဉ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C16758h();
            case 4:
                return new C16757g();
            case 5:
                return f49035i;
            case 6:
                C63010eb ebVar = f49036k;
                if (ebVar == null) {
                    synchronized (C16758h.class) {
                        ebVar = f49036k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49035i);
                            f49036k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
