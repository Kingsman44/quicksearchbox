package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43053b;
import com.google.p4281bu.p4282a.C56528bl;
import com.google.p4281bu.p4282a.C56583i;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.protobuf.C62971cq;
import p5304e.p5305a.p5306a.p5333ag.p5334a.C68394s;

/* renamed from: com.google.android.libraries.surveys.internal.view.n */
/* compiled from: PG */
public final class C43156n extends LinearLayout {

    /* renamed from: a */
    public boolean[] f112853a;

    /* renamed from: b */
    public String f112854b;

    /* renamed from: c */
    public C43155m f112855c;

    public C43156n(Context context) {
        super(context);
        setOrientation(1);
    }

    /* renamed from: a */
    public final void mo46215a(C56528bl blVar, boolean[] zArr) {
        if (zArr == null) {
            C56587m mVar = blVar.f150958a;
            if (mVar == null) {
                mVar = C56587m.f151083b;
            }
            this.f112853a = new boolean[mVar.f151085a.size()];
        } else {
            this.f112853a = zArr;
        }
        C56587m mVar2 = blVar.f150958a;
        if (mVar2 == null) {
            mVar2 = C56587m.f151083b;
        }
        C62971cq cqVar = mVar2.f151085a;
        for (int i = 0; i < cqVar.size(); i++) {
            int a = C56583i.m88215a(((C56585k) cqVar.get(i)).f151078a);
            if (a != 0 && a == 4) {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_other_option, this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i);
                CheckBox checkBox = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setContentDescription(getResources().getString(R.string.survey_other_option_hint));
                checkBox.setChecked(this.f112853a[i]);
                checkBox.setOnCheckedChangeListener(new C43153k(this, i));
                checkBox.setTag("OtherPleaseSpecify");
                EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                C43053b.m75957a(editText, (TextView) linearLayout.findViewById(R.id.tv_survey_other_option_pii_info));
                View findViewById = linearLayout.findViewById(R.id.survey_other_option_background);
                findViewById.setOnTouchListener(new C43149g(checkBox, findViewById, editText));
                editText.addTextChangedListener(new C43152j(this, i, checkBox));
                editText.setOnFocusChangeListener(new C43150h(this, i, checkBox, editText));
                if (C68394s.f184742a.mo6453a().mo60381a(getContext())) {
                    editText.setFocusable(false);
                    editText.postDelayed(new C43148f(editText), 500);
                }
            } else {
                boolean z = this.f112853a[i];
                int a2 = C56583i.m88215a(((C56585k) cqVar.get(i)).f151078a);
                if (a2 == 0) {
                    a2 = 1;
                }
                String str = a2 == 5 ? "NoneOfTheAbove" : null;
                String str2 = ((C56585k) cqVar.get(i)).f151080c;
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_item, this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i);
                CheckBox checkBox2 = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setText(str2);
                checkBox2.setContentDescription(str2);
                checkBox2.setChecked(z);
                checkBox2.setOnCheckedChangeListener(new C43153k(this, i));
                frameLayout.setOnClickListener(new C43151i(checkBox2));
                if (str != null) {
                    checkBox2.setTag(str);
                }
            }
        }
    }
}
