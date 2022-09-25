package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80617l;
import com.google.android.apps.gsa.nga.shared.p6309ag.C80627v;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ah */
/* compiled from: PG */
public final class C103908ah {

    /* renamed from: a */
    public final C80617l f289224a;

    /* renamed from: b */
    private C58528ij f289225b = null;

    /* renamed from: c */
    private Boolean f289226c = null;

    /* renamed from: d */
    private Locale f289227d = null;

    /* renamed from: e */
    private C58528ij f289228e = null;

    /* renamed from: f */
    private final SharedPreferences f289229f;

    /* renamed from: g */
    private final C104126w f289230g;

    public C103908ah(SharedPreferences sharedPreferences, C80617l lVar, C104126w wVar) {
        this.f289229f = sharedPreferences;
        this.f289224a = lVar;
        this.f289230g = wVar;
    }

    /* renamed from: j */
    private static void m171837j(Set set) {
        Arrays.toString(Collection.EL.stream(set).map(C103906af.f289222a).toArray());
    }

    /* renamed from: a */
    public final synchronized C58528ij mo93879a(Locale locale) {
        C58528ij ijVar;
        if (this.f289225b == null || mo93885g()) {
            C58526ih ihVar = new C58526ih();
            if (locale.equals(Locale.US)) {
                for (String next : this.f289229f.getStringSet("nga_available_system_image_groups", C58733pz.f156496a)) {
                    C80627v a = C80627v.m128255a(Integer.parseInt(next));
                    if (a == null) {
                        this.f289230g.mo93948a(2, String.format(Locale.US, "Unknown GroupId %s, this can happen on a version downgrade", new Object[]{next}));
                    } else {
                        ihVar.mo55373c(a);
                    }
                }
            }
            boolean f = this.f289224a.mo74371f();
            Stream filter = Collection.EL.stream(this.f289229f.getStringSet("nga_available_mdd_file_groups", C58733pz.f156496a)).map(new C103903ac(this, f)).filter(C103904ad.f289220a);
            Objects.requireNonNull(ihVar);
            filter.forEach(new C103905ae(ihVar));
            this.f289226c = Boolean.valueOf(f);
            this.f289225b = ihVar.mo55486f();
        }
        ijVar = this.f289225b;
        ijVar.getClass();
        m171837j(ijVar);
        return ijVar;
    }

    /* renamed from: b */
    public final synchronized C58528ij mo93880b() {
        if (this.f289228e == null) {
            this.f289228e = (C58528ij) Objects.requireNonNull(C58528ij.m90006F(this.f289229f.getStringSet("nga_available_language_pack", C58733pz.f156496a)));
        }
        return this.f289228e;
    }

    /* renamed from: c */
    public final synchronized void mo93881c() {
        this.f289229f.edit().remove("nga_available_system_image_groups").remove("nga_available_mdd_file_groups").remove("nga_available_mdd_file_groups_locale").remove("nga_available_language_pack").apply();
        this.f289225b = null;
        this.f289227d = null;
        this.f289228e = null;
    }

    /* renamed from: d */
    public final synchronized void mo93882d(Set set) {
        this.f289229f.edit().putStringSet("nga_available_mdd_file_groups", set).apply();
        this.f289225b = null;
    }

    /* renamed from: e */
    public final synchronized void mo93883e(Set set) {
        SharedPreferences.Editor edit = this.f289229f.edit();
        edit.putStringSet("nga_available_system_image_groups", (Set) Collection.EL.stream(set).map(C103907ag.f289223a).collect(Collectors.toSet()));
        edit.apply();
        m171837j(set);
        this.f289225b = null;
    }

    /* renamed from: f */
    public final synchronized void mo93884f(C58528ij ijVar) {
        if (!mo93880b().equals(ijVar)) {
            this.f289229f.edit().putStringSet("nga_available_language_pack", ijVar).apply();
            this.f289228e = C58528ij.m90006F(ijVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1.booleanValue() == r0) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo93885g() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.apps.gsa.nga.shared.ag.l r0 = r3.f289224a     // Catch:{ all -> 0x0018 }
            boolean r0 = r0.mo74371f()     // Catch:{ all -> 0x0018 }
            java.lang.Boolean r1 = r3.f289226c     // Catch:{ all -> 0x0018 }
            r2 = 1
            if (r1 != 0) goto L_0x000e
            monitor-exit(r3)
            return r2
        L_0x000e:
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)
            if (r1 == r0) goto L_0x0016
            return r2
        L_0x0016:
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8089t.C103908ah.mo93885g():boolean");
    }

    /* renamed from: h */
    public final synchronized boolean mo93886h() {
        return this.f289229f.getStringSet("nga_available_system_image_groups", C58733pz.f156496a).contains(Integer.toString(C80627v.SODA.getNumber()));
    }

    /* renamed from: i */
    public final synchronized boolean mo93887i(Locale locale) {
        String string;
        if (this.f289227d == null && (string = this.f289229f.getString("nga_available_mdd_file_groups_locale", (String) null)) != null) {
            this.f289227d = Locale.forLanguageTag(string);
        }
        Locale locale2 = this.f289227d;
        this.f289227d = locale;
        this.f289229f.edit().putString("nga_available_mdd_file_groups_locale", locale.toLanguageTag()).apply();
        if (locale.equals(locale2)) {
            return false;
        }
        mo93882d(C58733pz.f156496a);
        return true;
    }
}
