package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.j */
/* compiled from: PG */
public final class C16166j extends C16142cn {

    /* renamed from: a */
    public String f47696a;

    /* renamed from: b */
    public String f47697b;

    /* renamed from: c */
    private String f47698c;

    /* renamed from: d */
    private String f47699d;

    /* renamed from: e */
    private boolean f47700e;

    /* renamed from: f */
    private String f47701f;

    /* renamed from: g */
    private C16335ai f47702g;

    /* renamed from: h */
    private C16169m f47703h;

    /* renamed from: i */
    private C16330ad f47704i;

    /* renamed from: j */
    private byte f47705j;

    /* renamed from: a */
    public final C16143co mo22788a() {
        String str;
        String str2;
        String str3;
        String str4;
        C16335ai aiVar;
        C16169m mVar;
        C16330ad adVar;
        if (this.f47705j == 1 && (str = this.f47696a) != null && (str2 = this.f47698c) != null && (str3 = this.f47699d) != null && (str4 = this.f47701f) != null && (aiVar = this.f47702g) != null && (mVar = this.f47703h) != null && (adVar = this.f47704i) != null) {
            return new C16167k(str, str2, str3, this.f47700e, str4, this.f47697b, aiVar, mVar, adVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f47696a == null) {
            sb.append(" id");
        }
        if (this.f47698c == null) {
            sb.append(" candidateSuggestionId");
        }
        if (this.f47699d == null) {
            sb.append(" displayId");
        }
        if (this.f47705j == 0) {
            sb.append(" isDisplayedNow");
        }
        if (this.f47701f == null) {
            sb.append(" displayText");
        }
        if (this.f47702g == null) {
            sb.append(" displayMetadata");
        }
        if (this.f47703h == null) {
            sb.append(" source");
        }
        if (this.f47704i == null) {
            sb.append(" actionFulfillmentData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22789b(C16330ad adVar) {
        if (adVar != null) {
            this.f47704i = adVar;
            return;
        }
        throw new NullPointerException("Null actionFulfillmentData");
    }

    /* renamed from: c */
    public final void mo22790c(String str) {
        if (str != null) {
            this.f47698c = str;
            return;
        }
        throw new NullPointerException("Null candidateSuggestionId");
    }

    /* renamed from: d */
    public final void mo22791d(String str) {
        if (str != null) {
            this.f47699d = str;
            return;
        }
        throw new NullPointerException("Null displayId");
    }

    /* renamed from: e */
    public final void mo22792e(C16335ai aiVar) {
        if (aiVar != null) {
            this.f47702g = aiVar;
            return;
        }
        throw new NullPointerException("Null displayMetadata");
    }

    /* renamed from: f */
    public final void mo22793f(String str) {
        if (str != null) {
            this.f47701f = str;
            return;
        }
        throw new NullPointerException("Null displayText");
    }

    /* renamed from: g */
    public final void mo22794g(String str) {
        if (str != null) {
            this.f47696a = str;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: h */
    public final void mo22795h(boolean z) {
        this.f47700e = z;
        this.f47705j = 1;
    }

    /* renamed from: i */
    public final void mo22796i(C16169m mVar) {
        if (mVar != null) {
            this.f47703h = mVar;
            return;
        }
        throw new NullPointerException("Null source");
    }
}
