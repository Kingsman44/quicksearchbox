package com.google.android.apps.search.weather;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.apps.search.weather.p10685d.C142074c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58817ah;
import com.google.p5269w.p5270a.C67962d;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.weather.e */
/* compiled from: PG */
public final /* synthetic */ class C142077e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C142087f f385467a;

    /* renamed from: b */
    public final /* synthetic */ Intent f385468b;

    public /* synthetic */ C142077e(C142087f fVar, Intent intent) {
        this.f385467a = fVar;
        this.f385468b = intent;
    }

    public final Object apply(Object obj) {
        C142087f fVar = this.f385467a;
        Intent intent = this.f385468b;
        AccountId accountId = (AccountId) obj;
        Fragment b = fVar.f385490b.f727a.f739a.f744e.f634a.mo670b(R.id.weather_fragment_container);
        C142155u f = b instanceof C142118o ? ((C142118o) b).mo17754z() : null;
        if (f != null) {
            C67962d b2 = C142074c.m230650b(intent);
            if (!Objects.equals(f.f385646p, b2)) {
                f.f385646p = b2;
                f.mo117037h(C142074c.m230649a(intent));
            } else {
                ((ViewPager2) f.f385633c.requireView().findViewById(R.id.weather_tabs_pager)).mo9211c(C142074c.m230649a(intent), true);
            }
        } else {
            fVar.mo117003e(accountId);
        }
        return true;
    }
}
