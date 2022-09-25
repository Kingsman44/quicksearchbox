package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.content.Context;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8671d.C115976b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.PasswordRenderer */
/* compiled from: PG */
public final class PasswordRenderer extends C22939d {

    /* renamed from: a */
    public final C115976b f321605a;

    /* renamed from: b */
    public final Context f321606b;

    /* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.PasswordRenderer$URLSpanNoUnderline */
    /* compiled from: PG */
    class URLSpanNoUnderline extends URLSpan {
        private URLSpanNoUnderline(String str) {
            super(str);
        }

        /* renamed from: a */
        public static void m192276a(TextView textView) {
            Spannable spannable = (Spannable) textView.getText();
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                int spanStart = spannable.getSpanStart(uRLSpan);
                int spanEnd = spannable.getSpanEnd(uRLSpan);
                spannable.removeSpan(uRLSpan);
                spannable.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
            }
            textView.setText(spannable);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public PasswordRenderer(C22945j jVar, C115976b bVar, Context context) {
        super(jVar);
        this.f321605a = bVar;
        this.f321606b = context;
    }

    /* renamed from: e */
    public static void m192274e(TextView textView, int i) {
        textView.setText(i);
        textView.setVisibility(0);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f321606b).inflate(R.layout.password_authentication, (ViewGroup) null, false);
        TextInputLayout textInputLayout = (TextInputLayout) frameLayout.findViewById(R.id.payments_auth_password_input_layout);
        textInputLayout.getClass();
        EditText editText = (EditText) frameLayout.findViewById(R.id.payments_auth_password_input);
        editText.getClass();
        Button button = (Button) frameLayout.findViewById(R.id.payments_auth_password_cancel_button);
        button.getClass();
        C28292j jVar = new C28292j(35527);
        jVar.mo33795i(5);
        C28295m.m52919e(button, jVar);
        Button button2 = (Button) frameLayout.findViewById(R.id.payments_auth_password_authorize_button);
        button2.getClass();
        C28292j jVar2 = new C28292j(35526);
        jVar2.mo33795i(5);
        C28295m.m52919e(button2, jVar2);
        CheckBox checkBox = (CheckBox) frameLayout.findViewById(R.id.payments_auth_password_fingerprint_checkbox);
        checkBox.getClass();
        TextView textView = (TextView) frameLayout.findViewById(R.id.payments_auth_fingerprint_failure);
        textView.getClass();
        View findViewById = frameLayout.findViewById(R.id.payments_auth_password_dialog);
        findViewById.getClass();
        C28295m.m52919e(findViewById, new C28292j(35525));
        ((C115981ad) this.f321605a).f321634j.mo28726b(new C115994n(this, editText, textInputLayout, button2));
        TextView textView2 = (TextView) frameLayout.findViewById(R.id.payments_auth_forgot_password);
        textView2.getClass();
        C28292j jVar3 = new C28292j(35528);
        jVar3.mo33795i(5);
        C28295m.m52919e(textView2, jVar3);
        ((C115981ad) this.f321605a).f321625a.mo28726b(new C115999s(this, frameLayout, textView2));
        ((C115981ad) this.f321605a).f321628d.mo28726b(new C116000t(frameLayout));
        ((C115981ad) this.f321605a).f321632h.mo28726b(new C116001u(frameLayout));
        ((C115981ad) this.f321605a).f321633i.mo28726b(new C116002v(frameLayout));
        button2.setText(R.string.payments_auth_password_confirm);
        ((C115981ad) this.f321605a).f321626b.mo28726b(new C116003w(checkBox));
        ((C115981ad) this.f321605a).f321627c.mo28726b(new C116004x(textView));
        ((C115981ad) this.f321605a).f321629e.mo28726b(new C116005y(frameLayout));
        textView2.setOnClickListener(new C89943l(C115995o.f321657a));
        button.setOnClickListener(new C89943l(new C115996p(this)));
        button2.setOnClickListener(new C89943l(new C115997q(this, editText, button2)));
        editText.addTextChangedListener(new C116006z(textInputLayout));
        checkBox.setOnCheckedChangeListener(new C115978aa(this));
        ((C115981ad) this.f321605a).f321631g.mo28726b(new C115998r(this, editText, textInputLayout, button2));
        mo28295iC(frameLayout);
    }
}
