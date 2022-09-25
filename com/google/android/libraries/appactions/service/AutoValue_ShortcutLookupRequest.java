package com.google.android.libraries.appactions.service;

/* compiled from: PG */
final class AutoValue_ShortcutLookupRequest extends ShortcutLookupRequest {

    /* renamed from: a */
    private final String f398888a;

    /* renamed from: b */
    private final String f398889b;

    /* renamed from: c */
    private final String f398890c;

    public AutoValue_ShortcutLookupRequest(String str, String str2, String str3) {
        this.f398888a = str;
        this.f398889b = str2;
        this.f398890c = str3;
    }

    /* renamed from: a */
    public final String mo124518a() {
        return this.f398888a;
    }

    /* renamed from: b */
    public final String mo124519b() {
        return this.f398889b;
    }

    /* renamed from: c */
    public final String mo124520c() {
        return this.f398890c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ShortcutLookupRequest) {
            ShortcutLookupRequest shortcutLookupRequest = (ShortcutLookupRequest) obj;
            String str = this.f398888a;
            if (str != null ? str.equals(shortcutLookupRequest.mo124518a()) : shortcutLookupRequest.mo124518a() == null) {
                String str2 = this.f398889b;
                if (str2 != null ? str2.equals(shortcutLookupRequest.mo124519b()) : shortcutLookupRequest.mo124519b() == null) {
                    String str3 = this.f398890c;
                    if (str3 != null ? str3.equals(shortcutLookupRequest.mo124520c()) : shortcutLookupRequest.mo124520c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String str = this.f398888a;
        String str2 = this.f398889b;
        String str3 = this.f398890c;
        return "ShortcutLookupRequest{intentName=" + str + ", intentParamsJson=" + str2 + ", packageName=" + str3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f398888a;
        int i3 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i4 = (i ^ 1000003) * 1000003;
        String str2 = this.f398889b;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i5 = (i4 ^ i2) * 1000003;
        String str3 = this.f398890c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 ^ i3;
    }
}
