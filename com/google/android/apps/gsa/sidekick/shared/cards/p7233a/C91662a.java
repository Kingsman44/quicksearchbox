package com.google.android.apps.gsa.sidekick.shared.cards.p7233a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.a.a */
/* compiled from: PG */
public final class C91662a extends C91663b {

    /* renamed from: b */
    private final Integer f255649b;

    /* renamed from: c */
    private final C58833ax f255650c;

    public C91662a(Integer num, C58833ax axVar) {
        this.f255649b = num;
        this.f255650c = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo86072a() {
        return this.f255650c;
    }

    /* renamed from: b */
    public final Integer mo86073b() {
        return this.f255649b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91663b) {
            C91663b bVar = (C91663b) obj;
            return this.f255649b.equals(bVar.mo86073b()) && this.f255650c.equals(bVar.mo86072a());
        }
    }

    public final int hashCode() {
        return ((this.f255649b.hashCode() ^ 1000003) * 1000003) ^ this.f255650c.hashCode();
    }

    public final String toString() {
        Integer num = this.f255649b;
        String obj = this.f255650c.toString();
        return "CardIndex{index=" + num + ", subIndex=" + obj + "}";
    }
}
