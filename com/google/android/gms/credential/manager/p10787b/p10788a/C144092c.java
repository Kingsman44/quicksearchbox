package com.google.android.gms.credential.manager.p10787b.p10788a;

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
import com.google.android.gms.credential.manager.invocationparams.CallerInfo;
import com.google.android.gms.credential.manager.invocationparams.CredentialManagerAccount;
import com.google.android.gms.credential.manager.p10787b.C144089a;
import com.google.android.gms.p10792e.C144155a;
import com.google.android.gms.tasks.C146006ab;

/* renamed from: com.google.android.gms.credential.manager.b.a.c */
/* compiled from: PG */
public final class C144092c extends C143847s implements C144089a {

    /* renamed from: a */
    public static final /* synthetic */ int f390364a = 0;

    /* renamed from: b */
    private static final C143840l f390365b;

    /* renamed from: c */
    private static final C143707a f390366c;

    /* renamed from: d */
    private static final C143841m f390367d;

    static {
        C143840l lVar = new C143840l();
        f390365b = lVar;
        C144091b bVar = new C144091b();
        f390366c = bVar;
        f390367d = new C143841m("CredentialManager.API", bVar, lVar);
    }

    public C144092c(Context context) {
        super(context, (Activity) null, f390367d, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo119635a(CredentialManagerAccount credentialManagerAccount, CallerInfo callerInfo) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389863d = 26701;
        dcVar.f389862c = new Feature[]{C144155a.f390467a};
        dcVar.f389860a = new C144090a(credentialManagerAccount, callerInfo);
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
