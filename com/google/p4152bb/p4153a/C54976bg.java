package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.bg */
/* compiled from: PG */
public final class C54976bg extends C62937bq implements C62938br {

    /* renamed from: o */
    public static final C54976bg f144641o;

    /* renamed from: q */
    private static volatile C63010eb f144642q;

    /* renamed from: a */
    public int f144643a;

    /* renamed from: b */
    public boolean f144644b;

    /* renamed from: c */
    public int f144645c;

    /* renamed from: d */
    public boolean f144646d;

    /* renamed from: e */
    public boolean f144647e;

    /* renamed from: f */
    public boolean f144648f;

    /* renamed from: g */
    public int f144649g;

    /* renamed from: h */
    public int f144650h;

    /* renamed from: i */
    public C62961ch f144651i = emptyIntList();

    /* renamed from: j */
    public boolean f144652j;

    /* renamed from: k */
    public C55409rh f144653k;

    /* renamed from: l */
    public String f144654l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f144655m = true;

    /* renamed from: n */
    public boolean f144656n;

    /* renamed from: p */
    private byte f144657p = 2;

    static {
        C54976bg bgVar = new C54976bg();
        f144641o = bgVar;
        C62942bv.registerDefaultInstance(C54976bg.class, bgVar);
    }

    private C54976bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144657p);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144657p = b;
                return null;
            case 2:
                return newMessageInfo(f144641o, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0001\u0001\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0006\u0007\u0016\bဇ\t\nᐉ\u000b\fဈ\f\u0010ဇ\u0011\u0011င\b\u0015ဇ\u0013", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, "i", "j", C19621k.f54601a, "l", "m", C19618h.f54585a, C48004n.f124238a});
            case 3:
                return new C54976bg();
            case 4:
                return new C54975bf();
            case 5:
                return f144641o;
            case 6:
                C63010eb ebVar = f144642q;
                if (ebVar == null) {
                    synchronized (C54976bg.class) {
                        ebVar = f144642q;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144641o);
                            f144642q = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
