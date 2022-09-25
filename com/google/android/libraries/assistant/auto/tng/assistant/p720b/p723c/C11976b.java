package com.google.android.libraries.assistant.auto.tng.assistant.p720b.p723c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.portable.p1586b.C19083o;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p3723ar.imp.view.C48004n;
import com.google.p5277z.p5281b.C67987h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.b.c.b */
/* compiled from: PG */
public final class C11976b extends C62942bv implements C63001dt {

    /* renamed from: o */
    public static final C11976b f38453o;

    /* renamed from: q */
    private static volatile C63010eb f38454q;

    /* renamed from: a */
    public int f38455a;

    /* renamed from: b */
    public String f38456b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C61752n f38457c;

    /* renamed from: d */
    public int f38458d;

    /* renamed from: e */
    public String f38459e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62961ch f38460f = emptyIntList();

    /* renamed from: g */
    public String f38461g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f38462h;

    /* renamed from: i */
    public String f38463i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public int f38464j;

    /* renamed from: k */
    public C19088t f38465k;

    /* renamed from: l */
    public int f38466l;

    /* renamed from: m */
    public int f38467m;

    /* renamed from: n */
    public boolean f38468n;

    /* renamed from: p */
    private byte f38469p = 2;

    static {
        C11976b bVar = new C11976b();
        f38453o = bVar;
        C62942bv.registerDefaultInstance(C11976b.class, bVar);
    }

    private C11976b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38469p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38469p = b;
                return null;
            case 2:
                return newMessageInfo(f38453o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0001\u0002\u0001ဈ\u0000\u0003ဌ\u0002\u0004ဈ\u0003\u0005\u0016\u0006ဈ\u0004\u0007ဇ\u0005\bဈ\u0006\tဌ\u0007\nᐉ\b\u000bဌ\t\fဌ\n\rᐉ\u0001\u000eဇ\u000b", new Object[]{"a", "b", "d", C11981g.f38490a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C67987h.f184224a, C19621k.f54601a, "l", C19083o.f53523a, "m", C51209d.m86087b(), C45240c.f118157a, C48004n.f124238a});
            case 3:
                return new C11976b();
            case 4:
                return new C11975a();
            case 5:
                return f38453o;
            case 6:
                C63010eb ebVar = f38454q;
                if (ebVar == null) {
                    synchronized (C11976b.class) {
                        ebVar = f38454q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38453o);
                            f38454q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
