package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9593a.p9594a.C127412b;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b.C127416c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127426c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127455c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.b */
/* compiled from: PG */
public final class C127413b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C127413b f350829i;

    /* renamed from: k */
    private static volatile C63010eb f350830k;

    /* renamed from: a */
    public int f350831a;

    /* renamed from: b */
    public int f350832b = 0;

    /* renamed from: c */
    public Object f350833c;

    /* renamed from: d */
    public C34039bb f350834d;

    /* renamed from: e */
    public C34065ca f350835e;

    /* renamed from: f */
    public C127465c f350836f;

    /* renamed from: g */
    public C127412b f350837g;

    /* renamed from: h */
    public int f350838h;

    /* renamed from: j */
    private byte f350839j = 2;

    static {
        C127413b bVar = new C127413b();
        f350829i = bVar;
        C62942bv.registerDefaultInstance(C127413b.class, bVar);
    }

    private C127413b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f350839j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f350839j = b;
                return null;
            case 2:
                return newMessageInfo(f350829i, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0002\u0001ᐉ\u0000\u0002<\u0000\u0003Љ\u0004\t\u0005\t\u0006<\u0000\u0007\u0004\b<\u0000\t<\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C127471c.class, "e", C10662f.f35572a, C30325g.f82003a, C127455c.class, C19618h.f54585a, C127416c.class, C127426c.class});
            case 3:
                return new C127413b();
            case 4:
                return new C127410a();
            case 5:
                return f350829i;
            case 6:
                C63010eb ebVar = f350830k;
                if (ebVar == null) {
                    synchronized (C127413b.class) {
                        ebVar = f350830k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350829i);
                            f350830k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
