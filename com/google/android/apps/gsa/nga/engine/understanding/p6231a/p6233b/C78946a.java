package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6233b;

import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78954f;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78969u;
import com.google.android.apps.gsa.nga.engine.understanding.p6231a.C78971w;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.b.a */
/* compiled from: PG */
public final class C78946a implements C78954f {

    /* renamed from: a */
    private final C91142g f217184a;

    public C78946a(C91142g gVar) {
        this.f217184a = gVar;
    }

    /* renamed from: a */
    public final C58528ij mo73695a() {
        return C58733pz.f156496a;
    }

    /* renamed from: b */
    public final Optional mo73696b(String str, C58485gu guVar, String str2, Optional optional) {
        if (!this.f217184a.mo85405j(C90126fx.f251144dK)) {
            return Optional.empty();
        }
        String lowerCase = str.toLowerCase(Locale.US);
        if (!lowerCase.startsWith("search for ")) {
            return Optional.empty();
        }
        String substring = lowerCase.substring(11);
        C78969u uVar = new C78969u();
        uVar.mo73686b(substring);
        uVar.f217221a = new C78971w(str2);
        return Optional.m71637of(uVar.mo73685a());
    }

    /* renamed from: c */
    public final /* synthetic */ Optional mo73697c() {
        return Optional.empty();
    }

    /* renamed from: d */
    public final String mo73698d() {
        return "debug";
    }

    /* renamed from: e */
    public final boolean mo73699e() {
        return true;
    }
}
