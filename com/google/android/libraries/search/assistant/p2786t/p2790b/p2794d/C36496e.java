package com.google.android.libraries.search.assistant.p2786t.p2790b.p2794d;

import android.service.notification.StatusBarNotification;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.StandardNotification;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36474e;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import p3186j$.util.Optional;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.libraries.search.assistant.t.b.d.e */
/* compiled from: PG */
public final class C36496e {
    /* renamed from: a */
    public static Optional m65043a(C70334de deVar) {
        StatusBarNotification statusBarNotification = (StatusBarNotification) deVar.mo62027b(C36494c.f95245a);
        if (statusBarNotification != null) {
            return Optional.m71637of(C36474e.m65028b(statusBarNotification));
        }
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) deVar.mo62027b(C36494c.f95246b);
        if (bundledMessageNotification != null) {
            return Optional.m71637of(C36474e.m65027a(bundledMessageNotification));
        }
        return Optional.ofNullable((StandardNotification) deVar.mo62027b(C36494c.f95247c)).map(C36495d.f95249a);
    }

    /* renamed from: b */
    public static void m65044b(C70334de deVar, C36476g gVar) {
        int b = gVar.mo40179b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            deVar.mo62033h(C36494c.f95245a, gVar.mo40183c());
        } else if (i == 1) {
            deVar.mo62033h(C36494c.f95246b, gVar.mo40178a());
        } else if (i == 2) {
            deVar.mo62033h(C36494c.f95247c, gVar.mo40187d());
        }
    }
}
