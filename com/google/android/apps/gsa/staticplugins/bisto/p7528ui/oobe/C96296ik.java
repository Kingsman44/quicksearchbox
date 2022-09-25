package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89495cg;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ik */
/* compiled from: PG */
public abstract class C96296ik extends C96363kx implements C89495cg {

    /* renamed from: i */
    private static final C59071e f269473i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ik");

    /* renamed from: j */
    private static final long f269474j = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    public C22871g f269475b;

    /* renamed from: c */
    public C96325jm f269476c;

    /* renamed from: d */
    public C88483e f269477d;

    /* renamed from: e */
    public C89492cd f269478e;

    /* renamed from: f */
    public C96094ay f269479f;

    /* renamed from: g */
    public boolean f269480g;

    /* renamed from: h */
    boolean f269481h;

    /* renamed from: h */
    private final boolean m159606h(C124548d dVar) {
        if (dVar != null) {
            return dVar.mo106465F().keySet().containsAll(mo90024g());
        }
        C59104x c = f269473i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HerbieTstInPrgFrg");
        ((C59052c) ((C59052c) c).mo56372aa(17049)).mo56386p("deviceInfo null");
        return false;
    }

    /* renamed from: fW */
    public final void mo17874fW(String str, Set set, long j, C124548d dVar) {
        if (set.contains(24)) {
            if (m159606h(dVar)) {
                this.f269480g = true;
                mo77318iT().mo77312a();
                return;
            }
            this.f269480g = false;
            mo77318iT().mo77312a();
        }
    }

    /* renamed from: g */
    public abstract C58485gu mo90024g();

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = new OpaPageLayout(layoutInflater.getContext());
        opaPageLayout.f228726a.mo77362c(0);
        opaPageLayout.mo77370b(R.layout.progress_bar);
        String str = this.f269479f.f269039a;
        if (str != null) {
            HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
            headerLayout.getClass();
            C96095az a = this.f269476c.f269538a.mo89952a(mo89934e());
            if (a != null) {
                String name = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str).getName();
                String str2 = a.f269040a;
                String str3 = a.f269043d;
                if (str2 != null) {
                    C84018m.m133908c(headerLayout.f228718a, String.format(str2, new Object[]{name}), TextView.BufferType.NORMAL, headerLayout);
                }
                if (str3 != null) {
                    C84018m.m133908c(headerLayout.f228719b, str3, TextView.BufferType.NORMAL, headerLayout);
                }
            }
        }
        if (this.f269481h) {
            C89492cd cdVar = this.f269478e;
            str.getClass();
            C124548d b = cdVar.mo83401b(str);
            if (b == null) {
                C59104x c = f269473i.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HerbieTstInPrgFrg");
                ((C59052c) ((C59052c) c).mo56372aa(17048)).mo56386p("Failed to get device info");
                this.f269475b.mo28212l("exit", new C96293ih(this));
            }
            if (m159606h(b)) {
                C59104x b2 = f269473i.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "HerbieTstInPrgFrg");
                ((C59052c) ((C59052c) b2).mo56372aa(17047)).mo56386p("all profiles passed");
                this.f269475b.mo28212l("exit", new C96294ii(this));
            }
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("extra_device_id", this.f269479f.f269039a);
            bundle2.putIntegerArrayList("extra_profiles_for_audio_testing", new ArrayList(mo90024g()));
            C88489j jVar = new C88489j(C87739bu.BISTO_START_AUDIO_TESTING);
            jVar.mo82015c(bundle2);
            C89651f.m145940a(this.f269477d, jVar.mo82013a());
            this.f269481h = true;
            this.f269475b.mo28213m("timeout", f269474j, new C96295ij(this));
        }
        this.f269478e.mo83360B(new C58759qy(24), this);
        return opaPageLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        Bundle bundle = new Bundle();
        bundle.putString("extra_device_id", this.f269479f.f269039a);
        C88489j jVar = new C88489j(C87739bu.BISTO_STOP_AUDIO_TESTING);
        jVar.mo82015c(bundle);
        C89651f.m145940a(this.f269477d, jVar.mo82013a());
        this.f269481h = false;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f269478e.mo83379U(this);
    }
}
