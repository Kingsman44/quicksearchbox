package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.ak */
/* compiled from: PG */
public final class C78038ak extends C78070i {

    /* renamed from: a */
    public View f214956a;

    /* renamed from: b */
    public boolean f214957b;

    /* renamed from: c */
    public Duration f214958c;

    /* renamed from: d */
    public CharSequence f214959d;

    /* renamed from: e */
    public Fragment f214960e;

    /* renamed from: f */
    public C58485gu f214961f;

    /* renamed from: g */
    public byte f214962g;

    /* renamed from: h */
    public int f214963h;

    /* renamed from: i */
    private boolean f214964i;

    /* renamed from: a */
    public final C78071j mo73005a() {
        if (this.f214962g == 7 && this.f214961f != null && this.f214963h != 0) {
            return new C78039al(this.f214956a, this.f214964i, this.f214957b, this.f214958c, this.f214959d, this.f214960e, this.f214961f, this.f214963h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f214962g & 1) == 0) {
            sb.append(" safeForLockScreen");
        }
        if ((this.f214962g & 2) == 0) {
            sb.append(" isInputVisibleByDefault");
        }
        if ((this.f214962g & 4) == 0) {
            sb.append(" isCardHeadingVisible");
        }
        if (this.f214961f == null) {
            sb.append(" suggestions");
        }
        if (this.f214963h == 0) {
            sb.append(" presentationMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73006b(CharSequence charSequence) {
        this.f214959d = charSequence;
    }

    /* renamed from: c */
    public final void mo73007c() {
        this.f214962g = (byte) (this.f214962g | 2);
    }

    /* renamed from: d */
    public final void mo73008d(boolean z) {
        this.f214964i = z;
        this.f214962g = (byte) (this.f214962g | 1);
    }
}
