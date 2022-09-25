package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
public class DiscoverFeedLanguageSettingsFragment extends Fragment {

    /* renamed from: a */
    public C86054o f286512a;

    /* renamed from: b */
    public C102668m f286513b;

    /* renamed from: c */
    public C90465g f286514c;

    /* renamed from: d */
    View f286515d;

    /* renamed from: e */
    private C102667l f286516e;

    /* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.DiscoverFeedLanguageSettingsFragment$a */
    /* compiled from: PG */
    public interface C102645a {
        /* renamed from: qx */
        void mo93358qx(DiscoverFeedLanguageSettingsFragment discoverFeedLanguageSettingsFragment);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((ViewGroup) this.f286515d.getParent()).setClipToPadding(false);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        Menu menu2 = menu;
        this.f286514c.mo84210a(getActivity()).mo84208a(menu2, "now_settings", this.f286512a.mo79668a(), C87562e.m142218a(getActivity(), "now_settings"), false, false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((C102645a) C47266f.m84076a(getActivity(), C102645a.class)).mo93358qx(this);
        this.f286515d = layoutInflater.inflate(R.layout.discover_feed_language_preference_screen, viewGroup, false);
        C102668m mVar = this.f286513b;
        Activity activity = getActivity();
        View view = this.f286515d;
        activity.getClass();
        view.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) mVar.f286585a.mo17428b();
        telephonyManager.getClass();
        C22871g gVar = (C22871g) mVar.f286586b.mo17428b();
        gVar.getClass();
        C102677u uVar = (C102677u) mVar.f286587c.mo17428b();
        uVar.getClass();
        C102667l lVar = new C102667l(activity, view, telephonyManager, gVar, uVar);
        this.f286516e = lVar;
        lVar.mo93371b();
        lVar.mo93373d(BuildConfig.FLAVOR);
        lVar.mo93375f(1);
        C102677u uVar2 = lVar.f286580h;
        ((C59052c) ((C59052c) C102677u.f286597a.mo56224b()).mo56372aa(20838)).mo56386p("Reading discover preferred language from store");
        lVar.f286583k = uVar2.f286599c.mo28210j(uVar2.f286598b.mo93376a(), "sync discover language store", new C102674r(uVar2));
        C90873ag agVar = new C90873ag(lVar.f286583k, lVar.f286579g, "GetDiscoverFeedSelectedLanguage", new C102659d(lVar));
        agVar.mo85225c(CancellationException.class, C102660e.f286560a);
        agVar.mo85223a(C102661f.f286561a);
        return this.f286515d;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C102667l lVar = this.f286516e;
        if (lVar != null) {
            lVar.mo93371b();
            lVar.mo93372c();
            this.f286516e = null;
        }
    }
}
