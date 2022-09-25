package com.google.android.apps.gsa.staticplugins.p7382aj;

import android.content.Context;
import android.hardware.SensorManager;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.C91027k;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.f */
/* compiled from: PG */
public final class C93884f implements C93885g {

    /* renamed from: a */
    public static final C59071e f262214a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.aj.f");

    /* renamed from: b */
    public final C93886h f262215b;

    /* renamed from: c */
    public boolean f262216c;

    /* renamed from: d */
    private final Context f262217d;

    /* renamed from: e */
    private final C91027k f262218e;

    /* renamed from: f */
    private final C21370a f262219f;

    /* renamed from: g */
    private final C90931ca f262220g;

    /* renamed from: h */
    private C93883e f262221h;

    /* renamed from: i */
    private long f262222i;

    /* renamed from: a */
    public final void mo88204a() {
        long b = this.f262219f.mo26870b();
        C93883e eVar = this.f262221h;
        if ((eVar == null || eVar.f262210a) && b - this.f262222i > 10000) {
            this.f262222i = b;
            C90476a aVar = C91018d.f254254a;
            String str = this.f262218e.mo85306a((Map) null, (Map) null, false, false).f254175a;
            String str2 = this.f262218e.mo85306a((Map) null, (Map) null, false, true).f254175a;
            if (str != null && str2 != null) {
                C93883e eVar2 = new C93883e(this.f262217d, str, str2);
                this.f262221h = eVar2;
                this.f262220g.mo85139d(eVar2);
                Toast.makeText(this.f262217d, this.f262217d.getResources().getString(R.string.feedback_toast_on_shake), 0).show();
            }
        }
    }

    public C93884f(Context context, C91027k kVar, C21370a aVar, C90931ca caVar) {
        context.getClass();
        this.f262217d = context;
        this.f262218e = kVar;
        this.f262219f = aVar;
        this.f262220g = caVar;
        this.f262215b = new C93886h((SensorManager) context.getSystemService("sensor"), this, aVar);
    }
}
