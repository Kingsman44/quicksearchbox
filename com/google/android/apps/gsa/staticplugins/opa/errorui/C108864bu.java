package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.KeyguardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6345h.C81315k;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83613ab;
import com.google.android.apps.gsa.opa.p6441f.p6442a.C83614ac;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8322c.C107759j;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bu */
/* compiled from: PG */
public final class C108864bu extends C83907bm {

    /* renamed from: b */
    public static final C59071e f302702b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.bu");

    /* renamed from: c */
    public C86124t f302703c;

    /* renamed from: d */
    public C81315k f302704d;

    /* renamed from: e */
    public C58833ax f302705e;

    /* renamed from: f */
    public C68214a f302706f;

    /* renamed from: g */
    public C58881cr f302707g;

    /* renamed from: h */
    public C68214a f302708h;

    /* renamed from: i */
    private View f302709i;

    /* renamed from: j */
    private View f302710j;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: d */
    public final boolean mo77316d() {
        mo77318iT().mo77313b();
        return true;
    }

    /* renamed from: f */
    public final boolean mo77317f() {
        return true;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        e eVar;
        super.onActivityResult(i, i2, intent);
        if (i == 11001) {
            C59071e eVar2 = f302702b;
            ((C59052c) ((C59052c) eVar2.mo56224b()).mo56372aa(24399)).mo56387q("resultCode = %d", i2);
            if (i2 == -1) {
                C89949q.m146521e(C28285c.m52882i(this.f302709i, 5, (Integer) null), false);
                C80905at.m128763g(this.f302704d.mo74857E(), C108863bt.f302701a);
                mo77318iT().mo77312a();
                if (getActivity() != null) {
                    getActivity().finishAndRemoveTask();
                    if (((Boolean) this.f302707g.mo6453a()).booleanValue()) {
                        if (((KeyguardManager) getContext().getSystemService(KeyguardManager.class)).isDeviceLocked()) {
                            eVar = e.br;
                        } else {
                            eVar = e.bv;
                        }
                        C83613ab abVar = (C83613ab) C83614ac.f227951e.createBuilder();
                        abVar.copyOnWrite();
                        C83614ac acVar = (C83614ac) abVar.instance;
                        acVar.f227955c = eVar.ca;
                        acVar.f227953a |= 2;
                        abVar.copyOnWrite();
                        C83614ac acVar2 = (C83614ac) abVar.instance;
                        acVar2.f227954b = 1;
                        acVar2.f227953a |= 1;
                        ((C107759j) this.f302708h.mo27525b()).mo96272h((C83614ac) abVar.build());
                    } else {
                        C87565h hVar = new C87565h();
                        hVar.f236560f = 2;
                        ((C87568k) this.f302705e.mo56107c()).mo81688b(getContext(), hVar.mo81685a());
                    }
                    ((C89859i) this.f302706f.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_RELAUNCH_FROM_ERROR);
                }
            } else if (i2 == 1) {
                C89949q.m146521e(C28285c.m52882i(this.f302710j, 5, (Integer) null), false);
                mo77318iT().mo77312a();
                getActivity().finishAndRemoveTask();
                String x = this.f302703c.mo79758x(C90053de.f248991x);
                if (x != null) {
                    getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(x)));
                }
            } else if (i2 == 0) {
                mo77318iT().mo77313b();
            } else {
                ((C59052c) ((C59052c) eVar2.mo56225c()).mo56372aa(24400)).mo56387q("Unknown resultCode = %d", i2);
                mo77318iT().mo77313b();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.long_press_power_empty_layout, viewGroup, false);
        this.f302709i = inflate.findViewById(R.id.long_press_power_empty_layout_action_button);
        this.f302710j = inflate.findViewById(R.id.long_press_power_empty_layout_cancel_button);
        C28295m.m52919e(inflate, new C28292j(126731));
        View view = this.f302709i;
        C28292j jVar = new C28292j(37143);
        jVar.mo33795i(5);
        C28295m.m52919e(view, jVar);
        View view2 = this.f302710j;
        C28292j jVar2 = new C28292j(37142);
        jVar2.mo33795i(5);
        C28295m.m52919e(view2, jVar2);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            Intent className = new Intent().setClassName(getContext(), "com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.LongPressPowerActivity");
            className.putExtra("intent_extra_description_no_query", this.f302703c.mo79746e(C90053de.f248987t));
            className.putExtra("intent_extra_show_settings_button", this.f302703c.mo79746e(C90053de.f248943J));
            className.putExtra("intent_extra_power_off_animation", this.f302703c.mo79743a(C90053de.f248993z));
            className.putExtra("intent_extra_learn_more_url", this.f302703c.mo79758x(C90053de.f248991x));
            startActivityForResult(className, 11001);
            return;
        }
        ((C59052c) ((C59052c) f302702b.mo56224b()).mo56372aa(24401)).mo56386p("Finish this fragment restored from a configuration change.");
        mo77318iT().mo77313b();
    }
}
