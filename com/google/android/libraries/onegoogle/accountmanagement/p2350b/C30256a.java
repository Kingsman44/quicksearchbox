package com.google.android.libraries.onegoogle.accountmanagement.p2350b;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.particle.C30229c;
import com.google.android.libraries.onegoogle.accountmanagement.p2349a.C30254a;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.b.a */
/* compiled from: PG */
public final /* synthetic */ class C30256a implements C30229c {

    /* renamed from: a */
    public final /* synthetic */ C30258c f81807a;

    /* renamed from: b */
    public final /* synthetic */ Object f81808b;

    public /* synthetic */ C30256a(C30258c cVar, Object obj) {
        this.f81807a = cVar;
        this.f81808b = obj;
    }

    /* renamed from: a */
    public final String mo35702a(String str) {
        C30258c cVar = this.f81807a;
        Object obj = this.f81808b;
        Context context = cVar.itemView.getContext();
        boolean h = cVar.f81815b.mo56113h();
        int i = R.string.og_use_account_a11y_no_period;
        if (h && ((C30254a) cVar.f81815b.mo56107c()).f81803a.mo35583a(obj)) {
            C30254a aVar = (C30254a) cVar.f81815b.mo56107c();
            i = R.string.og_account_deactivated_a11y;
        }
        return context.getString(i, new Object[]{str});
    }
}
