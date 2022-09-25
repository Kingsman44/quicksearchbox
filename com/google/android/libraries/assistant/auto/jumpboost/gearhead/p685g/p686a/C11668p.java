package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.p686a;

import android.content.Context;
import android.graphics.drawable.Icon;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p685g.C11652a;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13326j;
import com.google.android.libraries.assistant.auto.tng.common.p933q.C13336t;
import com.google.android.libraries.search.assistant.notification.data.AutoValue_MessageNotification_Actions;
import com.google.android.libraries.search.assistant.notification.data.C34881b;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.notification.p2709a.C34852b;
import com.google.android.libraries.search.assistant.notification.p2712c.C34871e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.g.a.p */
/* compiled from: PG */
public final class C11668p implements C11652a {

    /* renamed from: a */
    public final C34852b f37652a;

    /* renamed from: b */
    public final Executor f37653b;

    /* renamed from: c */
    private final Context f37654c;

    public C11668p(Context context, C34852b bVar, Executor executor) {
        this.f37654c = context;
        this.f37652a = bVar;
        this.f37653b = executor;
    }

    /* renamed from: b */
    public static MessageNotification.Actions m27352b(MessagingInfo messagingInfo) {
        return new AutoValue_MessageNotification_Actions(Optional.m71637of(messagingInfo.f387121g), Optional.ofNullable(messagingInfo.f387122h), Optional.ofNullable(messagingInfo.f387123i));
    }

    /* renamed from: a */
    public final C60870cx mo20102a(List list, boolean z, String str) {
        C47633f d = C13336t.m29581d(list, new C11667o(this, z, str), this.f37653b);
        return C13336t.m29578a(C47633f.m84733g(d).mo51515h(C13326j.f41055a, this.f37653b), this.f37653b);
    }

    /* renamed from: c */
    public final MessageNotification mo20105c(String str, String str2, long j, boolean z, MessagingInfo messagingInfo) {
        String str3;
        String str4;
        String format = String.format("key-%s", new Object[]{Integer.toHexString(messagingInfo.hashCode())});
        C34881b bVar = new C34881b();
        bVar.f92518f = Optional.m71637of(str);
        bVar.f92519g = Optional.m71637of("text/plain");
        bVar.mo39594f(str2);
        bVar.f92515c = Optional.m71637of(Long.valueOf(j));
        if (z) {
            str3 = "sms";
        } else {
            str3 = messagingInfo.f387124j;
        }
        bVar.mo39599k(str3);
        if (z) {
            str4 = "SMS";
        } else {
            str4 = C34871e.m63635a(this.f37654c, messagingInfo.f387124j);
        }
        bVar.mo39595g(str4);
        bVar.f92514b = Optional.m71637of("msg");
        bVar.mo39598j(format);
        bVar.f92525m = Optional.m71637of(m27352b(messagingInfo));
        bVar.mo39597i(false);
        bVar.mo39592d(C58485gu.m89845m());
        if (messagingInfo.f387126l) {
            bVar.f92517e = Optional.m71637of(messagingInfo.f387120f);
        }
        Icon icon = messagingInfo.f387125k;
        if (icon != null) {
            bVar.f92526n = Optional.m71637of(icon);
        }
        return bVar.mo39589a();
    }
}
