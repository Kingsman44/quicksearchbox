package com.google.lens.p4698d;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58124d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.q */
/* compiled from: PG */
public final class C62178q extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C62178q f167872m;

    /* renamed from: o */
    private static volatile C63010eb f167873o;

    /* renamed from: a */
    public int f167874a;

    /* renamed from: b */
    public boolean f167875b;

    /* renamed from: c */
    public float f167876c;

    /* renamed from: d */
    public int f167877d;

    /* renamed from: e */
    public C58124d f167878e;

    /* renamed from: f */
    public C62961ch f167879f = emptyIntList();

    /* renamed from: g */
    public boolean f167880g;

    /* renamed from: h */
    public boolean f167881h;

    /* renamed from: i */
    public boolean f167882i;

    /* renamed from: j */
    public float f167883j;

    /* renamed from: k */
    public boolean f167884k;

    /* renamed from: l */
    public boolean f167885l;

    /* renamed from: n */
    private byte f167886n = 2;

    static {
        C62178q qVar = new C62178q();
        f167872m = qVar;
        C62942bv.registerDefaultInstance(C62178q.class, qVar);
    }

    private C62178q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167886n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167886n = b;
                return null;
            case 2:
                return newMessageInfo(f167872m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0001\u0001ဇ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ᐉ\u0003\u0005\u0016\u0006ဇ\u0004\bဇ\u0006\tခ\b\u000bဇ\t\fဇ\u0007\rဇ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "j", C19621k.f54601a, "i", "l"});
            case 3:
                return new C62178q();
            case 4:
                return new C62177p();
            case 5:
                return f167872m;
            case 6:
                C63010eb ebVar = f167873o;
                if (ebVar == null) {
                    synchronized (C62178q.class) {
                        ebVar = f167873o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167872m);
                            f167873o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
