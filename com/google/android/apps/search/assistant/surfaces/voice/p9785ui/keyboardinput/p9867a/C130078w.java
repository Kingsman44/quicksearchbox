package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput.p9867a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4948ba.p4949a.C64369b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.a.w */
/* compiled from: PG */
public final class C130078w extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f356678f = new C130074s();

    /* renamed from: k */
    public static final C130078w f356679k;

    /* renamed from: m */
    private static volatile C63010eb f356680m;

    /* renamed from: a */
    public int f356681a;

    /* renamed from: b */
    public String f356682b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f356683c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f356684d;

    /* renamed from: e */
    public C62961ch f356685e = emptyIntList();

    /* renamed from: g */
    public C54228aq f356686g;

    /* renamed from: h */
    public String f356687h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public int f356688i;

    /* renamed from: j */
    public int f356689j;

    /* renamed from: l */
    private byte f356690l = 2;

    static {
        C130078w wVar = new C130078w();
        f356679k = wVar;
        C62942bv.registerDefaultInstance(C130078w.class, wVar);
    }

    private C130078w() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f356690l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f356690l = b;
                return null;
            case 2:
                return newMessageInfo(f356679k, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004\u001e\u0005ᐉ\u0003\u0006ဈ\u0004\u0007ဌ\u0005\bင\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C130076u.f356677a, "e", C64369b.m96391b(), C30325g.f82003a, C19618h.f54585a, "i", C130079x.f356691a, "j"});
            case 3:
                return new C130078w();
            case 4:
                return new C130075t();
            case 5:
                return f356679k;
            case 6:
                C63010eb ebVar = f356680m;
                if (ebVar == null) {
                    synchronized (C130078w.class) {
                        ebVar = f356680m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356679k);
                            f356680m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
