package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b;

import java.io.Serializable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.b.a */
/* compiled from: PG */
public final class C129015a implements Serializable, C129020f {
    private static final long serialVersionUID = -4576173099233746152L;

    /* renamed from: a */
    private final C129021g f354460a;

    /* renamed from: b */
    private final C129022h f354461b;

    public C129015a(C129021g gVar, C129022h hVar) {
        if (gVar != null) {
            this.f354460a = gVar;
            if (hVar != null) {
                this.f354461b = hVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null position");
    }

    /* renamed from: a */
    public final C129021g mo108184a() {
        return this.f354460a;
    }

    public final Class annotationType() {
        return C129020f.class;
    }

    /* renamed from: b */
    public final C129022h mo108186b() {
        return this.f354461b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C129020f) {
            C129020f fVar = (C129020f) obj;
            return this.f354460a.equals(fVar.mo108184a()) && this.f354461b.equals(fVar.mo108186b());
        }
    }

    public final int hashCode() {
        return (this.f354460a.hashCode() ^ 481950551) + (this.f354461b.hashCode() ^ -1984669604);
    }

    public final String toString() {
        return "@com.google.android.apps.search.assistant.surfaces.voice.ui.common.uicomponent.UiComponentMapKey(position=" + this.f354460a + ", priority=" + this.f354461b + ')';
    }
}
