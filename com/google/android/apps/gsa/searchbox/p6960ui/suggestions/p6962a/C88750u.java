package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.WindowManager;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87847fu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87848fv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87891hk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87892hl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87894hn;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88704e;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4570p.C60385f;
import com.google.common.p4552o.p4570p.C60386g;
import com.google.common.p4552o.p4570p.C60387h;
import com.google.common.p4552o.p4570p.C60389j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.u */
/* compiled from: PG */
public final class C88750u {

    /* renamed from: c */
    private static final C59071e f240091c = C59071e.m91332i("com.google.android.apps.gsa.searchbox.ui.suggestions.a.u");

    /* renamed from: d */
    private static final C88704e f240092d = new C88748s();

    /* renamed from: a */
    public final Context f240093a;

    /* renamed from: b */
    public final C88701b f240094b;

    public C88750u(Context context, C88701b bVar) {
        this.f240093a = context;
        this.f240094b = bVar;
    }

    /* renamed from: c */
    private static final String m143870c(Suggestion suggestion) {
        if (suggestion.f108910k != 156 || !suggestion.f108925z.contains(286)) {
            return C89235z.m73089I(suggestion);
        }
        return C89235z.m145142n(C89235z.m145140l(suggestion), C89235z.m145139k(suggestion));
    }

