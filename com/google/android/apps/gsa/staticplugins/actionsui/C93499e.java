package com.google.android.apps.gsa.staticplugins.actionsui;

import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.shared.cards.p7233a.C91665d;
import com.google.android.apps.gsa.sidekick.shared.util.C91977ba;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.e */
/* compiled from: PG */
public final class C93499e extends C93697v {

    /* renamed from: a */
    private final C90929bz f260962a;

    /* renamed from: b */
    private final C21370a f260963b;

    /* renamed from: c */
    private final C68214a f260964c;

    /* renamed from: d */
    private final C58881cr f260965d;

    /* renamed from: e */
    private final C68214a f260966e;

    /* renamed from: f */
    private final C58881cr f260967f;

    /* renamed from: g */
    private final C91977ba f260968g;

    /* renamed from: h */
    private final C91665d f260969h;

    public C93499e(C90929bz bzVar, C21370a aVar, C68214a aVar2, C58881cr crVar, C68214a aVar3, C58881cr crVar2, C91977ba baVar, C91665d dVar) {
        this.f260962a = bzVar;
        this.f260963b = aVar;
        this.f260964c = aVar2;
        this.f260965d = crVar;
        this.f260966e = aVar3;
        this.f260967f = crVar2;
        this.f260968g = baVar;
        this.f260969h = dVar;
    }

    /* renamed from: a */
    public final C90929bz mo87808a() {
        return this.f260962a;
    }

    /* renamed from: b */
    public final C91665d mo87809b() {
        return this.f260969h;
    }

    /* renamed from: c */
    public final C91977ba mo87810c() {
        return this.f260968g;
    }

    /* renamed from: d */
    public final C21370a mo87811d() {
        return this.f260963b;
    }

    /* renamed from: e */
    public final C58881cr mo87812e() {
        return this.f260967f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C93697v) {
            C93697v vVar = (C93697v) obj;
            return this.f260962a.equals(vVar.mo87808a()) && this.f260963b.equals(vVar.mo87811d()) && this.f260964c.equals(vVar.mo87815g()) && this.f260965d.equals(vVar.mo87814f()) && this.f260966e.equals(vVar.mo87816h()) && this.f260967f.equals(vVar.mo87812e()) && this.f260968g.equals(vVar.mo87810c()) && this.f260969h.equals(vVar.mo87809b());
        }
    }

    /* renamed from: f */
    public final C58881cr mo87814f() {
        return this.f260965d;
    }

    /* renamed from: g */
    public final C68214a mo87815g() {
        return this.f260964c;
    }

    /* renamed from: h */
    public final C68214a mo87816h() {
        return this.f260966e;
    }

    public final int hashCode() {
        return ((((((((((((((this.f260962a.hashCode() ^ 1000003) * 1000003) ^ this.f260963b.hashCode()) * 1000003) ^ this.f260964c.hashCode()) * 1000003) ^ this.f260965d.hashCode()) * 1000003) ^ this.f260966e.hashCode()) * 1000003) ^ this.f260967f.hashCode()) * 1000003) ^ this.f260968g.hashCode()) * 1000003) ^ this.f260969h.hashCode();
    }

    public final String toString() {
        String obj = this.f260962a.toString();
        String obj2 = this.f260963b.toString();
        String obj3 = this.f260964c.toString();
        String obj4 = this.f260965d.toString();
        String obj5 = this.f260966e.toString();
        String obj6 = this.f260967f.toString();
        String obj7 = this.f260968g.toString();
        String obj8 = this.f260969h.toString();
        return "AgendaCardDependencies{taskRunner=" + obj + ", clock=" + obj2 + ", contentCacherFactoryLazy=" + obj3 + ", nowCardsResourcesSupplier=" + obj4 + ", nowRemoteClientLazy=" + obj5 + ", highContrastSettingsSupplier=" + obj6 + ", cardRenderingContextSupplier=" + obj7 + ", cardViewCreator=" + obj8 + "}";
    }
}
