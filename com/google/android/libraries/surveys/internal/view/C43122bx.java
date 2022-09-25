package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.surveys.internal.p3328e.C43053b;
import com.google.android.libraries.surveys.internal.p3328e.C43066o;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.p4281bu.p4282a.C56567cx;
import com.google.p4281bu.p4282a.C56568cy;
import com.google.p4281bu.p4282a.C56583i;
import com.google.p4281bu.p4282a.C56585k;
import com.google.p4281bu.p4282a.C56587m;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.libraries.surveys.internal.view.bx */
/* compiled from: PG */
public final class C43122bx extends LinearLayout {

    /* renamed from: b */
    public static final /* synthetic */ int f112781b = 0;

    /* renamed from: c */
    private static final C58495hd f112782c = C58495hd.m89904r(0, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_satisfied_grey600_36), 1, Integer.valueOf(R.drawable.quantum_ic_sentiment_satisfied_grey600_36), 2, Integer.valueOf(R.drawable.quantum_ic_sentiment_neutral_grey600_36), 3, Integer.valueOf(R.drawable.quantum_ic_sentiment_dissatisfied_grey600_36), 4, Integer.valueOf(R.drawable.quantum_ic_sentiment_very_dissatisfied_grey600_36));

    /* renamed from: a */
    public C43120bv f112783a;

    public C43122bx(Context context) {
        super(context);
        setOrientation(1);
    }

    /* renamed from: a */
    public final void mo46182a(C56568cy cyVar) {
        boolean z;
        int a;
        C56587m mVar = cyVar.f151044a;
        if (mVar == null) {
            mVar = C56587m.f151083b;
        }
        View[] viewArr = new View[mVar.f151085a.size()];
        C56587m mVar2 = cyVar.f151044a;
        if (mVar2 == null) {
            mVar2 = C56587m.f151083b;
        }
        C62971cq cqVar = mVar2.f151085a;
        int i = cyVar.f151045b;
        int a2 = C56567cx.m88211a(i);
        if (((a2 != 0 && a2 == 4) || ((a = C56567cx.m88211a(i)) != 0 && a == 5)) && cqVar.size() == 5) {
            z = true;
        } else {
            z = false;
        }
        for (int i2 = 0; i2 < cqVar.size(); i2++) {
            int a3 = C56583i.m88215a(((C56585k) cqVar.get(i2)).f151078a);
            if (a3 != 0 && a3 == 4) {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_other_entry, this, true);
                EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                C43053b.m75957a(editText, (TextView) linearLayout.findViewById(R.id.survey_other_option_personal_info));
                linearLayout.findViewById(R.id.survey_other_option_background).setOnClickListener(new C43116br(editText));
                editText.addTextChangedListener(new C43119bu(this, cqVar, i2));
                editText.setOnFocusChangeListener(new C43117bs(this, editText, cqVar, i2));
                viewArr[i2] = editText;
            } else {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_item, this, true);
                View childAt = getChildAt(getChildCount() - 1);
                viewArr[i2] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.survey_multiple_choice_text);
                textView.setText(((C56585k) cqVar.get(i2)).f151080c);
                textView.setContentDescription(((C56585k) cqVar.get(i2)).f151080c);
                ImageView imageView = (ImageView) viewArr[i2].findViewById(R.id.survey_multiple_choice_icon);
                if (z) {
                    int a4 = C56567cx.m88211a(cyVar.f151045b);
                    imageView.setImageDrawable(C43066o.m75981b(C0678gm.m2375e().mo3100c(getContext(), ((Integer) f112782c.get(Integer.valueOf((a4 != 0 && a4 == 5) ? ((C58729pv) f112782c).f156487c - (i2 + 1) : i2))).intValue()), getContext(), C1878d.m5128a(getContext(), R.color.survey_grey_icon_color)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr[i2].setOnClickListener(new C43118bt(this, viewArr, cqVar, i2));
            }
        }
    }
}
