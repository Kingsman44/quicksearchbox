package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.search.p3055n.p3081g.p3082a.p3083a.C39717b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60888db;
import com.google.protobuf.C63088z;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.g.a.v */
/* compiled from: PG */
public final class C39751v {

    /* renamed from: a */
    public static final C58974d f104571a = C58974d.m91134h("SodaResourceCollector");

    /* renamed from: b */
    public final Optional f104572b;

    /* renamed from: c */
    public final Optional f104573c;

    /* renamed from: d */
    public final Optional f104574d;

    /* renamed from: e */
    public final Optional f104575e;

    /* renamed from: f */
    public final Optional f104576f;

    /* renamed from: g */
    public final Optional f104577g;

    /* renamed from: h */
    public final C60888db f104578h;

    public C39751v(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, C60888db dbVar) {
        this.f104572b = optional;
        this.f104573c = optional2;
        this.f104574d = optional3;
        this.f104575e = optional4;
        this.f104576f = optional5;
        this.f104577g = optional6;
        this.f104578h = dbVar;
    }

    /* renamed from: a */
    public static Optional m69185a(C58833ax axVar) {
        return axVar.mo56113h() ? Optional.m71637of(axVar.mo56107c()) : Optional.empty();
    }

    /* renamed from: b */
    public static C39717b m69186b(Locale locale, Optional optional) {
        return new C39717b(locale, C58833ax.m90833j((C63088z) optional.orElse(null)), C58836b.f156633a);
    }
}
