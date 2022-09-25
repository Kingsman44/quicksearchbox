package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.C143700ab;
import com.google.android.gms.common.C143701ac;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144017q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.gms.measurement.internal.fx */
/* compiled from: PG */
public final class C145379fx extends C145315dn {

    /* renamed from: a */
    public final C145488jy f393008a;

    /* renamed from: b */
    private Boolean f393009b;

    /* renamed from: c */
    private String f393010c = null;

    public C145379fx(C145488jy jyVar) {
        C143919bh.m233958a(jyVar);
        this.f393008a = jyVar;
    }

    /* renamed from: c */
    private final void m236209c(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f393009b == null) {
                        if (!"com.google.android.gms".equals(this.f393010c) && !C144017q.m234197a(this.f393008a.f393363k.f392931a, Binder.getCallingUid())) {
                            if (!C143701ac.m233450a(this.f393008a.f393363k.f392931a).mo119085d(Binder.getCallingUid())) {
                                z2 = false;
                                this.f393009b = Boolean.valueOf(z2);
                            }
                        }
                        C145361ff ffVar = this.f393008a.f393363k;
                        z2 = true;
                        this.f393009b = Boolean.valueOf(z2);
                    }
                    if (this.f393009b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f393008a.mo120965ar().f392795c.mo120895b("Measurement Service called with invalid calling package. appId", C145325dx.m236116a(str));
                    throw e;
                }
            }
            if (this.f393010c == null && C143700ab.m233448j(this.f393008a.f393363k.f392931a, Binder.getCallingUid(), str)) {
                this.f393010c = str;
            }
            if (!str.equals(this.f393010c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f393008a.mo120965ar().f392795c.mo120894a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* renamed from: d */
    private final void m236210d(AppMetadata appMetadata) {
        C143919bh.m233958a(appMetadata);
        C143919bh.m233969l(appMetadata.f392500a);
        m236209c(appMetadata.f392500a, false);
        this.f393008a.mo121214j().mo121263T(appMetadata.f392501b, appMetadata.f392516q);
    }

    /* renamed from: a */
    public final void mo120999a(EventParcel eventParcel, AppMetadata appMetadata) {
        this.f393008a.mo121217m();
        this.f393008a.mo121222r(eventParcel, appMetadata);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo121000b(Runnable runnable) {
        C143919bh.m233958a(runnable);
        if (this.f393008a.mo120966as().mo120962j()) {
            runnable.run();
        } else {
            this.f393008a.mo120966as().mo120960h(runnable);
        }
    }

    /* renamed from: e */
    public final String mo120855e(AppMetadata appMetadata) {
        m236210d(appMetadata);
        return this.f393008a.mo121216l(appMetadata);
    }

    /* renamed from: f */
    public final List mo120856f(AppMetadata appMetadata, boolean z) {
        m236210d(appMetadata);
        String str = appMetadata.f392500a;
        C143919bh.m233958a(str);
        try {
            List<C145493kc> list = (List) this.f393008a.mo120966as().mo120957c(new C145376fu(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C145493kc kcVar : list) {
                if (z || !C145495ke.m236485ad(kcVar.f393383c)) {
                    arrayList.add(new UserAttributeParcel(kcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f393008a.mo120965ar().f392795c.mo120896c("Failed to get user properties. appId", C145325dx.m236116a(appMetadata.f392500a), e);
            return null;
        }
    }

    /* renamed from: g */
    public final List mo120857g(String str, String str2, AppMetadata appMetadata) {
        m236210d(appMetadata);
        String str3 = appMetadata.f392500a;
        C143919bh.m233958a(str3);
        try {
            return (List) this.f393008a.mo120966as().mo120957c(new C145367fl(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f393008a.mo120965ar().f392795c.mo120895b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: h */
    public final List mo120858h(String str, String str2, String str3) {
        m236209c(str, true);
        try {
            return (List) this.f393008a.mo120966as().mo120957c(new C145368fm(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f393008a.mo120965ar().f392795c.mo120895b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: i */
    public final List mo120859i(String str, String str2, boolean z, AppMetadata appMetadata) {
        m236210d(appMetadata);
        String str3 = appMetadata.f392500a;
        C143919bh.m233958a(str3);
        try {
            List<C145493kc> list = (List) this.f393008a.mo120966as().mo120957c(new C145365fj(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C145493kc kcVar : list) {
                if (z || !C145495ke.m236485ad(kcVar.f393383c)) {
                    arrayList.add(new UserAttributeParcel(kcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f393008a.mo120965ar().f392795c.mo120896c("Failed to query user properties. appId", C145325dx.m236116a(appMetadata.f392500a), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: j */
    public final List mo120860j(String str, String str2, String str3, boolean z) {
        m236209c(str, true);
        try {
            List<C145493kc> list = (List) this.f393008a.mo120966as().mo120957c(new C145366fk(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C145493kc kcVar : list) {
                if (z || !C145495ke.m236485ad(kcVar.f393383c)) {
                    arrayList.add(new UserAttributeParcel(kcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f393008a.mo120965ar().f392795c.mo120896c("Failed to get user properties as. appId", C145325dx.m236116a(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: k */
    public final void mo120861k(AppMetadata appMetadata) {
        m236210d(appMetadata);
        mo121000b(new C145377fv(this, appMetadata));
    }

    /* renamed from: l */
    public final void mo120862l(EventParcel eventParcel, AppMetadata appMetadata) {
        C143919bh.m233958a(eventParcel);
        m236210d(appMetadata);
        mo121000b(new C145372fq(this, eventParcel, appMetadata));
    }

    /* renamed from: m */
    public final void mo120863m(EventParcel eventParcel, String str, String str2) {
        C143919bh.m233958a(eventParcel);
        C143919bh.m233969l(str);
        m236209c(str, true);
        mo121000b(new C145373fr(this, eventParcel, str));
    }

    /* renamed from: n */
    public final void mo120864n(AppMetadata appMetadata) {
        C143919bh.m233969l(appMetadata.f392500a);
        m236209c(appMetadata.f392500a, false);
        mo121000b(new C145369fn(this, appMetadata));
    }

    /* renamed from: o */
    public final void mo120865o(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        C143919bh.m233958a(conditionalUserPropertyParcel);
        C143919bh.m233958a(conditionalUserPropertyParcel.f392526c);
        m236210d(appMetadata);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        conditionalUserPropertyParcel2.f392524a = appMetadata.f392500a;
        mo121000b(new C145363fh(this, conditionalUserPropertyParcel2, appMetadata));
    }

    /* renamed from: p */
    public final void mo120866p(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        C143919bh.m233958a(conditionalUserPropertyParcel);
        C143919bh.m233958a(conditionalUserPropertyParcel.f392526c);
        C143919bh.m233969l(conditionalUserPropertyParcel.f392524a);
        m236209c(conditionalUserPropertyParcel.f392524a, true);
        mo121000b(new C145364fi(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
    }

    /* renamed from: q */
    public final void mo120867q(AppMetadata appMetadata) {
        C143919bh.m233969l(appMetadata.f392500a);
        C143919bh.m233958a(appMetadata.f392521v);
        C145371fp fpVar = new C145371fp(this, appMetadata);
        if (this.f393008a.mo120966as().mo120962j()) {
            fpVar.run();
        } else {
            this.f393008a.mo120966as().mo120961i(fpVar);
        }
    }

    /* renamed from: r */
    public final void mo120868r(long j, String str, String str2, String str3) {
        mo121000b(new C145378fw(this, str2, str3, str, j));
    }

    /* renamed from: s */
    public final void mo120869s(Bundle bundle, AppMetadata appMetadata) {
        m236210d(appMetadata);
        String str = appMetadata.f392500a;
        C143919bh.m233958a(str);
        mo121000b(new C145362fg(this, str, bundle));
    }

    /* renamed from: t */
    public final void mo120870t(AppMetadata appMetadata) {
        m236210d(appMetadata);
        mo121000b(new C145370fo(this, appMetadata));
    }

    /* renamed from: u */
    public final void mo120871u(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        C143919bh.m233958a(userAttributeParcel);
        m236210d(appMetadata);
        mo121000b(new C145375ft(this, userAttributeParcel, appMetadata));
    }

    /* renamed from: v */
    public final byte[] mo120872v(EventParcel eventParcel, String str) {
        C143919bh.m233969l(str);
        C143919bh.m233958a(eventParcel);
        m236209c(str, true);
        this.f393008a.mo120965ar().f392802j.mo120895b("Log and bundle. event", this.f393008a.f393363k.f392942l.mo120890c(eventParcel.f392536a));
        C143919bh.m233958a(this.f393008a.f393363k);
        long nanoTime = System.nanoTime() / 1000000;
        C145358fc as = this.f393008a.mo120966as();
        C145374fs fsVar = new C145374fs(this, eventParcel, str);
        as.mo121002k();
        C145356fa faVar = new C145356fa(as, fsVar, true);
        if (Thread.currentThread() == as.f392911b) {
            faVar.run();
        } else {
            as.mo120958d(faVar);
        }
        try {
            byte[] bArr = (byte[]) faVar.get();
            if (bArr == null) {
                this.f393008a.mo120965ar().f392795c.mo120895b("Log and bundle returned null. appId", C145325dx.m236116a(str));
                bArr = new byte[0];
            }
            C143919bh.m233958a(this.f393008a.f393363k);
            this.f393008a.mo120965ar().f392802j.mo120897d("Log and bundle processed. event, size, time_ms", this.f393008a.f393363k.f392942l.mo120890c(eventParcel.f392536a), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f393008a.mo120965ar().f392795c.mo120897d("Failed to log and bundle. appId, event, error", C145325dx.m236116a(str), this.f393008a.f393363k.f392942l.mo120890c(eventParcel.f392536a), e);
            return null;
        }
    }
}
