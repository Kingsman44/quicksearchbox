package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52235kf;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.e */
/* compiled from: PG */
public final class C129228e {

    /* renamed from: a */
    public static final C129228e f354973a;

    /* renamed from: b */
    public static final C129228e f354974b;

    /* renamed from: c */
    public final C52070ec f354975c;

    /* renamed from: d */
    public final Fragment f354976d;

    /* renamed from: e */
    public final String f354977e;

    static {
        C52070ec a = C127406c.m208359a(C52235kf.INVALID_ARGUMENT);
        C69664n.m101060f(a, "error(Status.INVALID_ARGUMENT)");
        f354973a = new C129228e(a, (Fragment) null, (String) null);
        C52070ec ecVar = C127406c.f350821b;
        C69664n.m101060f(ecVar, "ignore()");
        f354974b = new C129228e(ecVar, (Fragment) null, (String) null);
    }

    public C129228e(C52070ec ecVar, Fragment fragment, String str) {
        this.f354975c = ecVar;
        this.f354976d = fragment;
        this.f354977e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C129228e)) {
            return false;
        }
        C129228e eVar = (C129228e) obj;
        return C69664n.m101066l(this.f354975c, eVar.f354975c) && C69664n.m101066l(this.f354976d, eVar.f354976d) && C69664n.m101066l(this.f354977e, eVar.f354977e);
    }

    public final int hashCode() {
        int hashCode = this.f354975c.hashCode() * 31;
        Fragment fragment = this.f354976d;
        int i = 0;
        int hashCode2 = (hashCode + (fragment == null ? 0 : fragment.hashCode())) * 31;
        String str = this.f354977e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        C52070ec ecVar = this.f354975c;
        Fragment fragment = this.f354976d;
        String str = this.f354977e;
        return "ClientOpRendererResult(clientOpResult=" + ecVar + ", fragment=" + fragment + ", fragmentTag=" + str + ")";
    }
}
