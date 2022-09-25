package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.b */
/* compiled from: PG */
public final /* synthetic */ class C101953b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101965f f284445a;

    /* renamed from: b */
    public final /* synthetic */ View f284446b;

    /* renamed from: c */
    public final /* synthetic */ int f284447c;

    /* renamed from: d */
    public final /* synthetic */ int f284448d;

    /* renamed from: e */
    public final /* synthetic */ String f284449e;

    public /* synthetic */ C101953b(C101965f fVar, View view, int i, int i2, String str) {
        this.f284445a = fVar;
        this.f284446b = view;
        this.f284447c = i;
        this.f284448d = i2;
        this.f284449e = str;
    }

    public final void run() {
        CharSequence charSequence;
        int i;
        int i2;
        int i3;
        C101965f fVar = this.f284445a;
        View view = this.f284446b;
        int i4 = this.f284447c;
        int i5 = this.f284448d;
        String str = this.f284449e;
        if (fVar.mo92745e()) {
            charSequence = fVar.f284522e.mo93022d().getText();
        } else {
            charSequence = ((TextView) view.findViewById(R.id.hotword_enrollment_query)).getText();
        }
        ((C59052c) ((C59052c) C101965f.f284518a.mo56224b()).mo56372aa(20443)).mo56359L("#updateTextColorOnUiThread currentUtteranceIdx: %s, firstXWords: %s, query: %s", Integer.valueOf(i4), Integer.valueOf(i5), charSequence);
        if (!(charSequence instanceof Spannable)) {
            ((C59052c) ((C59052c) C101965f.f284518a.mo56226d()).mo56372aa(20444)).mo56386p("Attempting to update text color when the current query text is not Spannable");
            return;
        }
        Spannable spannable = (Spannable) charSequence;
        int i6 = 0;
        if (i5 == 0) {
            Object[] spans = spannable.getSpans(0, charSequence.length(), Object.class);
            int length = spans.length;
            while (i6 < length) {
                Object obj = spans[i6];
                if ((obj instanceof ForegroundColorSpan) || (obj instanceof StyleSpan)) {
                    spannable.removeSpan(obj);
                }
                i6++;
            }
            return;
        }
        int i7 = -1;
        if (fVar.mo92745e()) {
            C101970k kVar = fVar.f284520c;
            if (i4 == 0) {
                i3 = R.string.hotword_enrollment_utterance_title_with_query_first;
                i2 = 0;
            } else {
                i2 = i4;
                i3 = R.string.hotword_enrollment_utterance_title_with_query_second;
            }
            String format = String.format(kVar.getString(i3), new Object[]{BuildConfig.FLAVOR});
            int length2 = format.length();
            if (charSequence.toString().startsWith(format) && charSequence.length() > length2) {
                i6 = length2 + 1;
            }
            i = (i5 == -1 || i6 == 0) ? -1 : length2 + C101961bh.m168748b(charSequence.toString().substring(length2), i5, str);
            i4 = i2;
        } else {
            if (charSequence.length() > 0) {
                i6 = 1;
            }
            if (i5 == -1) {
                i = -1;
            } else {
                i = C101961bh.m168748b(charSequence.toString(), i5, str);
            }
        }
        if (i != -1) {
            i7 = i;
        } else if (charSequence.length() > 0) {
            i7 = -1 + charSequence.length();
        }
        if (i7 > i6) {
            spannable.setSpan(new ForegroundColorSpan(fVar.f284520c.getResources().getColor(i4 < 2 ? R.color.tisid_query_yellow : R.color.tisid_query_green)), i6, i7, 33);
        }
    }
}
