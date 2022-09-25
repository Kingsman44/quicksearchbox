package com.google.android.apps.search.googleapp.launcher.minusone;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageButton;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cd */
/* compiled from: PG */
public final class C136626cd {

    /* renamed from: a */
    public final AccountId f371915a;

    /* renamed from: b */
    public final C136463a f371916b;

    /* renamed from: c */
    public final C136624cb f371917c;

    /* renamed from: d */
    public final C47770dh f371918d;

    /* renamed from: e */
    public final C136586au f371919e;

    /* renamed from: f */
    public final boolean f371920f;

    /* renamed from: g */
    public C136455h f371921g;

    public C136626cd(AccountId accountId, C136463a aVar, C136624cb cbVar, C47770dh dhVar, boolean z, C136586au auVar, C136455h hVar) {
        this.f371915a = accountId;
        this.f371916b = aVar;
        this.f371917c = cbVar;
        this.f371918d = dhVar;
        this.f371919e = auVar;
        this.f371920f = z;
        this.f371921g = hVar;
    }

    /* renamed from: a */
    public static void m222091a(ImageButton imageButton, C136624cb cbVar, C136455h hVar) {
        if (imageButton != null) {
            if ((hVar.f371508a & 1) != 0) {
                C63088z zVar = hVar.f371509b;
                imageButton.setBackground(new BitmapDrawable(cbVar.getContext().getResources(), BitmapFactory.decodeByteArray(zVar.mo59174N(), 0, zVar.mo59031d())));
            }
            if ((hVar.f371508a & 2) != 0) {
                imageButton.setContentDescription(hVar.f371510c);
            }
        }
    }
}
