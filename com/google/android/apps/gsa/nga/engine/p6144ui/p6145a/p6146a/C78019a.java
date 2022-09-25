package com.google.android.apps.gsa.nga.engine.p6144ui.p6145a.p6146a;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.MessageLayout;
import java.util.Locale;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C78019a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78024f f214865a;

    /* renamed from: b */
    public final /* synthetic */ MessageLayout f214866b;

    /* renamed from: c */
    public final /* synthetic */ StatusBarNotification f214867c;

    public /* synthetic */ C78019a(C78024f fVar, MessageLayout messageLayout, StatusBarNotification statusBarNotification) {
        this.f214865a = fVar;
        this.f214866b = messageLayout;
        this.f214867c = statusBarNotification;
    }

    public final void accept(Object obj) {
        C78024f fVar = this.f214865a;
        MessageLayout messageLayout = this.f214866b;
        StatusBarNotification statusBarNotification = this.f214867c;
        messageLayout.mo72984b().setText(fVar.f214876c.d(statusBarNotification.getNotification(), (Locale) obj));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
