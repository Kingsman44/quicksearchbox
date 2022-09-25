package com.google.android.apps.search.pronunciationlearning.p10638ui.practicing;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141512e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.practicing.g */
/* compiled from: PG */
public final class C141503g {

    /* renamed from: a */
    public final ProntoFeedbackView f384105a;

    /* renamed from: b */
    public final C141512e f384106b;

    /* renamed from: c */
    public final C141501e f384107c;

    public C141503g(ProntoFeedbackView prontoFeedbackView, C141512e eVar, C141501e eVar2) {
        this.f384105a = prontoFeedbackView;
        this.f384106b = eVar;
        this.f384107c = eVar2;
    }

    /* renamed from: a */
    public final int mo116524a(int i) {
        return C1878d.m5128a(this.f384105a.getContext(), i);
    }

    /* renamed from: b */
    public final void mo116525b() {
        TextView textView = (TextView) this.f384105a.findViewById(R.id.pronunciationlearning_extra_message_feedback_text);
        textView.setCompoundDrawablesWithIntrinsicBounds(C1877c.m5125a(this.f384105a.getContext(), R.drawable.pronunciationlearning_error_message_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setTextColor(mo116524a(R.color.agsa_color_error));
        String str = (String) this.f384106b.f384126d.get("GeneralErrorMessageKey");
        str.getClass();
        textView.setText(str);
    }
}
