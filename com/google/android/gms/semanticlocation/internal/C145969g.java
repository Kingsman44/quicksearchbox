package com.google.android.gms.semanticlocation.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.semanticlocation.C145974l;
import com.google.android.gms.semanticlocation.C145987y;
import com.google.android.gms.semanticlocation.C145988z;
import com.google.android.gms.semanticlocation.SemanticLocationEventRequest;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.semanticlocation.internal.g */
/* compiled from: PG */
public final class C145969g extends C143847s implements C145988z {

    /* renamed from: b */
    private static final C143840l f394655b;

    /* renamed from: c */
    private static final C143707a f394656c;

    /* renamed from: d */
    private static final C143841m f394657d;

    /* renamed from: a */
    public final SemanticLocationParameters f394658a;

    static {
        C143840l lVar = new C143840l();
        f394655b = lVar;
        C145966d dVar = new C145966d();
        f394656c = dVar;
        f394657d = new C143841m("SemanticLocation.SEMANTIC_LOCATION_API", dVar, lVar);
    }

    public C145969g(Context context, C145987y yVar) {
        super(context, (Activity) null, f394657d, yVar, C143846r.f389923a);
        this.f394658a = new SemanticLocationParameters(yVar.f394663a, yVar.f394664b, context.getPackageName());
    }

    /* renamed from: a */
    public final C146006ab mo122427a(SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145965c(this, semanticLocationEventRequest, pendingIntent);
        dcVar.f389862c = new Feature[]{C145974l.f394659a};
        dcVar.f389863d = 31101;
        return super.mo119290u(1, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo122428b(PendingIntent pendingIntent) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145964b(this, pendingIntent);
        dcVar.f389862c = new Feature[]{C145974l.f394659a};
        dcVar.f389863d = 31102;
        return super.mo119290u(1, dcVar.mo119260a());
    }
}
