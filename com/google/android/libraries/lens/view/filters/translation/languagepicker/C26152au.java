package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.logging.p2185ve.synthetic.dialogs.C28459d;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.base.C58833ax;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.au */
/* compiled from: PG */
public final /* synthetic */ class C26152au implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ LanguagePickerFragmentPeer f71060a;

    /* renamed from: b */
    public final /* synthetic */ MaterialToolbar f71061b;

    public /* synthetic */ C26152au(LanguagePickerFragmentPeer languagePickerFragmentPeer, MaterialToolbar materialToolbar) {
        this.f71060a = languagePickerFragmentPeer;
        this.f71061b = materialToolbar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71060a;
        MaterialToolbar materialToolbar = this.f71061b;
        C28306ab abVar = languagePickerFragmentPeer.f71023t;
        View a = C28459d.m53186a(languagePickerFragmentPeer.f71020q);
        C28313c a2 = languagePickerFragmentPeer.f71023t.f76990a.mo33805a(C28427h.m53115a(101808));
        a2.mo33859g(C45954d.m82060a(languagePickerFragmentPeer.f71025v.f69824a));
        a2.mo33859g(C28375ak.m53061c(51781));
        abVar.mo33801b(a, a2);
        ArrayList arrayList = new ArrayList();
        CharSequence h = materialToolbar.mo2397h();
        h.getClass();
        materialToolbar.findViewsWithText(arrayList, h, 2);
        C58833ax j = C58833ax.m90833j(!arrayList.isEmpty() ? (ImageButton) arrayList.get(0) : null);
        if (j.mo56113h()) {
            languagePickerFragmentPeer.f71023t.mo33801b((View) j.mo56107c(), languagePickerFragmentPeer.f71023t.f76990a.mo33805a(C28427h.m53115a(116879)));
        }
    }
}
