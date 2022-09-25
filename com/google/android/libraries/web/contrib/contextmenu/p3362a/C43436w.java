package com.google.android.libraries.web.contrib.contextmenu.p3362a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43448h;
import com.google.android.libraries.web.shared.p3445e.C44096a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.web.contrib.contextmenu.a.w */
/* compiled from: PG */
public final class C43436w implements C43448h {

    /* renamed from: a */
    private static final C59071e f113474a = C59071e.m91332i("com.google.android.libraries.web.contrib.contextmenu.a.w");

    /* renamed from: b */
    private final C43446f f113475b;

    /* renamed from: c */
    private final Context f113476c;

    /* renamed from: d */
    private final Fragment f113477d;

    /* renamed from: e */
    private final C44096a f113478e;

    public C43436w(C43446f fVar, Fragment fragment, C44096a aVar) {
        this.f113475b = fVar;
        this.f113476c = fragment.requireContext();
        this.f113477d = fragment;
        this.f113478e = aVar;
    }

    /* renamed from: a */
    public final int mo46519a() {
        return R.id.webx_context_menu_share_image_address_menu_item;
    }

    /* renamed from: b */
    public final int mo46520b() {
        return 89035;
    }

    /* renamed from: c */
    public final String mo46521c() {
        return this.f113476c.getResources().getString(R.string.webx_context_menu_share_image_address_text);
    }

    /* renamed from: d */
    public final void mo46522d() {
        try {
            this.f113477d.startActivity(this.f113478e.mo47066b(Uri.parse(this.f113475b.f113502c), BuildConfig.FLAVOR));
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f113474a.mo56226d()).mo56382g(e)).mo56372aa(54082)).mo56386p("No activity found to share image address.");
        }
    }
}
