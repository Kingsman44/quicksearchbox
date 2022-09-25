package com.google.android.gms.presencemanager.p10860a;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.presencemanager.C145758b;
import com.google.android.gms.presencemanager.C145759c;
import com.google.android.gms.presencemanager.PresentUser;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.presencemanager.a.g */
/* compiled from: PG */
public final class C145756g extends C143847s implements C145759c {

    /* renamed from: a */
    private static final C143840l f394093a;

    /* renamed from: b */
    private static final C143707a f394094b;

    /* renamed from: c */
    private static final C143841m f394095c;

    static {
        C143840l lVar = new C143840l();
        f394093a = lVar;
        C145754e eVar = new C145754e();
        f394094b = eVar;
        f394095c = new C143841m("PresenceManager.PRESENCE_REPORT_API", eVar, lVar);
    }

    public C145756g(Context context) {
        super(context, (Activity) null, f394095c, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo121919a(PresentUser presentUser) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C145758b.f394097b};
        dcVar.f389860a = new C145753d(presentUser);
        dcVar.f389863d = 25807;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
