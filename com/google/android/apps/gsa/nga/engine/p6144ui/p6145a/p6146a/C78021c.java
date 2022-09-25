package com.google.android.apps.gsa.nga.engine.p6144ui.p6145a.p6146a;

import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.ConfirmCancelCountDownLayout;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.MessageLayout;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C78021c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78024f f214870a;

    /* renamed from: b */
    public final /* synthetic */ MessageLayout f214871b;

    /* renamed from: c */
    public final /* synthetic */ ConfirmCancelCountDownLayout f214872c;

    public /* synthetic */ C78021c(C78024f fVar, MessageLayout messageLayout, ConfirmCancelCountDownLayout confirmCancelCountDownLayout) {
        this.f214870a = fVar;
        this.f214871b = messageLayout;
        this.f214872c = confirmCancelCountDownLayout;
    }

    public final void accept(Object obj) {
        Optional optional;
        C78024f fVar = this.f214870a;
        MessageLayout messageLayout = this.f214871b;
        ConfirmCancelCountDownLayout confirmCancelCountDownLayout = this.f214872c;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        Optional.ofNullable(fVar.f214874a).ifPresent(new C78019a(fVar, messageLayout, statusBarNotification));
        try {
            optional = Optional.m71637of(fVar.f214876c.a.getPackageManager().getApplicationIcon(statusBarNotification.getPackageName()));
        } catch (PackageManager.NameNotFoundException unused) {
            optional = Optional.empty();
        }
        if (optional.isPresent()) {
            messageLayout.mo72983a().setVisibility(0);
            messageLayout.mo72983a().setImageDrawable((Drawable) optional.get());
        } else {
            messageLayout.mo72983a().setVisibility(8);
        }
        confirmCancelCountDownLayout.setOnClickListener(new C78020b(fVar, statusBarNotification));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
