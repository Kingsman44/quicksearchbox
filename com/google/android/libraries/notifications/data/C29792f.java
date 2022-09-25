package com.google.android.libraries.notifications.data;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.notifications.data.f */
/* compiled from: PG */
final class C29792f extends C29825p {

    /* renamed from: a */
    private final Long f80760a;

    /* renamed from: b */
    private final Integer f80761b;

    /* renamed from: c */
    private final byte[] f80762c;

    public C29792f(Long l, Integer num, byte[] bArr) {
        this.f80760a = l;
        this.f80761b = num;
        this.f80762c = bArr;
    }

    /* renamed from: a */
    public final Integer mo35036a() {
        return this.f80761b;
    }

    /* renamed from: b */
    public final Long mo35037b() {
        return this.f80760a;
    }

    /* renamed from: c */
    public final byte[] mo35038c() {
        return this.f80762c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C29825p) {
            C29825p pVar = (C29825p) obj;
            if (this.f80760a.equals(pVar.mo35037b()) && this.f80761b.equals(pVar.mo35036a())) {
                if (Arrays.equals(this.f80762c, pVar instanceof C29792f ? ((C29792f) pVar).f80762c : pVar.mo35038c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f80760a.hashCode() ^ 1000003) * 1000003) ^ this.f80761b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f80762c);
    }

    public final String toString() {
        Long l = this.f80760a;
        Integer num = this.f80761b;
        String arrays = Arrays.toString(this.f80762c);
        return "ChimeTaskData{id=" + l + ", jobType=" + num + ", payload=" + arrays + "}";
    }
}
