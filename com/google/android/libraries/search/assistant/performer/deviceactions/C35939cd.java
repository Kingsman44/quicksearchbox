package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.C1831r;
import androidx.core.app.C1836w;
import androidx.core.app.C1839z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35973h;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.C35979n;
import com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.ScreenshotNotificationReceiver_Receiver;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.cd */
/* compiled from: PG */
public final /* synthetic */ class C35939cd implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35940ce f94099a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f94100b;

    public /* synthetic */ C35939cd(C35940ce ceVar, Bitmap bitmap) {
        this.f94099a = ceVar;
        this.f94100b = bitmap;
    }

    public final Object apply(Object obj) {
        C35940ce ceVar = this.f94099a;
        Bitmap bitmap = this.f94100b;
        Uri uri = (Uri) obj;
        C35973h hVar = ceVar.f94106f;
        C35979n nVar = ceVar.f94105e;
        C1839z zVar = new C1839z((Context) nVar.f94161a.mo17428b(), "com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.ScreenshotNotificationChannel");
        zVar.f5679J.icon = R.drawable.ma_screenshot_clientop_notification_icon;
        zVar.f5705y = "recommendation";
        zVar.f5685e = C1839z.m5037c(((Context) nVar.f94161a.mo17428b()).getString(R.string.ma_screenshot_taken_title));
        zVar.mo5015d(2, false);
        zVar.mo5015d(16, true);
        zVar.f5686f = C1839z.m5037c(((Context) nVar.f94161a.mo17428b()).getString(R.string.ma_screenshot_taken_content));
        zVar.f5687g = C147798a.m240895a((Context) nVar.f94161a.mo17428b(), 0, Intent.createChooser(new Intent("android.intent.action.VIEW").setFlags(268435456).addFlags(1).setDataAndType(uri, "image/png"), (CharSequence) null), 1409286144);
        C1836w wVar = new C1836w();
        wVar.mo5012e(bitmap);
        wVar.mo5011d((Bitmap) null);
        zVar.mo5022k(wVar);
        zVar.f5688h = bitmap;
        Context context = (Context) nVar.f94161a.mo17428b();
        Intent putExtra = new Intent("android.intent.action.SEND").setType("image/png").putExtra("android.intent.extra.STREAM", uri);
        putExtra.setClipData(new ClipData(new ClipDescription("content", new String[]{"text/plain"}), new ClipData.Item(uri)));
        putExtra.addFlags(1);
        zVar.mo5017f(new C1831r(context.getString(R.string.ma_screenshot_share_action), C147798a.m240895a(context, 103, Intent.createChooser(putExtra, (CharSequence) null).addFlags(268468224).addFlags(1), 335544320)).mo5008a());
        zVar.mo5017f(new C1831r(((Context) nVar.f94161a.mo17428b()).getString(R.string.ma_screenshot_edit_action), PendingIntent.getBroadcast((Context) nVar.f94161a.mo17428b(), 101, C147798a.m240896b(new Intent("com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.EDIT_ACTION", uri, (Context) nVar.f94161a.mo17428b(), ScreenshotNotificationReceiver_Receiver.class), 335544320, 0), 335544320)).mo5008a());
        zVar.mo5017f(new C1831r(((Context) nVar.f94161a.mo17428b()).getString(R.string.ma_screenshot_delete_action), PendingIntent.getBroadcast((Context) nVar.f94161a.mo17428b(), 102, C147798a.m240896b(new Intent("com.google.android.libraries.search.assistant.performer.deviceactions.screenshot.DELETE_ACTION", uri, (Context) nVar.f94161a.mo17428b(), ScreenshotNotificationReceiver_Receiver.class), 335544320, 0), 335544320)).mo5008a());
        hVar.mo39912b(zVar.mo5013a());
        return C36180b.f94544a;
    }
}
