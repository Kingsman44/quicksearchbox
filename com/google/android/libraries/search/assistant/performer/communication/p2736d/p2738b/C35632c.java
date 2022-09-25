package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2738b;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35626as;
import com.google.android.libraries.search.assistant.performer.communication.p2736d.C35665z;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.b.c */
/* compiled from: PG */
public final class C35632c implements C35626as, C35665z {

    /* renamed from: a */
    private final Context f93486a;

    /* renamed from: b */
    private final Executor f93487b;

    public C35632c(Context context, Executor executor) {
        this.f93486a = context;
        this.f93487b = executor;
    }

    /* renamed from: b */
    static /* synthetic */ C60870cx m64018b(BundledMessageNotification bundledMessageNotification) {
        Optional optional;
        Optional a = C34879g.m63707a(bundledMessageNotification);
        if (a.isPresent()) {
            optional = ((MessageNotification.Actions) a.get()).mo39568a();
        } else {
            optional = Optional.empty();
        }
        if (!optional.isPresent()) {
            return C60856cj.m92899h(new IllegalStateException("Notification is missing mark as read intent"));
        }
        try {
            ((PendingIntent) optional.get()).send();
            return C60866ct.f164955a;
        } catch (PendingIntent.CanceledException e) {
            return C60856cj.m92899h(new RuntimeException("Mark as read failed", e));
        }
    }

    /* renamed from: a */
    public final C60870cx mo20792a(BundledMessageNotification bundledMessageNotification, boolean z) {
        C35630a aVar = new C35630a(bundledMessageNotification);
        return C60856cj.m92905n(C47810es.m84965e(aVar), this.f93487b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C60870cx mo39766c(BundledMessageNotification bundledMessageNotification, String str) {
        Optional optional;
        Optional optional2;
        Optional a = C34879g.m63707a(bundledMessageNotification);
        if (a.isPresent()) {
            optional = ((MessageNotification.Actions) a.get()).mo39569b();
        } else {
            optional = Optional.empty();
        }
        if (a.isPresent()) {
            optional2 = ((MessageNotification.Actions) a.get()).mo39570c();
        } else {
            optional2 = Optional.empty();
        }
        if (!optional.isPresent() || !optional2.isPresent()) {
            return C60856cj.m92899h(new IllegalStateException("Notification is missing reply information"));
        }
        Bundle bundle = new Bundle();
        bundle.putCharSequence(((RemoteInput) optional2.get()).getResultKey(), str);
        Intent intent = new Intent();
        RemoteInput.addResultsToIntent(new RemoteInput[]{(RemoteInput) optional2.get()}, intent, bundle);
        try {
            ((PendingIntent) optional.get()).send(this.f93486a, 0, intent);
            return C60866ct.f164955a;
        } catch (PendingIntent.CanceledException e) {
            return C60856cj.m92899h(new RuntimeException("Reply failed", e));
        }
    }

    /* renamed from: d */
    public final C60870cx mo20797d(BundledMessageNotification bundledMessageNotification, String str) {
        C35631b bVar = new C35631b(this, bundledMessageNotification, str);
        return C60856cj.m92905n(C47810es.m84965e(bVar), this.f93487b);
    }
}
