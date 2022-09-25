package com.google.android.gms.kids.p10817a;

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
import com.google.android.gms.kids.C144421a;
import com.google.android.gms.kids.C144432d;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.kids.a.g */
/* compiled from: PG */
public final class C144428g extends C143847s implements C144432d {

    /* renamed from: a */
    private static final C143840l f391035a;

    /* renamed from: b */
    private static final C143707a f391036b;

    /* renamed from: c */
    private static final C143841m f391037c;

    static {
        C143840l lVar = new C143840l();
        f391035a = lVar;
        C144426e eVar = new C144426e();
        f391036b = eVar;
        f391037c = new C143841m("Kids.API", eVar, lVar);
    }

    public C144428g(Context context) {
        super(context, (Activity) null, f391037c, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo119887a(GetParentVerificationIntentRequest getParentVerificationIntentRequest) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C144421a.f391030d};
        dcVar.f389861b = false;
        dcVar.f389863d = 14103;
        dcVar.f389860a = new C144425d(getParentVerificationIntentRequest);
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
