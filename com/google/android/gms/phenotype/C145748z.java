package com.google.android.gms.phenotype;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.util.Pair;
import com.google.android.gms.common.C143876h;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;

/* renamed from: com.google.android.gms.phenotype.z */
/* compiled from: PG */
public final class C145748z extends C143847s {
    static {
        Pair.create(new C145723ag(), C146021aq.m237850d((Object) null));
    }

    protected C145748z(Context context) {
        super(context, (Activity) null, C145738p.f394058a, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo121901a(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145745w(str);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo121902b(String str, String str2) {
        if (!mo121907g(12451000)) {
            return C146021aq.m237849c(new C143842n(new Status(1, 16, (String) null, (PendingIntent) null, (ConnectionResult) null)));
        }
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145746x(str, str2);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: c */
    public final C146006ab mo121903c(String str, String str2, String str3) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145743u(str, str2, str3);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    @Deprecated
    /* renamed from: d */
    public final C146006ab mo121904d(String str) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145741s(str);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: e */
    public final C146006ab mo121905e(String str, int i, String[] strArr, byte[] bArr) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145742t(str, i, strArr, bArr);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: f */
    public final C146006ab mo121906f(int[] iArr, String str, String str2) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145739q(str, str2, iArr);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: g */
    public final boolean mo121907g(int i) {
        return C143876h.f389991d.mo119362j(this.f389931w, i) == 0;
    }

    /* renamed from: h */
    public final C146006ab mo121908h(String str, int i, String[] strArr, byte[] bArr, String str2) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145740r(str, i, strArr, bArr, str2);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: i */
    public final C146006ab mo121909i(String[] strArr, int[] iArr) {
        C143809dc dcVar = new C143809dc();
        dcVar.f389860a = new C145744v(strArr, iArr);
        return super.mo119290u(0, dcVar.mo119260a());
    }
}
