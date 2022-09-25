package com.google.android.apps.gsa.speech.hotword.unicornenrollment;

import android.view.View;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.EnrollmentHelper;

/* renamed from: com.google.android.apps.gsa.speech.hotword.unicornenrollment.a */
/* compiled from: PG */
public final class C92420a extends C92426e {

    /* renamed from: a */
    public View.OnClickListener f257752a;

    /* renamed from: b */
    public C92427f f257753b;

    /* renamed from: c */
    private boolean f257754c;

    /* renamed from: d */
    private String f257755d;

    /* renamed from: e */
    private String f257756e;

    /* renamed from: f */
    private String f257757f;

    /* renamed from: g */
    private String f257758g;

    /* renamed from: h */
    private EnrollmentHelper f257759h;

    /* renamed from: i */
    private boolean f257760i;

    /* renamed from: j */
    private boolean f257761j;

    /* renamed from: k */
    private boolean f257762k;

    /* renamed from: l */
    private byte f257763l;

    /* renamed from: a */
    public final C92428g mo87064a() {
        String str;
        String str2;
        String str3;
        String str4;
        EnrollmentHelper enrollmentHelper;
        View.OnClickListener onClickListener;
        C92427f fVar;
        if (this.f257763l == 15 && (str = this.f257755d) != null && (str2 = this.f257756e) != null && (str3 = this.f257757f) != null && (str4 = this.f257758g) != null && (enrollmentHelper = this.f257759h) != null && (onClickListener = this.f257752a) != null && (fVar = this.f257753b) != null) {
            return new C92423b(this.f257754c, str, str2, str3, str4, enrollmentHelper, this.f257760i, this.f257761j, this.f257762k, onClickListener, fVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f257763l & 1) == 0) {
            sb.append(" isVoiceMatchEnrollment");
        }
        if (this.f257755d == null) {
            sb.append(" parentEmail");
        }
        if (this.f257756e == null) {
            sb.append(" parentDisplayName");
        }
        if (this.f257757f == null) {
            sb.append(" unicornChildDisplayName");
        }
        if (this.f257758g == null) {
            sb.append(" unicornChildGender");
        }
        if (this.f257759h == null) {
            sb.append(" enrollmentHelper");
        }
        if ((this.f257763l & 2) == 0) {
            sb.append(" isUnicornPhoneEnrollment");
        }
        if ((this.f257763l & 4) == 0) {
            sb.append(" isUnicornHomeEnrollment");
        }
        if ((this.f257763l & 8) == 0) {
            sb.append(" isInUnicornSetUpWizard");
        }
        if (this.f257752a == null) {
            sb.append(" declineButtonListener");
        }
        if (this.f257753b == null) {
            sb.append(" passwordSubmitListener");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo87065b(EnrollmentHelper enrollmentHelper) {
        if (enrollmentHelper != null) {
            this.f257759h = enrollmentHelper;
            return;
        }
        throw new NullPointerException("Null enrollmentHelper");
    }

    /* renamed from: c */
    public final void mo87066c(boolean z) {
        this.f257762k = z;
        this.f257763l = (byte) (this.f257763l | 8);
    }

    /* renamed from: d */
    public final void mo87067d(boolean z) {
        this.f257761j = z;
        this.f257763l = (byte) (this.f257763l | 4);
    }

    /* renamed from: e */
    public final void mo87068e(boolean z) {
        this.f257760i = z;
        this.f257763l = (byte) (this.f257763l | 2);
    }

    /* renamed from: f */
    public final void mo87069f(boolean z) {
        this.f257754c = z;
        this.f257763l = (byte) (this.f257763l | 1);
    }

    /* renamed from: g */
    public final void mo87070g(String str) {
        if (str != null) {
            this.f257756e = str;
            return;
        }
        throw new NullPointerException("Null parentDisplayName");
    }

    /* renamed from: h */
    public final void mo87071h(String str) {
        if (str != null) {
            this.f257755d = str;
            return;
        }
        throw new NullPointerException("Null parentEmail");
    }

    /* renamed from: i */
    public final void mo87072i(String str) {
        if (str != null) {
            this.f257757f = str;
            return;
        }
        throw new NullPointerException("Null unicornChildDisplayName");
    }

    /* renamed from: j */
    public final void mo87073j(String str) {
        if (str != null) {
            this.f257758g = str;
            return;
        }
        throw new NullPointerException("Null unicornChildGender");
    }
}
