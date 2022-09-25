package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.v;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76564ah;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.android.apps.gsa.nga.engine.understanding.C79330v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80390c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80297as;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.m */
/* compiled from: PG */
public final class C77355m implements C76591c {

    /* renamed from: a */
    public static final /* synthetic */ int f213323a = 0;

    /* renamed from: b */
    private static final C58974d f213324b = C58974d.m91136j();

    /* renamed from: c */
    private static final C58495hd f213325c = C58495hd.m89901o(C79330v.m127277b("NGA_cancel_popup"), C80297as.CANCEL, C79330v.m127277b("NGA_confirm_popup"), C80297as.CONFIRM);

    /* renamed from: d */
    private final C78018a f213326d;

    public C77355m(C78018a aVar) {
        this.f213326d = aVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72244c(C58485gu.m89844l(new String[]{"NGA_cancel_popup", "NGA_confirm_popup"}));
        ((C76541a) h).f211766c = 13501;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        String upperCase = ((String) bgVar.mo72265g(C76564ah.f211801a, "confirmation_type").orElse(BuildConfig.FLAVOR)).trim().toUpperCase(Locale.US);
        Optional empty = Optional.empty();
        if (!TextUtils.isEmpty(upperCase)) {
            empty = v.a(C80390c.class, upperCase);
            if (empty.isEmpty()) {
                ((C58970a) ((C58970a) f213324b.mo56225c()).mo56372aa(3654)).mo56389s("Unknown confirmation type '%s'", upperCase);
                return C81442m.f222851a;
            }
        }
        C80390c a = this.f213326d.mo72962a();
        if (a == null || (empty.isPresent() && !((C80390c) empty.get()).equals(a))) {
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        Optional.ofNullable((C80297as) f213325c.get(bgVar.f211838b)).ifPresent(new C77354l(lVar));
        return C60856cj.m92900i((C80401n) lVar.build());
    }
}
