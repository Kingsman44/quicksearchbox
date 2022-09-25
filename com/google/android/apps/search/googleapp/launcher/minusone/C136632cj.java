package com.google.android.apps.search.googleapp.launcher.minusone;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageButton;
import com.google.android.apps.search.googleapp.launcher.minusone.p10353a.C136563c;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10347e.C136463a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.cj */
/* compiled from: PG */
public final class C136632cj implements C136560a {

    /* renamed from: a */
    public final AccountId f371927a;

    /* renamed from: b */
    public final C136463a f371928b;

    /* renamed from: c */
    public final C136563c f371929c;

    /* renamed from: d */
    public final C136630ch f371930d;

    /* renamed from: e */
    public final C47770dh f371931e;

    /* renamed from: f */
    public final C136586au f371932f;

    /* renamed from: g */
    public C136455h f371933g;

    public C136632cj(AccountId accountId, C136463a aVar, C136563c cVar, C136630ch chVar, C47770dh dhVar, C136586au auVar, C136455h hVar) {
        this.f371927a = accountId;
        this.f371928b = aVar;
        this.f371929c = cVar;
        this.f371930d = chVar;
        this.f371931e = dhVar;
        this.f371932f = auVar;
        this.f371933g = hVar;
    }

    /* renamed from: c */
    public static void m222102c(ImageButton imageButton, C136630ch chVar, C136455h hVar) {
        if (imageButton != null) {
            if ((hVar.f371508a & 1) != 0) {
                C63088z zVar = hVar.f371509b;
                imageButton.setBackground(new BitmapDrawable(chVar.getContext().getResources(), BitmapFactory.decodeByteArray(zVar.mo59174N(), 0, zVar.mo59031d())));
            }
            if ((hVar.f371508a & 2) != 0) {
                imageButton.setContentDescription(hVar.f371510c);
            }
        }
    }

    /* renamed from: a */
    public final void mo113224a(int i) {
    }

    /* renamed from: b */
    public final void mo113225b(float f) {
    }
}
