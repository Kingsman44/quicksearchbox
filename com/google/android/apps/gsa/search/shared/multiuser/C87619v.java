package com.google.android.apps.gsa.search.shared.multiuser;

import android.accounts.AccountManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.apps.gsa.shared.p7129r.C90462d;
import com.google.android.apps.gsa.shared.p7129r.C90464f;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.v */
/* compiled from: PG */
public final class C87619v extends C87603f {

    /* renamed from: a */
    private final Context f236695a;

    /* renamed from: b */
    private final C90465g f236696b;

    public C87619v(Context context, C90465g gVar) {
        this.f236695a = context;
        this.f236696b = gVar;
    }

    /* renamed from: a */
    private static final void m142439a(Drawable drawable, C87601d dVar) {
        dVar.mo81737f(drawable != null ? C90772bp.m148294b(drawable) : null);
    }

    /* renamed from: e */
    public final void mo81739e(C87601d dVar) {
        dVar.mo81736e(Arrays.asList(AccountManager.get(this.f236695a).getAccounts()));
    }

    /* renamed from: f */
    public final void mo81740f(Uri uri, C87601d dVar) {
        Drawable drawable;
        try {
            drawable = C90772bp.m148295c(this.f236695a, uri);
        } catch (Exception unused) {
            drawable = null;
        }
        m142439a(drawable, dVar);
    }

    /* renamed from: g */
    public final void mo81741g(Uri uri, C87601d dVar) {
        Drawable drawable;
        try {
            drawable = C90772bp.m148297e(this.f236695a, uri);
        } catch (Exception unused) {
            drawable = null;
        }
        m142439a(drawable, dVar);
    }

    /* renamed from: h */
    public final void mo81742h(Intent intent, C87601d dVar) {
        intent.addFlags(268435456);
        try {
            this.f236695a.sendBroadcast(intent);
        } catch (ActivityNotFoundException unused) {
        }
        dVar.mo81738g();
    }

    /* renamed from: i */
    public final void mo81743i(FeedbackData feedbackData, C87601d dVar) {
        C90464f a = this.f236696b.mo84210a(this.f236695a);
        ((C90462d) a.f252718b.mo27525b()).mo84205b(a.f252717a, feedbackData);
        dVar.mo81738g();
    }

    /* renamed from: j */
    public final void mo81744j(Intent intent, C87601d dVar) {
        intent.addFlags(268435456);
        try {
            this.f236695a.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
        dVar.mo81738g();
    }
}
