package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.a */
/* compiled from: PG */
public class C90420a {

    /* renamed from: a */
    public final C21370a f252564a;

    /* renamed from: b */
    public String f252565b;

    /* renamed from: c */
    public boolean f252566c;

    /* renamed from: d */
    public Uri f252567d;

    /* renamed from: e */
    public String f252568e;

    /* renamed from: f */
    public Uri f252569f;

    /* renamed from: g */
    public Integer f252570g;

    /* renamed from: h */
    public boolean f252571h;

    /* renamed from: i */
    public GroupDataKey f252572i;

    /* renamed from: j */
    public String f252573j;

    /* renamed from: k */
    public Intent f252574k;

    /* renamed from: l */
    public String f252575l;

    /* renamed from: m */
    public Long f252576m;

    /* renamed from: n */
    public Long f252577n;

    /* renamed from: o */
    public Long f252578o;

    /* renamed from: p */
    public boolean f252579p;

    public C90420a(C21370a aVar) {
        this.f252564a = aVar;
    }

    /* renamed from: a */
    public final void mo84143a(String str, String str2) {
        String str3;
        if (str2 == null) {
            str3 = String.valueOf(str).concat("*");
        } else {
            str3 = str + "*" + str2;
        }
        this.f252573j = str3;
    }
}
