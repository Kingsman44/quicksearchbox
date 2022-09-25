package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.C1831r;
import androidx.core.app.C1836w;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.v.d;
import com.google.android.apps.gsa.nga.shared.android.p6325a.C80943d;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.al */
/* compiled from: PG */
public final /* synthetic */ class C76301al implements C80943d {

    /* renamed from: a */
    public final /* synthetic */ C76303an f211340a;

    /* renamed from: b */
    public final /* synthetic */ Locale f211341b;

    /* renamed from: c */
    public final /* synthetic */ Uri f211342c;

    /* renamed from: d */
    public final /* synthetic */ Bitmap f211343d;

    public /* synthetic */ C76301al(C76303an anVar, Locale locale, Uri uri, Bitmap bitmap) {
        this.f211340a = anVar;
        this.f211341b = locale;
        this.f211342c = uri;
        this.f211343d = bitmap;
    }

    /* renamed from: a */
    public final void mo71377a(C1839z zVar) {
        C76303an anVar = this.f211340a;
        Locale locale = this.f211341b;
        Uri uri = this.f211342c;
        Bitmap bitmap = this.f211343d;
        zVar.f5686f = C1839z.m5037c(anVar.f211348d.mo75121a(locale).getString(R.string.nga_screenshot_taken_content, new Object[0]));
        zVar.f5687g = PendingIntent.getActivity(anVar.f211345a, 0, Intent.createChooser(d.b(uri), (CharSequence) null), 201326592);
        C1836w wVar = new C1836w();
        wVar.mo5012e(bitmap);
        wVar.mo5011d((Bitmap) null);
        zVar.mo5022k(wVar);
        zVar.f5688h = bitmap;
        Intent c = d.c(uri);
        c.setClipData(new ClipData(new ClipDescription("content", new String[]{"text/plain"}), new ClipData.Item(uri)));
        c.addFlags(1);
        zVar.mo5017f(new C1831r(anVar.f211348d.mo75121a(locale).getString(R.string.nga_screenshot_share_action, new Object[0]), PendingIntent.getBroadcast(anVar.f211345a, 103, C76303an.m122896a(anVar, anVar.f211345a, new C76296ag(Intent.createChooser(c, BuildConfig.FLAVOR, PendingIntent.getBroadcast(anVar.f211345a, 104, C76303an.m122896a(anVar, anVar.f211345a, C76295af.f211333a), 1409286144).getIntentSender()).addFlags(268468224).addFlags(1))), 335544320)).mo5008a());
        zVar.mo5017f(new C1831r(anVar.f211348d.mo75121a(locale).getString(R.string.nga_screenshot_edit_action, new Object[0]), PendingIntent.getBroadcast(anVar.f211345a, 101, C76303an.m122896a(anVar, anVar.f211345a, new C76297ah(anVar.f211347c.a(uri))), 335544320)).mo5008a());
        zVar.mo5017f(new C1831r(anVar.f211348d.mo75121a(locale).getString(R.string.nga_screenshot_delete_action, new Object[0]), PendingIntent.getBroadcast(anVar.f211345a, 102, C76303an.m122896a(anVar, anVar.f211345a, new C76294ae(uri)), 335544320)).mo5008a());
    }
}
