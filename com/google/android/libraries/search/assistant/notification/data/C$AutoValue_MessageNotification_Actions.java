package com.google.android.libraries.search.assistant.notification.data;

import com.google.android.libraries.search.assistant.notification.data.MessageNotification;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.notification.data.$AutoValue_MessageNotification_Actions  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_MessageNotification_Actions extends MessageNotification.Actions {

    /* renamed from: a */
    public final Optional f92492a;

    /* renamed from: b */
    public final Optional f92493b;

    /* renamed from: c */
    public final Optional f92494c;

    public C$AutoValue_MessageNotification_Actions(Optional optional, Optional optional2, Optional optional3) {
        if (optional != null) {
            this.f92492a = optional;
            if (optional2 != null) {
                this.f92493b = optional2;
                if (optional3 != null) {
                    this.f92494c = optional3;
                    return;
                }
                throw new NullPointerException("Null replyRemoteInput");
            }
            throw new NullPointerException("Null replyPendingIntent");
        }
        throw new NullPointerException("Null markAsReadPendingIntent");
    }

    /* renamed from: a */
    public final Optional mo39568a() {
        return this.f92492a;
    }

    /* renamed from: b */
    public final Optional mo39569b() {
        return this.f92493b;
    }

    /* renamed from: c */
    public final Optional mo39570c() {
        return this.f92494c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MessageNotification.Actions) {
            MessageNotification.Actions actions = (MessageNotification.Actions) obj;
            return this.f92492a.equals(actions.mo39568a()) && this.f92493b.equals(actions.mo39569b()) && this.f92494c.equals(actions.mo39570c());
        }
    }

    public final int hashCode() {
        return ((((this.f92492a.hashCode() ^ 1000003) * 1000003) ^ this.f92493b.hashCode()) * 1000003) ^ this.f92494c.hashCode();
    }

    public final String toString() {
        String obj = this.f92492a.toString();
        String obj2 = this.f92493b.toString();
        String obj3 = this.f92494c.toString();
        return "Actions{markAsReadPendingIntent=" + obj + ", replyPendingIntent=" + obj2 + ", replyRemoteInput=" + obj3 + "}";
    }
}
