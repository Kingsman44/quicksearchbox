package com.google.apps.tiktok.p3648i.p3652c;

import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.apps.tiktok.i.c.b */
/* compiled from: PG */
final class C47168b extends C47174h {

    /* renamed from: a */
    private final String f122818a;

    /* renamed from: b */
    private final C58833ax f122819b;

    /* renamed from: c */
    private final C58485gu f122820c;

    /* renamed from: d */
    private final C47153d f122821d;

    public C47168b(String str, C58833ax axVar, C58485gu guVar, C47153d dVar) {
        this.f122818a = str;
        this.f122819b = axVar;
        this.f122820c = guVar;
        this.f122821d = dVar;
    }

    /* renamed from: a */
    public final C47153d mo51085a() {
        return this.f122821d;
    }

    /* renamed from: b */
    public final C58833ax mo51086b() {
        return this.f122819b;
    }

    /* renamed from: c */
    public final C58485gu mo51087c() {
        return this.f122820c;
    }

    /* renamed from: d */
    public final String mo51088d() {
        return this.f122818a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47174h) {
            C47174h hVar = (C47174h) obj;
            return this.f122818a.equals(hVar.mo51088d()) && this.f122819b.equals(hVar.mo51086b()) && C58597ky.m90218i(this.f122820c, hVar.mo51087c()) && this.f122821d.equals(hVar.mo51085a());
        }
    }

    public final int hashCode() {
        return ((((((this.f122818a.hashCode() ^ 1000003) * 1000003) ^ this.f122819b.hashCode()) * 1000003) ^ this.f122820c.hashCode()) * 1000003) ^ this.f122821d.hashCode();
    }

    public final String toString() {
        String str = this.f122818a;
        String valueOf = String.valueOf(this.f122819b);
        String valueOf2 = String.valueOf(this.f122820c);
        String obj = this.f122821d.toString();
        return "RoomDatabaseDaosConfig{name=" + str + ", fallbackToDestructiveMigration=" + valueOf + ", migrations=" + valueOf2 + ", storage=" + obj + "}";
    }
}
