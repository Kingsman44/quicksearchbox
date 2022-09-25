package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import com.google.assistant.p3897e.p3921j.C52235kf;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.l */
/* compiled from: PG */
public final class C129124l {

    /* renamed from: a */
    public final int f354721a;

    /* renamed from: b */
    public final BundledMessageNotification f354722b;

    /* renamed from: c */
    public final String f354723c;

    /* renamed from: d */
    public final C52235kf f354724d;

    public /* synthetic */ C129124l(int i, BundledMessageNotification bundledMessageNotification, String str, C52235kf kfVar) {
        this.f354721a = i;
        this.f354722b = bundledMessageNotification;
        this.f354723c = str;
        this.f354724d = kfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C129124l)) {
            return false;
        }
        C129124l lVar = (C129124l) obj;
        return this.f354721a == lVar.f354721a && C69664n.m101066l(this.f354722b, lVar.f354722b) && C69664n.m101066l(this.f354723c, lVar.f354723c) && this.f354724d == lVar.f354724d;
    }

    public final int hashCode() {
        int i = this.f354721a * 31;
        BundledMessageNotification bundledMessageNotification = this.f354722b;
        return ((((i + (bundledMessageNotification == null ? 0 : bundledMessageNotification.hashCode())) * 31) + this.f354723c.hashCode()) * 31) + this.f354724d.hashCode();
    }

    public final String toString() {
        int i = this.f354721a;
        BundledMessageNotification bundledMessageNotification = this.f354722b;
        String str = this.f354723c;
        C52235kf kfVar = this.f354724d;
        return "ReadNotificationReplyResult(notificationIndex=" + i + ", notification=" + bundledMessageNotification + ", replyMessage=" + str + ", result=" + kfVar + ")";
    }
}
