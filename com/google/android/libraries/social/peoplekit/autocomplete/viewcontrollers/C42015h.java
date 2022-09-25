package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.h */
/* compiled from: PG */
final class C42015h implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ C42023p f109711a;

    public C42015h(C42023p pVar) {
        this.f109711a = pVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5) {
            if (!TextUtils.isEmpty(this.f109711a.f109728e.getText())) {
                C42023p pVar = this.f109711a;
                if (!pVar.f109731h.mo44460a()) {
                    pVar.f109731h.mo44461b();
                    return true;
                } else if (pVar.mo44499q()) {
                    C42075e eVar = pVar.f109734k;
                    PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                    peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144441D));
                    peopleKitVisualElementPath.mo44564a(pVar.f109736m.f109973a);
                    eVar.mo44577c(4, peopleKitVisualElementPath);
                    return true;
                } else {
                    pVar.f109731h.mo44461b();
                    return true;
                }
            } else {
                C42023p pVar2 = this.f109711a;
                ((InputMethodManager) pVar2.f109725b.getSystemService("input_method")).hideSoftInputFromWindow(pVar2.f109724a.getWindowToken(), 0);
            }
        }
        return false;
    }
}
