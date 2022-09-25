package com.google.apps.tiktok.dataservice.local;

/* renamed from: com.google.apps.tiktok.dataservice.local.c */
/* compiled from: PG */
final class C46849c extends C46842aq {

    /* renamed from: a */
    private final Throwable f122283a;

    public C46849c(Throwable th) {
        if (th != null) {
            this.f122283a = th;
            return;
        }
        throw new NullPointerException("Null error");
    }

    /* renamed from: a */
    public final Throwable mo50850a() {
        return this.f122283a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46842aq) {
            return this.f122283a.equals(((C46842aq) obj).mo50850a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f122283a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f122283a.toString();
        return "Failure{error=" + obj + "}";
    }
}
