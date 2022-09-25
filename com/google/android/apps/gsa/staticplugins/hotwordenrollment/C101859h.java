package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.h */
/* compiled from: PG */
public final class C101859h {

    /* renamed from: a */
    public static final C59071e f284125a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.h");

    /* renamed from: b */
    public final EnrollmentActivity f284126b;

    /* renamed from: c */
    public final SharedPreferences f284127c;

    /* renamed from: d */
    public final C74555u f284128d;

    /* renamed from: e */
    public final C28310af f284129e;

    /* renamed from: f */
    public final C90021c f284130f;

    /* renamed from: g */
    public final String f284131g;

    /* renamed from: h */
    public final Integer f284132h;

    /* renamed from: i */
    public final C58833ax f284133i;

    public C101859h(EnrollmentActivity enrollmentActivity, SharedPreferences sharedPreferences, C74555u uVar, C28310af afVar, C90021c cVar, String str, Integer num, C58833ax axVar) {
        this.f284126b = enrollmentActivity;
        this.f284127c = sharedPreferences;
        this.f284128d = uVar;
        this.f284129e = afVar;
        this.f284130f = cVar;
        this.f284131g = str;
        this.f284132h = num;
        this.f284133i = axVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C101892n mo92635a() {
        return (C101892n) this.f284126b.f727a.f739a.f744e.f634a.mo670b(R.id.root_fragment_content);
    }
}
