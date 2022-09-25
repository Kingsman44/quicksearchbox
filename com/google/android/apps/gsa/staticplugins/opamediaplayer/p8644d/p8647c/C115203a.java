package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84275o;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.a */
/* compiled from: PG */
public final class C115203a implements C115308dx {

    /* renamed from: a */
    private final C89859i f319705a;

    /* renamed from: b */
    private final C115315ed f319706b;

    /* renamed from: c */
    private C58833ax f319707c = C58836b.f156633a;

    public C115203a(C89859i iVar, C115315ed edVar) {
        this.f319705a = iVar;
        this.f319706b = edVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo101893a(C52174hz hzVar) {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo101894b(C52174hz hzVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo101895c(C52176ia iaVar) {
    }

    /* renamed from: d */
    public final void mo101896d(C84275o oVar) {
        if (!this.f319706b.mo101954a().mo101953g()) {
            if (this.f319707c.mo56113h() && ((String) this.f319707c.mo56107c()).equals(this.f319706b.mo101954a().mo101947a().f136895b)) {
                return;
            }
            if (oVar.mo77814t()) {
                this.f319705a.mo83702b(C89849ae.SPEAKR_PLAYBACK_STARTED);
                this.f319707c = C58833ax.m90834k(this.f319706b.mo101954a().mo101947a().f136895b);
            } else if (oVar.mo77810p()) {
                this.f319705a.mo83702b(C89849ae.SPEAKR_PLAYBACK_FAILED);
                this.f319707c = C58833ax.m90834k(this.f319706b.mo101954a().mo101947a().f136895b);
            }
        }
    }
}
