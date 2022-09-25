package com.google.android.libraries.search.rendering.xuikit.p3097a.p3098a.p3099a.p3101b;

import android.icu.util.ULocale;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64118c;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b.C64128m;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.a.a.b.b */
/* compiled from: PG */
public final class C39915b extends C39923j {

    /* renamed from: a */
    private final ULocale f104937a;

    /* renamed from: b */
    private final C64128m f104938b;

    /* renamed from: c */
    private final C64118c f104939c;

    public C39915b(ULocale uLocale, C64128m mVar, C64118c cVar) {
        if (uLocale != null) {
            this.f104937a = uLocale;
            if (mVar != null) {
                this.f104938b = mVar;
                if (cVar != null) {
                    this.f104939c = cVar;
                    return;
                }
                throw new NullPointerException("Null capitalization");
            }
            throw new NullPointerException("Null width");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: a */
    public final ULocale mo42076a() {
        return this.f104937a;
    }

    /* renamed from: b */
    public final C64118c mo42077b() {
        return this.f104939c;
    }

    /* renamed from: c */
    public final C64128m mo42078c() {
        return this.f104938b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39923j) {
            C39923j jVar = (C39923j) obj;
            return this.f104937a.equals(jVar.mo42076a()) && this.f104938b.equals(jVar.mo42078c()) && this.f104939c.equals(jVar.mo42077b());
        }
    }

    public final int hashCode() {
        return ((((this.f104937a.hashCode() ^ 1000003) * 1000003) ^ this.f104938b.hashCode()) * 1000003) ^ this.f104939c.hashCode();
    }

    public final String toString() {
        String obj = this.f104937a.toString();
        String num = Integer.toString(this.f104938b.f173377e);
        String num2 = Integer.toString(this.f104939c.f173348g);
        return "RelativeFormatterOptions{locale=" + obj + ", width=" + num + ", capitalization=" + num2 + "}";
    }
}
