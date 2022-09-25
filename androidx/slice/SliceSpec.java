package androidx.slice;

import androidx.versionedparcelable.C4267f;

/* compiled from: PG */
public final class SliceSpec implements C4267f {

    /* renamed from: a */
    String f13104a;

    /* renamed from: b */
    int f13105b;

    public SliceSpec() {
        this.f13105b = 1;
    }

    public SliceSpec(String str, int i) {
        this.f13104a = str;
        this.f13105b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SliceSpec)) {
            return false;
        }
        SliceSpec sliceSpec = (SliceSpec) obj;
        if (!this.f13104a.equals(sliceSpec.f13104a) || this.f13105b != sliceSpec.f13105b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13104a.hashCode() + this.f13105b;
    }

    public final String toString() {
        return String.format("SliceSpec{%s,%d}", new Object[]{this.f13104a, Integer.valueOf(this.f13105b)});
    }
}
