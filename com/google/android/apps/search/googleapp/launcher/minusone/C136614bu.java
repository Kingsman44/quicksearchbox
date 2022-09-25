package com.google.android.apps.search.googleapp.launcher.minusone;

import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.search.googleapp.launcher.minusone.p10353a.C136563c;
import com.google.android.apps.search.googleapp.launcher.minusone.p10354b.C136593a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.android.apps.search.googleapp.p10257g.p10258a.C135408y;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.lifecycle.flow.C47426f;
import com.google.apps.tiktok.lifecycle.flow.C47429i;
import com.google.p337aa.p338a.C6610l;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bu */
/* compiled from: PG */
public final class C136614bu implements C136560a {

    /* renamed from: a */
    public final AccountId f371893a;

    /* renamed from: b */
    public final C136463a f371894b;

    /* renamed from: c */
    public final C136612bs f371895c;

    /* renamed from: d */
    public final C46801dp f371896d;

    /* renamed from: e */
    public final C136586au f371897e;

    /* renamed from: f */
    public final C136593a f371898f;

    /* renamed from: g */
    public C136619by f371899g;

    /* renamed from: h */
    public final C135408y f371900h;

    /* renamed from: i */
    public final C136563c f371901i;

    /* renamed from: j */
    public final boolean f371902j;

    /* renamed from: k */
    public final boolean f371903k;

    /* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bu$a */
    /* compiled from: PG */
    final class C136615a implements C46792di {

        /* renamed from: a */
        private final ConstraintLayout f371904a;

        public C136615a(ConstraintLayout constraintLayout) {
            this.f371904a = constraintLayout;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            C136614bu.m222061c((C6610l) obj, this.f371904a);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C136614bu(AccountId accountId, C136463a aVar, C136563c cVar, C135408y yVar, C136612bs bsVar, C46801dp dpVar, C136586au auVar, C136593a aVar2, boolean z, boolean z2, C47429i iVar) {
        this.f371893a = accountId;
        this.f371894b = aVar;
        this.f371895c = bsVar;
        this.f371896d = dpVar;
        this.f371897e = auVar;
        this.f371898f = aVar2;
        this.f371901i = cVar;
        this.f371900h = yVar;
        this.f371902j = z;
        this.f371903k = z2;
        if (z2) {
            C47426f.m84293a(iVar.mo51262a(yVar.f368919c), new C136613bt(bsVar));
        }
    }

    /* renamed from: c */
    public static void m222061c(C6610l lVar, ConstraintLayout constraintLayout) {
        if ((lVar.f19632a & 256) != 0) {
            C1756o oVar = new C1756o();
            oVar.mo4889i(constraintLayout);
            oVar.mo4899u(R.id.googleapp_doodle_fragment, 0.0f);
            C1756o oVar2 = oVar;
            oVar2.mo4892l(R.id.googleapp_doodle_fragment, 3, 0, 3, 0);
            oVar2.mo4892l(R.id.googleapp_doodle_fragment, 6, R.id.googleapp_doodle_start_guideline, 7, 0);
            oVar2.mo4892l(R.id.googleapp_doodle_fragment, 7, R.id.googleapp_account_disc_fragment, 6, constraintLayout.getResources().getDimensionPixelSize(R.dimen.googleapp_minus_one_doodle_horizontal_margin));
            oVar2.mo4892l(R.id.googleapp_account_disc_fragment, 7, 0, 7, constraintLayout.getResources().getDimensionPixelSize(R.dimen.googleapp_minus_one_pixel_avatar_horizontal_margin));
            oVar.mo4888h(constraintLayout);
            return;
        }
        C1756o oVar3 = new C1756o();
        oVar3.mo4889i(constraintLayout);
        oVar3.mo4899u(R.id.googleapp_doodle_fragment, 0.0f);
        C1756o oVar4 = oVar3;
        oVar4.mo4892l(R.id.googleapp_doodle_fragment, 3, 0, 3, constraintLayout.getResources().getDimensionPixelSize(R.dimen.googleapp_minus_one_logo_vertical_margin));
        oVar4.mo4892l(R.id.googleapp_doodle_fragment, 6, R.id.googleapp_doodle_start_guideline, 7, 0);
        oVar3.mo4888h(constraintLayout);
    }

    /* renamed from: a */
    public final void mo113224a(int i) {
        int height;
        C136619by byVar = this.f371899g;
        if (byVar != null && (height = this.f371895c.requireView().getHeight()) != 0) {
            int i2 = -height;
            byVar.mo113272a(i < i2 ? 0.0f : 1.0f - (((float) i) / ((float) i2)));
        }
    }

    /* renamed from: b */
    public final void mo113225b(float f) {
        C136619by byVar = this.f371899g;
        if (byVar != null) {
            byVar.mo113272a(f);
        }
    }
}
