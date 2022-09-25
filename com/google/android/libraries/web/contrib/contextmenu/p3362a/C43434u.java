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

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.u */
/* compiled from: PG */
public final class C43434u implements C43448h {

    /* renamed from: a */
    private static final C59071e f113469a = C59071e.m91332i("com.google.android.libraries.web.contrib.contextmenu.a.u");

    /* renamed from: b */
    private final C43446f f113470b;

    /* renamed from: c */
    private final Context f113471c;

    /* renamed from: d */
    private final Fragment f113472d;

    public C43434u(C43446f fVar, Fragment fragment) {
        this.f113470b = fVar;
        this.f113471c = fragment.requireContext();
        this.f113472d = fragment;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_send_email_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89034;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113471c.getResources().getString(R.string.webx_context_menu_send_email_text, new Object[]{this.f113470b.f113505f});
    }

    /* renamed from: d */
    public final void mo46522d() {
        try {
            Fragment fragment = this.f113472d;
            String str = this.f113470b.f113505f;
            fragment.startActivity(new Intent("android.intent.action.SENDTO").setData(Uri.parse("mailto:")).putExtra("android.intent.extra.EMAIL", new String[]{str}));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f113469a.mo56226d()).mo56382g(e)).mo56372aa(54081)).mo56386p("No activity found to send email.");
        }
    }
}
