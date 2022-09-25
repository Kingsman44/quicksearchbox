package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74701ba;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.q */
/* compiled from: PG */
public final class C80997q implements C80963a {

    /* renamed from: a */
    private static final C58974d f222018a = C58974d.m91136j();

    /* renamed from: b */
    private final C74701ba f222019b;

    public C80997q(C74701ba baVar) {
        this.f222019b = baVar;
    }

    /* renamed from: d */
    public final void mo74736d() {
        try {
            this.f222019b.mo71053e();
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222018a.mo56226d()).mo56382g(e)).mo56372aa(6549)).mo56386p("Unable to delegateToVissCallback hide");
        }
    }

    /* renamed from: f */
    public final void mo74737f(Intent intent) {
        try {
            this.f222019b.mo71055g(intent);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222018a.mo56226d()).mo56382g(e)).mo56372aa(6551)).mo56386p("Unable to delegateToVissCallback startAssistantActivity");
        }
    }

    /* renamed from: g */
    public final void mo74738g(Intent intent) {
        try {
            this.f222019b.mo71056h(intent);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222018a.mo56226d()).mo56382g(e)).mo56372aa(6552)).mo56386p("Unable to delegateToVissCallback startVoiceActivity");
        }
    }

    /* renamed from: h */
    public final void mo74739h(Configuration configuration) {
        try {
            this.f222019b.mo71054f(configuration);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) f222018a.mo56226d()).mo56382g(e)).mo56372aa(6550)).mo56386p("Unable to delegateToVissCallback onConfigurationChanged");
        }
    }
}
