package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import android.net.Uri;
import android.support.p031v4.app.Fragment;
import android.view.View;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.al */
/* compiled from: PG */
final class C78039al extends C78071j {

    /* renamed from: a */
    private final View f214965a;

    /* renamed from: b */
    private final boolean f214966b;

    /* renamed from: c */
    private final boolean f214967c;

    /* renamed from: d */
    private final Duration f214968d;

    /* renamed from: e */
    private final CharSequence f214969e;

    /* renamed from: f */
    private final Fragment f214970f;

    /* renamed from: g */
    private final C58485gu f214971g;

    /* renamed from: h */
    private final int f214972h;

    public C78039al(View view, boolean z, boolean z2, Duration duration, CharSequence charSequence, Fragment fragment, C58485gu guVar, int i) {
        this.f214965a = view;
        this.f214966b = z;
        this.f214967c = z2;
        this.f214968d = duration;
        this.f214969e = charSequence;
        this.f214970f = fragment;
        this.f214971g = guVar;
        this.f214972h = i;
    }

    /* renamed from: a */
    public final Uri mo73009a() {
        return null;
    }

    /* renamed from: b */
    public final Fragment mo73010b() {
        return this.f214970f;
    }

    /* renamed from: c */
    public final View mo73011c() {
        return this.f214965a;
    }

    /* renamed from: e */
    public final C58485gu mo73012e() {
        return this.f214971g;
    }

    public final boolean equals(Object obj) {
        Duration duration;
        CharSequence charSequence;
        Fragment fragment;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78071j) {
            C78071j jVar = (C78071j) obj;
            View view = this.f214965a;
            if (view != null ? view.equals(jVar.mo73011c()) : jVar.mo73011c() == null) {
                if (jVar.mo73018i() == null && this.f214966b == jVar.mo73021l() && !jVar.mo73020k() && this.f214967c == jVar.mo73019j() && ((duration = this.f214968d) != null ? duration.equals(jVar.mo73014f()) : jVar.mo73014f() == null) && ((charSequence = this.f214969e) != null ? charSequence.equals(jVar.mo73015g()) : jVar.mo73015g() == null) && ((fragment = this.f214970f) != null ? fragment.equals(jVar.mo73010b()) : jVar.mo73010b() == null) && jVar.mo73009a() == null && C58597ky.m90218i(this.f214971g, jVar.mo73012e()) && jVar.mo73016h() == null) {
                    int i = this.f214972h;
                    int m = jVar.mo73022m();
                    if (i == 0) {
                        throw null;
                    } else if (m == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Duration mo73014f() {
        return this.f214968d;
    }

    /* renamed from: g */
    public final CharSequence mo73015g() {
        return this.f214969e;
    }

    /* renamed from: h */
    public final Runnable mo73016h() {
        return null;
    }

    /* renamed from: i */
    public final String mo73018i() {
        return null;
    }

    /* renamed from: j */
    public final boolean mo73019j() {
        return this.f214967c;
    }

    /* renamed from: k */
    public final boolean mo73020k() {
        return false;
    }

    /* renamed from: l */
    public final boolean mo73021l() {
        return this.f214966b;
    }

    /* renamed from: m */
    public final int mo73022m() {
        return this.f214972h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f214965a);
        boolean z = this.f214966b;
        boolean z2 = this.f214967c;
        String valueOf2 = String.valueOf(this.f214968d);
        String valueOf3 = String.valueOf(this.f214969e);
        String valueOf4 = String.valueOf(this.f214970f);
        String valueOf5 = String.valueOf(this.f214971g);
        String str = this.f214972h != 1 ? "null" : "START_ASSISTANT_ACTIVITY";
        return "AnswerUiData{view=" + valueOf + ", assistantQuery=null, safeForLockScreen=" + z + ", isInputVisibleByDefault=false, isCardHeadingVisible=" + z2 + ", dismissTimeout=" + valueOf2 + ", cardHeading=" + valueOf3 + ", fragment=" + valueOf4 + ", dataUri=null, suggestions=" + valueOf5 + ", onActivityFinish=null, presentationMode=" + str + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        View view = this.f214965a;
        int i4 = 0;
        if (view == null) {
            i = 0;
        } else {
            i = view.hashCode();
        }
        int i5 = 1231;
        int i6 = (((((i ^ 1000003) * -721379959) ^ (true != this.f214966b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
        if (true != this.f214967c) {
            i5 = 1237;
        }
        int i7 = (i6 ^ i5) * 1000003;
        Duration duration = this.f214968d;
        if (duration == null) {
            i2 = 0;
        } else {
            i2 = duration.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        CharSequence charSequence = this.f214969e;
        if (charSequence == null) {
            i3 = 0;
        } else {
            i3 = charSequence.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        Fragment fragment = this.f214970f;
        if (fragment != null) {
            i4 = fragment.hashCode();
        }
        int hashCode = (((i9 ^ i4) * -721379959) ^ this.f214971g.hashCode()) * -721379959;
        if (this.f214972h != 0) {
            return hashCode ^ 1;
        }
        throw null;
    }
}
