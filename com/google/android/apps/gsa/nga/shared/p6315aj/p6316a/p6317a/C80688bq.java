package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.protos.p4985f.p5042u.C65342d;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bq */
/* compiled from: PG */
public final class C80688bq extends C80781fb {

    /* renamed from: a */
    public String f221537a;

    /* renamed from: b */
    public String f221538b;

    /* renamed from: c */
    public C80786fg f221539c;

    /* renamed from: d */
    public C80589w f221540d;

    /* renamed from: e */
    public C65342d f221541e;

    /* renamed from: f */
    public int f221542f;

    /* renamed from: g */
    public int f221543g;

    /* renamed from: h */
    private C80831aj f221544h;

    /* renamed from: a */
    public final C80784fe mo74599a() {
        String str;
        C80831aj ajVar;
        int i;
        int i2;
        C65342d dVar;
        String str2 = this.f221537a;
        if (str2 != null && (str = this.f221538b) != null && (ajVar = this.f221544h) != null && (i = this.f221542f) != 0 && (i2 = this.f221543g) != 0 && (dVar = this.f221541e) != null) {
            return new C80689br(str2, str, this.f221539c, ajVar, this.f221540d, i, i2, dVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221537a == null) {
            sb.append(" label");
        }
        if (this.f221538b == null) {
            sb.append(" id");
        }
        if (this.f221544h == null) {
            sb.append(" clickUiAction");
        }
        if (this.f221542f == 0) {
            sb.append(" styleType");
        }
        if (this.f221543g == 0) {
            sb.append(" promotionChipType");
        }
        if (this.f221541e == null) {
            sb.append(" debugData");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74600b(C80831aj ajVar) {
        if (ajVar != null) {
            this.f221544h = ajVar;
            return;
        }
        throw new NullPointerException("Null clickUiAction");
    }

    /* renamed from: c */
    public final void mo74601c(C65342d dVar) {
        if (dVar != null) {
            this.f221541e = dVar;
            return;
        }
        throw new NullPointerException("Null debugData");
    }

    /* renamed from: d */
    public final void mo74602d(String str) {
        if (str != null) {
            this.f221537a = str;
            return;
        }
        throw new NullPointerException("Null label");
    }
}
