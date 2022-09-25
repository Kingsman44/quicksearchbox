package com.google.android.apps.gsa.staticplugins.p7920en;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.Serializable;

/* renamed from: com.google.android.apps.gsa.staticplugins.en.b */
/* compiled from: PG */
public final class C100560b implements Serializable {

    /* renamed from: h */
    private static final C59071e f281144h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.en.b");

    /* renamed from: i */
    private static C100560b f281145i;

    /* renamed from: a */
    public final String f281146a;

    /* renamed from: b */
    public final String f281147b;

    /* renamed from: c */
    public final String f281148c;

    /* renamed from: d */
    public final String f281149d;

    /* renamed from: e */
    public final int f281150e;

    /* renamed from: f */
    public final int f281151f;

    /* renamed from: g */
    public final int f281152g;

    public C100560b(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.f281146a = str;
        this.f281147b = str2;
        this.f281148c = str3;
        this.f281149d = str4;
        this.f281150e = i;
        this.f281151f = i2;
        this.f281152g = i3;
    }

    /* renamed from: a */
    static C100560b m166663a() {
        if (f281145i == null) {
            f281145i = new C100560b("Default Make", "Default Model", "Default Year", "Default Platform", SimpleSnackbar.LENGTH_SHORT, SimpleSnackbar.LENGTH_SHORT, 9);
        }
        return f281145i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo91965b() {
        String str = this.f281146a;
        String str2 = this.f281147b;
        String str3 = this.f281148c;
        String str4 = this.f281149d;
        Integer valueOf = Integer.valueOf(this.f281150e);
        Integer valueOf2 = Integer.valueOf(this.f281151f);
        int i = this.f281152g;
        ((C59052c) ((C59052c) f281144h.mo56224b()).mo56372aa(33514)).mo56364Q("Vehicle: %s - %s (%s), platform: %s. ScoDelay: %dms, A2DP delay: %dms, capability: %d (%5s).", str, str2, str3, str4, valueOf, valueOf2, Integer.valueOf(i), Integer.toBinaryString(i).replace(' ', '0'));
    }
}
