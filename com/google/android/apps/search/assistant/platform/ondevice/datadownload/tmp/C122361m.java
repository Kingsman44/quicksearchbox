package com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.tmp.m */
/* compiled from: PG */
public final /* synthetic */ class C122361m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f339258a;

    /* renamed from: b */
    public final /* synthetic */ String f339259b;

    public /* synthetic */ C122361m(Context context, String str) {
        this.f339258a = context;
        this.f339259b = str;
    }

    public final Object apply(Object obj) {
        Context context = this.f339258a;
        String str = this.f339259b;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, C147798a.m240896b((Intent) obj, 1409286144, 0), 1409286144);
        if (broadcast == null) {
            ((C59052c) ((C59052c) C122362n.f339260a.mo56226d()).mo56372aa(34756)).mo56389s("Error while creating intent %s", str);
        }
        return Optional.ofNullable(broadcast);
    }
}
