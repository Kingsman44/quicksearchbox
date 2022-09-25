package com.google.p4152bb.p4153a;

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

/* renamed from: com.google.bb.a.di */
/* compiled from: PG */
public final class C55032di extends C62937bq implements C62938br {

    /* renamed from: j */
    public static final C55032di f144777j;

    /* renamed from: l */
    private static volatile C63010eb f144778l;

    /* renamed from: a */
    public int f144779a;

    /* renamed from: b */
    public String f144780b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144781c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f144782d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f144783e;

    /* renamed from: f */
    public int f144784f;

    /* renamed from: g */
    public String f144785g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f144786h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C55136he f144787i;

    /* renamed from: k */
    private byte f144788k = 2;

    static {
        C55032di diVar = new C55032di();
        f144777j = diVar;
        C62942bv.registerDefaultInstance(C55032di.class, diVar);
    }

    private C55032di() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f144788k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f144788k = b;
                return null;
            case 2:
                return newMessageInfo(f144777j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\bဈ\u0007\tᐉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C55032di();
            case 4:
                return new C55031dh();
            case 5:
                return f144777j;
            case 6:
                C63010eb ebVar = f144778l;
                if (ebVar == null) {
                    synchronized (C55032di.class) {
                        ebVar = f144778l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144777j);
                            f144778l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
