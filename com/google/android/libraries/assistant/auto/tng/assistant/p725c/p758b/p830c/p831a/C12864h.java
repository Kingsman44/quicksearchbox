package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13037ay;
import com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.C16662b;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16734av;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16736ax;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16756f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16766p;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.h */
/* compiled from: PG */
public final class C12864h extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C12864h f40117i;

    /* renamed from: k */
    private static volatile C63010eb f40118k;

    /* renamed from: a */
    public int f40119a;

    /* renamed from: b */
    public C16736ax f40120b;

    /* renamed from: c */
    public C16662b f40121c;

    /* renamed from: d */
    public C16734av f40122d;

    /* renamed from: e */
    public C13037ay f40123e;

    /* renamed from: f */
    public C16766p f40124f;

    /* renamed from: g */
    public C16754d f40125g;

    /* renamed from: h */
    public C16756f f40126h;

    /* renamed from: j */
    private byte f40127j = 2;

    static {
        C12864h hVar = new C12864h();
        f40117i = hVar;
        C62942bv.registerDefaultInstance(C12864h.class, hVar);
    }

    private C12864h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f40127j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f40127j = b;
                return null;
            case 2:
                return newMessageInfo(f40117i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C12864h();
            case 4:
                return new C12863g();
            case 5:
                return f40117i;
            case 6:
                C63010eb ebVar = f40118k;
                if (ebVar == null) {
                    synchronized (C12864h.class) {
                        ebVar = f40118k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f40117i);
                            f40118k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
