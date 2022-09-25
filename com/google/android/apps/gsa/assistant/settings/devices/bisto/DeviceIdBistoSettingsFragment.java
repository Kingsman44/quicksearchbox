package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89635f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90732ap;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124528i;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.p9393a.C124542a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import p5460g.p5461a.C69464a;

@ProguardMustNotDelete
/* compiled from: PG */
public class DeviceIdBistoSettingsFragment extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C9620cl f33109h;

    /* renamed from: i */
    private String f33110i = null;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return R.xml.assistant_device_id_bisto_settings;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        KeyguardManager keyguardManager;
        C73873e.m108454a(this);
        Context context = getContext();
        C0167am activity = getActivity();
        if (!(context == null || activity == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || !keyguardManager.isKeyguardLocked())) {
            keyguardManager.requestDismissKeyguard(activity, (KeyguardManager.KeyguardDismissCallback) null);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f33110i = arguments.getString("assistant_device_id");
        }
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C28295m.m52919e(onCreateView, new C28292j(67943));
        C89949q.m146521e(C28285c.m52874a(onCreateView, 61687), false);
        return onCreateView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        C9620cl clVar = this.f33109h;
        String str = this.f33110i;
        C88483e eVar = (C88483e) clVar.f33293a.mo17428b();
        eVar.getClass();
        C89492cd cdVar = (C89492cd) clVar.f33294b.mo17428b();
        cdVar.getClass();
        ((C124542a) clVar.f33295c.mo17428b()).getClass();
        C91142g gVar = (C91142g) clVar.f33296d.mo17428b();
        gVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) clVar.f33297e).f184585a);
        a.getClass();
        C90465g gVar2 = (C90465g) clVar.f33298f.mo17428b();
        gVar2.getClass();
        ((C90476a) clVar.f33299g.mo17428b()).getClass();
        C22871g gVar3 = (C22871g) clVar.f33300h.mo17428b();
        gVar3.getClass();
        ((C90732ap) clVar.f33301i.mo17428b()).getClass();
        C69464a aVar = clVar.f33302j;
        C89656k kVar = (C89656k) clVar.f33303k.mo17428b();
        kVar.getClass();
        C124528i iVar = (C124528i) clVar.f33304l.mo17428b();
        iVar.getClass();
        C90021c cVar = (C90021c) clVar.f33305m.mo17428b();
        cVar.getClass();
        C86054o oVar = (C86054o) clVar.f33306n.mo17428b();
        oVar.getClass();
        C89635f fVar = (C89635f) clVar.f33307o.mo17428b();
        fVar.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) clVar.f33308p).f184585a);
        a2.getClass();
        return new C9619ck(eVar, cdVar, gVar, a, gVar2, str, gVar3, aVar, kVar, iVar, cVar, oVar, fVar, a2);
    }
}
