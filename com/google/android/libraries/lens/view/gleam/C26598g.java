package com.google.android.libraries.lens.view.gleam;

/* renamed from: com.google.android.libraries.lens.view.gleam.g */
/* compiled from: PG */
final class C26598g extends C26467az {

    /* renamed from: a */
    private final String f72521a;

    /* renamed from: b */
    private final String f72522b;

    /* renamed from: c */
    private final float f72523c;

    public C26598g(String str, String str2, float f) {
        if (str != null) {
            this.f72521a = str;
            if (str2 != null) {
                this.f72522b = str2;
                this.f72523c = f;
                return;
            }
            throw new NullPointerException("Null text");
        }
        throw new NullPointerException("Null prominentType");
    }

    /* renamed from: a */
    public final float mo31726a() {
        return this.f72523c;
    }

    /* renamed from: b */
    public final String mo31727b() {
        return this.f72521a;
    }

    /* renamed from: c */
    public final String mo31728c() {
        return this.f72522b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26467az) {
            C26467az azVar = (C26467az) obj;
            return this.f72521a.equals(azVar.mo31727b()) && this.f72522b.equals(azVar.mo31728c()) && Float.floatToIntBits(this.f72523c) == Float.floatToIntBits(azVar.mo31726a());
        }
    }

    public final int hashCode() {
        return ((((this.f72521a.hashCode() ^ 1000003) * 1000003) ^ this.f72522b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f72523c);
    }

    public final String toString() {
        String str = this.f72521a;
        String str2 = this.f72522b;
        float f = this.f72523c;
        return "ProminentTypeData{prominentType=" + str + ", text=" + str2 + ", width=" + f + "}";
    }
}
