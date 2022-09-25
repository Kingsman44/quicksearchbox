package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6092f;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5943x.C74976a;
import com.google.android.apps.gsa.nga.engine.p5913am.p5945z.C74980b;
import com.google.android.apps.gsa.nga.engine.p6056o.C76540c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76541a;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76593e;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76594f;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78059be;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.f.d */
/* compiled from: PG */
public final class C77284d implements C76591c {

    /* renamed from: a */
    private final C58974d f213165a = C58974d.m91136j();

    /* renamed from: b */
    private final Context f213166b;

    /* renamed from: c */
    private final C78059be f213167c;

    /* renamed from: d */
    private final C77301u f213168d;

    public C77284d(Context context, C78059be beVar, C77301u uVar) {
        this.f213166b = context;
        this.f213167c = beVar;
        this.f213168d = uVar;
    }

    /* renamed from: a */
    public final C76594f mo71711a() {
        C76593e h = C76594f.m123238h();
        h.mo72246e(Optional.m71637of(C82831ca.INCREASE_DECREASE));
        h.mo72277g("Increase_device_setting", C90126fx.f251252fM);
        h.mo72277g("Decrease_device_setting", C90126fx.f251252fM);
        h.mo72244c(C58485gu.m89847o("Increase_device_setting", "Decrease_device_setting"));
        ((C76541a) h).f211766c = 10102;
        return h.mo72276f();
    }

    /* renamed from: b */
    public final C60870cx mo71712b(C76590bg bgVar, C74965n nVar) {
        String str;
        Optional j = bgVar.mo72268j("setting");
        if (j.isEmpty()) {
            ((C58970a) ((C58970a) this.f213165a.mo56225c()).mo56372aa(3850)).mo56386p("No device setting set");
            return C81442m.f222851a;
        }
        C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
        C63490p pVar = (C63490p) j.get();
        boolean d = bgVar.f211838b.mo73901d("Increase_device_setting");
        if (this.f213168d.mo72511o(pVar)) {
            C77301u uVar = this.f213168d;
            Locale q = nVar.mo71342q();
            t tVar = uVar.f213203a;
            String a = uVar.mo72497a(pVar, q);
            if (d) {
                Object[] objArr = {a};
                str = uVar.f213204b.mo75121a(q).getString(R.string.nga_phone_settings_cant_increase_setting_restricted, objArr);
            } else {
                Object[] objArr2 = {a};
                str = uVar.f213204b.mo75121a(q).getString(R.string.nga_phone_settings_cant_decrease_setting_restricted, objArr2);
            }
            C81442m.m129557s(lVar, t.r(str));
            return C60856cj.m92900i((C80401n) lVar.build());
        } else if (pVar != C63490p.BRIGHTNESS_LEVEL || Settings.System.canWrite(this.f213166b)) {
            Optional k = bgVar.mo72269k("relative_value");
            if (k.isPresent()) {
                Locale q2 = nVar.mo71342q();
                boolean d2 = bgVar.f211838b.mo73901d("Increase_device_setting");
                if (C77301u.m124047p(k)) {
                    return C81442m.f222851a;
                }
                this.f213168d.mo72504h(lVar, new C76540c(pVar, (C74980b) k.get()), d2);
                this.f213168d.mo72499c(lVar, pVar, q2);
                this.f213168d.mo72505i(pVar, lVar, q2);
                return C60856cj.m92900i((C80401n) lVar.build());
            }
            Optional k2 = bgVar.mo72269k("absolute_value");
            if (k2.isPresent()) {
                Locale q3 = nVar.mo71342q();
                if (C77301u.m124047p(k2)) {
                    return C81442m.f222851a;
                }
                this.f213168d.mo72507k(lVar, new C76540c(pVar, (C74980b) k2.get()));
                this.f213168d.mo72499c(lVar, pVar, q3);
                this.f213168d.mo72505i(pVar, lVar, q3);
                return C60856cj.m92900i((C80401n) lVar.build());
            }
            this.f213168d.mo72504h(lVar, new C76540c(pVar, C74976a.f209197a), d);
            this.f213168d.mo72499c(lVar, pVar, nVar.mo71342q());
            this.f213168d.mo72505i(pVar, lVar, nVar.mo71342q());
            return C60856cj.m92900i((C80401n) lVar.build());
        } else {
            C78059be beVar = this.f213167c;
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse("package:".concat(String.valueOf(this.f213166b.getPackageName()))));
            beVar.mo73040b(R.string.nga_missing_settings_permission, lVar, intent, nVar.mo71342q());
            return C60856cj.m92900i((C80401n) lVar.build());
        }
    }
}
