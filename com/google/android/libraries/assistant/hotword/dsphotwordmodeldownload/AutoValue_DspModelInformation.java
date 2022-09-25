package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import java.util.UUID;

/* compiled from: PG */
public final class AutoValue_DspModelInformation extends DspModelInformation {

    /* renamed from: a */
    private final String f52065a;

    /* renamed from: b */
    private final int f52066b;

    /* renamed from: c */
    private final int f52067c;

    /* renamed from: d */
    private final UUID f52068d;

    /* renamed from: e */
    private final String f52069e;

    public AutoValue_DspModelInformation(String str, int i, int i2, UUID uuid, String str2) {
        if (str != null) {
            this.f52065a = str;
            this.f52066b = i;
            this.f52067c = i2;
            if (uuid != null) {
                this.f52068d = uuid;
                if (str2 != null) {
                    this.f52069e = str2;
                    return;
                }
                throw new NullPointerException("Null modelUri");
            }
            throw new NullPointerException("Null venderUuid");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final int mo23833a() {
        return this.f52066b;
    }

    /* renamed from: b */
    public final int mo23834b() {
        return this.f52067c;
    }

    /* renamed from: c */
    public final String mo23835c() {
        return this.f52065a;
    }

    /* renamed from: d */
    public final String mo23836d() {
        return this.f52069e;
    }

    /* renamed from: e */
    public final UUID mo23837e() {
        return this.f52068d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DspModelInformation) {
            DspModelInformation dspModelInformation = (DspModelInformation) obj;
            return this.f52065a.equals(dspModelInformation.mo23835c()) && this.f52066b == dspModelInformation.mo23833a() && this.f52067c == dspModelInformation.mo23834b() && this.f52068d.equals(dspModelInformation.mo23837e()) && this.f52069e.equals(dspModelInformation.mo23836d());
        }
    }

    public final int hashCode() {
        return ((((((((this.f52065a.hashCode() ^ 1000003) * 1000003) ^ this.f52066b) * 1000003) ^ this.f52067c) * 1000003) ^ this.f52068d.hashCode()) * 1000003) ^ this.f52069e.hashCode();
    }
}
