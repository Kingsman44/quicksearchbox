package com.google.android.libraries.assistant.auto.tng.common.p898b.p899a;

import com.google.android.gms.awareness.p10746a.C142926a;
import com.google.android.gms.contextmanager.C144024a;
import com.google.android.gms.contextmanager.C144053i;
import com.google.android.gms.contextmanager.ContextData;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.p4184bj.p4189b.p4190a.C55876h;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13218c implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13218c f40863a = new C13218c();

    private /* synthetic */ C13218c() {
    }

    public final Object apply(Object obj) {
        Object obj2;
        C144024a b = ((C144053i) ((C142926a) obj).f389625a).mo119577b();
        if (b == null) {
            try {
                return C58836b.f156633a;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            int i = 0;
            while (i < b.mo119324c()) {
                ContextData e = b.mo119538e(i);
                if (e == null || e.mo119530a() != 67) {
                    i++;
                } else {
                    try {
                        byte[] d = e.mo119533d();
                        if (d != null) {
                            obj2 = C58833ax.m90834k((C55876h) C62942bv.parseFrom((C62942bv) C55876h.f148687c, d, C62921ba.m95368a()));
                            b.mo119102b();
                            return obj2;
                        }
                    } catch (C62974ct e2) {
                        ((C59052c) ((C59052c) ((C59052c) C13220e.f40865a.mo56226d()).mo56382g(e2)).mo56372aa(44699)).mo56386p("Invalid MapsNavigationState proto");
                    }
                    obj2 = C58836b.f156633a;
                    b.mo119102b();
                    return obj2;
                }
            }
            b.mo119102b();
            return C58836b.f156633a;
        }
        throw th;
    }
}
