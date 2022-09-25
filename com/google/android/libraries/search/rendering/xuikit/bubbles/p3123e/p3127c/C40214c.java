package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3127c;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.c.c */
/* compiled from: PG */
final class C40214c implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C40215d f105664a;

    public C40214c(C40215d dVar) {
        this.f105664a = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47810es.m84979s(this.f105664a.f105665a.requireContext(), new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:".concat(String.valueOf(this.f105664a.f105665a.requireContext().getPackageName())))));
    }
}
