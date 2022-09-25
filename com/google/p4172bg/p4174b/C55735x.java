package com.google.p4172bg.p4174b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.x */
/* compiled from: PG */
public final class C55735x extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C55735x f147083i;

    /* renamed from: l */
    private static volatile C63010eb f147084l;

    /* renamed from: a */
    public int f147085a;

    /* renamed from: b */
    public C55715d f147086b;

    /* renamed from: c */
    public String f147087c;

    /* renamed from: d */
    public int f147088d;

    /* renamed from: e */
    public int f147089e;

    /* renamed from: f */
    public int f147090f;

    /* renamed from: g */
    public int f147091g;

    /* renamed from: h */
    public int f147092h;

    /* renamed from: j */
    private C55715d f147093j;

    /* renamed from: k */
    private byte f147094k = 2;

    static {
        C55735x xVar = new C55735x();
        f147083i = xVar;
        C62942bv.registerDefaultInstance(C55735x.class, xVar);
    }

    private C55735x() {
        emptyProtobufList();
        this.f147087c = BuildConfig.FLAVOR;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147094k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147094k = b;
                return null;
            case 2:
                return newMessageInfo(f147083i, "\u0001\b\u0000\u0001\u0002\u001b\b\u0000\u0000\u0002\u0002ᔉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u000fင\u000b\u0010င\f\u0011င\r\u0012င\u000e\u001bင\n", new Object[]{"a", "b", "j", C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "d"});
            case 3:
                return new C55735x();
            case 4:
                return new C55734w();
            case 5:
                return f147083i;
            case 6:
                C63010eb ebVar = f147084l;
                if (ebVar == null) {
                    synchronized (C55735x.class) {
                        ebVar = f147084l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147083i);
                            f147084l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
