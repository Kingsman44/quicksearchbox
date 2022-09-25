package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.g */
/* compiled from: PG */
public final class C43420g implements C43448h {

    /* renamed from: a */
    private final C43446f f113436a;

    /* renamed from: b */
    private final Context f113437b;

    /* renamed from: c */
    private final ClipboardManager f113438c;

    public C43420g(C43446f fVar, ClipboardManager clipboardManager, Fragment fragment) {
        this.f113436a = fVar;
        this.f113437b = fragment.requireContext();
        this.f113438c = clipboardManager;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_copy_link_text_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89031;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113437b.getResources().getString(R.string.webx_context_menu_copy_link_text_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        this.f113438c.setPrimaryClip(ClipData.newPlainText("copy_link_text", this.f113436a.f113507h));
    }
}
