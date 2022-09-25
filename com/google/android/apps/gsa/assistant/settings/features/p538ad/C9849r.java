package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.widget.Switch;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9805ak;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.p3674l.p3676b.C47386p;
import com.google.apps.tiktok.tracing.C47770dh;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.r */
/* compiled from: PG */
public final class C9849r {

    /* renamed from: a */
    public final C9841j f33861a;

    /* renamed from: b */
    public final C9805ak f33862b;

    /* renamed from: c */
    public final C46801dp f33863c;

    /* renamed from: d */
    public final C47770dh f33864d;

    /* renamed from: e */
    public final C47386p f33865e;

    /* renamed from: f */
    public final C69464a f33866f;

    /* renamed from: g */
    public final C91097g f33867g;

    /* renamed from: h */
    public final C28310af f33868h;

    /* renamed from: i */
    public final C28443m f33869i;

    /* renamed from: j */
    public final C86124t f33870j;

    /* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.r$a */
    /* compiled from: PG */
    final class C9850a implements C46792di {

        /* renamed from: a */
        public final Fragment f33871a;

        /* renamed from: b */
        private final C47386p f33872b;

        /* renamed from: c */
        private final C69464a f33873c;

        /* renamed from: d */
        private final C91097g f33874d;

        /* renamed from: e */
        private boolean f33875e = false;

        public C9850a(Fragment fragment, C47386p pVar, C69464a aVar, C91097g gVar) {
            this.f33871a = fragment;
            this.f33872b = pVar;
            this.f33873c = aVar;
            this.f33874d = gVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            View requireView = this.f33871a.requireView();
            requireView.findViewById(R.id.assistant_on_lockscreen_toggle).setEnabled(false);
            requireView.findViewById(R.id.skip_voice_recognition_toggle).setEnabled(false);
            requireView.findViewById(R.id.assistant_cast_on_lockscreen_toggle).setEnabled(false);
            this.f33872b.mo51246a(th, requireView);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C9857y yVar = (C9857y) obj;
            C9855w a = C9855w.m24617a(yVar.f33886b);
            if (a == null) {
                a = C9855w.STANDBY;
            }
            boolean z = true;
            if (a == C9855w.STANDBY && !this.f33875e) {
                this.f33875e = true;
                C18509a aVar = (C18509a) this.f33873c.mo17428b();
                aVar.mo24024f("lockscreen_consent");
                this.f33874d.mo65090b(aVar.mo24020b().mo24031a(), new C9848q(this));
            }
            View requireView = this.f33871a.requireView();
            ItemView findViewById = requireView.findViewById(R.id.assistant_on_lockscreen_toggle);
            ItemView findViewById2 = requireView.findViewById(R.id.skip_voice_recognition_toggle);
            ItemView findViewById3 = requireView.findViewById(R.id.assistant_cast_on_lockscreen_toggle);
            Switch t = findViewById.t();
            C9855w a2 = C9855w.m24617a(yVar.f33886b);
            if (a2 == null) {
                a2 = C9855w.STANDBY;
            }
            t.setChecked(a2 == C9855w.ENABLED);
            findViewById2.t().setChecked(yVar.f33887c);
            Switch t2 = findViewById3.t();
            int a3 = C9853u.m24616a(yVar.f33888d);
            t2.setChecked(a3 != 0 && a3 == 2);
            findViewById.setEnabled(true);
            C9855w a4 = C9855w.m24617a(yVar.f33886b);
            if (a4 == null) {
                a4 = C9855w.STANDBY;
            }
            findViewById2.setEnabled(a4 == C9855w.ENABLED);
            C9855w a5 = C9855w.m24617a(yVar.f33886b);
            if (a5 == null) {
                a5 = C9855w.STANDBY;
            }
            if (a5 != C9855w.ENABLED) {
                z = false;
            }
            findViewById3.setEnabled(z);
        }

        /* renamed from: c */
        public final void mo18079c() {
            View requireView = this.f33871a.requireView();
            requireView.findViewById(R.id.assistant_on_lockscreen_toggle).setEnabled(false);
            requireView.findViewById(R.id.skip_voice_recognition_toggle).setEnabled(false);
            requireView.findViewById(R.id.assistant_cast_on_lockscreen_toggle).setEnabled(false);
        }
    }

    public C9849r(C9841j jVar, C9805ak akVar, C46801dp dpVar, C47770dh dhVar, C47386p pVar, C69464a aVar, C91097g gVar, C28310af afVar, C28443m mVar, C86124t tVar) {
        this.f33861a = jVar;
        this.f33862b = akVar;
        this.f33863c = dpVar;
        this.f33864d = dhVar;
        this.f33865e = pVar;
        this.f33866f = aVar;
        this.f33867g = gVar;
        this.f33868h = afVar;
        this.f33869i = mVar;
        this.f33870j = tVar;
    }
}
