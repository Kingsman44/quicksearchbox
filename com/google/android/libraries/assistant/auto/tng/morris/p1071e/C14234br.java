package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.br */
/* compiled from: PG */
public final class C14234br extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C14234br f43075k;

    /* renamed from: m */
    private static volatile C63010eb f43076m;

    /* renamed from: a */
    public C14622qa f43077a;

    /* renamed from: b */
    public C14622qa f43078b;

    /* renamed from: c */
    public C14622qa f43079c;

    /* renamed from: d */
    public C14622qa f43080d;

    /* renamed from: e */
    public C14622qa f43081e;

    /* renamed from: f */
    public C14622qa f43082f;

    /* renamed from: g */
    public C14603pi f43083g;

    /* renamed from: h */
    public C14603pi f43084h;

    /* renamed from: i */
    public C14603pi f43085i;

    /* renamed from: j */
    public C14603pi f43086j;

    /* renamed from: l */
    private byte f43087l = 2;

    static {
        C14234br brVar = new C14234br();
        f43075k = brVar;
        C62942bv.registerDefaultInstance(C14234br.class, brVar);
    }

    private C14234br() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43087l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43087l = b;
                return null;
            case 2:
                return newMessageInfo(f43075k, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0000\n\u0001Љ\u0002Љ\u0003Љ\u0004Љ\u0005Љ\u0006Љ\u0007Љ\bЉ\tЉ\u000bЉ", new Object[]{"a", "b", C45240c.f118157a, C30325g.f82003a, C19618h.f54585a, "i", "d", "j", "e", C10662f.f35572a});
            case 3:
                return new C14234br();
            case 4:
                return new C14233bq();
            case 5:
                return f43075k;
            case 6:
                C63010eb ebVar = f43076m;
                if (ebVar == null) {
                    synchronized (C14234br.class) {
                        ebVar = f43076m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43075k);
                            f43076m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
