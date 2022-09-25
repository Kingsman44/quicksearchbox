package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.onegoogle.account.disc.C30194av;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.w */
/* compiled from: PG */
final class C30455w implements C30194av {

    /* renamed from: a */
    public final C30349ad f82267a;

    /* renamed from: b */
    public final C30450r f82268b;

    /* renamed from: c */
    public String f82269c;

    /* renamed from: d */
    private int f82270d;

    public C30455w(C30349ad adVar) {
        this.f82267a = adVar;
        this.f82268b = adVar.mo35918g();
    }

    /* renamed from: a */
    public final Drawable mo35649a(int i) {
        if (this.f82270d == i) {
            return this.f82268b;
        }
        this.f82268b.mo36038b();
        this.f82268b.mo36037a();
        this.f82270d = i;
        return this.f82268b;
    }

    /* renamed from: b */
    public final void mo35650b() {
        this.f82268b.start();
    }

    /* renamed from: c */
    public final void mo35651c() {
        this.f82268b.stop();
    }
}
