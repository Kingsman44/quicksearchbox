package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.utils.f */
/* compiled from: PG */
public final class C130308f implements C47388b {

    /* renamed from: a */
    public final boolean f357179a;

    public C130308f(boolean z) {
        this.f357179a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130308f) && this.f357179a == ((C130308f) obj).f357179a;
    }

    public final int hashCode() {
        return this.f357179a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f357179a;
        return "UpdateAssistantFooterVisibilityEvent(shouldAssistantFooterVisible=" + z + ")";
    }
}
