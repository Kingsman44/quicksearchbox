package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.android.libraries.web.shared.p3442b.C44081a;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.e */
/* compiled from: PG */
public final class C43418e implements C43448h {

    /* renamed from: a */
    private final C43446f f113431a;

    /* renamed from: b */
    private final Context f113432b;

    /* renamed from: c */
    private final C44081a f113433c;

    public C43418e(C43446f fVar, C44081a aVar, Fragment fragment) {
        this.f113431a = fVar;
        this.f113432b = fragment.requireContext();
        this.f113433c = aVar;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_copy_link_address_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89030;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113432b.getResources().getString(R.string.webx_context_menu_copy_link_address_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        this.f113433c.mo47048b(this.f113431a.f113503d);
    }
}
