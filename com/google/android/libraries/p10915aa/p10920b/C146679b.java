package com.google.android.libraries.p10915aa.p10920b;

import com.google.android.apps.gsa.assist.C9339aj;
import com.google.android.apps.gsa.assist.C9347ar;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.aa.b.b */
/* compiled from: PG */
public final class C146679b extends C146672at {

    /* renamed from: a */
    public final C9347ar f396111a;

    /* renamed from: b */
    public final C146701x f396112b;

    public C146679b(C9347ar arVar) {
        this.f396111a = arVar;
        int i = arVar.f32444c;
        int i2 = arVar.f32445d;
        this.f396112b = new C146701x(i, i2, arVar.f32448g + i, arVar.f32449h + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo123451a() {
        return this.f396111a.f32443b.size();
    }

    /* renamed from: b */
    public final C146701x mo123452b() {
        return this.f396112b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Optional mo123453c(int i) {
        return Optional.m71637of((C9347ar) this.f396111a.f32443b.get(i)).map(C146652a.f396091a);
    }

    /* renamed from: d */
    public final CharSequence mo123454d() {
        return this.f396111a.f32453l;
    }

    /* renamed from: e */
    public final CharSequence mo123455e() {
        return this.f396111a.f32454m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C146679b) {
            return this.f396111a.equals(((C146679b) obj).f396111a);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo123456f() {
        C9339aj ajVar = this.f396111a.f32451j;
        if (ajVar == null) {
            ajVar = C9339aj.f32401m;
        }
        return ajVar.f32405c;
    }

    public final int hashCode() {
        return this.f396111a.hashCode();
    }
}
