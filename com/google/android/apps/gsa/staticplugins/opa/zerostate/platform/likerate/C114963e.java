package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114799aw;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.e */
/* compiled from: PG */
final class C114963e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f319012a;

    /* renamed from: b */
    final /* synthetic */ C114964f f319013b;

    public C114963e(C114964f fVar, View view) {
        this.f319013b = fVar;
        this.f319012a = view;
    }

    public final void onClick(View view) {
        try {
            C114964f fVar = this.f319013b;
            C114799aw a = fVar.f319020g.mo101603a(fVar.f319016c);
            a.f318703a = ((C73841bf) this.f319013b.f319019f.mo27525b()).mo65322a().getString(R.string.like_rate_thank_you_for_your_feedback);
            a.f318704b = C114964f.f319015b;
            a.mo101664b();
            a.mo101665c();
        } catch (Exception e) {
            C59104x d = C114964f.f319014a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSLikeRateSupplier");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(29441)).mo56386p("Failed to show snackbar.");
        }
        this.f319013b.f319018e.mo101650c(this.f319012a).start();
        C114959a aVar = this.f319013b.f319017d;
        String obj = TextUtils.concat(new CharSequence[]{"opa_zero_state_last_click_like_rate_card_ve_", aVar.f318993b.mo79659F(), "_", ((bm) aVar.f318996e.mo27525b()).b()}).toString();
        SharedPreferences.Editor edit = aVar.f318992a.edit();
        edit.putLong(obj, aVar.f318995d.mo26870b());
        edit.apply();
    }
}
