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

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.a */
/* compiled from: PG */
public final class C43414a implements C43448h {

    /* renamed from: a */
    private static final C59071e f113421a = C59071e.m91332i("com.google.android.libraries.web.contrib.contextmenu.a.a");

    /* renamed from: b */
    private final C43446f f113422b;

    /* renamed from: c */
    private final Context f113423c;

    /* renamed from: d */
    private final Fragment f113424d;

    public C43414a(C43446f fVar, Fragment fragment) {
        this.f113422b = fVar;
        this.f113423c = fragment.requireContext();
        this.f113424d = fragment;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_call_number_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89028;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113423c.getResources().getString(R.string.webx_context_menu_call_number_text, new Object[]{this.f113422b.f113504e});
    }

    /* renamed from: d */
    public final void mo46522d() {
        try {
            this.f113424d.startActivity(new Intent("android.intent.action.DIAL").setData(Uri.parse("tel:".concat(String.valueOf(Uri.encode(this.f113422b.f113504e))))));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f113421a.mo56226d()).mo56382g(e)).mo56372aa(54078)).mo56386p("No activity found to call number.");
        }
    }
}
