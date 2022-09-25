package com.google.android.apps.gsa.shared.p6974ae;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.ae.a */
/* compiled from: PG */
public final class C89092a extends C89096e {

    /* renamed from: a */
    private int f241431a;

    /* renamed from: b */
    private int f241432b;

    /* renamed from: c */
    private int f241433c;

    /* renamed from: d */
    private int f241434d;

    /* renamed from: e */
    private byte f241435e;

    /* renamed from: a */
    public final C89097f mo83059a() {
        if (this.f241435e == 15) {
            return new C89093b(this.f241431a, this.f241432b, this.f241433c, this.f241434d);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f241435e & 1) == 0) {
            sb.append(" needPermissionNotificationId");
        }
        if ((this.f241435e & 2) == 0) {
            sb.append(" needPermissionNotificationTitleId");
        }
        if ((this.f241435e & 4) == 0) {
            sb.append(" needPermissionTtsId");
        }
        if ((this.f241435e & 8) == 0) {
            sb.append(" needPermissionTtsFallbackEnabledId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo83060b() {
        this.f241431a = R.string.notification_text;
        this.f241435e = (byte) (this.f241435e | 1);
    }

    /* renamed from: c */
    public final void mo83061c() {
        this.f241432b = R.string.notification_heading;
        this.f241435e = (byte) (this.f241435e | 2);
    }

    /* renamed from: d */
    public final void mo83062d() {
        this.f241434d = R.string.permission_eyesfree_tts;
        this.f241435e = (byte) (this.f241435e | 8);
    }

    /* renamed from: e */
    public final void mo83063e() {
        this.f241433c = R.string.permission_eyesfree_tts;
        this.f241435e = (byte) (this.f241435e | 4);
    }
}
