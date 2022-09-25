package com.google.android.apps.gsa.sidekick.main.p7203f;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.p489g.C9299q;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.q */
/* compiled from: PG */
public final class C91387q {

    /* renamed from: a */
    final /* synthetic */ C91388r f254960a;

    /* renamed from: b */
    private C9299q f254961b;

    public C91387q(C91388r rVar) {
        this.f254960a = rVar;
    }

    /* renamed from: a */
    public final C9299q mo85707a() {
        byte[] e;
        if (!(this.f254961b != null || (e = ((C86338r) this.f254960a.f254967f.mo17428b()).mo80079e("now_user_session_state", new byte[0])) == null || e.length == 0)) {
            try {
                this.f254961b = (C9299q) C62942bv.parseFrom((C62942bv) C9299q.f32280e, e);
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) C91388r.f254962a.mo56226d()).mo56382g(e2)).mo56372aa(11570)).mo56386p("Failed to parse user session preferences userSessionStateData");
            } catch (RuntimeException e3) {
                if (e3.getCause() instanceof C62974ct) {
                    ((C59052c) ((C59052c) ((C59052c) C91388r.f254962a.mo56226d()).mo56382g(e3)).mo56372aa(11571)).mo56386p("Failed to parse user session preferences userSessionStateData");
                } else {
                    throw e3;
                }
            }
        }
        if (this.f254961b == null) {
            this.f254961b = C9299q.f32280e;
        }
        return this.f254961b;
    }

    /* renamed from: b */
    public final void mo85708b(C9299q qVar) {
        this.f254961b = qVar;
        if (qVar != null) {
            C86337q b = ((C86338r) this.f254960a.f254967f.mo17428b()).mo80076b();
            b.mo80068c("now_user_session_state", this.f254961b.toByteArray());
            b.apply();
        }
    }
}
