package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.h */
/* compiled from: PG */
public final class C16164h extends C16113bl {

    /* renamed from: a */
    public String f47681a;

    /* renamed from: b */
    private String f47682b;

    /* renamed from: c */
    private boolean f47683c;

    /* renamed from: d */
    private String f47684d;

    /* renamed from: e */
    private C16335ai f47685e;

    /* renamed from: f */
    private C16330ad f47686f;

    /* renamed from: g */
    private byte f47687g;

    /* renamed from: h */
    private int f47688h;

    /* renamed from: a */
    public final C16115bn mo22765a() {
        String str;
        String str2;
        int i;
        String str3;
        C16335ai aiVar;
        C16330ad adVar;
        if (this.f47687g == 1 && (str = this.f47681a) != null && (str2 = this.f47682b) != null && (i = this.f47688h) != 0 && (str3 = this.f47684d) != null && (aiVar = this.f47685e) != null && (adVar = this.f47686f) != null) {
            return new C16165i(str, str2, this.f47683c, i, str3, aiVar, adVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f47681a == null) {
            sb.append(" id");
        }
        if (this.f47682b == null) {
            sb.append(" displayId");
        }
        if (this.f47687g == 0) {
            sb.append(" isDisplayedNow");
        }
        if (this.f47688h == 0) {
            sb.append(" status");
        }
        if (this.f47684d == null) {
            sb.append(" displayText");
        }
        if (this.f47685e == null) {
            sb.append(" displayMetadata");
        }
        if (this.f47686f == null) {
            sb.append(" actionFulfillmentData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22766b(C16330ad adVar) {
        if (adVar != null) {
            this.f47686f = adVar;
            return;
        }
        throw new NullPointerException("Null actionFulfillmentData");
    }

    /* renamed from: c */
    public final void mo22767c(String str) {
        if (str != null) {
            this.f47682b = str;
            return;
        }
        throw new NullPointerException("Null displayId");
    }

    /* renamed from: d */
    public final void mo22768d(C16335ai aiVar) {
        if (aiVar != null) {
            this.f47685e = aiVar;
            return;
        }
        throw new NullPointerException("Null displayMetadata");
    }

    /* renamed from: e */
    public final void mo22769e(String str) {
        if (str != null) {
            this.f47684d = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: f */
    public final void mo22770f(String str) {
        if (str != null) {
            this.f47681a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: g */
    public final void mo22771g(boolean z) {
        this.f47683c = z;
        this.f47687g = 1;
    }

    /* renamed from: h */
    public final void mo22772h(int i) {
        if (i != 0) {
            this.f47688h = i;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
