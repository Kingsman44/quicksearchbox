package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import android.icu.util.ULocale;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64128m;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.a */
/* compiled from: PG */
public final class C39914a extends C39922i {

    /* renamed from: a */
    private final ULocale f104935a;

    /* renamed from: b */
    private final C64128m f104936b;

    public C39914a(ULocale uLocale, C64128m mVar) {
        if (uLocale != null) {
            this.f104935a = uLocale;
            if (mVar != null) {
                this.f104936b = mVar;
                return;
            }
            throw new NullPointerException("Null width");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final ULocale mo42071a() {
        return this.f104935a;
    }

    /* renamed from: b */
    public final C64128m mo42072b() {
        return this.f104936b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39922i) {
            C39922i iVar = (C39922i) obj;
            return this.f104935a.equals(iVar.mo42071a()) && this.f104936b.equals(iVar.mo42072b());
        }
    }

    public final int hashCode() {
        return ((this.f104935a.hashCode() ^ 1000003) * 1000003) ^ this.f104936b.hashCode();
    }

    public final String toString() {
        String obj = this.f104935a.toString();
        String num = Integer.toString(this.f104936b.f173377e);
        return "DurationFormatterOptions{locale=" + obj + ", width=" + num + "}";
    }
}
