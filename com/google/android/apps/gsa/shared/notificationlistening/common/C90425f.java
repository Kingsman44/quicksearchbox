package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.f */
/* compiled from: PG */
public final class C90425f extends C90421b {

    /* renamed from: v */
    private static final C59071e f252602v = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.common.f");

    /* renamed from: r */
    public final long f252603r;

    /* renamed from: s */
    public final CharSequence f252604s;

    /* renamed from: t */
    public final C90427h f252605t;

    /* renamed from: u */
    public final Long f252606u;

    public C90425f(C90424e eVar) {
        super(eVar);
        CharSequence charSequence = eVar.f252600r;
        if (charSequence == null) {
            ((C59052c) ((C59052c) f252602v.mo56226d()).mo56372aa(10939)).mo56386p("Event title is required.");
            int i = C90755l.f253831a;
            this.f252604s = BuildConfig.FLAVOR;
        } else {
            this.f252604s = charSequence;
        }
        this.f252606u = eVar.f252601s;
        Long l = eVar.f252599q;
        if (l == null) {
            ((C59052c) ((C59052c) f252602v.mo56226d()).mo56372aa(10938)).mo56386p("Timestamp is required.");
            int i2 = C90755l.f253831a;
            this.f252603r = 0;
        } else {
            this.f252603r = l.longValue();
        }
        this.f252605t = new C90427h(this.f252591l, this.f252581b, false, (String) null);
    }

    /* renamed from: b */
    public final C90427h mo84131b() {
        return this.f252605t;
    }

    /* renamed from: e */
    public final boolean mo84133e(C90421b bVar) {
        if (super.mo84133e(bVar) && (bVar instanceof C90425f)) {
            C90425f fVar = (C90425f) bVar;
            if (this.f252603r != fVar.f252603r || !TextUtils.equals(this.f252604s, fVar.f252604s) || !C58832aw.m90831a(this.f252606u, fVar.f252606u)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        long j = this.f252603r;
        Long l = this.f252606u;
        String obj = this.f252605t.toString();
        String bVar = super.toString();
        return "EventNotification: eventStartTimestamp=" + j + ", reminderTimestamp=" + l + ", identifier=" + obj + ", " + bVar;
    }
}
