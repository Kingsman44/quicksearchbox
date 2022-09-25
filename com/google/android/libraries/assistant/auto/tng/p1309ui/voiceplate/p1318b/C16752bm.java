package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.bm */
/* compiled from: PG */
public final class C16752bm extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C16752bm f49003m;

    /* renamed from: o */
    private static volatile C63010eb f49004o;

    /* renamed from: a */
    public int f49005a;

    /* renamed from: b */
    public boolean f49006b;

    /* renamed from: c */
    public boolean f49007c;

    /* renamed from: d */
    public boolean f49008d;

    /* renamed from: e */
    public C16750bk f49009e;

    /* renamed from: f */
    public C16720ah f49010f;

    /* renamed from: g */
    public String f49011g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f49012h;

    /* renamed from: i */
    public boolean f49013i;

    /* renamed from: j */
    public boolean f49014j;

    /* renamed from: k */
    public boolean f49015k;

    /* renamed from: l */
    public C16728ap f49016l;

    /* renamed from: n */
    private byte f49017n = 2;

    static {
        C16752bm bmVar = new C16752bm();
        f49003m = bmVar;
        C62942bv.registerDefaultInstance(C16752bm.class, bmVar);
    }

    private C16752bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49017n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49017n = b;
                return null;
            case 2:
                return newMessageInfo(f49003m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ᐉ\u0003\u0004ဇ\u0002\u0005ဉ\u0004\u0006ဈ\u0005\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဉ\f", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l"});
            case 3:
                return new C16752bm();
            case 4:
                return new C16751bl();
            case 5:
                return f49003m;
            case 6:
                C63010eb ebVar = f49004o;
                if (ebVar == null) {
                    synchronized (C16752bm.class) {
                        ebVar = f49004o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49003m);
                            f49004o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
