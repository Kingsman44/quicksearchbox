package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.support.p031v4.app.FragmentManager;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.common.p4522b.C58528ij;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.o */
/* compiled from: PG */
public final /* synthetic */ class C10049o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10054t f34272a;

    /* renamed from: b */
    public final /* synthetic */ CompoundButton f34273b;

    /* renamed from: c */
    public final /* synthetic */ C10053s f34274c;

    public /* synthetic */ C10049o(C10054t tVar, CompoundButton compoundButton, C10053s sVar) {
        this.f34272a = tVar;
        this.f34273b = compoundButton;
        this.f34274c = sVar;
    }

    public final void onClick(View view) {
        C10054t tVar = this.f34272a;
        CompoundButton compoundButton = this.f34273b;
        C10053s sVar = this.f34274c;
        C28443m mVar = tVar.f34285g;
        C28440j h = C28442l.m53142h();
        h.mo33895b(C28442l.m53144j(compoundButton));
        mVar.mo33853c(h.mo33894a(), C28485y.m53234a(compoundButton));
        boolean isChecked = compoundButton.isChecked();
        if (sVar.mo18209f(C58528ij.m90013M(C79570b.CALL_CONTACT, C79570b.CALL_NUMBER, C79570b.CALL_CONTACT_V2, C79570b.CALL_NUMBER_V2))) {
            if (isChecked) {
                FragmentManager childFragmentManager = tVar.f34290l.getChildFragmentManager();
                C58528ij<C79570b> d = sVar.mo18171d();
                C10007af afVar = (C10007af) C10008ag.f34205c.createBuilder();
                afVar.copyOnWrite();
                C10008ag agVar = (C10008ag) afVar.instance;
                C62961ch chVar = agVar.f34207a;
                if (!chVar.mo58948c()) {
                    agVar.f34207a = C62942bv.mutableCopy(chVar);
                }
                for (C79570b bVar : d) {
                    agVar.f34207a.mo58916g(bVar.f218339o);
                }
                C10058x xVar = new C10058x();
                C68324h.m98669f(xVar);
                C47243l.m84039a(xVar, (C10008ag) afVar.build());
                xVar.showNow(childFragmentManager, "calls_opt_in_dialog_fragment");
                return;
            }
            isChecked = false;
        }
        tVar.f34289k.mo18175a(sVar.mo18171d(), isChecked);
    }
}
