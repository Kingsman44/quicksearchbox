package com.google.android.apps.gsa.staticplugins.p8163o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.android.apps.gsa.search.core.p6519al.p6678cw.C85232a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88398a;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88430ba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88458h;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88459i;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.c */
/* compiled from: PG */
public final class C105831c {

    /* renamed from: a */
    public static final C59071e f295234a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.o.c");

    /* renamed from: b */
    public final Context f295235b;

    /* renamed from: c */
    public final C21370a f295236c;

    /* renamed from: d */
    public final C85232a f295237d;

    /* renamed from: e */
    public final C68214a f295238e;

    /* renamed from: f */
    public final C22871g f295239f;

    /* renamed from: g */
    public final C22871g f295240g;

    /* renamed from: h */
    public final Set f295241h = new HashSet();

    /* renamed from: i */
    final Map f295242i;

    /* renamed from: j */
    public PendingIntent f295243j;

    /* renamed from: k */
    public PendingIntent f295244k;

    /* renamed from: l */
    public PendingIntent f295245l;

    /* renamed from: m */
    public PendingIntent f295246m;

    /* renamed from: n */
    public PendingIntent f295247n;

    /* renamed from: o */
    public PendingIntent f295248o;

    /* renamed from: p */
    public PendingIntent f295249p;

    /* renamed from: q */
    public boolean f295250q = false;

    public C105831c(Context context, C21370a aVar, C85232a aVar2, C22871g gVar, C22871g gVar2, C68214a aVar3) {
        this.f295235b = context;
        this.f295236c = aVar;
        this.f295237d = aVar2;
        this.f295239f = gVar;
        this.f295240g = gVar2;
        this.f295238e = aVar3;
        this.f295242i = new HashMap();
    }

    /* renamed from: c */
    public static boolean m176195c(PlaybackStateCompat playbackStateCompat) {
        int i = playbackStateCompat.f994a;
        return i == 3 || i == 6;
    }

    /* renamed from: e */
    private final PendingIntent m176196e(String str, C88458h hVar) {
        C88430ba baVar = (C88430ba) C88431bb.f239082a.createBuilder();
        baVar.mo58885m(C88459i.f239145a, hVar);
        return C88483e.m142827a(this.f295235b, str, (C88431bb) baVar.build(), 0);
    }

    /* renamed from: a */
    public final PendingIntent mo95079a(String str, long j) {
        C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
        aVar.copyOnWrite();
        C88458h hVar = (C88458h) aVar.instance;
        hVar.f239138a |= 1;
        hVar.f239139b = (long) ((int) j);
        return m176196e(str, (C88458h) aVar.build());
    }

    /* renamed from: b */
    public final void mo95080b(Notification.Builder builder, int i, int i2, PendingIntent pendingIntent) {
        builder.addAction(i, this.f295235b.getResources().getString(i2), pendingIntent);
    }

    /* renamed from: d */
    public final PendingIntent mo95081d(String str, int i) {
        C88398a aVar = (C88398a) C88458h.f239136h.createBuilder();
        aVar.copyOnWrite();
        C88458h hVar = (C88458h) aVar.instance;
        hVar.f239140c = i - 1;
        hVar.f239138a |= 2;
        return m176196e(str, (C88458h) aVar.build());
    }
}
