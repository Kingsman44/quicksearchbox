package com.google.p4172bg.p4174b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bg.b.j */
/* compiled from: PG */
public final class C55721j extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C55721j f147017k;

    /* renamed from: o */
    private static volatile C63010eb f147018o;

    /* renamed from: a */
    public int f147019a;

    /* renamed from: b */
    public C62971cq f147020b = emptyProtobufList();

    /* renamed from: c */
    public C55715d f147021c;

    /* renamed from: d */
    public String f147022d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public float f147023e;

    /* renamed from: f */
    public String f147024f;

    /* renamed from: g */
    public C55717f f147025g;

    /* renamed from: h */
    public int f147026h;

    /* renamed from: i */
    public C55737z f147027i;

    /* renamed from: j */
    public float f147028j;

    /* renamed from: l */
    private C55715d f147029l;

    /* renamed from: m */
    private C55715d f147030m;

    /* renamed from: n */
    private byte f147031n = 2;

    static {
        C55721j jVar = new C55721j();
        f147017k = jVar;
        C62942bv.registerDefaultInstance(C55721j.class, jVar);
    }

    private C55721j() {
        emptyProtobufList();
        emptyProtobufList();
        this.f147024f = BuildConfig.FLAVOR;
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f147031n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f147031n = b;
                return null;
            case 2:
                return newMessageInfo(f147017k, "\u0001\u000b\u0000\u0001\u0001\u0017\u000b\u0000\u0001\u0005\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0004ဈ\u0003\u0005ခ\u0004\bဈ\u0006\u000fᐉ\u000b\u0011င\r\u0013ᐉ\u0002\u0015ဉ\u0010\u0017ခ\u0012", new Object[]{"a", "b", C55735x.class, C45240c.f118157a, "l", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "m", "i", "j"});
            case 3:
                return new C55721j();
            case 4:
                return new C55720i();
            case 5:
                return f147017k;
            case 6:
                C63010eb ebVar = f147018o;
                if (ebVar == null) {
                    synchronized (C55721j.class) {
                        ebVar = f147018o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f147017k);
                            f147018o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
