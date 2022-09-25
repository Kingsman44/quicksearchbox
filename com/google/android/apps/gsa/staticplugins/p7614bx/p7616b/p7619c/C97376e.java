package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97349a;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7618b.C97350b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.common.C10678R;
import com.google.android.material.bottomsheet.C44565p;
import com.google.android.material.bottomsheet.C44566q;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.e */
/* compiled from: PG */
public final class C97376e extends C44566q {

    /* renamed from: a */
    public boolean f271949a;

    /* renamed from: b */
    public C97394w f271950b;

    /* renamed from: a */
    private final void m161148a(TextView textView, int i) {
        if (textView != null) {
            textView.setText(Html.fromHtml(getString(i)));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C97349a aVar = this.f271950b.f271969a.f271891e;
        ((C97350b) aVar).f271880a.mo28345s("onIncognitoInterstitialCancelled", "ParticleDiscEventsDispatcher", new Bundle());
    }

    public final /* bridge */ /* synthetic */ Dialog onCreateDialog(Bundle bundle) {
        C44565p pVar = new C44565p(getContext(), C10678R.style.Theme_GoogleMaterial_DayNight_BottomSheetDialog);
        pVar.setContentView((int) R.layout.incognito_interstitial);
        m161148a((TextView) pVar.mo1197b().mo1177e(R.id.visibility_warning_intro), R.string.incognito_interstitial_visibility_warning_intro);
        m161148a((TextView) pVar.mo1197b().mo1177e(R.id.tabs_warning), R.string.incognito_interstitial_tabs_warning);
        if (this.f271950b != null) {
            CheckBox checkBox = (CheckBox) pVar.mo1197b().mo1177e(R.id.do_not_show_checkbox);
            if (checkBox != null) {
                checkBox.setChecked(this.f271949a);
                checkBox.setOnCheckedChangeListener(new C97373b(this));
            }
            Button button = (Button) pVar.mo1197b().mo1177e(R.id.learn_more_button);
            if (button != null) {
                button.setOnClickListener(new C97374c(this));
            }
            Button button2 = (Button) pVar.mo1197b().mo1177e(R.id.continue_button);
            if (button2 != null) {
                button2.setOnClickListener(new C97375d(this));
            }
        }
        return pVar;
    }
}
