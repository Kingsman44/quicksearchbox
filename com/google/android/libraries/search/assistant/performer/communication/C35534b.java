package com.google.android.libraries.search.assistant.performer.communication;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.b */
/* compiled from: PG */
final class C35534b extends C35489a {

    /* renamed from: a */
    private final String f93314a;

    /* renamed from: b */
    private final String f93315b;

    public C35534b(String str, String str2) {
        if (str != null) {
            this.f93314a = str;
            if (str2 != null) {
                this.f93315b = str2;
                return;
            }
            throw new NullPointerException("Null mimetype");
        }
        throw new NullPointerException("Null accountType");
    }

    /* renamed from: a */
    public final String mo39664a() {
        return this.f93314a;
    }

    /* renamed from: b */
    public final String mo39665b() {
        return this.f93315b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35489a) {
            C35489a aVar = (C35489a) obj;
            return this.f93314a.equals(aVar.mo39664a()) && this.f93315b.equals(aVar.mo39665b());
        }
    }

    public final int hashCode() {
        return ((this.f93314a.hashCode() ^ 1000003) * 1000003) ^ this.f93315b.hashCode();
    }

    public final String toString() {
        String str = this.f93314a;
        String str2 = this.f93315b;
        return "AccountTypeAndMimetype{accountType=" + str + ", mimetype=" + str2 + "}";
    }
}
