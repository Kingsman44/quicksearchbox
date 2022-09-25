package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.view.View;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.b */
/* compiled from: PG */
final class C101834b extends C101838f {

    /* renamed from: a */
    private final View f284053a;

    /* renamed from: b */
    private final String f284054b;

    /* renamed from: c */
    private final boolean f284055c;

    /* renamed from: d */
    private final C101837e f284056d;

    /* renamed from: e */
    private final C90584f f284057e;

    /* renamed from: f */
    private final String f284058f;

    /* renamed from: g */
    private final C58833ax f284059g;

    public C101834b(View view, String str, boolean z, C101837e eVar, C90584f fVar, String str2, C58833ax axVar) {
        this.f284053a = view;
        this.f284054b = str;
        this.f284055c = z;
        this.f284056d = eVar;
        this.f284057e = fVar;
        this.f284058f = str2;
        this.f284059g = axVar;
    }

    /* renamed from: a */
    public final View mo92603a() {
        return this.f284053a;
    }

    /* renamed from: b */
    public final C90584f mo92604b() {
        return this.f284057e;
    }

    /* renamed from: c */
    public final C101837e mo92605c() {
        return this.f284056d;
    }

    /* renamed from: d */
    public final C58833ax mo92606d() {
        return this.f284059g;
    }

    /* renamed from: e */
    public final String mo92607e() {
        return this.f284054b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C101838f) {
            C101838f fVar = (C101838f) obj;
            return this.f284053a.equals(fVar.mo92603a()) && this.f284054b.equals(fVar.mo92607e()) && this.f284055c == fVar.mo92610g() && this.f284056d.equals(fVar.mo92605c()) && this.f284057e.equals(fVar.mo92604b()) && this.f284058f.equals(fVar.mo92609f()) && this.f284059g.equals(fVar.mo92606d());
        }
    }

    /* renamed from: f */
    public final String mo92609f() {
        return this.f284058f;
    }

    /* renamed from: g */
    public final boolean mo92610g() {
        return this.f284055c;
    }

    public final int hashCode() {
        return ((((((((((((this.f284053a.hashCode() ^ 1000003) * 1000003) ^ this.f284054b.hashCode()) * 1000003) ^ (true != this.f284055c ? 1237 : 1231)) * 1000003) ^ this.f284056d.hashCode()) * 1000003) ^ this.f284057e.hashCode()) * 1000003) ^ this.f284058f.hashCode()) * 1000003) ^ this.f284059g.hashCode();
    }

    public final String toString() {
        String obj = this.f284053a.toString();
        String str = this.f284054b;
        boolean z = this.f284055c;
        String obj2 = this.f284056d.toString();
        String num = Integer.toString(this.f284057e.f253255d);
        String str2 = this.f284058f;
        String valueOf = String.valueOf(this.f284059g);
        return "DependencyControllerParams{loadingIndicatorView=" + obj + ", accountName=" + str + ", isGoogleHomeEnrollment=" + z + ", callback=" + obj2 + ", modelType=" + num + ", locale=" + str2 + ", impersonatedUser=" + valueOf + "}";
    }
}
