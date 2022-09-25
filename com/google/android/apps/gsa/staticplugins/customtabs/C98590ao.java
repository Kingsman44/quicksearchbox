package com.google.android.apps.gsa.staticplugins.customtabs;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.customtabs.p7708a.C98574j;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1703d.C20664t;
import com.google.android.libraries.p1703d.C20665u;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.ao */
/* compiled from: PG */
public final class C98590ao implements C118549h {

    /* renamed from: a */
    public static final C59071e f275355a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.customtabs.ao");

    /* renamed from: b */
    public final SharedPreferences f275356b;

    /* renamed from: c */
    private final Context f275357c;

    /* renamed from: d */
    private final C69464a f275358d;

    /* renamed from: e */
    private final C22871g f275359e;

    public C98590ao(Context context, SharedPreferences sharedPreferences, C69464a aVar, C22871g gVar) {
        this.f275357c = context;
        this.f275356b = sharedPreferences;
        this.f275358d = aVar;
        this.f275359e = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C60870cx cxVar;
        String b = ((C98574j) this.f275358d.mo17428b()).mo91180b();
        if (b == null) {
            C59104x d = f275355a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "IsGoogleDefaultTask");
            ((C59052c) ((C59052c) d).mo56372aa(19104)).mo56386p("Chrome custom tabs package not available");
            cxVar = C60856cj.m92900i(C118826c.f331422a);
        } else {
            cxVar = C90877ak.m148471e(C20665u.m38827g(this.f275357c, b, new C98588am(this)), 50, TimeUnit.SECONDS, this.f275359e);
            C90476a aVar = C91018d.f254254a;
        }
        return C60846c.m92878g(C60846c.m92878g(C60838bs.m92859i(C118826c.m197213c(cxVar)), TimeoutException.class, C98586ak.f275349a, C60826bg.f164896a), C20664t.class, C98587al.f275350a, C60826bg.f164896a);
    }
}
