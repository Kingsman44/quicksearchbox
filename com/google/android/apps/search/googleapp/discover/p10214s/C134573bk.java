package com.google.android.apps.search.googleapp.discover.p10214s;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.bk */
/* compiled from: PG */
public final class C134573bk extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C134573bk f366497h;

    /* renamed from: j */
    private static volatile C63010eb f366498j;

    /* renamed from: a */
    public int f366499a;

    /* renamed from: b */
    public int f366500b;

    /* renamed from: c */
    public String f366501c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f366502d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C134552aq f366503e;

    /* renamed from: f */
    public int f366504f;

    /* renamed from: g */
    public C134570bh f366505g;

    /* renamed from: i */
    private byte f366506i = 2;

    static {
        C134573bk bkVar = new C134573bk();
        f366497h = bkVar;
        C62942bv.registerDefaultInstance(C134573bk.class, bkVar);
    }

    private C134573bk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f366506i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f366506i = b;
                return null;
            case 2:
                return newMessageInfo(f366497h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0004\u0005ᐉ\u0003\u0006ᐉ\u0005", new Object[]{"a", "b", C134564bb.m218287b(), C45240c.f118157a, "d", C10662f.f35572a, C134572bj.m218291b(), "e", C30325g.f82003a});
            case 3:
                return new C134573bk();
            case 4:
                return new C134561az();
            case 5:
                return f366497h;
            case 6:
                C63010eb ebVar = f366498j;
                if (ebVar == null) {
                    synchronized (C134573bk.class) {
                        ebVar = f366498j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366497h);
                            f366498j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
