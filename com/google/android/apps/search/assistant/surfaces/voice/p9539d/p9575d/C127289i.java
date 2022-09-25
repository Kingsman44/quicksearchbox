package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d;

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
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.d.i */
/* compiled from: PG */
public final class C127289i extends C62937bq implements C62938br {

    /* renamed from: i */
    public static final C127289i f350561i;

    /* renamed from: k */
    private static volatile C63010eb f350562k;

    /* renamed from: a */
    public int f350563a;

    /* renamed from: b */
    public String f350564b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C127283c f350565c;

    /* renamed from: d */
    public C127292l f350566d;

    /* renamed from: e */
    public C127294n f350567e;

    /* renamed from: f */
    public boolean f350568f;

    /* renamed from: g */
    public int f350569g;

    /* renamed from: h */
    public C127285e f350570h;

    /* renamed from: j */
    private byte f350571j = 2;

    static {
        C127289i iVar = new C127289i();
        f350561i = iVar;
        C62942bv.registerDefaultInstance(C127289i.class, iVar);
    }

    private C127289i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350571j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350571j = b;
                return null;
            case 2:
                return newMessageInfo(f350561i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0006ဇ\u0004\u0007င\u0005\bᐉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C127289i();
            case 4:
                return new C127288h();
            case 5:
                return f350561i;
            case 6:
                C63010eb ebVar = f350562k;
                if (ebVar == null) {
                    synchronized (C127289i.class) {
                        ebVar = f350562k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350561i);
                            f350562k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
