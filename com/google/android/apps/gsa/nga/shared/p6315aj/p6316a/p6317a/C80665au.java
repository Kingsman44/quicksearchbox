package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.au */
/* compiled from: PG */
public final class C80665au extends C80716cr {

    /* renamed from: a */
    public String f221451a;

    /* renamed from: b */
    public String f221452b;

    /* renamed from: c */
    public String f221453c;

    /* renamed from: d */
    public C80721cw f221454d;

    /* renamed from: e */
    public C80587u f221455e;

    /* renamed from: f */
    public int f221456f;

    /* renamed from: g */
    private boolean f221457g;

    /* renamed from: h */
    private boolean f221458h;

    /* renamed from: i */
    private boolean f221459i;

    /* renamed from: j */
    private Optional f221460j = Optional.empty();

    /* renamed from: k */
    private C80831aj f221461k;

    /* renamed from: l */
    private Optional f221462l = Optional.empty();

    /* renamed from: m */
    private Optional f221463m = Optional.empty();

    /* renamed from: n */
    private C80727db f221464n;

    /* renamed from: o */
    private byte f221465o;

    public C80665au() {
    }

    /* renamed from: a */
    public final C80722cx mo74477a() {
        String str;
        String str2;
        String str3;
        C80721cw cwVar;
        C80831aj ajVar;
        C80727db dbVar;
        int i;
        if (this.f221465o == 7 && (str = this.f221451a) != null && (str2 = this.f221452b) != null && (str3 = this.f221453c) != null && (cwVar = this.f221454d) != null && (ajVar = this.f221461k) != null && (dbVar = this.f221464n) != null && (i = this.f221456f) != 0) {
            return new C80666av(str, str2, str3, this.f221457g, this.f221458h, cwVar, this.f221459i, this.f221455e, this.f221460j, ajVar, this.f221462l, this.f221463m, dbVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221451a == null) {
            sb.append(" firstLine");
        }
        if (this.f221452b == null) {
            sb.append(" secondLine");
        }
        if (this.f221453c == null) {
            sb.append(" bottomText");
        }
        if ((this.f221465o & 1) == 0) {
            sb.append(" hasLogo");
        }
        if ((this.f221465o & 2) == 0) {
            sb.append(" hasIllustrationGif");
        }
        if (this.f221454d == null) {
            sb.append(" illustrationGifType");
        }
        if ((this.f221465o & 4) == 0) {
            sb.append(" hasSuggestionChips");
        }
        if (this.f221461k == null) {
            sb.append(" clickAction");
        }
        if (this.f221464n == null) {
            sb.append(" loggingInfos");
        }
        if (this.f221456f == 0) {
            sb.append(" executionStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74478b(String str) {
        if (str != null) {
            this.f221453c = str;
            return;
        }
        throw new NullPointerException("Null bottomText");
    }

    /* renamed from: c */
    public final void mo74479c(C80831aj ajVar) {
        if (ajVar != null) {
            this.f221461k = ajVar;
            return;
        }
        throw new NullPointerException("Null clickAction");
    }

    /* renamed from: d */
    public final void mo74480d(Optional optional) {
        if (optional != null) {
            this.f221460j = optional;
            return;
        }
        throw new NullPointerException("Null disclosureInfo");
    }

    /* renamed from: e */
    public final void mo74481e(String str) {
        if (str != null) {
            this.f221451a = str;
            return;
        }
        throw new NullPointerException("Null firstLine");
    }

    /* renamed from: f */
    public final void mo74482f(boolean z) {
        this.f221458h = z;
        this.f221465o = (byte) (this.f221465o | 2);
    }

    /* renamed from: g */
    public final void mo74483g(boolean z) {
        this.f221457g = z;
        this.f221465o = (byte) (this.f221465o | 1);
    }

    /* renamed from: h */
    public final void mo74484h(boolean z) {
        this.f221459i = z;
        this.f221465o = (byte) (this.f221465o | 4);
    }

    /* renamed from: i */
    public final void mo74485i(C80721cw cwVar) {
        if (cwVar != null) {
            this.f221454d = cwVar;
            return;
        }
        throw new NullPointerException("Null illustrationGifType");
    }

    /* renamed from: j */
    public final void mo74486j(Optional optional) {
        if (optional != null) {
            this.f221463m = optional;
            return;
        }
        throw new NullPointerException("Null impressionInfo");
    }

    /* renamed from: k */
    public final void mo74487k(C80727db dbVar) {
        if (dbVar != null) {
            this.f221464n = dbVar;
            return;
        }
        throw new NullPointerException("Null loggingInfos");
    }

    /* renamed from: l */
    public final void mo74488l(String str) {
        if (str != null) {
            this.f221452b = str;
            return;
        }
        throw new NullPointerException("Null secondLine");
    }

    /* renamed from: m */
    public final void mo74489m(Optional optional) {
        if (optional != null) {
            this.f221462l = optional;
            return;
        }
        throw new NullPointerException("Null suggestionLogData");
    }

    public C80665au(C80722cx cxVar) {
        C80666av avVar = (C80666av) cxVar;
        this.f221451a = avVar.f221466a;
        this.f221452b = avVar.f221467b;
        this.f221453c = avVar.f221468c;
        this.f221457g = avVar.f221469d;
        this.f221458h = avVar.f221470e;
        this.f221454d = avVar.f221471f;
        this.f221459i = avVar.f221472g;
        this.f221455e = avVar.f221473h;
        this.f221460j = avVar.f221474i;
        this.f221461k = avVar.f221475j;
        this.f221462l = avVar.f221476k;
        this.f221463m = avVar.f221477l;
        this.f221464n = avVar.f221478m;
        this.f221456f = avVar.f221479n;
        this.f221465o = 7;
    }
}
