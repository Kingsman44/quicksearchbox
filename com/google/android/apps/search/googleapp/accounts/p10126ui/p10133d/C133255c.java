package com.google.android.apps.search.googleapp.accounts.p10126ui.p10133d;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30518b;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30461b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30465f;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.d.c */
/* compiled from: PG */
public final class C133255c {

    /* renamed from: a */
    public static final C58495hd f363182a;

    /* renamed from: f */
    private static final C58495hd f363183f;

    /* renamed from: b */
    public final Fragment f363184b;

    /* renamed from: c */
    public final C28310af f363185c;

    /* renamed from: d */
    public final C28306ab f363186d;

    /* renamed from: e */
    public final C28443m f363187e;

    /* renamed from: g */
    private final C69464a f363188g;

    /* renamed from: h */
    private final C30306o f363189h;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(149502, Integer.valueOf(R.id.googleapp_account_disc_container));
        gzVar.mo55429h(149503, Integer.valueOf(R.id.googleapp_account_disc_ve));
        gzVar.mo55429h(149504, Integer.valueOf(R.id.googleapp_account_menu_ve));
        gzVar.mo55429h(149786, Integer.valueOf(R.id.googleapp_account_menu_contributions_ve));
        gzVar.mo55429h(149787, Integer.valueOf(R.id.googleapp_account_menu_info_removal_ve));
        gzVar.mo55429h(149788, Integer.valueOf(R.id.googleapp_account_menu_recents_ve));
        gzVar.mo55429h(149789, Integer.valueOf(R.id.googleapp_account_menu_reminders_ve));
        gzVar.mo55429h(149790, Integer.valueOf(R.id.googleapp_account_menu_search_console_ve));
        gzVar.mo55429h(149792, Integer.valueOf(R.id.googleapp_account_menu_data_ve));
        gzVar.mo55429h(149791, Integer.valueOf(R.id.googleapp_account_menu_search_history_ve));
        gzVar.mo55429h(149949, Integer.valueOf(R.id.googleapp_account_menu_search_history_status_ve));
        gzVar.mo55429h(149948, Integer.valueOf(R.id.googleapp_account_menu_remove_search_history_ve));
        gzVar.mo55429h(149505, Integer.valueOf(R.id.googleapp_account_menu_settings_ve));
        gzVar.mo55429h(149506, Integer.valueOf(R.id.googleapp_account_menu_help_and_feedback_ve));
        f363182a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(139629, 149786);
        gzVar2.mo55429h(147906, 149787);
        gzVar2.mo55429h(139627, 149788);
        gzVar2.mo55429h(139628, 149789);
        gzVar2.mo55429h(139631, 149790);
        gzVar2.mo55429h(139626, 149791);
        gzVar2.mo55429h(90536, 149792);
        gzVar2.mo55429h(90537, 149505);
        gzVar2.mo55429h(90538, 149506);
        gzVar2.mo55429h(112542, 149949);
        gzVar2.mo55429h(112541, 149948);
        f363183f = gzVar2.mo55427f(false);
    }

    public C133255c(Fragment fragment, C28310af afVar, C28306ab abVar, C28443m mVar, C69464a aVar, C30306o oVar) {
        this.f363184b = fragment;
        this.f363185c = afVar;
        this.f363186d = abVar;
        this.f363187e = mVar;
        this.f363188g = aVar;
        this.f363189h = oVar;
    }

    /* renamed from: c */
    private final void m216270c(int i) {
        View findViewById = this.f363184b.requireView().findViewById(((Integer) f363182a.get(Integer.valueOf(i))).intValue());
        findViewById.setVisibility(0);
        this.f363186d.mo33802c(findViewById, this.f363185c.mo33805a(C28427h.m53115a(i))).mo33892i(1);
    }

    /* renamed from: d */
    private final void m216271d(C30464e eVar) {
        Integer num = (Integer) f363183f.get(Integer.valueOf(eVar.mo36062b()));
        if (num != null) {
            View findViewById = this.f363184b.requireView().findViewById(((Integer) f363182a.get(num)).intValue());
            C30465f j = eVar.mo36069j();
            if (j != null) {
                j.f82285a.mo5704e(this.f363184b.getViewLifecycleOwner(), new C133253a(findViewById));
            } else {
                findViewById.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo111050a(int i) {
        if (!(i == 149503 || this.f363184b.requireView().findViewById(R.id.googleapp_account_menu_ve).getVisibility() == 0)) {
            mo111051b();
            m216270c(149504);
            m216270c(i);
        }
        C19559g.m37302a().post(C47810es.m84977q(new C133254b(this, i)));
    }

    /* renamed from: b */
    public final void mo111051b() {
        this.f363184b.requireView().findViewById(R.id.googleapp_account_menu_ve).setVisibility(0);
        C30518b bVar = (C30518b) this.f363188g.mo17428b();
        C58485gu q = bVar.mo36184q();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            C30464e eVar = (C30464e) q.get(i);
            if (!eVar.mo36066f().equals(C30461b.PRIVACY_ADVISOR) || C30281j.m56319c(this.f363189h.f81934a.f81883d) != null) {
                m216271d(eVar);
            }
        }
        C58485gu e = bVar.mo36171d().mo36148e();
        int size2 = e.size();
        for (int i2 = 0; i2 < size2; i2++) {
            m216271d(((C30631n) e.get(i2)).mo36352j());
        }
    }
}
