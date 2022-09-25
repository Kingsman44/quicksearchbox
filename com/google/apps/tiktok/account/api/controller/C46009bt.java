package com.google.apps.tiktok.account.api.controller;

import android.content.Intent;

/* renamed from: com.google.apps.tiktok.account.api.controller.bt */
/* compiled from: PG */
public final class C46009bt extends C45981as {

    /* renamed from: a */
    public final Intent f120852a;

    public C46009bt(Intent intent) {
        if (intent != null) {
            this.f120852a = intent;
            return;
        }
        throw new NullPointerException("Null intent");
    }

    /* renamed from: a */
    public final Intent mo50127a() {
        return this.f120852a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45981as) {
            return this.f120852a.equals(((C45981as) obj).mo50127a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f120852a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f120852a.toString();
        return "SelectorContext{intent=" + obj + "}";
    }
}
