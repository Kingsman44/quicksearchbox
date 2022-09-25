package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.k */
/* compiled from: PG */
public final class C43424k implements C43448h {

    /* renamed from: a */
    private static final C59071e f113446a = C59071e.m91332i("com.google.android.libraries.web.contrib.contextmenu.a.k");

    /* renamed from: b */
    private final C43446f f113447b;

    /* renamed from: c */
    private final Context f113448c;

    /* renamed from: d */
    private final Fragment f113449d;

    public C43424k(C43446f fVar, Fragment fragment) {
        this.f113447b = fVar;
        this.f113448c = fragment.requireContext();
        this.f113449d = fragment;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_open_in_maps_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89033;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113448c.getResources().getString(R.string.webx_context_menu_open_in_maps_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        try {
            this.f113449d.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("geo:0,0?q=".concat(String.valueOf(Uri.encode(this.f113447b.f113506g))))));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f113446a.mo56226d()).mo56382g(e)).mo56372aa(54079)).mo56386p("No activity found to open address in Maps.");
        }
    }
}
