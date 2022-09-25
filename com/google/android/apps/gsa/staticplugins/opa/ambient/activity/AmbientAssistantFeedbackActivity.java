package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0383d;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.core.content.C1877c;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* compiled from: PG */
public final class AmbientAssistantFeedbackActivity extends C106402ac {

    /* renamed from: j */
    public static Bitmap f296768j;

    /* renamed from: k */
    public C90465g f296769k;

    /* renamed from: l */
    public C106428w f296770l;

    /* renamed from: n */
    private AmbientAssistantFeedbackFragment f296771n;

    /* renamed from: o */
    private Bitmap f296772o;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.al);
        this.f296772o = f296768j;
        f296768j = null;
        super.onCreate(bundle);
        setContentView((int) R.layout.aa_feedback_activity);
        AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment = (AmbientAssistantFeedbackFragment) this.f727a.f739a.f744e.f634a.mo670b(R.id.feedback_fragment);
        this.f296771n = ambientAssistantFeedbackFragment;
        if (ambientAssistantFeedbackFragment == null || !ambientAssistantFeedbackFragment.f296791s) {
            C90461c cVar = new C90461c();
            cVar.f252699k = false;
            cVar.f252693e = "com.google.android.googlequicksearchbox.AA_FEEDBACK_CATEGORY";
            cVar.mo84200d("Smartspace feedback", Boolean.toString(true));
            this.f296769k.mo84210a(this).mo84209b(cVar, 1);
            return;
        }
        C0356aq aqVar = (C0356aq) mo1322k();
        aqVar.mo1163P();
        C0383d dVar = aqVar.f1215o;
        if (dVar != null) {
            dVar.mo1241l(C1877c.m5125a(this, R.drawable.quantum_ic_close_white_24));
            dVar.mo1223A();
            dVar.mo1239j(true);
            dVar.mo1255z();
            dVar.mo1244o(getResources().getString(R.string.feedback_title));
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        mo1322k().mo1176d().inflate(R.menu.feedback_action_bar, menu);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Optional optional;
        if (menuItem.getItemId() == R.id.feedback_action_next) {
            RadioGroup radioGroup = (RadioGroup) mo1322k().mo1177e(R.id.feedback_group_context);
            RadioGroup radioGroup2 = (RadioGroup) mo1322k().mo1177e(R.id.feedback_group_context_location_card);
            if (!(radioGroup.getCheckedRadioButtonId() == -1 && radioGroup2.getCheckedRadioButtonId() == -1) && (radioGroup.getCheckedRadioButtonId() != R.id.feedback_context_other || !TextUtils.isEmpty(((EditText) mo1322k().mo1177e(R.id.feedback_context_other_text)).getText().toString()))) {
                AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment = this.f296771n;
                if (ambientAssistantFeedbackFragment != null) {
                    C106428w wVar = this.f296770l;
                    String b = ambientAssistantFeedbackFragment.mo95506b();
                    C58495hd a = this.f296771n.mo95505a();
                    AmbientAssistantFeedbackFragment ambientAssistantFeedbackFragment2 = this.f296771n;
                    CheckBox checkBox = ambientAssistantFeedbackFragment2.f296777e;
                    if (checkBox == null || ambientAssistantFeedbackFragment2.f296778f == null || !checkBox.isChecked()) {
                        optional = Optional.empty();
                    } else {
                        optional = Optional.m71637of(Duration.ofMinutes((long) ambientAssistantFeedbackFragment2.getContext().getResources().getIntArray(R.array.feedback_location_history_minutes)[ambientAssistantFeedbackFragment2.f296778f.getSelectedItemPosition()]));
                    }
                    wVar.mo95526a(this, b, a, optional, this.f296771n.mo95507d(), this.f296772o);
                }
            } else {
                Toast.makeText(this, R.string.feedback_feature_required, 0).show();
                return true;
            }
        } else if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }
}
