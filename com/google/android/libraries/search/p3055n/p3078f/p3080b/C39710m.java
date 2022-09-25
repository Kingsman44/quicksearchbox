package com.google.android.libraries.search.p3055n.p3078f.p3080b;

import com.google.android.libraries.assistant.soda.C19243af;
import com.google.android.libraries.assistant.soda.C19347o;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.C66944fg;
import com.google.speech.p5218j.C67087ko;

/* renamed from: com.google.android.libraries.search.n.f.b.m */
/* compiled from: PG */
public final class C39710m implements C19347o {

    /* renamed from: a */
    final /* synthetic */ C39711n f104490a;

    public C39710m(C39711n nVar) {
        this.f104490a = nVar;
    }

    /* renamed from: t */
    public final void mo23782t(C67087ko koVar) {
        C62940bt r0 = C62942bv.checkIsLite(C66944fg.f181964f);
        koVar.mo58887l(r0);
        if (koVar.f169962ag.mo58857o(r0.f169971d)) {
            C59071e eVar = C39711n.f104491a;
            C62940bt r02 = C62942bv.checkIsLite(C66944fg.f181964f);
            koVar.mo58887l(r02);
            Object l = koVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                Object obj = r02.f169969b;
            } else {
                r02.mo58889c(l);
            }
            C47538ax c = this.f104490a.f104502k.mo51613c("QuickPhraseEvent");
            try {
                this.f104490a.f104493b.mo40418a(koVar);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
                } catch (Exception unused) {
                }
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: u */
    public final /* synthetic */ void mo23783u() {
    }

    /* renamed from: v */
    public final void mo23784v(C19243af afVar) {
    }
}
