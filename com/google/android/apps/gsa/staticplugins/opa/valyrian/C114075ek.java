package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90024cc;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107379c;
import com.google.android.apps.gsa.staticplugins.opa.p8295aq.C107382f;
import com.google.android.apps.gsa.staticplugins.opa.p8307au.C107606q;
import com.google.android.apps.gsa.staticplugins.opa.p8311aw.C107623a;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ek */
/* compiled from: PG */
public final class C114075ek implements C107623a {

    /* renamed from: a */
    private final Context f316061a;

    /* renamed from: b */
    private final C86124t f316062b;

    /* renamed from: c */
    private final boolean f316063c;

    /* renamed from: d */
    private final int f316064d;

    /* renamed from: e */
    private final boolean f316065e;

    /* renamed from: f */
    private final SharedPreferences f316066f;

    /* renamed from: g */
    private final C107379c f316067g;

    public C114075ek(Context context, C86124t tVar, boolean z, int i, C107379c cVar, boolean z2, SharedPreferences sharedPreferences) {
        this.f316061a = context;
        this.f316062b = tVar;
        this.f316063c = z;
        this.f316064d = i;
        this.f316067g = cVar;
        this.f316065e = z2;
        this.f316066f = sharedPreferences;
    }

    /* renamed from: a */
    public final int mo95355a() {
        return (int) C91115n.m148870b((float) this.f316062b.mo79743a(C90014bt.f247077aO), this.f316061a);
    }

    /* renamed from: b */
    public final int mo95356b() {
        return this.f316061a.getResources().getDimensionPixelSize(R.dimen.valyrian_lock_screen_icon_offset);
    }

    /* renamed from: c */
    public final int mo95357c() {
        SharedPreferences sharedPreferences = this.f316066f;
        C86124t tVar = this.f316062b;
        if (tVar.mo79746e(C90014bt.f247626kh) && (!C107606q.m178486e(tVar) || !C107606q.m178485d(sharedPreferences, tVar))) {
            if (this.f316062b.mo79746e(C90024cc.f248132c)) {
                return this.f316061a.getResources().getDimensionPixelSize(R.dimen.chatui_startup_with_richinput_height_above_conversation_starters);
            }
            if (this.f316062b.mo79746e(C90024cc.f248134e)) {
                return this.f316061a.getResources().getDimensionPixelSize(R.dimen.chatui_startup_with_richinput_and_conversation_starters_height);
            }
            return this.f316061a.getResources().getDimensionPixelSize(R.dimen.chatui_startup_with_richinput_height);
        } else if (this.f316062b.mo79746e(C90014bt.f247775nX)) {
            return this.f316061a.getResources().getDimensionPixelSize(R.dimen.chatui_startup_height);
        } else {
            return this.f316061a.getResources().getDimensionPixelSize(R.dimen.chatui_startup_shorter_height);
        }
    }

    /* renamed from: d */
    public final int mo95358d() {
        if (this.f316064d == 1) {
            return 2;
        }
        if (this.f316065e) {
            return 3;
        }
        if (this.f316063c) {
            return 2;
        }
        if (this.f316067g.mo95995a().mo56113h()) {
            return this.f316067g.mo95995a().mo56107c() == C107382f.DISMISSED ? 2 : 3;
        }
        return 1;
    }
}
