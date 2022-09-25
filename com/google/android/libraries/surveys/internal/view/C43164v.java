package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43053b;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.p4281bu.p4282a.C56530bn;

/* renamed from: com.google.android.libraries.surveys.internal.view.v */
/* compiled from: PG */
public final class C43164v extends LinearLayout {

    /* renamed from: a */
    public C43163u f112860a;

    public C43164v(Context context) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.survey_question_open_text_item, this, true);
    }

    /* renamed from: a */
    public final void mo46219a(C56530bn bnVar) {
        EditText editText = (EditText) findViewById(R.id.survey_open_text);
        C43053b.m75957a(editText, (TextView) findViewById(R.id.survey_open_text_personal_info));
        editText.setSingleLine(false);
        if (!bnVar.f150961a.isEmpty()) {
            editText.setHint(bnVar.f150961a);
        }
        if (!C43066o.m75994o(getContext())) {
            editText.requestFocus();
        }
        editText.addTextChangedListener(new C43162t(this));
    }
}
