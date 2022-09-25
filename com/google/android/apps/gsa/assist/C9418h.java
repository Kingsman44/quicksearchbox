package com.google.android.apps.gsa.assist;

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
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.assist.h */
/* compiled from: PG */
public final class C9418h extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C9418h f32714k;

    /* renamed from: m */
    private static volatile C63010eb f32715m;

    /* renamed from: a */
    public int f32716a;

    /* renamed from: b */
    public C62971cq f32717b = emptyProtobufList();

    /* renamed from: c */
    public C63088z f32718c = C63088z.f170246b;

    /* renamed from: d */
    public C9332ac f32719d;

    /* renamed from: e */
    public boolean f32720e;

    /* renamed from: f */
    public C9432v f32721f;

    /* renamed from: g */
    public int f32722g;

    /* renamed from: h */
    public String f32723h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f32724i;

    /* renamed from: j */
    public boolean f32725j;

    /* renamed from: l */
    private byte f32726l = 2;

    static {
        C9418h hVar = new C9418h();
        f32714k = hVar;
        C62942bv.registerDefaultInstance(C9418h.class, hVar);
    }

    private C9418h() {
    }

    /* renamed from: a */
    public final void mo17673a() {
        C62971cq cqVar = this.f32717b;
        if (!cqVar.mo58948c()) {
            this.f32717b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32726l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32726l = b;
                return null;
            case 2:
                return newMessageInfo(f32714k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0003\u0001Л\u0002ည\u0000\u0003ᐉ\u0001\u0005ဇ\u0002\u0006ᐉ\u0003\u0007ဌ\u0004\bဈ\u0006\nင\u0007\u000bဇ\b", new Object[]{"a", "b", C9410f.class, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C9419i.f32727a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C9418h();
            case 4:
                return new C9417g();
            case 5:
                return f32714k;
            case 6:
                C63010eb ebVar = f32715m;
                if (ebVar == null) {
                    synchronized (C9418h.class) {
                        ebVar = f32715m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32714k);
                            f32715m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
