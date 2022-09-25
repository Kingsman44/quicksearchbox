package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.p10795a.p10796a.C144191a;
import com.google.android.gms.feedback.p10795a.p10797b.C144194a;
import com.google.android.p10905k.C146607f;
import com.google.android.p10905k.C146609h;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p5304e.p5305a.p5306a.p5390n.p5401f.p5402a.C68856a;

/* renamed from: com.google.android.gms.feedback.l */
/* compiled from: PG */
public final class C144207l {

    /* renamed from: a */
    public String f390622a;

    /* renamed from: b */
    public String f390623b;

    /* renamed from: c */
    public String f390624c;

    /* renamed from: d */
    public boolean f390625d;

    /* renamed from: e */
    public ThemeSettings f390626e;

    /* renamed from: f */
    public LogOptions f390627f;

    /* renamed from: g */
    public C144189a f390628g;

    /* renamed from: h */
    public ApplicationErrorReport f390629h;

    /* renamed from: i */
    private Bitmap f390630i;

    /* renamed from: j */
    private final Bundle f390631j;

    /* renamed from: k */
    private final List f390632k;

    /* renamed from: l */
    private boolean f390633l;

    /* renamed from: m */
    private String f390634m;

    @Deprecated
    public C144207l() {
        this.f390631j = new Bundle();
        this.f390632k = new ArrayList();
        this.f390629h = new ApplicationErrorReport();
        this.f390634m = C144191a.m234430b();
    }

    /* renamed from: a */
    public final FeedbackOptions mo119741a() {
        FeedbackOptions feedbackOptions = new FeedbackOptions(new ApplicationErrorReport());
        feedbackOptions.f390576m = this.f390630i;
        feedbackOptions.f390569f = null;
        feedbackOptions.f390564a = this.f390622a;
        feedbackOptions.f390566c = this.f390623b;
        feedbackOptions.f390565b = this.f390631j;
        feedbackOptions.f390568e = this.f390624c;
        feedbackOptions.f390571h = this.f390632k;
        feedbackOptions.f390572i = this.f390625d;
        feedbackOptions.f390573j = this.f390626e;
        feedbackOptions.f390574k = this.f390627f;
        feedbackOptions.f390575l = this.f390633l;
        feedbackOptions.f390581r = this.f390628g;
        feedbackOptions.f390577n = this.f390634m;
        feedbackOptions.f390578o = false;
        feedbackOptions.f390579p = 0;
        feedbackOptions.f390580q = false;
        return feedbackOptions;
    }

    /* renamed from: b */
    public final void mo119742b(boolean z) {
        if ((!this.f390631j.isEmpty() || !this.f390632k.isEmpty()) && this.f390633l != z) {
            throw new IllegalStateException("Can't mix pii-full psd and pii-free psd");
        }
        this.f390633l = z;
    }

    /* renamed from: c */
    public final void mo119743c(Map map) {
        mo119742b(true);
        for (Map.Entry entry : map.entrySet()) {
            this.f390631j.putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: d */
    public final void mo119744d(Bitmap bitmap) {
        if (!this.f390625d || !C68856a.f185063a.mo6453a().mo60655a()) {
            this.f390630i = bitmap;
            return;
        }
        throw new IllegalStateException("Can't call setScreenshotBitmap after report is already certified pii free.");
    }

    public C144207l(Context context) {
        String str;
        C146609h.f395979a = context.getContentResolver();
        this.f390631j = new Bundle();
        this.f390632k = new ArrayList();
        this.f390629h = new ApplicationErrorReport();
        try {
            C146609h hVar = C144194a.f390601b;
            String str2 = hVar.f395980b;
            if (((C146607f) hVar).mo123402a().booleanValue()) {
                str = System.currentTimeMillis() + "_" + Math.abs(new SecureRandom().nextLong());
            } else {
                str = C144191a.m234430b();
            }
            this.f390634m = str;
        } catch (SecurityException unused) {
            this.f390634m = C144191a.m234430b();
        }
    }
}
