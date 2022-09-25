package com.google.android.libraries.surveys;

import android.accounts.Account;
import android.app.Activity;
import java.util.List;

/* renamed from: com.google.android.libraries.surveys.b */
/* compiled from: PG */
public final class C43025b {

    /* renamed from: a */
    public C43028e f112519a;

    /* renamed from: b */
    public Account f112520b;

    /* renamed from: c */
    public List f112521c;

    /* renamed from: d */
    private final Activity f112522d;

    /* renamed from: e */
    private int f112523e;

    /* renamed from: f */
    private Integer f112524f;

    /* renamed from: g */
    private final SurveyData f112525g;

    /* renamed from: h */
    private C43029f f112526h;

    /* renamed from: i */
    private C43027d f112527i;

    public C43025b(Activity activity, SurveyData surveyData) {
        if (activity == null) {
            throw new IllegalArgumentException("Client activity is not set.");
        } else if (surveyData != null) {
            this.f112522d = activity;
            this.f112525g = surveyData;
            this.f112526h = C43029f.FIRST_CARD_NON_MODAL;
            this.f112527i = C43027d.CARD;
        } else {
            throw new IllegalArgumentException("Survey data is null.");
        }
    }

    /* renamed from: a */
    public final C43030g mo46051a() {
        return new C43030g(this.f112522d, this.f112523e, this.f112524f, this.f112519a, this.f112520b, this.f112525g, this.f112521c, this.f112526h, this.f112527i);
    }

    /* renamed from: b */
    public final void mo46052b(int i, Integer num) {
        if (num.intValue() > 0) {
            this.f112523e = i;
            this.f112524f = num;
            return;
        }
        throw new IllegalArgumentException("The max prompt width must be a positive value.");
    }
}
