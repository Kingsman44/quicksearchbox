package com.google.android.apps.search.assistant.surfaces.voice.growth.p9634c.p9635a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129020f;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129021g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b.C129022h;
import java.io.Serializable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.c.a.a */
/* compiled from: PG */
final class C127720a implements Serializable, C129020f {
    private static final long serialVersionUID = -4576173099233746152L;

    /* renamed from: a */
    public final C129021g f351597a;

    /* renamed from: b */
    private final C129022h f351598b;

    public C127720a(C129021g gVar, C129022h hVar) {
        if (gVar != null) {
            this.f351597a = gVar;
            if (hVar != null) {
                this.f351598b = hVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null position");
    }

    /* renamed from: a */
    public final C129021g mo108184a() {
        return this.f351597a;
    }

    public final Class annotationType() {
        return C129020f.class;
    }

    /* renamed from: b */
    public final C129022h mo108186b() {
        return this.f351598b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C129020f) {
            C129020f fVar = (C129020f) obj;
            return this.f351597a.equals(fVar.mo108184a()) && this.f351598b.equals(fVar.mo108186b());
        }
    }

    public final int hashCode() {
        return (this.f351597a.hashCode() ^ 481950551) + (this.f351598b.hashCode() ^ -1984669604);
    }

    public final String toString() {
        return "@com.google.android.apps.search.assistant.surfaces.voice.ui.common.uicomponent.UiComponentMapKey(position=" + this.f351597a + ", priority=" + this.f351598b + ')';
    }
}
