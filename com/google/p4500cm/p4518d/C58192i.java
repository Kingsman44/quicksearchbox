package com.google.p4500cm.p4518d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3915h.p3916a.C51227b;
import com.google.common.p4552o.C60555uf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.cm.d.i */
/* compiled from: PG */
public final class C58192i extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C58192i f155603j;

    /* renamed from: l */
    private static volatile C63010eb f155604l;

    /* renamed from: a */
    public int f155605a;

    /* renamed from: b */
    public C62961ch f155606b;

    /* renamed from: c */
    public C60555uf f155607c;

    /* renamed from: d */
    public String f155608d;

    /* renamed from: e */
    public String f155609e;

    /* renamed from: f */
    public String f155610f;

    /* renamed from: g */
    public C19088t f155611g;

    /* renamed from: h */
    public C63196b f155612h;

    /* renamed from: i */
    public C51227b f155613i;

    /* renamed from: k */
    private byte f155614k = 2;

    static {
        C58192i iVar = new C58192i();
        f155603j = iVar;
        C62942bv.registerDefaultInstance(C58192i.class, iVar);
    }

    private C58192i() {
        emptyProtobufList();
        emptyIntList();
        this.f155606b = emptyIntList();
        this.f155608d = BuildConfig.FLAVOR;
        this.f155609e = BuildConfig.FLAVOR;
        this.f155610f = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f155614k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f155614k = b;
                return null;
            case 2:
                return newMessageInfo(f155603j, "\u0001\b\u0000\u0001\u0006\u0012\b\u0000\u0001\u0004\u0006ဈ\u0004\u0007ᐉ\u0002\bဈ\u0005\nဈ\u0007\r\u0018\u0010ᐉ\u000b\u0011ᐉ\f\u0012ᐉ\r", new Object[]{"a", "d", C45240c.f118157a, "e", C10662f.f35572a, "b", C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C58192i();
            case 4:
                return new C58191h();
            case 5:
                return f155603j;
            case 6:
                C63010eb ebVar = f155604l;
                if (ebVar == null) {
                    synchronized (C58192i.class) {
                        ebVar = f155604l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155603j);
                            f155604l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
