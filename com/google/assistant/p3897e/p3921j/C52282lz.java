package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.lz */
/* compiled from: PG */
public final class C52282lz extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C52282lz f137236h;

    /* renamed from: j */
    private static volatile C63010eb f137237j;

    /* renamed from: a */
    public int f137238a;

    /* renamed from: b */
    public String f137239b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52395qd f137240c;

    /* renamed from: d */
    public C52395qd f137241d;

    /* renamed from: e */
    public String f137242e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f137243f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f137244g;

    /* renamed from: i */
    private byte f137245i = 2;

    static {
        C52282lz lzVar = new C52282lz();
        f137236h = lzVar;
        C62942bv.registerDefaultInstance(C52282lz.class, lzVar);
    }

    private C52282lz() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f137245i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f137245i = b;
                return null;
            case 2:
                return newMessageInfo(f137236h, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0005ဈ\u0004\u0006ဈ\u0005\u000eင\r", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C52282lz();
            case 4:
                return new C52281ly();
            case 5:
                return f137236h;
            case 6:
                C63010eb ebVar = f137237j;
                if (ebVar == null) {
                    synchronized (C52282lz.class) {
                        ebVar = f137237j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137236h);
                            f137237j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
