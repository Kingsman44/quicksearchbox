package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43445e;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.i */
/* compiled from: PG */
public final class C43422i implements C43448h {

    /* renamed from: a */
    private final C43446f f113441a;

    /* renamed from: b */
    private final Context f113442b;

    /* renamed from: c */
    private final ClipboardManager f113443c;

    public C43422i(C43446f fVar, ClipboardManager clipboardManager, Fragment fragment) {
        this.f113441a = fVar;
        this.f113442b = fragment.requireContext();
        this.f113443c = clipboardManager;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_copy_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89032;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113442b.getResources().getString(R.string.webx_context_menu_copy_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        String str;
        C43445e a = C43445e.m76673a(this.f113441a.f113501b);
        if (a == null) {
            a = C43445e.UNKNOWN;
        }
        if (a == C43445e.EMAIL_ADDRESS) {
            str = this.f113441a.f113505f;
        } else {
            str = a == C43445e.PHONE_NUMBER ? this.f113441a.f113504e : a == C43445e.GEO_ADDRESS ? this.f113441a.f113506g : BuildConfig.FLAVOR;
        }
        this.f113443c.setPrimaryClip(ClipData.newPlainText("copy_menu_item_content", str));
    }
}
