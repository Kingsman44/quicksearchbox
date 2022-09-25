package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.view.View;
import android.widget.Switch;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.shared.util.permissions.ProxyPermissionsRequester;
import com.google.android.libraries.assistant.p1535p.p1536a.p1538b.C18521i;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62963cj;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.u */
/* compiled from: PG */
final class C10055u implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C10054t f34297a;

    public C10055u(C10054t tVar) {
        this.f34297a = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C10056v vVar = (C10056v) bVar;
        C10054t tVar = this.f34297a;
        C58528ij F = C58528ij.m90006F(new C62963cj(vVar.mo18189a().f34207a, C10008ag.f34204b));
        View requireView = tVar.f34290l.requireView();
        int a = ((C10053s) Objects.requireNonNull((C10053s) C10054t.f34283e.get(F))).mo18168a();
        int i = ItemView.a;
        Switch t = requireView.findViewById(a).t();
        C18521i iVar = C18521i.WARM_ACTIONS_TOGGLE_ACTION_UNSPECIFIED;
        int b = vVar.mo18190b();
        int i2 = b - 1;
        if (b != 0) {
            if (i2 == 0 || i2 == 1) {
                t.setChecked(false);
            } else if (i2 == 2) {
                t.setChecked(true);
                tVar.f34289k.mo18175a(F, true);
                if (!tVar.f34292n.mo85346a("android.permission.ANSWER_PHONE_CALLS")) {
                    ((C58970a) ((C58970a) C10054t.f34279a.mo56224b()).mo56372aa(975)).mo56386p("#MWW Requesting ANSWER_PHONE_CALLS permission.");
                    new ProxyPermissionsRequester(tVar.f34293o, tVar.f34290l.getContext()).mo81047ju(new String[]{"android.permission.ANSWER_PHONE_CALLS"}, 19, C10046l.f34269a);
                }
            }
            return C47392e.f123115a;
        }
        throw null;
    }
}
