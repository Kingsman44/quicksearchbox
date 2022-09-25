package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.support.p033v7.widget.C0701hi;
import android.support.p033v7.widget.SearchView;
import android.view.MenuItem;
import androidx.core.p098j.C2043bi;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bi */
/* compiled from: PG */
final class C26167bi implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ C26197x f71077a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f71078b;

    /* renamed from: c */
    final /* synthetic */ SearchView f71079c;

    /* renamed from: d */
    final /* synthetic */ LanguagePickerFragmentPeer f71080d;

    public C26167bi(LanguagePickerFragmentPeer languagePickerFragmentPeer, C26197x xVar, AppBarLayout appBarLayout, SearchView searchView) {
        this.f71080d = languagePickerFragmentPeer;
        this.f71077a = xVar;
        this.f71078b = appBarLayout;
        this.f71079c = searchView;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71080d;
        this.f71077a.mo31419b(C58836b.f156633a);
        languagePickerFragmentPeer.mo31337b();
        AppBarLayout appBarLayout = this.f71078b;
        appBarLayout.mo47405o(true, C2043bi.m5570ax(appBarLayout), true);
        this.f71080d.f71004a.getScrollingChildHelper().mo5279a(true);
        LanguagePickerFragmentPeer languagePickerFragmentPeer2 = this.f71080d;
        if (!languagePickerFragmentPeer2.f71015l) {
            languagePickerFragmentPeer2.f71027x.mo19974a(C37194a.f98503bM.mo40815i(C62722b.CANCELLED));
        }
        this.f71079c.setOnQueryTextListener((C0701hi) null);
        return true;
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        LanguagePickerFragmentPeer languagePickerFragmentPeer = this.f71080d;
        this.f71077a.mo31419b(C58833ax.m90834k(BuildConfig.FLAVOR));
        languagePickerFragmentPeer.mo31337b();
        AppBarLayout appBarLayout = this.f71078b;
        appBarLayout.mo47405o(false, C2043bi.m5570ax(appBarLayout), true);
        this.f71080d.f71004a.getScrollingChildHelper().mo5279a(false);
        this.f71080d.f71027x.mo19974a(C37194a.f98502bL);
        this.f71079c.setOnQueryTextListener(new C26166bh(this));
        return true;
    }
}
