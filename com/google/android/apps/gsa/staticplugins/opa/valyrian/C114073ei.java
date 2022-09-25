package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.os.RemoteException;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.C108800ed;
import com.google.android.apps.gsa.staticplugins.opa.p8371i.C109263a;
import com.google.android.apps.gsa.staticplugins.opa.p8371i.C109264b;
import com.google.android.apps.gsa.staticplugins.opa.p8371i.C109265c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ei */
/* compiled from: PG */
public final class C114073ei extends C109265c {

    /* renamed from: i */
    public static final C88244um[] f316058i = {C88244um.UPDATE_ACTION_UI, C88244um.SET_FINAL_RECOGNIZED_TEXT, C88244um.UPDATE_RECOGNIZED_TEXT, C88244um.SHOW_RECOGNITION_STATE, C88244um.SHOW_ERROR, C88244um.SET_SEARCH_PLATE_MODE, C88244um.START_ACTIVITY, C88244um.SET_EXTERNAL_FLAGS, C88244um.SHOW_VOICE_ACTIONS};

    /* renamed from: j */
    private static final C59071e f316059j = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.valyrian.ei");

    public C114073ei(C109264b bVar, C109263a aVar) {
        super(bVar, aVar);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.apps.gsa.search.shared.service.t, com.google.android.apps.gsa.search.shared.ui.actions.j] */
    /* JADX WARNING: type inference failed for: r6v1, types: [com.google.android.apps.gsa.search.shared.service.t, com.google.android.apps.gsa.search.shared.ui.actions.j] */
    /* JADX WARNING: type inference failed for: r10v9, types: [com.google.android.apps.gsa.search.shared.service.t, com.google.android.apps.gsa.search.shared.ui.actions.j] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        r5 = r9.f304370g.size();
        r6 = r9.f304371h;
     */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r10) {
        /*
            r9 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r10.f236959a     // Catch:{ RemoteException -> 0x0192 }
            int r0 = r0.f238699b     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.uo r0 = r10.f236959a     // Catch:{ RemoteException -> 0x0192 }
            int r0 = r0.f238699b     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r0)     // Catch:{ RemoteException -> 0x0192 }
            if (r0 != 0) goto L_0x0014
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW     // Catch:{ RemoteException -> 0x0192 }
        L_0x0014:
            int r0 = r0.ordinal()     // Catch:{ RemoteException -> 0x0192 }
            r1 = 36
            if (r0 == r1) goto L_0x018c
            r1 = 54
            r2 = 0
            r3 = 2
            if (r0 == r1) goto L_0x00ae
            switch(r0) {
                case 44: goto L_0x0097;
                case 45: goto L_0x007d;
                case 46: goto L_0x006b;
                case 47: goto L_0x005d;
                default: goto L_0x0025;
            }     // Catch:{ RemoteException -> 0x0192 }
        L_0x0025:
            switch(r0) {
                case 49: goto L_0x004e;
                case 50: goto L_0x0040;
                case 51: goto L_0x002a;
                default: goto L_0x0028;
            }     // Catch:{ RemoteException -> 0x0192 }
        L_0x0028:
            goto L_0x018b
        L_0x002a:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88256uy.f238719a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = r10.mo81918e(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.va r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88259va) r10     // Catch:{ RemoteException -> 0x0192 }
            int r0 = r10.f238724b     // Catch:{ RemoteException -> 0x0192 }
            java.lang.String r1 = r10.f238725c     // Catch:{ RemoteException -> 0x0192 }
            java.lang.String r10 = r10.f238726d     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.t r2 = r9.f304368e     // Catch:{ RemoteException -> 0x0192 }
            if (r2 == 0) goto L_0x018b
            r2.mo17572iK(r0, r1, r10)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x0040:
            java.lang.Class<android.content.Intent> r0 = android.content.Intent.class
            android.os.Parcelable r10 = r10.mo81912b(r0)     // Catch:{ RemoteException -> 0x0192 }
            android.content.Intent r10 = (android.content.Intent) r10     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.t r0 = r9.f304366c     // Catch:{ RemoteException -> 0x0192 }
            r0.mo49088fO(r10)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x004e:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88266vh.f238738a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = r10.mo81918e(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.vj r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88268vj) r10     // Catch:{ RemoteException -> 0x0192 }
            int r0 = r10.f238742b     // Catch:{ RemoteException -> 0x0192 }
            int r0 = r10.f238743c     // Catch:{ RemoteException -> 0x0192 }
            boolean r10 = r10.f238744d     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x005d:
            java.lang.Class<com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction> r0 = com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction.class
            android.os.Parcelable r10 = r10.mo81912b(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction r10 = (com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction) r10     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.t r0 = r9.f304366c     // Catch:{ RemoteException -> 0x0192 }
            r0.mo17567f(r10)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x006b:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq.f238816a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = r10.mo81918e(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.ws r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws) r10     // Catch:{ RemoteException -> 0x0192 }
            int r10 = r10.f238820b     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.t r0 = r9.f304368e     // Catch:{ RemoteException -> 0x0192 }
            if (r0 == 0) goto L_0x018b
            r0.mo17568g(r10)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x007d:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn.f238990a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = r10.mo81918e(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.zp r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp) r10     // Catch:{ RemoteException -> 0x0192 }
            java.lang.String r0 = r10.f238994b     // Catch:{ RemoteException -> 0x0192 }
            java.lang.String r1 = r10.f238995c     // Catch:{ RemoteException -> 0x0192 }
            int r3 = r10.f238993a     // Catch:{ RemoteException -> 0x0192 }
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0091
            java.lang.String r2 = r10.f238996d     // Catch:{ RemoteException -> 0x0192 }
        L_0x0091:
            com.google.android.apps.gsa.search.shared.service.t r10 = r9.f304366c     // Catch:{ RemoteException -> 0x0192 }
            r10.mo17570i(r0, r1, r2)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x0097:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb.f238727a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = r10.mo81918e(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.vd r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd) r10     // Catch:{ RemoteException -> 0x0192 }
            java.lang.String r0 = r10.f238731b     // Catch:{ RemoteException -> 0x0192 }
            int r1 = r10.f238730a     // Catch:{ RemoteException -> 0x0192 }
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00a8
            java.lang.String r2 = r10.f238732c     // Catch:{ RemoteException -> 0x0192 }
        L_0x00a8:
            com.google.android.apps.gsa.search.shared.service.t r10 = r9.f304366c     // Catch:{ RemoteException -> 0x0192 }
            r10.mo17573iL(r0, r2)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x00ae:
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable> r0 = com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable.class
            android.os.Parcelable r0 = r10.mo81912b(r0)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable r0 = (com.google.android.apps.gsa.search.shared.service.ShowVoiceActionsEventParcelable) r0     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.shared.search.Query r1 = r0.f236960a     // Catch:{ RemoteException -> 0x0192 }
            java.util.List r4 = r0.f236961b     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r0 = r0.f236962c     // Catch:{ RemoteException -> 0x0192 }
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88308ww.f238829a     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r10 = r10.mo81918e(r5)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.service.b.wy r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88310wy) r10     // Catch:{ RemoteException -> 0x0192 }
            int r10 = r10.f238833b     // Catch:{ RemoteException -> 0x0192 }
            boolean r5 = r0.f236264r     // Catch:{ RemoteException -> 0x0192 }
            if (r5 == 0) goto L_0x00d0
            com.google.android.apps.gsa.staticplugins.opa.i.a r10 = r9.f304365b     // Catch:{ RemoteException -> 0x0192 }
            r10.mo97727c()     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x00d0:
            r9.f304370g = r4     // Catch:{ RemoteException -> 0x0192 }
            r9.f304371h = r10     // Catch:{ RemoteException -> 0x0192 }
            int r5 = r9.f304371h     // Catch:{ RemoteException -> 0x0192 }
            if (r5 < 0) goto L_0x00ed
            java.util.List r5 = r9.f304370g     // Catch:{ RemoteException -> 0x0192 }
            int r5 = r5.size()     // Catch:{ RemoteException -> 0x0192 }
            int r6 = r9.f304371h     // Catch:{ RemoteException -> 0x0192 }
            if (r5 <= r6) goto L_0x00ed
            java.util.List r5 = r9.f304370g     // Catch:{ RemoteException -> 0x0192 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction r5 = (com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction) r5     // Catch:{ RemoteException -> 0x0192 }
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r5 = r5.f236008a     // Catch:{ RemoteException -> 0x0192 }
            goto L_0x00ee
        L_0x00ed:
            r5 = r2
        L_0x00ee:
            if (r5 == 0) goto L_0x00f5
            com.google.android.apps.gsa.staticplugins.opa.i.a r6 = r9.f304365b     // Catch:{ RemoteException -> 0x0192 }
            r6.mo97728f()     // Catch:{ RemoteException -> 0x0192 }
        L_0x00f5:
            com.google.android.apps.gsa.search.shared.service.t r6 = r9.f304367d     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x00fc
            r6.mo82129d(r1, r4, r0, r10)     // Catch:{ RemoteException -> 0x0192 }
        L_0x00fc:
            com.google.android.apps.gsa.search.shared.service.t r6 = r9.f304367d     // Catch:{ RemoteException -> 0x0192 }
            r7 = 3
            if (r6 == 0) goto L_0x0162
            com.google.android.apps.gsa.search.shared.ui.actions.a r8 = r6.mo82127a()     // Catch:{ RemoteException -> 0x0192 }
            if (r8 == 0) goto L_0x0162
            com.google.android.apps.gsa.search.shared.ui.actions.a r6 = r6.mo82127a()     // Catch:{ RemoteException -> 0x0192 }
            if (r5 != 0) goto L_0x010f
        L_0x010d:
            r7 = 2
            goto L_0x015d
        L_0x010f:
            if (r6 != 0) goto L_0x0112
            goto L_0x010d
        L_0x0112:
            boolean r6 = r6.mo82036A()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x0119
            goto L_0x010d
        L_0x0119:
            boolean r6 = r5.mo81087y()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x0120
            goto L_0x010d
        L_0x0120:
            boolean r6 = r5.mo81077p()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 != 0) goto L_0x012d
            boolean r6 = r5.mo81087y()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 != 0) goto L_0x012d
            goto L_0x010d
        L_0x012d:
            boolean r6 = r0.f236255i     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x0132
            goto L_0x010d
        L_0x0132:
            boolean r6 = r5.mo81084w()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x0139
            goto L_0x010d
        L_0x0139:
            boolean r6 = r5.mo81083v()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x0140
            goto L_0x010d
        L_0x0140:
            boolean r6 = r5 instanceof com.google.android.apps.gsa.search.shared.actions.core.VoiceDelightAction     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x0145
            goto L_0x010d
        L_0x0145:
            boolean r6 = r5.mo81079r()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 != 0) goto L_0x014c
            goto L_0x010d
        L_0x014c:
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r6 = r5.mo81065f()     // Catch:{ RemoteException -> 0x0192 }
            if (r6 == 0) goto L_0x015d
            com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo r5 = r5.mo81065f()     // Catch:{ RemoteException -> 0x0192 }
            boolean r5 = r5.mo81435e()     // Catch:{ RemoteException -> 0x0192 }
            if (r5 == 0) goto L_0x015d
            goto L_0x010d
        L_0x015d:
            com.google.android.apps.gsa.staticplugins.opa.i.b r5 = r9.f304364a     // Catch:{ RemoteException -> 0x0192 }
            r5.mo97729o(r7)     // Catch:{ RemoteException -> 0x0192 }
        L_0x0162:
            com.google.android.apps.gsa.search.shared.service.t r5 = r9.f304366c     // Catch:{ RemoteException -> 0x0192 }
            r5.mo17569h(r1, r4, r0, r10)     // Catch:{ RemoteException -> 0x0192 }
            boolean r10 = r0.f236254h     // Catch:{ RemoteException -> 0x0192 }
            if (r10 != 0) goto L_0x0174
            if (r7 != r3) goto L_0x016e
            goto L_0x0176
        L_0x016e:
            com.google.android.apps.gsa.staticplugins.opa.i.b r10 = r9.f304364a     // Catch:{ RemoteException -> 0x0192 }
            r10.mo97729o(r3)     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x0174:
            if (r7 != r3) goto L_0x018b
        L_0x0176:
            boolean r10 = r4.isEmpty()     // Catch:{ RemoteException -> 0x0192 }
            if (r10 != 0) goto L_0x018b
            com.google.android.apps.gsa.search.shared.service.t r10 = r9.f304367d     // Catch:{ RemoteException -> 0x0192 }
            if (r10 == 0) goto L_0x0183
            r10.mo82128c()     // Catch:{ RemoteException -> 0x0192 }
        L_0x0183:
            com.google.android.apps.gsa.search.shared.ui.actions.h r10 = r9.f304369f     // Catch:{ RemoteException -> 0x0192 }
            if (r10 == 0) goto L_0x018b
            com.google.android.apps.gsa.staticplugins.immersiveactions.n r10 = (com.google.android.apps.gsa.staticplugins.immersiveactions.C102424n) r10     // Catch:{ RemoteException -> 0x0192 }
            r10.f285854c = r2     // Catch:{ RemoteException -> 0x0192 }
        L_0x018b:
            return
        L_0x018c:
            com.google.android.apps.gsa.search.shared.service.t r10 = r9.f304366c     // Catch:{ RemoteException -> 0x0192 }
            r10.mo49090r()     // Catch:{ RemoteException -> 0x0192 }
            return
        L_0x0192:
            r10 = move-exception
            com.google.common.f.e r0 = f316059j
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "VOpaDelegatingSSUiCB"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Unexpected exception in onServiceEvent."
            r2 = 28613(0x6fc5, float:4.0095E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r10)).mo56372aa(r2)).mo56386p(r1)
            int r10 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.valyrian.C114073ei.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }

    /* renamed from: fN */
    public final void mo77682fN(int i) {
        try {
            C88499t tVar = this.f304368e;
            if (tVar != null) {
                ((C108800ed) tVar).f302540a.mo97513be(i);
            }
        } catch (RemoteException e) {
            C59104x d = f316059j.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VOpaDelegatingSSUiCB");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(28614)).mo56386p("Unexpected exception in onSpeechLevel.");
            int i2 = C90755l.f253831a;
        }
    }
}
