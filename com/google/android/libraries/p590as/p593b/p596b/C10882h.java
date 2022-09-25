package com.google.android.libraries.p590as.p593b.p596b;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import java.util.Locale;

/* renamed from: com.google.android.libraries.as.b.b.h */
/* compiled from: PG */
public abstract class C10882h {

    /* renamed from: c */
    public static final C10882h f35968c;

    static {
        Locale forLanguageTag = Locale.forLanguageTag(BuildConfig.FLAVOR);
        C58733pz pzVar = C58733pz.f156496a;
        C58495hd hdVar = C58729pv.f156485a;
        C58836b bVar = C58836b.f156633a;
        f35968c = new C10784a(forLanguageTag, -1, 1, pzVar, hdVar, 0, bVar, bVar);
    }

    /* renamed from: i */
    public static C10882h m25897i(String str, int i, C58528ij ijVar, C58495hd hdVar, String str2) {
        return new C10784a(Locale.forLanguageTag(str), i, 3, ijVar, hdVar, 0, C58836b.f156633a, C58833ax.m90834k(new C10823b(str2)));
    }

    /* renamed from: j */
    public static C10882h m25898j(String str, int i, C58528ij ijVar, C58495hd hdVar, long j, String str2, String str3) {
        return new C10784a(Locale.forLanguageTag(str), i, 2, ijVar, hdVar, j, C58833ax.m90834k(new C10847c(str2, str3)), C58836b.f156633a);
    }

    /* renamed from: m */
    public static C10882h m25899m(Locale locale, int i, int i2, C58528ij ijVar, C58495hd hdVar, long j) {
        C58836b bVar = C58836b.f156633a;
        return new C10784a(locale, i, i2, ijVar, hdVar, j, bVar, bVar);
    }

    /* renamed from: n */
    public static C10882h m25900n(String str, int i, C58528ij ijVar, C58495hd hdVar, long j) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        C58836b bVar = C58836b.f156633a;
        return new C10784a(forLanguageTag, i, 2, ijVar, hdVar, j, bVar, bVar);
    }

    /* renamed from: a */
    public abstract int mo19282a();

    /* renamed from: b */
    public abstract long mo19283b();

    /* renamed from: c */
    public abstract C58833ax mo19284c();

    /* renamed from: d */
    public abstract C58833ax mo19285d();

    /* renamed from: e */
    public abstract C58495hd mo19286e();

    /* renamed from: f */
    public abstract C58528ij mo19288f();

    /* renamed from: g */
    public abstract Locale mo19289g();

    /* renamed from: h */
    public abstract int mo19290h();

    /* renamed from: k */
    public final String mo19332k() {
        return String.format(Locale.US, "%s_v%d", new Object[]{mo19289g().toLanguageTag(), Integer.valueOf(mo19282a())});
    }

    /* renamed from: l */
    public final boolean mo19333l(C10882h hVar) {
        return mo19289g().equals(hVar.mo19289g()) && mo19282a() == hVar.mo19282a();
    }
}
