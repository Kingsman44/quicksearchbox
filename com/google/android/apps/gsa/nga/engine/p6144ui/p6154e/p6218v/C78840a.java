package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.v.a */
/* compiled from: PG */
public final class C78840a extends C78846b {

    /* renamed from: a */
    public final String f216983a;

    /* renamed from: c */
    private final int f216984c;

    public C78840a(String str, int i) {
        if (str != null) {
            this.f216983a = str;
            this.f216984c = i;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: a */
    public final String mo73642a() {
        return this.f216983a;
    }

    /* renamed from: b */
    public final int mo73643b() {
        return this.f216984c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78846b) {
            C78846b bVar = (C78846b) obj;
            return this.f216983a.equals(bVar.mo73642a()) && this.f216984c == bVar.mo73643b();
        }
    }

    public final int hashCode() {
        return ((this.f216983a.hashCode() ^ 1000003) * 1000003) ^ this.f216984c;
    }

    public final String toString() {
        String str = this.f216983a;
        int i = this.f216984c;
        String str2 = i != 1 ? i != 2 ? "HIDE_WITH_ANIMATION" : "HIDE" : "SHOW";
        return "Transcription{text=" + str + ", visibility=" + str2 + "}";
    }
}
