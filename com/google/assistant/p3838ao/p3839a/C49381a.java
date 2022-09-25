package com.google.assistant.p3838ao.p3839a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.ap.b.l;
import com.google.android.apps.gsa.nga.engine.ap.b.m;
import com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.C75005n;
import com.google.assistant.p3838ao.p3839a.p3847g.C49644a;
import com.google.assistant.p3838ao.p3839a.p3848h.C49661p;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4580v.C60950i;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.a */
/* compiled from: PG */
public class C49381a extends C49692r {

    /* renamed from: a */
    public final Context f127635a;

    /* renamed from: b */
    public final Optional f127636b;

    /* renamed from: c */
    public final C49661p f127637c;

    /* renamed from: d */
    public final Optional f127638d;

    /* renamed from: e */
    public final Optional f127639e;

    /* renamed from: f */
    public final C58528ij f127640f;

    /* renamed from: g */
    public final C58528ij f127641g;

    /* renamed from: h */
    public final Locale f127642h;

    /* renamed from: i */
    public final String f127643i;

    /* renamed from: j */
    public final C60950i f127644j;

    /* renamed from: k */
    public final int f127645k;

    /* renamed from: l */
    public final l f127646l;

    /* renamed from: m */
    public final C75005n f127647m;

    /* renamed from: n */
    private final C49644a f127648n;

    /* renamed from: o */
    private final m f127649o;

    public C49381a(Context context, Optional optional, int i, C49661p pVar, Optional optional2, Optional optional3, C58528ij ijVar, C58528ij ijVar2, l lVar, C75005n nVar, Locale locale, m mVar, C49644a aVar, String str, C60950i iVar) {
        this.f127635a = context;
        if (optional != null) {
            this.f127636b = optional;
            this.f127645k = i;
            this.f127637c = pVar;
            if (optional2 != null) {
                this.f127638d = optional2;
                if (optional3 != null) {
                    this.f127639e = optional3;
                    this.f127640f = ijVar;
                    this.f127641g = ijVar2;
                    this.f127646l = lVar;
                    this.f127647m = nVar;
                    this.f127642h = locale;
                    this.f127649o = mVar;
                    this.f127648n = aVar;
                    this.f127643i = str;
                    this.f127644j = iVar;
                    return;
                }
                throw new NullPointerException("Null foregroundWebUri");
            }
            throw new NullPointerException("Null screenAnnotations");
        }
        throw new NullPointerException("Null request");
    }

    /* renamed from: a */
    public final Context mo53240a() {
        return this.f127635a;
    }

    /* renamed from: b */
    public final C49644a mo53241b() {
        return this.f127648n;
    }

    /* renamed from: c */
    public final C49661p mo53242c() {
        return this.f127637c;
    }

    /* renamed from: d */
    public final C58528ij mo53243d() {
        return this.f127641g;
    }

    /* renamed from: e */
    public final C58528ij mo53244e() {
        return this.f127640f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C49692r) {
            C49692r rVar = (C49692r) obj;
            return this.f127635a.equals(rVar.mo53240a()) && this.f127636b.equals(rVar.mo53248h()) && this.f127645k == rVar.mo53253l() && this.f127637c.equals(rVar.mo53242c()) && this.f127638d.equals(rVar.mo53250i()) && this.f127639e.equals(rVar.mo53247g()) && this.f127640f.equals(rVar.mo53244e()) && this.f127641g.equals(rVar.mo53243d()) && this.f127646l.equals(rVar.mo53255n()) && this.f127647m.equals(rVar.mo53254m()) && this.f127642h.equals(rVar.mo53252k()) && this.f127649o.equals(rVar.mo53256o()) && this.f127648n.equals(rVar.mo53241b()) && this.f127643i.equals(rVar.mo53251j()) && this.f127644j.equals(rVar.mo53246f());
        }
    }

    /* renamed from: f */
    public final C60950i mo53246f() {
        return this.f127644j;
    }

    /* renamed from: g */
    public final Optional mo53247g() {
        return this.f127639e;
    }

    /* renamed from: h */
    public final Optional mo53248h() {
        return this.f127636b;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((this.f127635a.hashCode() ^ 1000003) * 1000003) ^ this.f127636b.hashCode()) * 1000003) ^ this.f127645k) * 1000003) ^ this.f127637c.hashCode()) * 1000003) ^ this.f127638d.hashCode()) * 1000003) ^ this.f127639e.hashCode()) * 1000003) ^ this.f127640f.hashCode()) * 1000003) ^ this.f127641g.hashCode()) * 1000003) ^ this.f127646l.hashCode()) * 1000003) ^ this.f127647m.hashCode()) * 1000003) ^ this.f127642h.hashCode()) * 1000003) ^ this.f127649o.hashCode()) * 1000003) ^ this.f127648n.hashCode()) * 1000003) ^ this.f127643i.hashCode()) * 1000003) ^ this.f127644j.hashCode();
    }

    /* renamed from: i */
    public final Optional mo53250i() {
        return this.f127638d;
    }

    /* renamed from: j */
    public final String mo53251j() {
        return this.f127643i;
    }

    /* renamed from: k */
    public final Locale mo53252k() {
        return this.f127642h;
    }

    /* renamed from: l */
    public final int mo53253l() {
        return this.f127645k;
    }

    /* renamed from: m */
    public final C75005n mo53254m() {
        return this.f127647m;
    }

    /* renamed from: n */
    public final l mo53255n() {
        return this.f127646l;
    }

    /* renamed from: o */
    public final m mo53256o() {
        return this.f127649o;
    }

    public final String toString() {
        String obj = this.f127635a.toString();
        String obj2 = this.f127636b.toString();
        String num = Integer.toString(this.f127645k - 1);
        String obj3 = this.f127637c.toString();
        String obj4 = this.f127638d.toString();
        String obj5 = this.f127639e.toString();
        String obj6 = this.f127640f.toString();
        String obj7 = this.f127641g.toString();
        String obj8 = this.f127646l.toString();
        String obj9 = this.f127647m.toString();
        String obj10 = this.f127642h.toString();
        String obj11 = this.f127649o.toString();
        String obj12 = this.f127648n.toString();
        String str = this.f127643i;
        return "SuggestContext{androidContext=" + obj + ", request=" + obj2 + ", trigger=" + num + ", suggestStateSnapshot=" + obj3 + ", screenAnnotations=" + obj4 + ", foregroundWebUri=" + obj5 + ", enabledExperiments=" + obj6 + ", controlExperiments=" + obj7 + ", installedAppCache=" + obj8 + ", foregroundAppOracle=" + obj9 + ", locale=" + obj10 + ", localization=" + obj11 + ", suggestPrefs=" + obj12 + ", deviceCountryCode=" + str + ", timeSource=" + this.f127644j.toString() + "}";
    }
}