    /* renamed from: d */
    private final void m143871d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog create = new AlertDialog.Builder(this.f240093a).setTitle(charSequence).setMessage(charSequence2).setPositiveButton(charSequence3, onClickListener).setNegativeButton(charSequence4, onClickListener2).create();
        try {
            create.show();
            create.getButton(-1).setTextColor(-65536);
        } catch (WindowManager.BadTokenException e) {
            C59104x c = f240091c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "sb.u.SugLgClckHdlr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10010)).mo56386p("Error creating dialog for long click on a contact suggestion.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0093, code lost:
        if (android.text.TextUtils.isEmpty(r0) != false) goto L_0x00a9;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82479a(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r17, com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an r18, java.lang.Integer r19) {
        /*
            r16 = this;
            r9 = r16
            r10 = r17
            int r0 = r10.f108910k
            java.lang.String r8 = com.google.android.libraries.searchbox.shared.suggestion.C41670aj.m73074g(r17)
            java.lang.String r5 = r17.mo44269v()
            r1 = 2132092793(0x7f152779, float:1.9825993E38)
            r2 = 2132092794(0x7f15277a, float:1.9825995E38)
            r3 = 1
            r4 = 0
            r6 = 89
            if (r0 != r6) goto L_0x005d
            int r0 = r19.intValue()
            r7 = 269(0x10d, float:3.77E-43)
            if (r0 != r7) goto L_0x005e
            android.content.Context r0 = r9.f240093a
            android.content.res.Resources r0 = r0.getResources()
            r7 = 2132092797(0x7f15277d, float:1.9826E38)
            java.lang.String r0 = r0.getString(r7)
            android.content.Context r7 = r9.f240093a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r5
            r4 = 2132092796(0x7f15277c, float:1.9825999E38)
            java.lang.String r3 = r7.getString(r4, r3)
            android.text.Spanned r3 = android.text.Html.fromHtml(r3)
            android.content.Context r4 = r9.f240093a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r2 = r4.getString(r2)
            android.content.Context r4 = r9.f240093a
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r1 = r4.getString(r1)
            r13 = r1
            r12 = r2
            r11 = r3
            goto L_0x00dc
        L_0x005d:
            r6 = r0
        L_0x005e:
            r0 = 156(0x9c, float:2.19E-43)
            java.lang.String r7 = "sb.u.SugLgClckHdlr"
            if (r6 != r0) goto L_0x00fa
            android.content.Context r0 = r9.f240093a
            android.content.res.Resources r0 = r0.getResources()
            r11 = 2132092800(0x7f152780, float:1.9826007E38)
            java.lang.String r11 = r0.getString(r11)
            android.content.Context r0 = r9.f240093a
            android.content.res.Resources r12 = r0.getResources()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            android.content.Context r0 = r9.f240093a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r13 = com.google.android.apps.gsa.shared.p6990an.C89235z.m145145q(r17)     // Catch:{ Exception -> 0x0096 }
            android.content.pm.ApplicationInfo r13 = r0.getApplicationInfo(r13, r4)     // Catch:{ Exception -> 0x0096 }
            java.lang.CharSequence r0 = r0.getApplicationLabel(r13)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0096 }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0096 }
            if (r7 == 0) goto L_0x00b6
            goto L_0x00a9
        L_0x0096:
            r0 = move-exception
            com.google.common.f.e r13 = f240091c
            com.google.common.f.x r13 = r13.mo56226d()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r7)
            java.lang.String r7 = "Slice suggestion to be hidden did not have its Application info found."
            r14 = 10007(0x2717, float:1.4023E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r0)).mo56372aa(r14)).mo56386p(r7)
        L_0x00a9:
            android.content.Context r0 = r9.f240093a
            android.content.res.Resources r0 = r0.getResources()
            r7 = 2132092799(0x7f15277f, float:1.9826005E38)
            java.lang.String r0 = r0.getString(r7)
        L_0x00b6:
            r3[r4] = r0
            r0 = 2132092798(0x7f15277e, float:1.9826003E38)
            java.lang.String r0 = r12.getString(r0, r3)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.content.Context r3 = r9.f240093a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r2 = r3.getString(r2)
            android.content.Context r3 = r9.f240093a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r1 = r3.getString(r1)
            r13 = r1
            r12 = r2
            r15 = r11
            r11 = r0
            r0 = r15
        L_0x00dc:
            com.google.android.apps.gsa.searchbox.ui.suggestions.a.q r14 = new com.google.android.apps.gsa.searchbox.ui.suggestions.a.q
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.apps.gsa.searchbox.ui.suggestions.a.r r7 = new com.google.android.apps.gsa.searchbox.ui.suggestions.a.r
            r7.<init>(r9, r10)
            r1 = r16
            r2 = r0
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.m143871d(r2, r3, r4, r5, r6, r7)
            return
        L_0x00fa:
            com.google.common.f.e r0 = f240091c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r7)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 10009(0x2719, float:1.4026E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r1 = "unsupported suggestion type=%d subtype=%d for hiding"
            r2 = r19
            r0.mo56395y(r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88750u.mo82479a(com.google.android.libraries.searchbox.shared.suggestion.Suggestion, com.google.android.apps.gsa.searchbox.ui.suggestions.views.an, java.lang.Integer):void");
    }

    /* renamed from: b */
    public final void mo82480b(Suggestion suggestion, int i) {
        C58976aa aaVar = C58975e.f156826a;
        C60387h hVar = (C60387h) C60389j.f163423f.createBuilder();
        hVar.copyOnWrite();
        C60389j jVar = (C60389j) hVar.instance;
        jVar.f163426b = i - 1;
        jVar.f163425a |= 1;
        int i2 = suggestion.f108910k;
        hVar.copyOnWrite();
        C60389j jVar2 = (C60389j) hVar.instance;
        jVar2.f163425a |= 4;
        jVar2.f163427c = i2;
        if (!TextUtils.isEmpty(m143870c(suggestion))) {
            String c = m143870c(suggestion);
            hVar.copyOnWrite();
            C60389j jVar3 = (C60389j) hVar.instance;
            c.getClass();
            jVar3.f163425a |= 8;
            jVar3.f163429e = c;
        }
        if (!suggestion.f108925z.isEmpty()) {
            C58485gu guVar = suggestion.f108925z;
            hVar.copyOnWrite();
            C60389j jVar4 = (C60389j) hVar.instance;
            C62961ch chVar = jVar4.f163428d;
            if (!chVar.mo58948c()) {
                jVar4.f163428d = C62942bv.mutableCopy(chVar);
            }
            C62947c.addAll((Iterable) guVar, (List) jVar4.f163428d);
        }
        C60385f fVar = (C60385f) C60386g.f163418c.createBuilder();
        fVar.copyOnWrite();
        C60386g gVar = (C60386g) fVar.instance;
        C60389j jVar5 = (C60389j) hVar.build();
        jVar5.getClass();
        gVar.f163421b = jVar5;
        gVar.f163420a |= 8;
        C60386g gVar2 = (C60386g) fVar.build();
        C87891hk hkVar = (C87891hk) C87892hl.f237768c.createBuilder();
        hkVar.copyOnWrite();
        C87892hl hlVar = (C87892hl) hkVar.instance;
        gVar2.getClass();
        hlVar.f237771b = gVar2;
        hlVar.f237770a |= 1;
        C87847fu fuVar = (C87847fu) C87848fv.f237681d.createBuilder();
        fuVar.copyOnWrite();
        C87848fv fvVar = (C87848fv) fuVar.instance;
        fvVar.f237683a |= 2;
        fvVar.f237685c = 147882891;
        fuVar.mo58885m(C87894hn.f237773a, (C87892hl) hkVar.build());
        this.f240094b.mo82300A((C87848fv) fuVar.build(), f240092d);
    }
}
