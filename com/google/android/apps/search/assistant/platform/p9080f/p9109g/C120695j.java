package com.google.android.apps.search.assistant.platform.p9080f.p9109g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119824bs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.j */
/* compiled from: PG */
public final class C120695j extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C120695j f335679k;

    /* renamed from: m */
    private static volatile C63010eb f335680m;

    /* renamed from: a */
    public int f335681a;

    /* renamed from: b */
    public int f335682b = 0;

    /* renamed from: c */
    public Object f335683c;

    /* renamed from: d */
    public C119834cb f335684d;

    /* renamed from: e */
    public boolean f335685e;

    /* renamed from: f */
    public C120691f f335686f;

    /* renamed from: g */
    public String f335687g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C119824bs f335688h;

    /* renamed from: i */
    public boolean f335689i;

    /* renamed from: j */
    public int f335690j;

    /* renamed from: l */
    private byte f335691l = 2;

    static {
        C120695j jVar = new C120695j();
        f335679k = jVar;
        C62942bv.registerDefaultInstance(C120695j.class, jVar);
    }

    private C120695j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f335691l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f335691l = b;
                return null;
            case 2:
                return newMessageInfo(f335679k, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0002\u0001\t\u0002м\u0000\u0003<\u0000\u0004ဇ\u0000\u0005Љ\u0006ለ\u0001\u0007ဉ\u0002\bဇ\u0003\t\f", new Object[]{C45240c.f118157a, "b", "a", "d", C120703r.class, C120811d.class, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C120695j();
            case 4:
                return new C120693h();
            case 5:
                return f335679k;
            case 6:
                C63010eb ebVar = f335680m;
                if (ebVar == null) {
                    synchronized (C120695j.class) {
                        ebVar = f335680m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f335679k);
                            f335680m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
