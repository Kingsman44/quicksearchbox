package com.google.android.libraries.onegoogle.owners.p2387b;

import android.graphics.Bitmap;
import com.google.android.libraries.onegoogle.common.C30926m;
import com.google.android.libraries.onegoogle.owners.C30977l;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.onegoogle.owners.b.b */
/* compiled from: PG */
final class C30963b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f83432a;

    /* renamed from: b */
    final /* synthetic */ long f83433b;

    /* renamed from: c */
    final /* synthetic */ C30964c f83434c;

    /* renamed from: d */
    final /* synthetic */ int f83435d;

    /* renamed from: e */
    private final String f83436e;

    /* renamed from: f */
    private final String f83437f;

    public C30963b(C30964c cVar, int i, boolean z, long j) {
        this.f83434c = cVar;
        this.f83435d = i;
        this.f83432a = z;
        this.f83433b = j;
        this.f83436e = C30977l.m57836a(cVar.f83440c);
        this.f83437f = i != 32 ? i != 48 ? i != 64 ? i != 120 ? "null" : "LARGE" : "MEDIUM" : "SMALL" : "TINY";
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        String a = C30926m.m57721a(th);
        C30964c cVar = this.f83434c;
        C30847m mVar = cVar.f83438a;
        String str = this.f83436e;
        mVar.mo36542c(str, this.f83437f, a, cVar.f83439b, this.f83432a);
        this.f83434c.f83438a.mo36546g((double) (System.currentTimeMillis() - this.f83433b), this.f83436e, this.f83437f, a, this.f83434c.f83439b, this.f83432a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        String str = ((Bitmap) obj) != null ? "OK" : "NULL";
        C30964c cVar = this.f83434c;
        cVar.f83438a.mo36542c(this.f83436e, this.f83437f, str, cVar.f83439b, this.f83432a);
        this.f83434c.f83438a.mo36546g((double) (System.currentTimeMillis() - this.f83433b), this.f83436e, this.f83437f, str, this.f83434c.f83439b, this.f83432a);
    }
}
