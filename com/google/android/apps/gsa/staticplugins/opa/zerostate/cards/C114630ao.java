package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28289g;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.material.bottomsheet.C44565p;
import com.google.apps.tiktok.inject.C47266f;
import com.google.assistant.p3994s.p3995a.C53115by;
import com.google.assistant.p3994s.p3995a.C53118ca;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ao */
/* compiled from: PG */
public final class C114630ao extends DialogFragment implements C28289g {

    /* renamed from: d */
    private static final C59071e f318015d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ao");

    /* renamed from: a */
    public C68214a f318016a;

    /* renamed from: b */
    public C114629an f318017b;

    /* renamed from: c */
    public C28293k f318018c;

    /* renamed from: e */
    private C53118ca f318019e;

    /* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.ao$a */
    /* compiled from: PG */
    public interface C114631a {
        /* renamed from: qU */
        void mo101481qU(C114630ao aoVar);
    }

    /* renamed from: a */
    public final C28293k mo33782a() {
        return this.f318018c;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            this.f318019e = (C53118ca) C62942bv.parseFrom((C62942bv) C53118ca.f139194b, getArguments().getByteArray("OverflowMenuKey"), C62921ba.m95368a());
            ((C114631a) C47266f.m84076a(getActivity(), C114631a.class)).mo101481qU(this);
            Activity activity = getActivity();
            LayoutInflater from = LayoutInflater.from(activity);
            C44565p pVar = new C44565p(activity, R.style.OpaBottomSheetDialog);
            View inflate = from.inflate(R.layout.overflow_menu, (ViewGroup) null);
            pVar.setContentView(inflate, new LinearLayout.LayoutParams(-1, -2));
            C28293k kVar = this.f318018c;
            if (kVar != null) {
                C28295m.m52919e(inflate, ((C28257a) kVar).f76908a);
            }
            C68214a aVar = this.f318016a;
            C53118ca caVar = this.f318019e;
            caVar.getClass();
            ((ListView) inflate.findViewById(R.id.overflow_menu_action_list)).setAdapter(new C114626ak(activity, aVar, pVar, (C53115by[]) caVar.f139196a.toArray(new C53115by[0]), this.f318017b, this.f318018c));
            inflate.setSystemUiVisibility(inflate.getSystemUiVisibility() | 16);
            return pVar;
        } catch (C62974ct unused) {
            C59104x d = f318015d.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OverflowMenuDialog");
            ((C59052c) ((C59052c) d).mo56372aa(29286)).mo56386p("Cannot parse overflow menu data from saved fragment state.");
            return null;
        }
    }
}
