package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.c.f */
/* compiled from: PG */
public final class C13060f extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C13060f f40536l;

    /* renamed from: n */
    private static volatile C63010eb f40537n;

    /* renamed from: a */
    public int f40538a;

    /* renamed from: b */
    public C13038b f40539b;

    /* renamed from: c */
    public C13033au f40540c;

    /* renamed from: d */
    public C16736ax f40541d;

    /* renamed from: e */
    public C16662b f40542e;

    /* renamed from: f */
    public C16734av f40543f;

    /* renamed from: g */
    public C12991i f40544g;

    /* renamed from: h */
    public C13077w f40545h;

    /* renamed from: i */
    public C16766p f40546i;

    /* renamed from: j */
    public C16754d f40547j;

    /* renamed from: k */
    public C16756f f40548k;

    /* renamed from: m */
    private byte f40549m = 2;

    static {
        C13060f fVar = new C13060f();
        f40536l = fVar;
        C62942bv.registerDefaultInstance(C13060f.class, fVar);
    }

    private C13060f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40549m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40549m = b;
                return null;
            case 2:
                return newMessageInfo(f40536l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0003\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ဉ\u0004\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nᐉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C30325g.f82003a, C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C13060f();
            case 4:
                return new C13059e();
            case 5:
                return f40536l;
            case 6:
                C63010eb ebVar = f40537n;
                if (ebVar == null) {
                    synchronized (C13060f.class) {
                        ebVar = f40537n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40536l);
                            f40537n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
