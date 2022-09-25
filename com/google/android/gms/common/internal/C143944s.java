package com.google.android.gms.common.internal;

import android.accounts.Account;
import com.google.android.gms.signin.C145994f;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.s */
/* compiled from: PG */
public final class C143944s {

    /* renamed from: a */
    public final Account f390169a;

    /* renamed from: b */
    public final Set f390170b;

    /* renamed from: c */
    public final Set f390171c;

    /* renamed from: d */
    public final Map f390172d;

    /* renamed from: e */
    public final String f390173e;

    /* renamed from: f */
    public final String f390174f;

    /* renamed from: g */
    public final C145994f f390175g;

    /* renamed from: h */
    public Integer f390176h;

    public C143944s(Account account, Set set, Map map, String str, String str2, C145994f fVar) {
        this.f390169a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f390170b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f390172d = map;
        this.f390173e = str;
        this.f390174f = str2;
        this.f390175g = fVar == null ? C145994f.f394670a : fVar;
        HashSet hashSet = new HashSet(emptySet);
        for (C143943r rVar : map.values()) {
            Set set2 = rVar.f390168a;
            hashSet.addAll((Collection) null);
        }
        this.f390171c = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    /* renamed from: a */
    public final String mo119476a() {
        Account account = this.f390169a;
        if (account != null) {
            return account.name;
        }
        return null;
    }
}
