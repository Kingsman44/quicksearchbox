package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.utils;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.utils.g */
/* compiled from: PG */
public final class C130309g implements C47388b {

    /* renamed from: a */
    public final boolean f357180a;

    public C130309g(boolean z) {
        this.f357180a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130309g) && this.f357180a == ((C130309g) obj).f357180a;
    }

    public final int hashCode() {
        return this.f357180a ? 1 : 0;
    }

    public final String toString() {
        boolean z = this.f357180a;
        return "UpdateAssistantHeaderVisibilityEvent(shouldAssistantHeaderVisible=" + z + ")";
    }
}
