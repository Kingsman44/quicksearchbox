package com.google.firebase.p4610c;

import android.content.Context;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3186j$.time.ZoneOffset;
import p3186j$.time.format.DateTimeFormatter;
import p3186j$.util.DateRetargetClass;

/* renamed from: com.google.firebase.c.l */
/* compiled from: PG */
final class C61138l {

    /* renamed from: a */
    private final SharedPreferences f165460a;

    public C61138l(Context context, String str) {
        this.f165460a = context.getSharedPreferences("FirebaseHeartBeat".concat(str), 0);
    }

    /* renamed from: i */
    private final synchronized String m93480i(long j) {
        return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* renamed from: j */
    private final synchronized String m93481j(String str) {
        for (Map.Entry next : this.f165460a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final synchronized void m93482k() {
        long j = this.f165460a.getLong("fire-count", 0);
        String str = BuildConfig.FLAVOR;
        String str2 = null;
        for (Map.Entry next : this.f165460a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = (String) next.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f165460a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f165460a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: l */
    private final synchronized void m93483l(String str) {
        String j = m93481j(str);
        if (j != null) {
            HashSet hashSet = new HashSet(this.f165460a.getStringSet(j, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f165460a.edit().remove(j).commit();
            } else {
                this.f165460a.edit().putStringSet(j, hashSet).commit();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized List mo57701a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f165460a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(new C61127a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo57705e(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo57702b() {
        SharedPreferences.Editor edit = this.f165460a.edit();
        for (Map.Entry next : this.f165460a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo57703c() {
        String i = m93480i(System.currentTimeMillis());
        this.f165460a.edit().putString("last-used-date", i).commit();
        m93483l(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo57704d(long j, String str) {
        String i = m93480i(j);
        if (!this.f165460a.getString("last-used-date", BuildConfig.FLAVOR).equals(i)) {
            long j2 = this.f165460a.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                m93482k();
                j2 = this.f165460a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f165460a.getStringSet(str, new HashSet()));
            hashSet.add(i);
            this.f165460a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", i).commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo57705e(long j) {
        this.f165460a.edit().putLong("fire-global", j).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized boolean mo57706f(long j, long j2) {
        return m93480i(j).equals(m93480i(j2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean mo57707g(long j) {
        return mo57708h(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final synchronized boolean mo57708h(long j) {
        if (!this.f165460a.contains("fire-global")) {
            this.f165460a.edit().putLong("fire-global", j).commit();
            return true;
        } else if (mo57706f(this.f165460a.getLong("fire-global", -1), j)) {
            return false;
        } else {
            this.f165460a.edit().putLong("fire-global", j).commit();
            return true;
        }
    }
}
