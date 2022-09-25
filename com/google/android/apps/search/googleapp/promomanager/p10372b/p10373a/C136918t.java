package com.google.android.apps.search.googleapp.promomanager.p10372b.p10373a;

import android.content.Context;
import android.content.pm.ShortcutManager;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63954r;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63955s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.a.t */
/* compiled from: PG */
public final class C136918t implements C136903e {

    /* renamed from: a */
    public static final /* synthetic */ int f372647a = 0;

    /* renamed from: b */
    private static final C58974d f372648b = C58974d.m91135i("WeatherShortcutPE");

    /* renamed from: c */
    private final Context f372649c;

    public C136918t(Context context) {
        this.f372649c = context;
    }

    /* renamed from: a */
    public final C60870cx mo113438a(C63955s sVar, C137009dj djVar) {
        C58970a aVar = (C58970a) ((C58970a) f372648b.mo56224b()).mo56372aa(40889);
        C63954r a = C63954r.m96325a(sVar.f172968a);
        if (a == null) {
            a = C63954r.TYPE_UNSPECIFIED;
        }
        aVar.mo56389s("Evaluating %s Condition Predicate", a.name());
        return C60856cj.m92900i(Boolean.valueOf(Collection.EL.stream(((ShortcutManager) this.f372649c.getSystemService(ShortcutManager.class)).getPinnedShortcuts()).anyMatch(C136917s.f372646a)));
    }
}
