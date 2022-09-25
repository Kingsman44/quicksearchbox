package com.google.android.apps.gsa.staticplugins.nowcards;

import android.content.Context;
import com.google.android.apps.gsa.sidekick.main.p7205h.C91433o;
import com.google.android.apps.gsa.sidekick.shared.cards.C91675ad;
import com.google.android.apps.gsa.sidekick.shared.cards.C91711z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ac */
/* compiled from: PG */
public class C104256ac {

    /* renamed from: a */
    private final C104376bo f290004a;

    public C104256ac(C104376bo boVar) {
        this.f290004a = boVar;
    }

    /* renamed from: a */
    public C91433o mo94028a(Context context, C91675ad adVar) {
        try {
            return (C91433o) Class.forName("com.google.android.apps.gsa.staticplugins.nowcards.NowCardsControllerAdapterWrapperImpl").getDeclaredConstructor(new Class[]{C104376bo.class, C91675ad.class}).newInstance(new Object[]{this.f290004a, adVar});
        } catch (Exception e) {
            throw new ClassNotFoundException("Could not load NowCardsControllerAdapterWrapperImpl", e);
        }
    }

    /* renamed from: b */
    public C91711z mo94029b(Context context, C91675ad adVar) {
        try {
            return (C91711z) Class.forName("com.google.android.apps.gsa.staticplugins.nowcards.NowCardsAdapterWrapperImpl").getDeclaredConstructor(new Class[]{C104376bo.class, C91675ad.class}).newInstance(new Object[]{this.f290004a, adVar});
        } catch (Exception e) {
            throw new ClassNotFoundException("Could not load NowCardsAdapterWrapperImpl", e);
        }
    }
}
