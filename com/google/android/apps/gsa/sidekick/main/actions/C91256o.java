package com.google.android.apps.gsa.sidekick.main.actions;

import android.content.Context;
import android.widget.Toast;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.main.entry.C91306ak;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.shared.util.C91957ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7805kp;
import com.google.p375ai.p378b.C7816l;
import com.google.p375ai.p378b.C7963ql;
import com.google.p375ai.p378b.C8100vn;

/* renamed from: com.google.android.apps.gsa.sidekick.main.actions.o */
/* compiled from: PG */
public final class C91256o extends C91252k {

    /* renamed from: b */
    private final Context f254695b;

    /* renamed from: c */
    private final C7805kp f254696c;

    public C91256o(Context context, C7718hj hjVar, C7708h hVar, C7805kp kpVar, C91376f fVar, C91306ak akVar, C21370a aVar) {
        super(fVar, akVar, hjVar, hVar, aVar);
        this.f254695b = context;
        this.f254696c = kpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo85518a(C7963ql qlVar) {
        int i = R.string.sidekick_network_error;
        if (qlVar != null) {
            C7816l lVar = qlVar.f27973c;
            if (lVar == null) {
                lVar = C7816l.f27316c;
            }
            if ((lVar.f27318a & 1) != 0) {
                super.onPostExecute((C7963ql) null);
                Context context = this.f254695b;
                C7816l lVar2 = qlVar.f27973c;
                if (lVar2 == null) {
                    lVar2 = C7816l.f27316c;
                }
                int c = C8100vn.m22939c(lVar2.f27319b);
                if (c != 0 && c == 14) {
                    i = R.string.confirm_place_bad_address;
                }
                Toast.makeText(context, i, 1).show();
                return;
            }
            super.onPostExecute(qlVar);
            Toast.makeText(this.f254695b, R.string.confirm_place_updated, 1).show();
            return;
        }
        super.onPostExecute((C7963ql) null);
        Toast.makeText(this.f254695b, R.string.sidekick_network_error, 1).show();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((C7963ql) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C7752iq mo85520b(C7708h hVar, long j) {
        if (this.f254696c == null) {
            return C91957ah.m150910a(this.f254689a, hVar, j, (C7669fo) null);
        }
        C7751ip ipVar = (C7751ip) C91957ah.m150910a(this.f254689a, hVar, j, (C7669fo) null).toBuilder();
        C7805kp kpVar = this.f254696c;
        ipVar.copyOnWrite();
        C7752iq iqVar = (C7752iq) ipVar.instance;
        kpVar.getClass();
        iqVar.f27152v = kpVar;
        iqVar.f27131a |= C89885b.HTTP_VALUE;
        return (C7752iq) ipVar.build();
    }
}
