package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.p9869b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.migration.fragment.C130127c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.migration.b.b */
/* compiled from: PG */
public final class C130123b extends C130124c {

    /* renamed from: a */
    private final C130127c f356781a;

    public C130123b(C130127c cVar) {
        if (cVar != null) {
            this.f356781a = cVar;
            return;
        }
        throw new NullPointerException("Null fragmentZOrder");
    }

    /* renamed from: a */
    public final C130127c mo109511a() {
        return this.f356781a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130124c) {
            return this.f356781a.equals(((C130124c) obj).mo109511a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f356781a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f356781a.toString();
        return "ClassicAssistLayerDismissEvent{fragmentZOrder=" + obj + "}";
    }
}
