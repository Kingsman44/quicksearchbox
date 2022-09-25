package com.google.android.libraries.search.assistant.p2786t.p2790b.p2791a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.C1832s;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.assistant.notification.p2712c.C34867a;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.t.b.a.c */
/* compiled from: PG */
public final class C36469c {

    /* renamed from: a */
    public static final C59071e f95212a = C59071e.m91332i("com.google.android.libraries.search.assistant.t.b.a.c");

    /* renamed from: b */
    private final Context f95213b;

    /* renamed from: c */
    private final C46428ao f95214c;

    public C36469c(Context context, C46428ao aoVar) {
        this.f95213b = context;
        this.f95214c = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo40175a(PendingIntent pendingIntent, Intent intent) {
        return C2169h.m6027a(new C36468b(this, pendingIntent, intent));
    }

    /* renamed from: b */
    public final Optional mo40176b(Notification notification) {
        return Optional.ofNullable((C1832s) C34867a.m63630b(notification).orElse(null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo40177c(PendingIntent pendingIntent, Intent intent, C2164c cVar) {
        try {
            pendingIntent.send(this.f95213b, 0, intent, new C36467a(cVar), this.f95214c);
            return "TriggerActionPendingIntent";
        } catch (PendingIntent.CanceledException e) {
            ((C59052c) ((C59052c) ((C59052c) f95212a.mo56226d()).mo56382g(e)).mo56372aa(51490)).mo56386p("Failed to trigger action PendingIntent");
            cVar.mo5439d(e);
            return "TriggerActionPendingIntent";
        }
    }
}
