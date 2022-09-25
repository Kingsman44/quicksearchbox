package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.$AutoValue_PeopleApiAffinity  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_PeopleApiAffinity extends PeopleApiAffinity {

    /* renamed from: a */
    public final double f110655a;

    /* renamed from: b */
    public final String f110656b;

    /* renamed from: c */
    public final AffinityMetadata f110657c;

    /* renamed from: d */
    public final boolean f110658d;

    public C$AutoValue_PeopleApiAffinity(double d, String str, AffinityMetadata affinityMetadata, boolean z) {
        this.f110655a = d;
        if (str != null) {
            this.f110656b = str;
            if (affinityMetadata != null) {
                this.f110657c = affinityMetadata;
                this.f110658d = z;
                return;
            }
            throw new NullPointerException("Null affinityMetadata");
        }
        throw new NullPointerException("Null loggingId");
    }

    /* renamed from: a */
    public final double mo45027a() {
        return this.f110655a;
    }

    /* renamed from: b */
    public final AffinityMetadata mo45028b() {
        return this.f110657c;
    }

    /* renamed from: c */
    public final String mo45029c() {
        return this.f110656b;
    }

    /* renamed from: d */
    public final boolean mo45030d() {
        return this.f110658d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PeopleApiAffinity) {
            PeopleApiAffinity peopleApiAffinity = (PeopleApiAffinity) obj;
            return Double.doubleToLongBits(this.f110655a) == Double.doubleToLongBits(peopleApiAffinity.mo45027a()) && this.f110656b.equals(peopleApiAffinity.mo45029c()) && this.f110657c.equals(peopleApiAffinity.mo45028b()) && this.f110658d == peopleApiAffinity.mo45030d();
        }
    }

    public final int hashCode() {
        return (true != this.f110658d ? 1237 : 1231) ^ ((((((((int) ((Double.doubleToLongBits(this.f110655a) >>> 32) ^ Double.doubleToLongBits(this.f110655a))) ^ 1000003) * 1000003) ^ this.f110656b.hashCode()) * 1000003) ^ this.f110657c.hashCode()) * 1000003);
    }

    public final String toString() {
        double d = this.f110655a;
        String str = this.f110656b;
        String obj = this.f110657c.toString();
        boolean z = this.f110658d;
        return "PeopleApiAffinity{value=" + d + ", loggingId=" + str + ", affinityMetadata=" + obj + ", isPopulated=" + z + "}";
    }
}
