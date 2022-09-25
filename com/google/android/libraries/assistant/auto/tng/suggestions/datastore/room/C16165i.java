package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.i */
/* compiled from: PG */
final class C16165i extends C16115bn {

    /* renamed from: a */
    private final String f47689a;

    /* renamed from: b */
    private final String f47690b;

    /* renamed from: c */
    private final boolean f47691c;

    /* renamed from: d */
    private final String f47692d;

    /* renamed from: e */
    private final C16335ai f47693e;

    /* renamed from: f */
    private final C16330ad f47694f;

    /* renamed from: g */
    private final int f47695g;

    public C16165i(String str, String str2, boolean z, int i, String str3, C16335ai aiVar, C16330ad adVar) {
        this.f47689a = str;
        this.f47690b = str2;
        this.f47691c = z;
        this.f47695g = i;
        this.f47692d = str3;
        this.f47693e = aiVar;
        this.f47694f = adVar;
    }

    /* renamed from: a */
    public final C16330ad mo22773a() {
        return this.f47694f;
    }

    /* renamed from: b */
    public final C16335ai mo22774b() {
        return this.f47693e;
    }

    /* renamed from: c */
    public final String mo22775c() {
        return this.f47690b;
    }

    /* renamed from: d */
    public final String mo22776d() {
        return this.f47692d;
    }

    /* renamed from: e */
    public final String mo22777e() {
        return this.f47689a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16115bn) {
            C16115bn bnVar = (C16115bn) obj;
            return this.f47689a.equals(bnVar.mo22777e()) && this.f47690b.equals(bnVar.mo22775c()) && this.f47691c == bnVar.mo22778f() && this.f47695g == bnVar.mo22779g() && this.f47692d.equals(bnVar.mo22776d()) && this.f47693e.equals(bnVar.mo22774b()) && this.f47694f.equals(bnVar.mo22773a());
        }
    }

    /* renamed from: f */
    public final boolean mo22778f() {
        return this.f47691c;
    }

    /* renamed from: g */
    public final int mo22779g() {
        return this.f47695g;
    }

    public final int hashCode() {
        return ((((((((((((this.f47689a.hashCode() ^ 1000003) * 1000003) ^ this.f47690b.hashCode()) * 1000003) ^ (true != this.f47691c ? 1237 : 1231)) * 1000003) ^ this.f47695g) * 1000003) ^ this.f47692d.hashCode()) * 1000003) ^ this.f47693e.hashCode()) * 1000003) ^ this.f47694f.hashCode();
    }

    public final String toString() {
        String str = this.f47689a;
        String str2 = this.f47690b;
        boolean z = this.f47691c;
        String str3 = this.f47695g != 1 ? "ACTIVE" : "INACTIVE";
        String str4 = this.f47692d;
        String obj = this.f47693e.toString();
        String obj2 = this.f47694f.toString();
        return "ShortcutToDisplay{id=" + str + ", displayId=" + str2 + ", isDisplayedNow=" + z + ", status=" + str3 + ", displayText=" + str4 + ", displayMetadata=" + obj + ", actionFulfillmentData=" + obj2 + "}";
    }
}
