package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.android.libraries.web.shared.p3445e.C44096a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.y */
/* compiled from: PG */
public final class C43438y implements C43448h {

    /* renamed from: a */
    private static final C59071e f113481a = C59071e.m91332i("com.google.android.libraries.web.contrib.contextmenu.a.y");

    /* renamed from: b */
    private final C43446f f113482b;

    /* renamed from: c */
    private final Context f113483c;

    /* renamed from: d */
    private final Fragment f113484d;

    /* renamed from: e */
    private final C44096a f113485e;

    public C43438y(C43446f fVar, Fragment fragment, C44096a aVar) {
        this.f113482b = fVar;
        this.f113483c = fragment.requireContext();
        this.f113484d = fragment;
        this.f113485e = aVar;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_share_link_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89036;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113483c.getResources().getString(R.string.webx_context_menu_share_link_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        try {
            this.f113484d.startActivity(this.f113485e.mo47066b(Uri.parse(this.f113482b.f113503d), this.f113482b.f113507h));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f113481a.mo56226d()).mo56382g(e)).mo56372aa(54083)).mo56386p("No activity found to share link.");
        }
    }
}
