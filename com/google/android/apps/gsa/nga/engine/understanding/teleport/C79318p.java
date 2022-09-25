package com.google.android.apps.gsa.nga.engine.understanding.teleport;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.p */
/* compiled from: PG */
final class C79318p extends C79325w {

    /* renamed from: a */
    private final C79311i f217818a;

    /* renamed from: b */
    private final boolean f217819b;

    public C79318p(C79311i iVar, boolean z) {
        this.f217818a = iVar;
        this.f217819b = z;
    }

    /* renamed from: a */
    public final C79311i mo73886a() {
        return this.f217818a;
    }

    /* renamed from: b */
    public final boolean mo73887b() {
        return this.f217819b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79325w) {
            C79325w wVar = (C79325w) obj;
            return this.f217818a.equals(wVar.mo73886a()) && this.f217819b == wVar.mo73887b();
        }
    }

    public final int hashCode() {
        return ((this.f217818a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f217819b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f217818a.toString();
        boolean z = this.f217819b;
        return "ForegroundAppOrWebsiteInfo{appOrUrl=" + obj + ", isInBrowser=" + z + "}";
    }
}
