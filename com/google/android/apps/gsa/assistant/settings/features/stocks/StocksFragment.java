package com.google.android.apps.gsa.assistant.settings.features.stocks;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.google.android.apps.gsa.assistant.settings.base.C9512n;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.sidekick.shared.training.InterestLauncherHelper;
import com.google.android.libraries.logging.p2185ve.C28310af;

@ProguardMustNotDelete
/* compiled from: PG */
public class StocksFragment extends Fragment {

    /* renamed from: a */
    public C86124t f194494a;

    /* renamed from: b */
    public C28310af f194495b;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0167am activity = getActivity();
        InterestLauncherHelper.Options options = new InterestLauncherHelper.Options();
        options.f256343a = "stock_listings";
        Intent a = InterestLauncherHelper.m150800a(options);
        a.setFlags(a.getFlags() & -268435457);
        activity.startActivity(a);
        ((C9512n) activity).mo17825E(0, (Intent) null);
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.stocks.StocksFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.stocks.StocksFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.stocks.StocksFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
