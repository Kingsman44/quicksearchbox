package com.google.android.apps.gsa.staticplugins.p7960g.p7963c;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.c.c */
/* compiled from: PG */
final class C101282c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f282672a;

    /* renamed from: b */
    final /* synthetic */ C101285f f282673b;

    public C101282c(C101285f fVar, boolean z) {
        this.f282673b = fVar;
        this.f282672a = z;
    }

    public final void run() {
        C101285f fVar = this.f282673b;
        ObjectAnimator.ofArgb(fVar.f282680d, "backgroundColor", new int[]{fVar.f54539k.getResources().getColor(R.color.screen_assist_search_scrim), -1}).setDuration(400).start();
        if (this.f282672a) {
            ((C59052c) ((C59052c) C101285f.f282677a.mo56224b()).mo56372aa(13853)).mo56389s("sharing image %s", this.f282673b.f282683g);
            C101285f fVar2 = this.f282673b;
            Uri uri = fVar2.f282683g;
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/png");
            intent.setFlags(268435456);
            intent.putExtra("android.intent.extra.STREAM", uri);
            Intent createChooser = Intent.createChooser(intent, fVar2.f54539k.getString(R.string.screen_assist_share_title));
            createChooser.addFlags(1);
            fVar2.f54539k.startActivityForResult(createChooser, 0);
            fVar2.mo92219a(C89849ae.SHARE_SCREENSHOT_SUCCESSFUL);
        }
    }
}
