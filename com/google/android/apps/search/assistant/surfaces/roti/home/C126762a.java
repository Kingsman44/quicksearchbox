package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Intent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.a */
/* compiled from: PG */
final class C126762a {

    /* renamed from: a */
    public Intent f349096a;

    /* renamed from: b */
    public Intent f349097b;

    /* renamed from: c */
    public String f349098c;

    /* renamed from: a */
    public final ResultState mo107764a() {
        Intent intent;
        String str;
        Intent intent2 = this.f349096a;
        if (intent2 != null && (intent = this.f349097b) != null && (str = this.f349098c) != null) {
            return new AutoValue_ResultState(intent2, intent, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f349096a == null) {
            sb.append(" activityResult");
        }
        if (this.f349097b == null) {
            sb.append(" externalIntent");
        }
        if (this.f349098c == null) {
            sb.append(" showText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
