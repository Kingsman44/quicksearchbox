package com.google.android.libraries.lens.view.gleam;

/* renamed from: com.google.android.libraries.lens.view.gleam.f */
/* compiled from: PG */
final class C26580f extends C26466ay {

    /* renamed from: a */
    private final int f72452a;

    /* renamed from: b */
    private final String f72453b;

    /* renamed from: c */
    private final float f72454c;

    public C26580f(int i, String str, float f) {
        this.f72452a = i;
        this.f72453b = str;
        this.f72454c = f;
    }

    /* renamed from: a */
    public final float mo31723a() {
        return this.f72454c;
    }

    /* renamed from: b */
    public final int mo31724b() {
        return this.f72452a;
    }

    /* renamed from: c */
    public final String mo31725c() {
        return this.f72453b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26466ay) {
            C26466ay ayVar = (C26466ay) obj;
            return this.f72452a == ayVar.mo31724b() && this.f72453b.equals(ayVar.mo31725c()) && Float.floatToIntBits(this.f72454c) == Float.floatToIntBits(ayVar.mo31723a());
        }
    }

    public final int hashCode() {
        return ((((this.f72452a ^ 1000003) * 1000003) ^ this.f72453b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f72454c);
    }

    public final String toString() {
        int i = this.f72452a;
        String str = this.f72453b;
        float f = this.f72454c;
        return "PriceLevelData{value=" + i + ", text=" + str + ", width=" + f + "}";
    }
}
