package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.lockscreen.impl;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.TransparentAssistUiActivityInSearch */
/* compiled from: PG */
public class TransparentAssistUiActivityInSearch extends Activity {

    /* renamed from: a */
    private static final C59071e f223840a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.lockscreen.impl.TransparentAssistUiActivityInSearch");

    /* renamed from: b */
    private final C81848c f223841b = new C81870y(this);

    /* renamed from: a */
    private final Optional m130094a() {
        return Optional.ofNullable(getIntent().getBundleExtra("controller_container")).map(C81868w.f223884a).map(C81869x.f223885a);
    }

    public final void finish() {
        C58976aa aaVar = C58975e.f156826a;
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.C);
        C58976aa aaVar = C58975e.f156826a;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        getWindow().addFlags(6815872);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C58976aa aaVar = C58975e.f156826a;
        super.onStart();
        Optional a = m130094a();
        if (a.isPresent()) {
            try {
                ((C81851f) a.get()).mo75375e(this.f223841b);
            } catch (RemoteException e) {
                C59104x c = f223840a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TransparentAssistActi");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6304)).mo56386p("Failed to register on remote controller. Finishing");
                finish();
            }
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C58976aa aaVar = C58975e.f156826a;
        Optional a = m130094a();
        if (a.isPresent()) {
            try {
                ((C81851f) a.get()).mo75376f();
            } catch (RemoteException e) {
                C59104x c = f223840a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "TransparentAssistActi");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(6307)).mo56386p("Failed to unregister from remote controller");
            }
        }
        super.onStop();
    }
}
